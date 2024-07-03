package lk.sampath.oc.Transfers.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="OC_TRN_REVERSE_MCASH")
public class ReverseMCashRequest {

	@Column(name="USER_NAME")
	private String userName;
		
	@Id
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="BENEFICIARY_MESSAGE")
	private String beneficiaryMessage;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="SEND_MESSAGE")
	private String sendMessage;
	
	@Column(name="SENDER_ID")
	private String senderId;
	
	@Transient
	@Column(name="SENDER_PIN")
	private String senderPin;
	
	@Column(name="SUSPENDED_BY")
	private String suspendedBy;
	
	@Column(name="SUSPENDED_SOL")
	private String suspendedSol;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getBeneficiaryMessage() {
		return beneficiaryMessage;
	}
	public void setBeneficiaryMessage(String beneficiaryMessage) {
		this.beneficiaryMessage = beneficiaryMessage;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSendMessage() {
		return sendMessage;
	}
	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getSenderPin() {
		return senderPin;
	}
	public void setSenderPin(String senderPin) {
		this.senderPin = senderPin;
	}
	public String getSuspendedBy() {
		return suspendedBy;
	}
	public void setSuspendedBy(String suspendedBy) {
		this.suspendedBy = suspendedBy;
	}
	public String getSuspendedSol() {
		return suspendedSol;
	}
	public void setSuspendedSol(String suspendedSol) {
		this.suspendedSol = suspendedSol;
	}
	@Override
	public String toString() {
		return "ReverseMCashRequest [userName=" + userName + ", transactionId=" + transactionId
				+ ", beneficiaryMessage=" + beneficiaryMessage + ", companyName=" + companyName + ", sendMessage="
				+ sendMessage + ", senderId=" + senderId + ", senderPin=" + senderPin + ", suspendedBy=" + suspendedBy
				+ ", suspendedSol=" + suspendedSol + "]";
	}
	public ReverseMCashRequest(String userName, String transactionId, String beneficiaryMessage, String companyName,
			String sendMessage, String senderId, String senderPin, String suspendedBy, String suspendedSol) {
		super();
		this.userName = userName;
		this.transactionId = transactionId;
		this.beneficiaryMessage = beneficiaryMessage;
		this.companyName = companyName;
		this.sendMessage = sendMessage;
		this.senderId = senderId;
		this.senderPin = senderPin;
		this.suspendedBy = suspendedBy;
		this.suspendedSol = suspendedSol;
	}
	public ReverseMCashRequest() {}
	
}
