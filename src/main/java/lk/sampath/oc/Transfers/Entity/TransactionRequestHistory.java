package lk.sampath.oc.Transfers.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lk.sampath.oc.Transfers.Enums.TransactionCategory;
import lk.sampath.oc.Transfers.Enums.TransactionType;

@Entity
@Table(name = "OC_TRN_TRANSACTION_REQUEST_H")
public class TransactionRequestHistory {

	@Id
	@Column(name = "TRANSACTION_ID")
	private String transactionId;

	@Column(name = "EXTERNAL_ID")
	private String externalId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "FROM_ACCOUNT_NUMBER")
	private String fromAccountNumber;

	@Column(name = "TO_ACCOUNT_NUMBER")
	private String toAccountNumber;

	@Column(name = "CARD_NAME")
	private String cardName;

	@Column(name = "BANK_NAME")
	private String bankName;

	@Column(name = "BANK_CODE")
	private String bankCode;

	@Column(name = "BRANCH_CODE")
	private String branchCode;

	@Enumerated(EnumType.STRING)
	@Column(name = "TRAN_TYPE", length = 10)
	private TransactionType transactionType;

	@Column(name = "TRAN_AMOUNT")
	private BigDecimal transactionAmount;

	@Column(name = "REQUESTED_DTM")
	private Date requestedDate;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "CHANNEL")
	private String channel;

	@Enumerated(EnumType.STRING)
	@Column(name = "TRANSACTION_CATEGORY", length = 10)
	private TransactionCategory transactionCategory;

	@Column(name = "BENEFICIARY_REMARKS")
	private String benificiaryRemarks;

	@Column(name = "SENDER_REMARKS")
	private String senderRemarks;

	@Size(min = 2, max = 10)
	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "BACKEND_REFERENCE_NUMBER")
	private String backendRefNumber;

	@Column(name = "CDCI_STATUS")
	private String cdciStatus;

	@Column(name = "BACKEND_RESPONSE")
	private String backendResponse;

	@Column(name = "MC_SENDER_NIC")
	private String mobileCashSenderNIC;

	@Column(name = "MC_SENDER_MOBILE")
	private String mobileCashSenderMobile;

	@Column(name = "MC_RECIPIENT_MOBILE")
	private String mobileRecipientMobile;

	@Column(name = "MC_RECIPIENT_NAME")
	private String mobileRecipientName;

	@Column(name = "MC_RECIPIENT_NIC")
	private String mobileRecipientNIC;

	@Column(name = "MC_TRANSFER_FREQUENCY")
	private String transferFrequency;

	@Column(name = "MC_NEXT_SCHEDULE")
	private Date nextSchedule;

	@Column(name = "MC_NO_OF_TRANSFERS")
	private long numOfTransfers;

	@Column(name = "MC_SCHEDULE_ID")
	private String scheduleId;
	

	@Column(name = "MC_TO_ACCOUNT_NAME")
	private String toAccountName;
	
	@Column(name = "MC_FROM_ACCOUNT_NAME")
	private String fromAccountName;
	
	@Column(name = "COMMISSION_FROM_ACCOUNT_NUMBER")
	private String commissionFromAccountNumber;

	public String getCommissionFromAccountNumber() {
		return commissionFromAccountNumber;
	}

	public void setCommissionFromAccountNumber(String commissionFromAccountNumber) {
		this.commissionFromAccountNumber = commissionFromAccountNumber;
	}

	public String getBenificiaryRemarks() {
		return benificiaryRemarks;
	}

	public void setBenificiaryRemarks(String benificiaryRemarks) {
		this.benificiaryRemarks = benificiaryRemarks;
	}

	public String getSenderRemarks() {
		return senderRemarks;
	}

	public void setSenderRemarks(String senderRemarks) {
		this.senderRemarks = senderRemarks;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBackendRefNumber() {
		return backendRefNumber;
	}

	public void setBackendRefNumber(String backendRefNumber) {
		this.backendRefNumber = backendRefNumber;
	}

	public String getCdciStatus() {
		return cdciStatus;
	}

	public void setCdciStatus(String cdciStatus) {
		this.cdciStatus = cdciStatus;
	}

	public String getBackendResponse() {
		return backendResponse;
	}

	public void setBackendResponse(String backendResponse) {
		this.backendResponse = backendResponse;
	}

	public String getMobileCashSenderNIC() {
		return mobileCashSenderNIC;
	}

	public void setMobileCashSenderNIC(String mobileCashSenderNIC) {
		this.mobileCashSenderNIC = mobileCashSenderNIC;
	}

	public String getMobileCashSenderMobile() {
		return mobileCashSenderMobile;
	}

	public void setMobileCashSenderMobile(String mobileCashSenderMobile) {
		this.mobileCashSenderMobile = mobileCashSenderMobile;
	}

	public String getMobileRecipientMobile() {
		return mobileRecipientMobile;
	}

	public void setMobileRecipientMobile(String mobileRecipientMobile) {
		this.mobileRecipientMobile = mobileRecipientMobile;
	}

	public String getMobileRecipientName() {
		return mobileRecipientName;
	}

	public void setMobileRecipientName(String mobileRecipientName) {
		this.mobileRecipientName = mobileRecipientName;
	}

	public String getMobileRecipientNIC() {
		return mobileRecipientNIC;
	}

	public void setMobileRecipientNIC(String mobileRecipientNIC) {
		this.mobileRecipientNIC = mobileRecipientNIC;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public TransactionType getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public TransactionCategory getTransactionCategory() {
		return transactionCategory;
	}

	public void setTransactionCategory(TransactionCategory transactionCategory) {
		this.transactionCategory = transactionCategory;
	}

	public String getTransferFrequency() {
		return transferFrequency;
	}

	public void setTransferFrequency(String transferFrequency) {
		this.transferFrequency = transferFrequency;
	}

	public Date getNextSchedule() {
		return nextSchedule;
	}

	public void setNextSchedule(Date nextSchedule) {
		this.nextSchedule = nextSchedule;
	}

	public long getNumOfTransfers() {
		return numOfTransfers;
	}

	public void setNumOfTransfers(long numOfTransfers) {
		this.numOfTransfers = numOfTransfers;
	}

	public String getScheduleId() {
		return scheduleId;
	}
	
	

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getToAccountName() {
		return toAccountName;
	}

	public void setToAccountName(String toAccountName) {
		this.toAccountName = toAccountName;
	}

	public String getFromAccountName() {
		return fromAccountName;
	}

	public void setFromAccountName(String fromAccountName) {
		this.fromAccountName = fromAccountName;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}


	@Override
	public String toString() {
		return "TransactionRequest [transactionId=" + transactionId + ", externalId=" + externalId + ", userName="
				+ userName + ", fromAccountNumber=" + fromAccountNumber + ", toAccountNumber=" + toAccountNumber
				+ ", cardName=" + cardName + ", bankName=" + bankName + ", bankCode=" + bankCode + ", branchCode="
				+ branchCode + ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount
				+ ", requestedDate=" + requestedDate + ", status=" + status + ", channel=" + channel
				+ ", transactionCategory=" + transactionCategory + ", benificiaryRemarks=" + benificiaryRemarks
				+ ", senderRemarks=" + senderRemarks + ", currency=" + currency + ", backendRefNumber="
				+ backendRefNumber + ", cdciStatus=" + cdciStatus + ", backendResponse=" + backendResponse
				+ ", mobileCashSenderNIC=" + mobileCashSenderNIC + ", mobileCashSenderMobile=" + mobileCashSenderMobile
				+ ", mobileRecipientMobile=" + mobileRecipientMobile + ", mobileRecipientName=" + mobileRecipientName
				+ ", mobileRecipientNIC=" + mobileRecipientNIC + ", transferFrequency=" + transferFrequency
				+ ", nextSchedule=" + nextSchedule + ", numOfTransfers=" + numOfTransfers 
				+ "]";
	}

}
