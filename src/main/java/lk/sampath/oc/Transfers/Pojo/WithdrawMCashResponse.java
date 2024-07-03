package lk.sampath.oc.Transfers.Pojo;

import lk.sampath.oc.Transfers.integration.mcash.WithdrawResponse;

public class WithdrawMCashResponse {

	ResponseHeader responseHeader;
	WithdrawResponse withdrawResponse;
	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}
	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public WithdrawResponse getWithdrawResponse() {
		return withdrawResponse;
	}
	public void setWithdrawResponse(WithdrawResponse withdrawResponse) {
		this.withdrawResponse = withdrawResponse;
	}
	@Override
	public String toString() {
		return "WithdrawMCashResponse [responseHeader=" + responseHeader + ", withdrawResponse=" + withdrawResponse
				+ "]";
	}
	public WithdrawMCashResponse(ResponseHeader responseHeader, WithdrawResponse withdrawResponse) {
		super();
		this.responseHeader = responseHeader;
		this.withdrawResponse = withdrawResponse;
	}
	public WithdrawMCashResponse() {
		super();
	}
	
	
}
