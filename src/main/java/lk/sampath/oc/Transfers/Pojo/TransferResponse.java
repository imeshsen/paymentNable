package lk.sampath.oc.Transfers.Pojo;

public class TransferResponse {
	
	String authenticationType;
	String transferReference;
	ResponseHeader responseHeader;
	
	
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getTransferReference() {
		return transferReference;
	}
	public void setTransferReference(String transferReference) {
		this.transferReference = transferReference;
	}
	
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public TransferResponse(String authenticationType, String transferReference, ResponseHeader resHeader) {
		super();
		this.authenticationType = authenticationType;
		this.transferReference = transferReference;
		this.responseHeader = resHeader;
	}
	public TransferResponse() {
		
	}
	@Override
	public String toString() {
		return "TransferResponse [authenticationType=" + authenticationType + ", transferReference=" + transferReference
				+ ", responseHeader=" + responseHeader + "]";
	}
	
	
	
}
