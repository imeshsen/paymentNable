package lk.sampath.oc.Transfers.Pojo;

import lk.sampath.oc.Transfers.Enums.InvokeMessage;
import lk.sampath.oc.Transfers.Enums.InvokeStatus;

public class UpdateDailyLimitsOutput {

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
	public void setInvokeMessage(InvokeMessage invoke_message) {
		this.invokeMessage = invoke_message;
	}
	
}
