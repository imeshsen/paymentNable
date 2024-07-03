package lk.sampath.oc.Transfers.Controllers;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lk.sampath.oc.Transfers.Entity.ReverseMCashRequest;
import lk.sampath.oc.Transfers.Entity.TransactionRequest;
import lk.sampath.oc.Transfers.Entity.TransactionRequestHistory;
import lk.sampath.oc.Transfers.Entity.WithdrawMCashRequest;
import lk.sampath.oc.Transfers.Enums.ErrorCode;
import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;
import lk.sampath.oc.Transfers.Pojo.FundTransferDTO;
import lk.sampath.oc.Transfers.Pojo.GetTransfers;
import lk.sampath.oc.Transfers.Pojo.ResponseHeader;
import lk.sampath.oc.Transfers.Pojo.ReverseMCashResponse;
import lk.sampath.oc.Transfers.Pojo.TransferResponse;
import lk.sampath.oc.Transfers.Pojo.ValidateTransferResponse;
import lk.sampath.oc.Transfers.Pojo.WithdrawMCashResponse;
import lk.sampath.oc.Transfers.Pojo.getTransfersResponse;
import lk.sampath.oc.Transfers.Pojo.reports.FundTransferReportDTO;
import lk.sampath.oc.Transfers.Pojo.reports.FundTransferReportRequestDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.FundTransfersReportResponseDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.GetFundTransfersRequestDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.GetFundTransfersResponseDTO;
import lk.sampath.oc.Transfers.Service.TransactionService;
import lk.sampath.oc.Transfers.integration.mcash.ReverseResponse;
import lk.sampath.oc.Transfers.integration.mcash.WithdrawResponse;

@RestController
public class TransferController {

	private static Logger logger = LogManager.getLogger(TransferController.class);

	@Autowired
	private TransactionService transService;

	@RequestMapping(value = "/transactions/validate", method = RequestMethod.POST)
	public ValidateTransferResponse validateTransfer(@RequestBody TransactionRequest tr) {
		ThreadContext.put("id", tr.getUserName());
		ThreadContext.put("apiName", "validateTransfer");
		ThreadContext.put("user", tr.getUserName());
		logger.info("validate transfer request : " + tr.toString());
		return this.transService.validateTransfer(tr);
	}

	@RequestMapping(value = "/transactions/add", method = RequestMethod.POST)
	public ResponseEntity<TransferResponse> doTransfer(@RequestBody TransactionRequest tr) {
		ThreadContext.put("id", tr.getUserName());
		ThreadContext.put("apiName", "doTransfer");
		ThreadContext.put("user", tr.getUserName());

		logger.info("do transfer request : " + tr.toString());

		System.out.println(tr.getRequestedDate());

		tr.setRequestedDate(new Date());
		tr.setNextSchedule(new Date());

		ResponseHeader responseHeader = this.transService.validateTransfer(tr).getResponseHeader();
		if (responseHeader.getReturnStatus().equals(InvokeStatus.SUCCESS)) {
			logger.info("transfer validate success");
			TransferResponse obj = this.transService.doTransfer(tr);
			if (obj.getResponseHeader().getReturnStatus().equals(InvokeStatus.SUCCESS))
				return new ResponseEntity<TransferResponse>(obj, HttpStatus.OK);
			else {
				return new ResponseEntity<TransferResponse>(obj, HttpStatus.BAD_REQUEST);
			}
		} else {
			logger.info("transfer validate failed");
			TransferResponse trRes = new TransferResponse();
			trRes.setResponseHeader(responseHeader);
			return new ResponseEntity<TransferResponse>(trRes, HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(path = "/transactions/getTransfers", method = RequestMethod.POST)
	public getTransfersResponse getTransfers(@RequestBody GetTransfers getTransObj) {
		ThreadContext.put("id", getTransObj.getUserName());
		ThreadContext.put("apiName", "getTransfers");
		ThreadContext.put("user", getTransObj.getUserName());

		logger.info("get transfers request ");

		getTransfersResponse trRes = new getTransfersResponse();

		try {
			trRes = this.transService.getTransfers(getTransObj);
			List<TransactionRequestHistory> trList = trRes.getTrList();
			logger.info("transaction list retrieved  : ");
			trList.forEach((trObj) -> {
				logger.info(trObj.toString());
			});
		} catch (Exception e) {
			ResponseHeader header = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_004.toString(),
					InvokeMessage.GET_TRANSFERS_FAILED.toString());
			trRes.setResponseHeader(header);
		}
		return trRes;
	}

	@RequestMapping(path = "/transactions/getFundTransfers", method = RequestMethod.POST)
	public GetFundTransfersResponseDTO getFundTransfers(@RequestBody GetFundTransfersRequestDTO getFundTransfers) {
		ThreadContext.put("id", getFundTransfers.getAdminUserId());
		ThreadContext.put("apiName", "getFundTransfers");
		ThreadContext.put("user", getFundTransfers.getAdminUserId());

		logger.info("get fund transfers request ");

		GetFundTransfersResponseDTO trRes = new GetFundTransfersResponseDTO();

		try {
			trRes = this.transService.getFundTransfers(getFundTransfers);
			List<FundTransferDTO> trList = trRes.getListOfTransactions();
			logger.info("transaction list retrieved  : ");
//			trList.forEach((trObj) -> {
//				logger.info(trObj.toString());
//			});
		} catch (Exception e) {
			e.printStackTrace();
			ResponseHeader header = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_004.toString(),
					InvokeMessage.GET_TRANSFERS_FAILED.toString());
			trRes.setResponseHeader(header);
		}
		return trRes;
	}

	@RequestMapping(path = "/transactions/getFundTransferReport", method = RequestMethod.POST)
	public FundTransfersReportResponseDTO getFundTransfersReport(
			@RequestBody FundTransferReportRequestDTO fundTransferReportDTO) {
		ThreadContext.put("id", fundTransferReportDTO.getAdminUserId());
		ThreadContext.put("apiName", "getFundTransferReport");
		ThreadContext.put("user", fundTransferReportDTO.getAdminUserId());

		logger.info("get fund transfer report request ");

		FundTransfersReportResponseDTO trRes = new FundTransfersReportResponseDTO();

		try {
			trRes = this.transService.getFundTransferReport(fundTransferReportDTO);
			List<FundTransferReportDTO> trList = trRes.getListOfTransactions();
			logger.info("transaction list retrieved  : ");
			trList.forEach((trObj) -> {
				logger.info(trObj.toString());
			});
		} catch (Exception e) {
			e.printStackTrace();
			ResponseHeader header = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_004.toString(),
					InvokeMessage.GET_TRANSFERS_FAILED.toString());
			trRes.setResponseHeader(header);
		}
		return trRes;
	}

	@RequestMapping(value = "/withdrawMobileCash", method = RequestMethod.POST)
	public WithdrawMCashResponse withdrawMobileCash(@RequestBody WithdrawMCashRequest withdrawMCashReq) {
		ThreadContext.put("id", withdrawMCashReq.getUserName());
		ThreadContext.put("apiName", "withdrawMCash");
		ThreadContext.put("user", withdrawMCashReq.getUserName());
		logger.info("withdraw mobile cash request : " + withdrawMCashReq.toString());

		WithdrawMCashResponse mcashRes = new WithdrawMCashResponse();
		ResponseHeader resHeader;

		try {
			WithdrawResponse res = this.transService.withdrawMCash(withdrawMCashReq);
			resHeader = new ResponseHeader(InvokeStatus.SUCCESS, InvokeMessage.WITHDRAW_MOBILE_CASH_SUCCESS.toString());
			mcashRes.setResponseHeader(resHeader);
			mcashRes.setWithdrawResponse(res);
		} catch (Exception e) {
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_001.toString(),
					InvokeMessage.WITHDRAW_MOBILE_CASH_FAILED.toString());
			mcashRes.setResponseHeader(resHeader);
		}
		return mcashRes;
	}

	@RequestMapping(value = "/reverseMobileCash", method = RequestMethod.POST)
	public ReverseMCashResponse reverseMobileCash(@RequestBody ReverseMCashRequest reverseMCashReq) {
		ThreadContext.put("id", reverseMCashReq.getUserName());
		ThreadContext.put("apiName", "reverseMCash");
		ThreadContext.put("user", reverseMCashReq.getUserName());
		logger.info("reverse mobile cash request : " + reverseMCashReq.toString());

		ReverseMCashResponse mcashRes = new ReverseMCashResponse();
		ResponseHeader resHeader;

		try {
			ReverseResponse res = this.transService.reverseMCash(reverseMCashReq);
			resHeader = new ResponseHeader(InvokeStatus.SUCCESS, InvokeMessage.REVERSE_MOBILE_CASH_SUCCESS.toString());
			mcashRes.setResponseHeader(resHeader);
			mcashRes.setReverseResponse(res);
		} catch (Exception e) {
			resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_002.toString(),
					InvokeMessage.REVERSE_MOBILE_CASH_FAILED.toString());
			mcashRes.setResponseHeader(resHeader);
		}

		return mcashRes;
	}

//	@RequestMapping(value="/reverseMobileCash", method=RequestMethod.GET)
//	public ReverseMCashRequest getreverseMobileCash() {
//		ReverseMCashRequest m=new ReverseMCashRequest("Krishni", "TRMC001", "beneficiaryMessage", "companyName", "sendMessage", "senderId", "senderPin", "suspendedBy", "suspendedSol");
//		return m;
//	}
//	
//	@RequestMapping(value="/withdrawMobileCash", method=RequestMethod.GET)
//	public WithdrawMCashRequest getwithdrawMobileCash() {
//		WithdrawMCashRequest m=new WithdrawMCashRequest("Krishni", "TRMC002", "03910018074", "beneId", "beneMsg", "benePin", "companyName", "paidBy", new Date(), "sendMessage", new BigDecimal(123.22),"1234");
//		return m;
//	}

}
