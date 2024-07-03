package lk.sampath.oc.Transfers.Service;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import lk.sampath.oc.Transfers.Entity.TransactionRequest;
import lk.sampath.oc.Transfers.Enums.ErrorCode;
import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;
import lk.sampath.oc.Transfers.Pojo.DailyTransactionDTO;
import lk.sampath.oc.Transfers.Pojo.ResponseHeader;
import lk.sampath.oc.Transfers.Pojo.UpdateDailyLimitsOutput;
import lk.sampath.oc.Transfers.Pojo.ValidateTransferOutput;
import lk.sampath.oc.Transfers.Pojo.ValidateTransferResponse;

@Service
public class RestConsumerService {

	private static Logger logger = LogManager.getLogger(RestConsumerService.class);

	RestTemplate restTemplate = new RestTemplate();

	@Value("${service.url.transferDetail.endpoint}")
	private String transferDetailServiceBaseUrl;

	@Value("${service.url.approvals.endpoint}")
	private String approvalsBaseUrl;

	public ValidateTransferResponse validateTransactionDetails(TransactionRequest requestBody) {

		logger.info("calling validate transfer details rest api");
		ValidateTransferResponse validateTransferDetailResponse = new ValidateTransferResponse();
//		String transferDetailServiceUrl ="http://192.125.125.111:9081/trd/validateTransferDetail";
		String transferDetailServiceUrl = transferDetailServiceBaseUrl + "/validateTransferDetail";
		URI transferDetailServiceUri;
		try {
			transferDetailServiceUri = new URI(transferDetailServiceUrl);
			ValidateTransferOutput validateTransferDetailOut = restTemplate.postForObject(transferDetailServiceUri,
					requestBody, ValidateTransferOutput.class);
			logger.info(validateTransferDetailOut.toString());

			ResponseHeader resHeader;
			if (validateTransferDetailOut.getInvokeStatus().equals(InvokeStatus.SUCCESS)) {
				resHeader = new ResponseHeader(
						InvokeStatus.valueOf(validateTransferDetailOut.getInvokeStatus().toString()),
						InvokeMessage.VALIDATE_TRANSFER_DETAILS_SUCCESS.toString());
			} else {
				resHeader = new ResponseHeader(
						InvokeStatus.valueOf(validateTransferDetailOut.getInvokeStatus().toString()),
						ErrorCode.TR_008.toString(), validateTransferDetailOut.getInvokeMessage().toString());
			}
			validateTransferDetailResponse.setResponseHeader(resHeader);

		} catch (RestClientException e) {
			logger.error("invoke failed. cannot access url", e);
			ResponseHeader resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_005.toString(),
					e.getMessage());
			validateTransferDetailResponse.setResponseHeader(resHeader);
		} catch (Exception e) {
			System.out.println("invoke failed. cannot access url");
			logger.error("Consumer Connection error",e);
			ResponseHeader resHeader = new ResponseHeader(InvokeStatus.FAIL, ErrorCode.TR_005.toString(),
					InvokeMessage.INVOKE_VALIDATE_TRANSFER_DETAIL_SERVICE_FAILED.toString());
			validateTransferDetailResponse.setResponseHeader(resHeader);
		}
		System.out.println(validateTransferDetailResponse.toString());
		return validateTransferDetailResponse;
	}

	public void saveDailyTransactionLimits(DailyTransactionDTO dailyTransaction) throws URISyntaxException {
		logger.info("calling update daily limits rest api");
		// String transferDetailServiceUrl
		// ="http://192.125.125.111:9081/trd/updateDailyLimits";
		String transferDetailServiceUrl = transferDetailServiceBaseUrl + "/updateDailyLimits";
		URI transferDetailServiceUri = new URI(transferDetailServiceUrl);
		UpdateDailyLimitsOutput saveDailyTransactionResponse = null;
		saveDailyTransactionResponse = restTemplate.postForObject(transferDetailServiceUri, dailyTransaction,
				UpdateDailyLimitsOutput.class);
		System.out.println(saveDailyTransactionResponse.toString());

	}

}
