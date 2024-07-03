package lk.sampath.oc.Transfers.Pojo;

import lk.sampath.oc.Transfers.integration.mcash.ReverseResponse;

public class ReverseMCashResponse {
	
	ResponseHeader responseHeader;
	ReverseResponse reverseResponse;
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public ReverseResponse getReverseResponse() {
		return reverseResponse;
	}
	public void setReverseResponse(ReverseResponse reverseResponse) {
		this.reverseResponse = reverseResponse;
	}
	public ReverseMCashResponse(ResponseHeader responseHeader, ReverseResponse reverseResponse) {
		super();
		this.responseHeader = responseHeader;
		this.reverseResponse = reverseResponse;
	}
	public ReverseMCashResponse() {
		super();
	}
	@Override
	public String toString() {
		return "ReverseMCashResponse [responseHeader=" + responseHeader + ", reverseResponse=" + reverseResponse + "]";
	}
	
	

}
