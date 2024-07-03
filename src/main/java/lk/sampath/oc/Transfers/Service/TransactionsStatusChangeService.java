package lk.sampath.oc.Transfers.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import lk.sampath.oc.Transfers.Entity.TransactionRequestHistory;
import lk.sampath.oc.Transfers.Entity.TransactionStatusChange;
import lk.sampath.oc.Transfers.Entity.TransactionStatusChangeHistory;
import lk.sampath.oc.Transfers.Enums.ErrorCode;
import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;
import lk.sampath.oc.Transfers.Pojo.approval.ApprovalDTO;
import lk.sampath.oc.Transfers.Pojo.approval.ApprovalListResponseDTO;
import lk.sampath.oc.Transfers.Pojo.approval.ApprovalResponseDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.ApprovedTransferStatusUpdateResponse;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.SubmitTransferStatusChangeRequestDTO;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.SubmitTransferStatusUpdateResponse;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.TransferStatusAuthorizationsOutputDto;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.TransferStatusAuthorizationsResponse;
import lk.sampath.oc.Transfers.Pojo.txnStatusChange.TransferStatusUpdateDTO;
import lk.sampath.oc.Transfers.Repository.TransactionHistoryRepository;
import lk.sampath.oc.Transfers.Repository.TransactionStatusChangeHistoryRepository;
import lk.sampath.oc.Transfers.Repository.TransactionStatusChangeRepository;

@Service
public class TransactionsStatusChangeService {
	private static Logger logger = LogManager.getLogger(TransactionsStatusChangeService.class);

	private static final String APPROVAL_TYPE = "TRANSACTION";
	private static final String PENDING_STATUS = "PENDING";
	@Autowired
	private TransactionStatusChangeRepository transactionStatusChangeRepository;
	@Autowired
	private TransactionHistoryRepository transactionHistoryRepository;
	@Autowired
	private TransactionStatusChangeHistoryRepository transactionStatusChangeHistoryRepository;
	@Autowired
	private RestConsumerApprovalService restConsumerApprovalService;

	public SubmitTransferStatusUpdateResponse submitTransferStatusUpdate(

			SubmitTransferStatusChangeRequestDTO submitTransferStatusUpdate) {
		// TODO Create Call TXN Call
		SubmitTransferStatusUpdateResponse response = new SubmitTransferStatusUpdateResponse();
		try {
			TransactionRequestHistory transactionRequestHistory =  new TransactionRequestHistory();
			transactionRequestHistory.setTransactionId(submitTransferStatusUpdate.getTransferRequestId());
			transactionStatusChangeRepository.findByTransactionRequestHistory(transactionRequestHistory);

			/**
			 * Create new request and sending to the api
			 */
			ApprovalDTO approvalDto = new ApprovalDTO();
			approvalDto.setReferenceId(submitTransferStatusUpdate.getTransferRequestId());
			approvalDto.setType(APPROVAL_TYPE);
			ApprovalResponseDTO approvalResponseDTO = restConsumerApprovalService.createApproval(approvalDto,
					submitTransferStatusUpdate.getAdminUserId(),submitTransferStatusUpdate.getUserGroup());

			TransactionStatusChange entity = new TransactionStatusChange();
			entity.setAdminUserId(submitTransferStatusUpdate.getAdminUserId());
			entity.setNewStatus(submitTransferStatusUpdate.getNewStatus());
			entity.setUserGroup(submitTransferStatusUpdate.getUserGroup());
			entity.setTransactionRequestHistory(
					transactionHistoryRepository.getOne(submitTransferStatusUpdate.getTransferRequestId()));
			
			
			entity.setApprovalId(approvalResponseDTO.getPayLoad().getApprovalID());
			transactionStatusChangeRepository.save(entity);
			response.setReturnCode(ErrorCode.TR_001.toString());
			response.setApprovalId(entity.getApprovalId());
			response.setReturnStatus(InvokeStatus.SUCCESS);
			response.setReturnMessage(InvokeMessage.TRANSACTION_STATUS_CHANGE_REQUEST_SUBMMITED.toString());
		} catch (Exception ex) {
			logger.error(InvokeMessage.FAILED_TO_SUBMIT_TRANSACTION_STATUS_CHANGE_REQUEST,ex);
			response.setReturnStatus(InvokeStatus.FAIL);
			response.setReturnCode(ErrorCode.TR_002.toString());
			response.setReturnMessage(InvokeMessage.FAILED_TO_SUBMIT_TRANSACTION_STATUS_CHANGE_REQUEST.toString());
		}
		return response;
	}

	public TransferStatusAuthorizationsResponse getTransferStatusAuthorizations(@RequestBody String adminUserId) {

		TransferStatusAuthorizationsResponse responseObj = new TransferStatusAuthorizationsResponse();
		responseObj.setListOfTransactions(new ArrayList<TransferStatusAuthorizationsOutputDto>());
		int pageNumber = (1 / 200);
		int pageSize = 200;
		try {

			logger.debug("page number > " + pageNumber);
			logger.debug("page size > " + pageSize);
			Pageable pageable = new PageRequest(pageNumber, pageSize);
			
			Iterator<TransactionStatusChange> itrTxnObject = this.transactionStatusChangeRepository.findAll(pageable)
					.iterator();

			while (itrTxnObject.hasNext()) {
				TransactionStatusChange entity = itrTxnObject.next();
				TransferStatusAuthorizationsOutputDto obj = new TransferStatusAuthorizationsOutputDto();
				obj.setAmount(entity.getTransactionRequestHistory().getTransactionAmount());
				obj.setApprovalId(entity.getApprovalId());
				obj.setCurrency(entity.getTransactionRequestHistory().getCurrency());
				obj.setFromAccount(entity.getTransactionRequestHistory().getFromAccountNumber());
				obj.setNewStatus(entity.getNewStatus());
				obj.setStatus(entity.getTransactionRequestHistory().getStatus());
				obj.setToAccount(entity.getTransactionRequestHistory().getToAccountNumber());
				obj.setToBank(entity.getTransactionRequestHistory().getBankCode());
				obj.setTransferRequestDate(entity.getTransactionRequestHistory().getRequestedDate());
				obj.setTransferRequestId(entity.getTransactionRequestHistory().getTransactionId());
				obj.setTransferType(entity.getTransactionRequestHistory().getTransactionCategory().toString());
				obj.setUserId(entity.getTransactionRequestHistory().getUserName());
				responseObj.getListOfTransactions().add(obj);
			}
			
			responseObj.setReturnCode(ErrorCode.TR_001.toString());
			responseObj.setReturnMessage(InvokeMessage.GET_PENDING_TRANSFER_REQUEST_SUCCESS.toString());
		} catch (Exception ex) {
			responseObj.setReturnCode(ErrorCode.TR_002.toString());
			responseObj.setReturnMessage(InvokeMessage.GET_PENDING_TRANSFER_REQUEST_FAILED.toString());
		}

		return responseObj;
	}
	
	public TransferStatusAuthorizationsResponse getTransferStatusAuthorizationsByGroupID( String groupID,String userName) {
		
		
		TransferStatusAuthorizationsResponse responseObj = new TransferStatusAuthorizationsResponse();
		responseObj.setListOfTransactions(new ArrayList<TransferStatusAuthorizationsOutputDto>());
		try {
			
			ApprovalListResponseDTO approvalListResponseDTO=restConsumerApprovalService.retrieveApprovals(PENDING_STATUS, APPROVAL_TYPE, groupID,userName);
			
			Iterator<ApprovalDTO>  itrApprovalDTO = approvalListResponseDTO.getListOfApprovals().iterator();
			while (itrApprovalDTO.hasNext()) {
				ApprovalDTO approvalDTO =itrApprovalDTO.next();
				TransactionStatusChange entity = this.transactionStatusChangeRepository.findByApprovalId(approvalDTO.getApprovalID()).get();
				TransferStatusAuthorizationsOutputDto obj = new TransferStatusAuthorizationsOutputDto();
				obj.setAmount(entity.getTransactionRequestHistory().getTransactionAmount());
				obj.setApprovalId(entity.getApprovalId());
				obj.setCurrency(entity.getTransactionRequestHistory().getCurrency());
				obj.setFromAccount(entity.getTransactionRequestHistory().getFromAccountNumber());
				obj.setNewStatus(entity.getNewStatus());
				obj.setStatus(entity.getTransactionRequestHistory().getStatus());
				obj.setToAccount(entity.getTransactionRequestHistory().getToAccountNumber());
				obj.setToBank(entity.getTransactionRequestHistory().getBankCode());
				obj.setTransferRequestDate(entity.getTransactionRequestHistory().getRequestedDate());
				obj.setTransferRequestId(entity.getTransactionRequestHistory().getTransactionId());
				obj.setTransferType(entity.getTransactionRequestHistory().getTransactionCategory().toString());
				obj.setUserId(entity.getTransactionRequestHistory().getUserName());
				responseObj.getListOfTransactions().add(obj);
			}
			
			responseObj.setReturnCode(ErrorCode.TR_001.toString());
			responseObj.setReturnMessage(InvokeMessage.GET_PENDING_TRANSFER_REQUEST_SUCCESS.toString());
		} catch (Exception ex) {
			logger.error(InvokeMessage.GET_PENDING_TRANSFER_REQUEST_FAILED,ex);
			responseObj.setReturnCode(ErrorCode.TR_002.toString());
			responseObj.setReturnMessage(InvokeMessage.GET_PENDING_TRANSFER_REQUEST_FAILED.toString());
		}

		return responseObj;
	}

	public ApprovedTransferStatusUpdateResponse approveTransferStatusUpdate(
			@RequestBody TransferStatusUpdateDTO approveTransferStatusUpdateDto) {
		// TODO Create Call TXN Call
		ApprovedTransferStatusUpdateResponse response = new ApprovedTransferStatusUpdateResponse();
		try {

			Optional<TransactionStatusChange> transactionStatusChange = transactionStatusChangeRepository
					.findByApprovalId(approveTransferStatusUpdateDto.getApprovalId());
			if (!transactionStatusChange.isPresent()) {
				response.setReturnStatus(InvokeStatus.SUCCESS);
				response.setReturnCode(ErrorCode.TR_002.toString());
				response.setReturnMessage(InvokeMessage.TRANSACTION_STATUS_CHANGE_REQUEST_NOT_EXISTS.toString());
				return response;
			}
			TransactionStatusChange obj = transactionStatusChange.get();

			ApprovalDTO approvalDto = new ApprovalDTO();
			approvalDto.setApprovalID(approveTransferStatusUpdateDto.getApprovalId());
			approvalDto.setApprover(approveTransferStatusUpdateDto.getAdminUserId());
			approvalDto.setApprovalStatus(approveTransferStatusUpdateDto.getAction().toString());
			approvalDto.setComment(approveTransferStatusUpdateDto.getComments());
			approvalDto.setReferenceId(obj.getTransactionRequestHistory().getTransactionId());
			ApprovalResponseDTO approvalResponseDTO = restConsumerApprovalService.approve(approvalDto,
					approveTransferStatusUpdateDto.getAdminUserId(),approveTransferStatusUpdateDto.getUserGroup());
			if (approvalResponseDTO.getApprovalStatus().equals("VERIFIED")) {
				TransactionStatusChangeHistory objHistory = new TransactionStatusChangeHistory();
				objHistory.setAdminUserId(obj.getAdminUserId());
				objHistory.setApprovalAction(approveTransferStatusUpdateDto.getAction());
				objHistory.setApprovalId(obj.getApprovalId());
				objHistory.setComment(approveTransferStatusUpdateDto.getComments());
				objHistory.setNewStatus(obj.getNewStatus());
				objHistory.setTransactionRequestHistory(obj.getTransactionRequestHistory());
				transactionStatusChangeHistoryRepository.save(objHistory);
				transactionStatusChangeRepository.delete(obj);
				response.setReturnStatus(InvokeStatus.SUCCESS);
				response.setReturnCode(ErrorCode.TR_001.toString());
				response.setComment(approveTransferStatusUpdateDto.getComments());
				response.setReturnMessage(InvokeMessage.APPROVAL_REQUEST_SUBMIT_SUCCESSFULLY.toString());
			} else {
				response.setReturnStatus(InvokeStatus.FAIL);
				response.setReturnCode(ErrorCode.TR_003.toString());
				response.setReturnMessage(approvalResponseDTO.getReturnMessage());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			response.setReturnStatus(InvokeStatus.FAIL);
			response.setReturnCode(ErrorCode.TR_002.toString());
			response.setReturnMessage(InvokeMessage.FAILED_TO_SUBMIT_APPROVAL_REQUEST.toString());
		}
		return response;
	}

}
