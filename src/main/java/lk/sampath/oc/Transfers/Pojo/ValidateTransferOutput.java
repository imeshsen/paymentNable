package lk.sampath.oc.Transfers.Pojo;
import lk.sampath.oc.Transfers.Enums.InvokeMessage;

import lk.sampath.oc.Transfers.Enums.InvokeStatus;

public class ValidateTransferOutput {

	@Override
	public String toString() {
		return "ValidateTransferOutput [invokeStatus=" + invokeStatus + ", invokeMessage=" + invokeMessage + "]";
	}
	
	InvokeStatus invokeStatus;
	InvokeMessage invokeMessage;
	
	
	public InvokeStatus getInvokeStatus() {
		return invokeStatus;
	}
	public void setInvokeStatus(InvokeStatus invoke_status) {
		this.invokeStatus = invoke_status;
	}
	public InvokeMessage getInvokeMessage() {
		return invokeMessage;
	}
	public void setInvokeMessage(InvokeMessage debitAccountValidationFailed) {
		this.invokeMessage = debitAccountValidationFailed;
	}
	
	
	
}
