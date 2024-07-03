package lk.sampath.oc.Transfers.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="OC_TRN_TRANSACTION_STATUS_CHANGE")
public class TransactionStatusChange {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	@Column(name = "ADMIN_USER_ID")
	private String adminUserId;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TRANSACTION_REQUEST_ID")
	private TransactionRequestHistory transactionRequestHistory;
	
	@Column(name = "NEW_STATUS")
	private String newStatus;
	
	@ApiModelProperty(notes = "Approval Id")
	@Column(name = "APPROVAL_ID")
	private String approvalId;
	
	@ApiModelProperty(notes = "Approval User Group")
	@Column(name = "USER_GROUP")
	private String userGroup;

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

	public TransactionRequestHistory getTransactionRequestHistory() {
		return transactionRequestHistory;
	}

	public void setTransactionRequestHistory(TransactionRequestHistory transactionRequestHistory) {
		this.transactionRequestHistory = transactionRequestHistory;
	}

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public String getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(String approvalId) {
		this.approvalId = approvalId;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}
	
		
}
