package lk.sampath.oc.Transfers.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="OC_TRN_WITHDRAW_MCASH")
public class WithdrawMCashRequest {
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Id
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="ACCNT_NUM")
	private String accountNumber;
	
	@Column(name="BENEFICIARY_ID")
	private String beneficiaryId;
	
	@Column(name="BENEFICIARY_MESSAGE")
	private String beneficiaryMessage;
	
	@Transient
	@Column(name="BENEFICIARY_PIN")
	private String beneficiaryPin;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="PAID_BY")
	private String paidBy;
	
	@Column(name="PAID_DATE")
	private Date paidDate;
	
	@Column(name="SEND_MESSAGE")
	private String sendMessage;
	
	@Column(name="TXN_AMOUNT")
	private BigDecimal txnAmount;
	
	@Transient
	@Column(name="TXN_PIN")
	private String txnPin;
	
	
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
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBeneficiaryId() {
		return beneficiaryId;
	}
	public void setBeneficiaryId(String beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}
	public String getBeneficiaryMessage() {
		return beneficiaryMessage;
	}
	public void setBeneficiaryMessage(String beneficiaryMessage) {
		this.beneficiaryMessage = beneficiaryMessage;
	}
	public String getBeneficiaryPin() {
		return beneficiaryPin;
	}
	public void setBeneficiaryPin(String beneficiaryPin) {
		this.beneficiaryPin = beneficiaryPin;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}
	public Date getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	public String getSendMessage() {
		return sendMessage;
	}
	public void setSendMessage(String sendMessage) {
		this.sendMessage = sendMessage;
	}
	public BigDecimal getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}
	public String getTxnPin() {
		return txnPin;
	}
	public void setTxnPin(String txnPin) {
		this.txnPin = txnPin;
	}
	public WithdrawMCashRequest() {}
	public WithdrawMCashRequest(String userName, String transactionId, String accountNumber, String beneficiaryId,
			String beneficiaryMessage, String beneficiaryPin, String companyName, String paidBy, Date paidDate,
			String sendMessage, BigDecimal txnAmount, String txnPin) {
		super();
		this.userName = userName;
		this.transactionId = transactionId;
		this.accountNumber = accountNumber;
		this.beneficiaryId = beneficiaryId;
		this.beneficiaryMessage = beneficiaryMessage;
		this.beneficiaryPin = beneficiaryPin;
		this.companyName = companyName;
		this.paidBy = paidBy;
		this.paidDate = paidDate;
		this.sendMessage = sendMessage;
		this.txnAmount = txnAmount;
		this.txnPin = txnPin;
	}
	@Override
	public String toString() {
		return "WithdrawMCashRequest [userName=" + userName + ", transactionId=" + transactionId + ", accountNumber="
				+ accountNumber + ", beneficiaryId=" + beneficiaryId + ", beneficiaryMessage=" + beneficiaryMessage
				+ ", beneficiaryPin=" + beneficiaryPin + ", companyName=" + companyName + ", paidBy=" + paidBy
				+ ", paidDate=" + paidDate + ", sendMessage=" + sendMessage + ", txnAmount=" + txnAmount + ", txnPin="
				+ txnPin + "]";
	}
	

}
