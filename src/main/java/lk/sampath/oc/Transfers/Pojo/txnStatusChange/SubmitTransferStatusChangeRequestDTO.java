package lk.sampath.oc.Transfers.Pojo.txnStatusChange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class SubmitTransferStatusChangeRequestDTO {
	@Id
	@GeneratedValue
	private int id;
	@NotNull(message = "Admin user id can not be empty")
	@ApiModelProperty(notes = "User ID of logged in Admin")
	private String adminUserId;
	
	@NotNull(message = "User Group id can not be empty")
	@ApiModelProperty(notes = "User Group of logged in Admin")
	private String userGroup;
	
	@NotNull(message = "Transfer Request ID Can not be empty")
	private String request;
	@NotNull(message = "Transfer Request ID Can not be empty")
	@ApiModelProperty(notes = "Transfer reference")
	
	private String transferRequestId;
	@ApiModelProperty(notes = "New status (Success / Fail )")
	private String newStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(String adminUserId) {
		this.adminUserId = adminUserId;
	}
	public String getTransferRequestId() {
		return transferRequestId;
	}
	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}
	public String getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	public String getUserGroup() {
		return userGroup;
	}
	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}
		
}
