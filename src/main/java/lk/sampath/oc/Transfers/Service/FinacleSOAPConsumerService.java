package lk.sampath.oc.Transfers.Service;

import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;
import lk.sampath.oc.Transfers.Pojo.ResponseHeader;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoInterBankTransferFault;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoInterBankTransferRequestType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoInterBankTransferResponseType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferFault;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferRequestType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferResponseType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.IIBFinacleIntegration;
import lk.sampath.oc.Transfers.integration.finacleIntegration.IIBFinacleIntegration_Service;

@Service
@SuppressWarnings("unchecked")
public class FinacleSOAPConsumerService {

	private static Logger logger = LogManager.getLogger(FinacleSOAPConsumerService.class);
	@Value("${service.url.iib.finacle.wsdl}")
	private String iibFinacleWsdl;

	ResponseHeader validateDebitAccount() {
		// TODO
		ResponseHeader res = new ResponseHeader(InvokeStatus.SUCCESS,
				InvokeMessage.VALIDATE_DEBIT_ACCOUNT_SUCCESS.toString());
		return res;
	}

	ResponseHeader getAdditionalDetails() {
		ResponseHeader res = new ResponseHeader(InvokeStatus.SUCCESS,
				InvokeMessage.GET_ADDITIONAL_DETAILS_SUCCESS.toString());
		return res;
	}

	DoTransferResponseType doFinacleTransfer(DoTransferRequestType transferReq) {
		logger.info("calling soap api for finacle transfer");

		try {
			URL url = ClassLoader.getSystemResource("wsdl/IIBFinacleIntegration.wsdl");

			IIBFinacleIntegration_Service service = new IIBFinacleIntegration_Service(url);

			IIBFinacleIntegration proxy = service.getIIBFinacleIntegrationSOAP();
			((BindingProvider) proxy).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
					iibFinacleWsdl);

			logger.info("Using endpoint URL: "
					+ ((BindingProvider) proxy).getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));

			DoTransferResponseType response = proxy.doTransfer(transferReq);

//		
//		service.getIIBFinacleIntegrationSOAP()
//		service.getPort(IIBFinacleIntegration)
//		
//		JAXBElement<DoTransferResponseType> response = (JAXBElement<DoTransferResponseType>) getWebServiceTemplate()
//				.marshalSendAndReceive(iibFinacleWsdl, transferReq,
//						new SoapActionCallback("http://www.sampath.lk/SD/IIBFinacleIntegration/DoTransferRequest"));
//
//		System.out.println(response.getValue().toString());
			return response;
		} catch (DoTransferFault e) {
logger.error("Fail to doFinacleTransfer",e);
			
		}
		return null;
	}

	DoInterBankTransferResponseType doInterbankTransfer(DoInterBankTransferRequestType transferReq) {
		logger.info("calling soap api for interbank transfer");

		try {
			URL url = ClassLoader.getSystemResource("wsdl/IIBFinacleIntegration.wsdl");
			IIBFinacleIntegration_Service service = new IIBFinacleIntegration_Service(url);
			IIBFinacleIntegration proxy = service.getIIBFinacleIntegrationSOAP();
			((BindingProvider) proxy).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
					iibFinacleWsdl);

			DoInterBankTransferResponseType response;
			
			response = proxy.doInterBankTransfer(transferReq);
			if (response == null) {
				return null;
			} else {
				return response;
			}
		} catch (DoInterBankTransferFault e) {
			// TODO Auto-generated catch block
			logger.error("Fail to doInterbankTransfer",e);
		} catch(Exception ex) {
			logger.error("Fail to doInterbankTransfer",ex);
		}
		return null;
	}

}
