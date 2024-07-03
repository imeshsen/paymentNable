package lk.sampath.oc.Transfers.Service;

import java.net.URL;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import lk.sampath.oc.Transfers.integration.finacleIntegration.DoTransferResponseType;
import lk.sampath.oc.Transfers.integration.finacleIntegration.IIBFinacleIntegration;
import lk.sampath.oc.Transfers.integration.finacleIntegration.IIBFinacleIntegration_Service;
import lk.sampath.oc.Transfers.integration.mcash.Create;
import lk.sampath.oc.Transfers.integration.mcash.CreateResponse;
import lk.sampath.oc.Transfers.integration.mcash.MCashAuthenticationException_Exception;
import lk.sampath.oc.Transfers.integration.mcash.MCashException_Exception;
import lk.sampath.oc.Transfers.integration.mcash.MCashServices;
import lk.sampath.oc.Transfers.integration.mcash.MCashServices_Service;
import lk.sampath.oc.Transfers.integration.mcash.MCashSystemException_Exception;
import lk.sampath.oc.Transfers.integration.mcash.MCashValidationException_Exception;
import lk.sampath.oc.Transfers.integration.mcash.ResultData;
import lk.sampath.oc.Transfers.integration.mcash.Reverse;
import lk.sampath.oc.Transfers.integration.mcash.ReverseResponse;
import lk.sampath.oc.Transfers.integration.mcash.Withdraw;
import lk.sampath.oc.Transfers.integration.mcash.WithdrawResponse;

@Service
@SuppressWarnings("unchecked")
public class MCashSOAPConsumerService extends WebServiceGatewaySupport {

	private static Logger logger = LogManager.getLogger(MCashSOAPConsumerService.class);
	@Value("${service.url.mcash.endpoint}")
	private String mCashEndpoint;

	WithdrawResponse withdrawMCash(Withdraw withdrawReq) {
		logger.info("calling soap api for mcash withdraw");
		JAXBElement<WithdrawResponse> response = (JAXBElement<WithdrawResponse>) getWebServiceTemplate()
				// .marshalSendAndReceive("http://192.125.125.96:7003/MobileCashServices/MCashServices",
				// withdrawReq,
				// .marshalSendAndReceive("http://localhost:8088/mockMCashServicesPortBinding",
				// withdrawReq,
				.marshalSendAndReceive(mCashEndpoint, withdrawReq, new SoapActionCallback(""));
		System.out.println(response.getValue().toString());
		return response.getValue();
	}

	ReverseResponse reverseMobileCash(Reverse reverseReq) {
		logger.info("calling soap api for mcash reverse");
		JAXBElement<ReverseResponse> response = (JAXBElement<ReverseResponse>) getWebServiceTemplate()
				// .marshalSendAndReceive("http://192.125.125.96:7003/MobileCashServices/MCashServices",
				// reverseReq,
				// .marshalSendAndReceive("http://localhost:8088/mockMCashServicesPortBinding",
				// reverseReq,
				.marshalSendAndReceive(mCashEndpoint, reverseReq, new SoapActionCallback(""));
		System.out.println(response.getValue().toString());
		return response.getValue();

	}

	boolean createMCash(Create createReq) {

		URL url = ClassLoader.getSystemResource("wsdl/MCashServices.wsdl");

		MCashServices_Service service = new MCashServices_Service(url);

		MCashServices proxy = service.getMCashServicesPort();
		((BindingProvider) proxy).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, mCashEndpoint);

		logger.info("Using endpoint URL: "
				+ ((BindingProvider) proxy).getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY));
		logger.info("SOAP Request", createReq);
		logger.info("SOAP Request", createReq.toString());
//		ResultData response = proxy.create(createReq.getUser(), createReq.getCreateData());

		try {
			ResultData response = proxy.create(createReq.getUser(), createReq.getCreateData());

			return true;
		} catch (MCashSystemException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (MCashException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (MCashAuthenticationException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (MCashValidationException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

//		logger.info("calling soap api for mcash create");
//		JAXBElement<CreateResponse> response = (JAXBElement<CreateResponse>) getWebServiceTemplate()
//				// .marshalSendAndReceive("http://192.125.125.96:7003/MobileCashServices/MCashServices",
//				// createReq,
//				// .marshalSendAndReceive("http://192.168.80.94:8088/mockMCashServicesPortBinding",
//				// createReq,
//				// .marshalSendAndReceive("http://localhost:8088/mockMCashServicesPortBinding",
//				// createReq,
//				.marshalSendAndReceive(mCashEndpoint, createReq, new SoapActionCallback(""));
//		System.out.println(response.getValue().toString());

	}

}
