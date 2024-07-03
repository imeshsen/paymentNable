package lk.sampath.oc.Transfers.Pojo;

public class ValidateTransferResponse {

	ResponseHeader responseHeader;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	@Override
	public String toString() {
		return "ValidateTransferOutput [responseHeader=" + responseHeader + "]";
	}
	
	
}
