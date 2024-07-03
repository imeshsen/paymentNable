package lk.sampath.oc.Transfers.Service;

import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import lk.sampath.oc.Transfers.Entity.ReverseMCashRequest;
import lk.sampath.oc.Transfers.Entity.TransactionRequest;
import lk.sampath.oc.Transfers.Entity.TransactionRequestHistory;
import lk.sampath.oc.Transfers.Entity.WithdrawMCashRequest;
import lk.sampath.oc.Transfers.Enums.ErrorCode;
import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;
import lk.sampath.oc.Transfers.Enums.TransactionCategory;
import lk.sampath.oc.Transfers.Enums.TransactionType;
import lk.sampath.oc.Transfers.Pojo.DailyTransactionDTO;
import lk.sampath.oc.Transfers.Pojo.FundTransferDTO;
import lk.sampath.oc.Transfers.Pojo.GetTransfers;
import lk.sampath.oc.Transfers.Pojo.ResponseHeader;
import lk.sampath.oc.Transfers.Pojo.TransferResponse;
import lk.sampath.oc.Transfers.Pojo.ValidateTransferResponse;
import lk.sampath.oc.Transfers.Pojo.getTransfersResponse;
import lk.sampath.oc.Transfers.Pojo.profileInfo.ProfileResponse;
import lk.sampath.oc.Transfers.Pojo.reports.FundTransferReportDTO;
import lk.sampath.oc.Transfers.Pojo.reports.FundTransferReportRequestDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.FundTransfersReportResponseDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.GetFundTransfersRequestDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.GetFundTransfersResponseDTO;
import lk.sampath.oc.Transfers.Repository.ReverseMCashRepository;
import lk.sampath.oc.Transfers.Repository.TransactionHistoryRepository;
import lk.sampath.oc.Transfers.Repository.TransactionRepository;
import lk.sampath.oc.Transfers.Repository.WithdrawMCashRepository;
import lk.sampath.oc.Transfers.Specifications.TransactionRequestSpecification;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoInterBankTransferRequestType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoInterBankTransferResponseType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferRequestType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferResponseType;
import lk.sampath.oc.Transfers.integration.mcash.Create;
import lk.sampath.oc.Transfers.integration.mcash.CreateDataInt;
import lk.sampath.oc.Transfers.integration.mcash.Reverse;
import lk.sampath.oc.Transfers.integration.mcash.ReverseDataInt;
import lk.sampath.oc.Transfers.integration.mcash.ReverseResponse;
import lk.sampath.oc.Transfers.integration.mcash.User;
import lk.sampath.oc.Transfers.integration.mcash.Withdraw;
import lk.sampath.oc.Transfers.integration.mcash.WithdrawDataInt;
import lk.sampath.oc.Transfers.integration.mcash.WithdrawResponse;

@Service
public class TransactionService {

	private static Logger logger = LogManager.getLogger(TransactionService.class);

	@Value("${config.finacle.transactionReq.memo.prefix}")
	private String memoPrefix;
	@Value("${config.finacle.transactionReq.memo.purpose}")
	private String memoPurpose;
	@Value("${config.finacle.appCode}")
	private String appCode;
	@Value("${config.finacle.cdCICode}")
	private String cdCICode;
	@Value("${config.finacle.controller}")
	private String controller;
	@Value("${config.finacle.interBnkReq.terminalID}")
	private String terminalID;
	@Value("${config.finacle.interBnkReq.slips.oth}")
	private String slipOthCode;
	@Value("${config.finacle.interBnkReq.slips.cc}")
	private String slipCCCode;
	@Value("${config.finacle.interBnkReq.ceftFlag}")
	private String ceftFlag;
	@Value("${config.finacle.interBnkReq.fromAccountType}")
	private String fromAccountType;
	@Value("${config.finacle.interBnkReq.fromAccountBankCode}")
	private String fromAccountBankCode;
	@Value("${config.finacle.interBnkReq.toAccountType}")
	private String toAccountType;
	@Value("${config.finacle.interBnkReq.commAccount}")
	private String commAccount;
	@Value("${config.finacle.interBnkReq.channelType}")
	private String channelType;
	@Value("${config.bankcode.sampathbank}")
	private String sampathBankCode;

	@Autowired
	private TransactionRepository trRepo;

	@Autowired
	private TransactionHistoryRepository trHistoryRepo;

	@Autowired
	private WithdrawMCashRepository withdrawMCRepo;

	@Autowired
	private ReverseMCashRepository reverseMCRepo;

	@Autowired
	private RestCustomerManagementService restCustomerManagementService;

	TransferResponse transferRes = new TransferResponse();

	DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
	DateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	@Autowired
	private FinacleSOAPConsumerService finacleConsumerService;

	@Autowired
	private MCashSOAPConsumerService mCashConsumerService;

	@Autowired
	private RestChargeProfileService restChargeProfileService;

	@Autowired
	private RestConsumerService restConsumerService;
	// @Autowired
	ValidateTransferResponse validateTransferOut = new ValidateTransferResponse();

	public ValidateTransferResponse validateTransfer(TransactionRequest tr) {
//		logger.info("inside validate transfer");
		ResponseHeader resHeader = new ResponseHeader();
		resHeader.setReturnStatus(InvokeStatus.SUCCESS);

		resHeader = this.finacleConsumerService.validateDebitAccount();

		if (resHeader.getReturnStatus().equals(InvokeStatus.SUCCESS)) {
			resHeader = this.finacleConsumerService.getAdditionalDetails();
			// TODO Validate
			validateTransferOut.setResponseHeader(resHeader);
			if (resHeader.getReturnStatus().equals(InvokeStatus.SUCCESS)) {
				validateTransferOut = this.restConsumerService.validateTransactionDetails(tr);

			} else {
				validateTransferOut.setResponseHeader(resHeader);
			}
		} else {
			validateTransferOut.setResponseHeader(resHeader);
		}

		System.out.println(validateTransferOut.toString());
		return validateTransferOut;
	}

	@SuppressWarnings("unused")
	public TransferResponse doTransfer(TransactionRequest tr) {
		logger.info("inside do transfer");

		TransferResponse transactionRes = new TransferResponse();
		ResponseHeader resHeader = new ResponseHeader();

		try {
			saveTransactionRequest(tr);
			logger.info("transaction request saved");
		} catch (Exception e) {
			e.printStackTrace();
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_009.toString(),
					InvokeMessage.SAVE_TRANSACTION_REQUEST_FAILED.toString());
			transactionRes.setResponseHeader(resHeader);
		}

		try {
			if (resHeader.getReturnStatus() == null) {
				transactionRes = proceedTransfer(tr);
			}
			logger.info("transfer proceeded");
		} catch (Exception e) {
			logger.error("transfer proceeded",e);
			e.printStackTrace();
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_010.toString(),
					InvokeMessage.PROCEED_TRANSFER_FAILED.toString());
			transactionRes.setResponseHeader(resHeader);
		}

		DailyTransactionDTO dl = new DailyTransactionDTO(new Date(), tr.getUserName(), tr.getChannel(),
				tr.getTransactionCategory(), tr.getTransactionAmount());

		try {
			if (resHeader.getReturnStatus() == null) {
				this.restConsumerService.saveDailyTransactionLimits(dl);
				logger.info("daily limits updated");
			}
		} catch (URISyntaxException e) {
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_005.toString(),
					InvokeMessage.INVOKE_VALIDATE_TRANSFER_DETAIL_SERVICE_FAILED.toString());
		} catch (Exception e) {
			e.printStackTrace();
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_011.toString(),
					InvokeMessage.SAVE_TRANSACTION_FAILED.toString());
			transactionRes.setResponseHeader(resHeader);
		}

		try {
			deleteTransactionRequest(tr);
			logger.info("deleted transaction from OC_TRN_TRANSACTION_REQUEST table");
		} catch (Exception e) {
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_006.toString(),
					InvokeMessage.DELETE_TRANSFER_RECORD_FAILED.toString());
			transactionRes.setResponseHeader(resHeader);

		}
		try {
			if (resHeader.getReturnStatus() == null) {
				tr.setStatus(InvokeStatus.SUCCESS.toString());
			} else {
				tr.setStatus(InvokeStatus.FAIL.toString());
			}
			saveTransactionRequestHistory(tr);
			logger.info("transaction request moved to OC_TRN_TRANSACTION_REQUEST_H table");
		} catch (Exception e) {
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_007.toString(),
					InvokeMessage.SAVE_TRANSACTION_TO_RECORD_HISTORY_FAILED.toString());
			transactionRes.setResponseHeader(resHeader);
		}

		return transactionRes;
	}

	void saveTransactionRequest(TransactionRequest tr) {
		tr.setStatus("NEW");
		this.trRepo.save(tr);
	}

	void deleteTransactionRequest(TransactionRequest tr) {
		this.trRepo.deleteById(tr.getTransactionId());
	}

	void saveTransactionRequestHistory(TransactionRequest tr) {
		TransactionRequestHistory trH = new TransactionRequestHistory();
		trH.setBackendRefNumber(tr.getBackendRefNumber());
		trH.setBackendResponse(tr.getBackendResponse());
		trH.setBankCode(tr.getBankCode());
		trH.setBankName(tr.getBankName());
		trH.setBenificiaryRemarks(tr.getBenificiaryRemarks());
		trH.setCardName(tr.getCardName());
		trH.setCdciStatus(tr.getCdciStatus());
		trH.setChannel(tr.getChannel());
		trH.setCurrency(tr.getCurrency());
		trH.setExternalId(tr.getExternalId());
		trH.setFromAccountNumber(tr.getFromAccountNumber());
		trH.setMobileCashSenderMobile(tr.getMobileCashSenderMobile());
		trH.setMobileRecipientNIC(tr.getMobileRecipientNIC());
		trH.setMobileCashSenderNIC(tr.getMobileCashSenderNIC());
		trH.setMobileRecipientMobile(tr.getMobileRecipientMobile());
		trH.setMobileRecipientName(tr.getMobileRecipientName());
		trH.setRequestedDate(tr.getRequestedDate());
		trH.setSenderRemarks(tr.getSenderRemarks());
		trH.setStatus(tr.getStatus());
		trH.setToAccountNumber(tr.getToAccountNumber());
		trH.setTransactionAmount(tr.getTransactionAmount());
		trH.setTransactionCategory(tr.getTransactionCategory());
		trH.setTransactionId(tr.getTransactionId());
		trH.setTransactionType(tr.getTransactionType());
		trH.setScheduleId(tr.getScheduleId());
		trH.setTransferFrequency(tr.getTransferFrequency());
		trH.setNextSchedule(tr.getNextSchedule());
		trH.setNumOfTransfers(tr.getNumOfTransfers());
		trH.setFromAccountName(tr.getFromAccountName());
		trH.setToAccountName(tr.getToAccountName());
		trH.setNumOfTransfers(tr.getNumOfTransfers());
		trH.setUserName(tr.getUserName());
		this.trHistoryRepo.save(trH);
	}

	boolean validateBranch() {
		// TODO
		return false;
	}

	boolean validateLimits() {
		// TODO
		return false;
	}

	TransferResponse proceedTransfer(TransactionRequest tr) {
		TransactionType transferMode = tr.getTransactionType();
		TransactionCategory transferCategory = tr.getTransactionCategory();
		String bankCode = tr.getBankCode();

		if ((transferCategory.equals(TransactionCategory.OWN) || transferCategory.equals(TransactionCategory.TPS))
				|| (transferCategory.equals(TransactionCategory.OTH) && (bankCode.equals(sampathBankCode)))
				|| (transferCategory.equals(TransactionCategory.CC) && (bankCode.equals(sampathBankCode)))) {
			logger.info("initiating fiancle transfer");
			return processFinacleTransfer(tr);
		}
		if (transferCategory.equals(TransactionCategory.OTH) && (!bankCode.equals(sampathBankCode))
				|| transferCategory.equals(TransactionCategory.CC) && (!bankCode.equals(sampathBankCode))) {
			logger.info("initiating inter bank transfer");
			return processInterBankTransfer(tr);
		} else if (transferCategory.equals(TransactionCategory.SMC)||transferCategory.equals(TransactionCategory.MC)) {
			logger.info("initiating sampath mobile cash transfer");
			return processMobileCashTransfer(tr);
		} else {
			throw new RuntimeException("Not a fincale transfer, TransactionType : " + transferMode
					+ " TransactionCategory : " + transferCategory + " BankCode : " + bankCode);
		}
	}

	public TransferResponse processFinacleTransfer(TransactionRequest tr) {
		DoTransferRequestType transReq = new DoTransferRequestType();

		String beneRemarks = tr.getBenificiaryRemarks();
		String senderRemarks = tr.getSenderRemarks();
		String transMemo = "CMNBLK-01-" + memoPrefix + "-02-" + beneRemarks + "-03--04-" + senderRemarks + "-05-"
				+ memoPurpose;

		transReq.setAPPCode(appCode);
		transReq.setCDCICode(cdCICode);
		transReq.setController(controller);
		transReq.setDTxnAmount(tr.getTransactionAmount().doubleValue());
		transReq.setFromAccountNo(tr.getFromAccountNumber());
		transReq.setToAccountNo(tr.getToAccountNumber());
		transReq.setTransMemo(transMemo);
		transReq.setValueDate(sdf2.format(new Date()));

		// TODO below mapping needed or not?
		transReq.setFromCurrCode(tr.getCurrency());
		logger.info("finacle transfer request : " + transReq.toString());
		// TODO Call active doFinacleTransfer
		DoTransferResponseType transRes = finacleConsumerService.doFinacleTransfer(transReq);
		logger.info("finacle transfer response : " + transRes.toString());

		transferRes.setTransferReference(tr.getTransactionId());
		transferRes.setAuthenticationType("");

		ResponseHeader resHeader = new ResponseHeader();
		resHeader.setReturnCode(transRes.getActionCode());
		if (transRes.getActionCode().equals("000")) {
			resHeader.setReturnStatus(InvokeStatus.SUCCESS);
			resHeader.setReturnMessage(InvokeMessage.DO_FINACLE_TRANSFER_SUCCESS.toString());
		} else {
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(InvokeMessage.FAILED_TO_DO_FINACLE_TRANSFER.toString());
		}

		transferRes.setResponseHeader(resHeader);
		return transferRes;
	}

	public TransferResponse processInterBankTransfer(TransactionRequest tr) {

		ResponseHeader resHeader = new ResponseHeader();
		double chargeAmount;
	
		try {
				chargeAmount = this.getChargeCommissionAmount(tr);
		} catch (Exception ex) {
			logger.error("Process Inter Bank Transfer",ex);
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(ex.getMessage());
			transferRes.setResponseHeader(resHeader);
			return transferRes;
		}

	if (null != tr.getCommissionFromAccountNumber() && !tr.getCommissionFromAccountNumber().isEmpty()) {
			try {
				TransferResponse transResponse = this.doTransferWithCommissionAccount(tr, chargeAmount , true);
				if(null!=transResponse && transResponse.getResponseHeader().getReturnStatus().toString().equals(InvokeStatus.SUCCESS.toString())){
					chargeAmount = 0;
				}else{
					return transResponse;
				}
			} catch (Exception e) {
				resHeader.setReturnStatus(InvokeStatus.FAIL);
				resHeader.setReturnMessage(InvokeMessage.FAILED_TO_DO_FINACLE_TRANSFER_FOR_COMMISSION.toString());
				transferRes.setResponseHeader(resHeader);
				return transferRes;			}
		}
		TransactionCategory transferCategory = tr.getTransactionCategory();

		DoInterBankTransferRequestType interBnkReq = new DoInterBankTransferRequestType();

		interBnkReq.setAPPCode(appCode);
		interBnkReq.setController(controller);
		interBnkReq.setCDCICode(cdCICode);
		interBnkReq.setTerminalID(terminalID);
		interBnkReq.setFromAccNo(tr.getFromAccountNumber());
		interBnkReq.setFromAccType(fromAccountType);
		interBnkReq.setFromAccBankCode(fromAccountBankCode);
		interBnkReq.setToAccNo(tr.getToAccountNumber());
		interBnkReq.setToAccName(tr.getToAccountName());
		interBnkReq.setToAccType(toAccountType);
		interBnkReq.setToAccBankCode(tr.getBankCode());
		interBnkReq.setToAccBranchCode(tr.getBranchCode());
		interBnkReq.setTxnAmount(tr.getTransactionAmount().doubleValue());
		interBnkReq.setCommAmount(chargeAmount);
		interBnkReq.setCommAccount(commAccount);
		
		

		interBnkReq.setTranRemarks(tr.getBenificiaryRemarks());
		interBnkReq.setValueDate(sdf2.format(new Date()));
		if (transferCategory.equals(TransactionCategory.CC))
			interBnkReq.setCardNo(tr.getCardName());
		if (transferCategory.equals(TransactionCategory.OTH))
			interBnkReq.setSlipsCode(slipOthCode);
		else if (transferCategory.equals(TransactionCategory.CC))
			interBnkReq.setSlipsCode(slipCCCode);

		interBnkReq.setCEFTFlag(ceftFlag);

		interBnkReq.setChannelType(channelType);
		interBnkReq.setDrCurrencyCode(tr.getCurrency());
		interBnkReq.setFromAccName(tr.getFromAccountName());
		interBnkReq.setReference(tr.getBackendRefNumber());
		logger.info("inter bank request : " + interBnkReq.toString());
		DoInterBankTransferResponseType interBnkRes = finacleConsumerService.doInterbankTransfer(interBnkReq);
		logger.info("interbank transfer response : " + interBnkRes.toString());

		transferRes.setTransferReference(tr.getTransactionId());
		transferRes.setAuthenticationType("");

		resHeader.setReturnCode(interBnkRes.getActionCode());
		if (interBnkRes.getTxnStatus().equals("000")) {
			resHeader.setReturnStatus(InvokeStatus.SUCCESS);
			resHeader.setReturnMessage(InvokeMessage.DO_INTERBANK_TRANSFER_SUCCESS.toString());
		} else {
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(interBnkRes.getTxnStatusDesc());
		}
		transferRes.setResponseHeader(resHeader);

		return transferRes;
	}

	public TransferResponse processMobileCashTransfer(TransactionRequest tr) {
		
		double chargeAmount;
		
		try{
			chargeAmount = this.getChargeCommissionAmount(tr);
		}catch(Exception ex){
			ResponseHeader resHeader = new ResponseHeader();
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(ex.getMessage());
			transferRes.setResponseHeader(resHeader);
			return transferRes;
		}

		try {
			TransferResponse transResponse = this.doTransferWithCommissionAccount(tr, chargeAmount, false);
			if (null == transResponse && !transResponse.getResponseHeader().getReturnStatus().toString()
					.equalsIgnoreCase(InvokeStatus.SUCCESS.toString())) {
				return transResponse;
			}
		} catch (Exception e) {
			ResponseHeader resHeader = new ResponseHeader();
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(InvokeMessage.FAILED_TO_DO_FINACLE_TRANSFER_FOR_COMMISSION.toString());
			transferRes.setResponseHeader(resHeader);
			return transferRes;
		}
		
		Create createReq = new Create();

		User u = new User();
		u.setAppUser(tr.getUserName());
		u.setAppCode("SVR");

		CreateDataInt dataInt = new CreateDataInt();
		// dataInt.setCompanyID(303030);
		dataInt.setTxnType("POI");
		dataInt.setTxnStatus("U");
		dataInt.setTrWithdrawType("POI");
		dataInt.setAccount(tr.getFromAccountNumber());
		dataInt.setBeneID(tr.getMobileRecipientNIC());
		dataInt.setBeneName(tr.getMobileRecipientName());
		dataInt.setBeneTel(tr.getMobileRecipientMobile());
		dataInt.setCurrCode("LKR");
		dataInt.setDeductCommission("Y");
		dataInt.setSenderID(tr.getMobileCashSenderNIC());
		dataInt.setSenderName(tr.getUserName());
//TODO		dataInt.setSenderTitle(tr.get);
		dataInt.setSenderTel(tr.getMobileCashSenderMobile());
		dataInt.setSenderTel2(tr.getMobileRecipientMobile());
		dataInt.setTxnAmount(tr.getTransactionAmount().doubleValue());
		createReq.setCreateData(dataInt);
		createReq.setUser(u);

		if (mCashConsumerService.createMCash(createReq)) {
			// TODO mapping
			transferRes.setTransferReference(tr.getTransactionId());
			transferRes.setAuthenticationType("");

			ResponseHeader resHeader = new ResponseHeader();
			resHeader.setReturnStatus(InvokeStatus.SUCCESS);
			resHeader.setReturnMessage(InvokeMessage.DO_MOBILE_CASH_TRANSFER_SUCCESS.toString());
			transferRes.setResponseHeader(resHeader);
		} else {

			ResponseHeader resHeader = new ResponseHeader();
			resHeader.setReturnStatus(InvokeStatus.FAIL);
			resHeader.setReturnMessage(InvokeMessage.FAILED_TO_SUBMIT_MOBILE_CASH_TRANSFER.toString());
			transferRes.setResponseHeader(resHeader);
		}
		// logger.info("mcash transfer response : " + createRes.toString());

		return transferRes;
	}

	public GetFundTransfersResponseDTO getFundTransfers(GetFundTransfersRequestDTO getTransObj) {

		ResponseHeader resHeader = new ResponseHeader();
		GetFundTransfersResponseDTO transRes = new GetFundTransfersResponseDTO();

		String startDateStr = getTransObj.getTransferRequestedDateFrom();
		String endDateStr = getTransObj.getTransferRequestedDateto();

		logger.info("start date >> " + startDateStr);
		logger.info("end date >> " + endDateStr);

		Date sDate = null;
		Date eDate = null;
		try {
			if (startDateStr != null && !startDateStr.isEmpty())
				sDate = sdf.parse(startDateStr);
			if (endDateStr != null && !endDateStr.isEmpty())
				eDate = sdf.parse(endDateStr);

		} catch (ParseException e) {
			logger.info("date parsing excepiton");
			logger.error(e.getStackTrace());
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_003.toString(),
					InvokeMessage.DATE_PARSE_EXCEPTION.toString());
			transRes.setResponseHeader(resHeader);
			return transRes;
		}

		logger.info("start date >> " + sDate);
		logger.info("end date >> " + eDate);

		logger.info("inside get transfers service");

		int pageNumber = (1 / 200);
		int pageSize = 200;

		logger.info("page number > " + pageNumber);
		logger.info("page size > " + pageSize);
		Pageable pageable = new PageRequest(pageNumber, pageSize);

//Page<TransactionRequestHistory> trHPage= this.trHistoryRepo.findAll(pageable);
		TransactionCategory transferType = null;
		if (getTransObj.getTransferType() != null && !getTransObj.getTransferType().isEmpty()) {
			transferType = TransactionCategory.valueOf(getTransObj.getTransferType());
		}

		Iterator<TransactionRequestHistory> trHistoryItr = this.trHistoryRepo
				.findAll(generateFundTransferQuery(sDate, eDate, transferType, getTransObj), pageable).iterator();
		transRes.setListOfTransactions(new ArrayList<FundTransferDTO>());
		while (trHistoryItr.hasNext()) {
			TransactionRequestHistory txnHistoryObj = trHistoryItr.next();
			FundTransferDTO obj = new FundTransferDTO(txnHistoryObj.getTransactionId(),
					txnHistoryObj.getTransactionType(), txnHistoryObj.getTransactionCategory(),
					txnHistoryObj.getRequestedDate(), txnHistoryObj.getTransactionAmount(), txnHistoryObj.getCurrency(),
					txnHistoryObj.getFromAccountNumber(), txnHistoryObj.getToAccountNumber(),
					txnHistoryObj.getBankCode(), txnHistoryObj.getUserName(), txnHistoryObj.getRequestedDate(),
					txnHistoryObj.getTransferFrequency(), txnHistoryObj.getNextSchedule(),
					txnHistoryObj.getNumOfTransfers(), txnHistoryObj.getStatus());

			transRes.getListOfTransactions().add(obj);
		}
		;
		resHeader = new ResponseHeader(InvokeStatus.SUCCESS, InvokeMessage.GET_TRANSFERS_SUCCESS.toString());
		transRes.setResponseHeader(resHeader);

		return transRes;
	}

	public FundTransfersReportResponseDTO getFundTransferReport(FundTransferReportRequestDTO getTransObj) {

		ResponseHeader resHeader = new ResponseHeader();
		FundTransfersReportResponseDTO transRes = new FundTransfersReportResponseDTO();

		String startDateStr = getTransObj.getFromDate();
		String endDateStr = getTransObj.getToDate();

		logger.info("start date >> " + startDateStr);
		logger.info("end date >> " + endDateStr);

		Date sDate = null;
		Date eDate = null;
		try {
			if (startDateStr != null && !endDateStr.isEmpty())
				sDate = sdf.parse(startDateStr);
			if (endDateStr != null && !endDateStr.isEmpty())
				eDate = sdf.parse(endDateStr);

		} catch (ParseException e) {
			logger.info("date parsing excepiton");
			logger.error(e.getStackTrace());
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_003.toString(),
					InvokeMessage.DATE_PARSE_EXCEPTION.toString());
			transRes.setResponseHeader(resHeader);
			return transRes;
		}

		logger.info("start date >> " + sDate);
		logger.info("end date >> " + eDate);

		logger.info("inside get transfers service");

		Iterator<Object[]> itrList;
		if (sDate != null && eDate != null && getTransObj.getUserId() != null && !getTransObj.getUserId().isEmpty()) {
			itrList = this.trHistoryRepo.getFundTransferReports(sDate, eDate, getTransObj.getUserId()).iterator();
		} else if (sDate != null && eDate != null) {
			itrList = this.trHistoryRepo.getFundTransferReports(sDate, eDate).iterator();
		} else if (getTransObj.getUserId() != null && !getTransObj.getUserId().isEmpty()) {
			itrList = this.trHistoryRepo.getFundTransferReports(getTransObj.getUserId()).iterator();
		} else {
			itrList = this.trHistoryRepo.getFundTransferReports().iterator();
		}
		transRes.setListOfTransactions(new ArrayList<FundTransferReportDTO>());
		if (itrList != null) {
			while (itrList.hasNext()) {
				Object[] objNext = itrList.next();
				FundTransferReportDTO obj = new FundTransferReportDTO();
				obj.setTransactionType(objNext[0].toString());
				obj.setCurrency(objNext[1].toString());
				obj.setTransactionCount(Integer.parseInt(objNext[2].toString()));
				obj.setAmount(Double.parseDouble(objNext[3].toString()));
				transRes.getListOfTransactions().add(obj);
			}
		}
		resHeader = new ResponseHeader(InvokeStatus.SUCCESS, InvokeMessage.GET_TRANSFERS_SUCCESS.toString());
		transRes.setResponseHeader(resHeader);

		return transRes;
	}

	private Specification<TransactionRequestHistory> generateFundTransferQuery(Date sDate, Date eDate,
			TransactionCategory transferType, GetFundTransfersRequestDTO getTransObj) {

		Specification<TransactionRequestHistory> specification;
		specification = TransactionRequestSpecification.filterFromMinAndMaxAmount(getTransObj.getAmountFrom(),
				getTransObj.getAmountTo());

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromUserName(getTransObj.getUserId());
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromUserName(getTransObj.getUserId()));

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromTxnStartDateAndEndDate(sDate, eDate);
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromTxnStartDateAndEndDate(sDate, eDate));

		if (specification == null)
			specification = TransactionRequestSpecification.filterTransactionCategory(transferType);
		else
			specification = specification.and(TransactionRequestSpecification.filterTransactionCategory(transferType));

//		if (specification == null)
//			specification = TransactionRequestSpecification.filterFromExternelId(getTransObj.getTxnRequestedId());
//		else
//			specification = specification
//					.and(TransactionRequestSpecification.filterFromExternelId(getTransObj.getTxnRequestedId()));

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromStatus(getTransObj.getStatus());
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromStatus(getTransObj.getStatus()));

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromTxnRequestedId(getTransObj.getTxnRequestedId());
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromTxnRequestedId(getTransObj.getTxnRequestedId()));

		return specification;
	}
	private Specification<TransactionRequestHistory> generateTransferQuery(Date sDate, Date eDate,GetTransfers getTransObj) {
		

		Specification<TransactionRequestHistory> specification;
		specification = TransactionRequestSpecification
				.filterFromFromAccountNumber(getTransObj.getFromAccountNumber());

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromMaxAmount(getTransObj.getAmountMax());
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromMaxAmount(getTransObj.getAmountMax()));

		if (specification == null)
			specification = TransactionRequestSpecification.filterFromTxnStartDate(sDate);
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromTxnStartDate(sDate));
		
		if (specification == null)
			specification = TransactionRequestSpecification.filterFromTxnEndDate(eDate);
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromTxnEndDate(eDate));
		
		if (specification == null)
			specification = TransactionRequestSpecification.filterFromTransactionCategory(getTransObj.getTransferCategory());
		else
			specification = specification
					.and(TransactionRequestSpecification.filterFromTransactionCategory(getTransObj.getTransferCategory()));

		return specification;
	}

	public getTransfersResponse getTransfers(GetTransfers getTransObj) {

		ResponseHeader resHeader = new ResponseHeader();
		getTransfersResponse transRes = new getTransfersResponse();

		String startDateStr = getTransObj.getTxnRequestedStartDate();
		String endDateStr = getTransObj.getTxnRequestedEndDate();

		logger.info("start date >> " + startDateStr);
		logger.info("end date >> " + endDateStr);

		Date sDate = null;
		Date eDate = null;
		try {
			if (startDateStr != null)
				sDate = sdf.parse(startDateStr);
			if (endDateStr != null)
				eDate = sdf.parse(endDateStr);

		} catch (ParseException e) {
			logger.info("date parsing excepiton");
			logger.error(e.getStackTrace());
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_003.toString(),
					InvokeMessage.DATE_PARSE_EXCEPTION.toString());
			transRes.setResponseHeader(resHeader);
			return transRes;
		}

		logger.info("start date >> " + sDate);
		logger.info("end date >> " + eDate);

		logger.info("inside get transfers service");

		int pageNumber = (getTransObj.getStartRecord() / getTransObj.getNumberOfRecords());
		int pageSize = getTransObj.getNumberOfRecords();

		logger.info("page number > " + pageNumber);
		logger.info("page size > " + pageSize);
		Pageable pageable = new PageRequest(pageNumber, pageSize);

//		Page<TransactionRequestHistory> trHPage= this.trHistoryRepo.findAll(pageable);

		Page<TransactionRequestHistory> trHPage = this.trHistoryRepo.findAll(generateTransferQuery(sDate, eDate, getTransObj),
				pageable);

		transRes.setTrList(trHPage.getContent());
		resHeader = new ResponseHeader(InvokeStatus.SUCCESS, InvokeMessage.GET_TRANSFERS_SUCCESS.toString());
		transRes.setResponseHeader(resHeader);

		return transRes;
	}

	public WithdrawResponse withdrawMCash(WithdrawMCashRequest mcashObj) {
		this.withdrawMCRepo.save(mcashObj);

		DateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");

		User u = new User();
		u.setAppCode("AGT");
		u.setAppUser(mcashObj.getUserName());

		WithdrawDataInt withdrawIntObj = new WithdrawDataInt();
		withdrawIntObj.setAccount(mcashObj.getAccountNumber());
		withdrawIntObj.setBeneID(mcashObj.getBeneficiaryId());
		withdrawIntObj.setBeneMessage(mcashObj.getBeneficiaryMessage());
		withdrawIntObj.setBenePin(mcashObj.getBeneficiaryPin());
		withdrawIntObj.setCompanyName(mcashObj.getCompanyName());
		withdrawIntObj.setPaidBy(Integer.parseInt(mcashObj.getPaidBy()));
		withdrawIntObj.setPaidDate(sdf.format(mcashObj.getPaidDate()));
		withdrawIntObj.setSendMessage(mcashObj.getSendMessage());
		withdrawIntObj.setTxnAmount(mcashObj.getTxnAmount().doubleValue());
		withdrawIntObj.setTxnPin(mcashObj.getTxnPin());

		Withdraw withdrawObj = new Withdraw();
		withdrawObj.setUser(u);
		withdrawObj.setWithdrawData(withdrawIntObj);
		return this.mCashConsumerService.withdrawMCash(withdrawObj);
	}

	public ReverseResponse reverseMCash(ReverseMCashRequest mcashObj) {
		this.reverseMCRepo.save(mcashObj);

		User u = new User();
		u.setAppCode("AGT");
		u.setAppUser(mcashObj.getUserName());

		ReverseDataInt reverseIntObj = new ReverseDataInt();
		reverseIntObj.setBeneMessage(mcashObj.getBeneficiaryMessage());
		reverseIntObj.setCompanyName(mcashObj.getCompanyName());
		reverseIntObj.setSenderId(mcashObj.getSenderId());
		reverseIntObj.setSenderPin(mcashObj.getSenderPin());
		reverseIntObj.setSendMessage(mcashObj.getSendMessage());
		reverseIntObj.setSuspendBy(mcashObj.getSuspendedBy());
		reverseIntObj.setSuspendSol(mcashObj.getSuspendedSol());

		Reverse reverseObj = new Reverse();
		reverseObj.setUser(u);
		reverseObj.setReverseData(reverseIntObj);

		return this.mCashConsumerService.reverseMobileCash(reverseObj);
	}
	
	//Commission deduction
	private TransferResponse doTransferWithCommissionAccount(TransactionRequest tr, double chargeAmount, boolean isInterbanking){
			DoTransferRequestType transReq = new DoTransferRequestType();

			String beneRemarks = tr.getBenificiaryRemarks();
			String senderRemarks = tr.getSenderRemarks();
			String transMemo = "CMNBLK-01-" + memoPrefix + "-02-" + beneRemarks + "-03--04-" + senderRemarks + "-05-"
					+ memoPurpose;

			transReq.setAPPCode(appCode);
			transReq.setCDCICode(cdCICode);
			transReq.setController(controller);
			transReq.setDTxnAmount(chargeAmount);
			if(isInterbanking || (null != tr.getCommissionFromAccountNumber() && !tr.getCommissionFromAccountNumber().isEmpty())){
			transReq.setFromAccountNo(tr.getCommissionFromAccountNumber());
			}else{
				transReq.setFromAccountNo(tr.getFromAccountNumber());
			}
			transReq.setToAccountNo(commAccount);
			transReq.setTransMemo(transMemo);
			transReq.setValueDate(sdf2.format(new Date()));

			// TODO below mapping needed or not?
			transReq.setFromCurrCode(tr.getCurrency());
			logger.info("finacle transfer request : " + transReq.toString());
			// TODO Call active doFinacleTransfer
			try {
				DoTransferResponseType transRes = finacleConsumerService.doFinacleTransfer(transReq);
				logger.info("finacle transfer response : " + transRes.toString());

				transferRes.setTransferReference(tr.getTransactionId());
				transferRes.setAuthenticationType("");

				ResponseHeader respHeader = new ResponseHeader();
				respHeader.setReturnCode(transRes.getActionCode());
				if (transRes.getActionCode().equals("000")) {
					respHeader.setReturnStatus(InvokeStatus.SUCCESS);
					respHeader.setReturnMessage(InvokeMessage.DO_INTERBANK_TRANSFER_SUCCESS.toString());
				} else {
					respHeader.setReturnStatus(InvokeStatus.FAIL);
					respHeader.setReturnMessage(InvokeMessage.FAILED_TO_DO_FINACLE_TRANSFER_FOR_COMMISSION.toString());		
				}
				transferRes.setResponseHeader(respHeader);
				return transferRes;
			} catch (Exception e) {
				ResponseHeader respHeader = new ResponseHeader();
				respHeader.setReturnStatus(InvokeStatus.FAIL);
				respHeader.setReturnMessage(InvokeMessage.FAILED_TO_DO_FINACLE_TRANSFER_FOR_COMMISSION.toString());
				transferRes.setResponseHeader(respHeader);
				return transferRes;
			}
	}
	
	private double getChargeCommissionAmount(TransactionRequest tr) throws Exception{
		String  chargeProfileId;
		try {
			ProfileResponse profileResponse = restCustomerManagementService.getCustomerProfileInfo(tr.getUserName());
			if(profileResponse != null && profileResponse.getPayLoad() !=  null && profileResponse.getPayLoad() != null && profileResponse.getPayLoad().getProfileInformation() != null ) {
				chargeProfileId=  profileResponse.getPayLoad().getProfileInformation().getChargeProfile();
			}else {
				throw new Exception(InvokeMessage.PROFILE_NOT_FOUND.toString());
			}
		}catch (Exception ex) {
			throw new Exception(InvokeMessage.ISSUE_ON_RETRIEVING_PROFILE.toString());
		}
		try {
			return restChargeProfileService.getChargeProfile(tr.getUserName(), chargeProfileId, tr.getTransactionCategory().toString());
		}catch (Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}
}
