package lk.sampath.oc.Transfers.Service;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import lk.sampath.oc.Transfers.Enums.ExceptionCode;
import lk.sampath.oc.Transfers.Exceptions.InvalidUrlException;
import lk.sampath.oc.Transfers.Pojo.profileInfo.ProfileResponse;

@Service
public class RestCustomerManagementService {

	private static Logger logger = LogManager.getLogger(RestCustomerManagementService.class);

	RestTemplate restTemplate = new RestTemplate();

	@Value("${service.url.customer.endpoint}")
	private String customerBaseUrl;

	public ProfileResponse getCustomerProfileInfo(String userId) {
		logger.info("calling update daily limits rest api");
		URI url;
		try {
			url = new URI(customerBaseUrl + "/service/getVishwaUserDetails/" + userId);
			HttpEntity<ProfileResponse> response = null;

			HttpHeaders headers = new HttpHeaders();
			headers.set("userId", userId);
			HttpEntity request = new HttpEntity(headers);

			response = restTemplate.exchange(url, HttpMethod.GET, request, ProfileResponse.class);
			// response = restTemplate.getForObject(url, responseType, uriVariables)
			return response.getBody();
		} catch (URISyntaxException e) {
			throw new InvalidUrlException(ExceptionCode.URL_NOT_FOUND.toString());
		} catch (HttpStatusCodeException e) {
			logger.error("Response Status - " + e.getStatusCode() + " " + e.getStatusText() + " "
					+ e.getResponseBodyAsString(), e);
			throw e;
		}
	}

}
