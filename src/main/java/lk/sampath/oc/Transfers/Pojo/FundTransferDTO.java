package lk.sampath.oc.Transfers.Pojo;

import java.math.BigDecimal;
import java.util.Date;

import lk.sampath.oc.Transfers.Enums.TransactionCategory;
import lk.sampath.oc.Transfers.Enums.TransactionType;

public class FundTransferDTO {

	private String transferRequestId;
	private TransactionType transferMode;
	private TransactionCategory transferType;
	private Date transferRequestDate;
	private BigDecimal amount;
	private String currency;
	private String fromAccount;
	private String toAccount;
	private String toBank;
	private String userId;
	private Date transferDate;
	private String transferFrequency;
	private Date nextSchedule;
	private long numOfTransfers;
	private String status;

	public FundTransferDTO() {
		
	}
	public FundTransferDTO(String transferRequestId, TransactionType transferMode, TransactionCategory transferType,
			Date transferRequestDate, BigDecimal amount, String currency, String fromAccount, String toAccount,
			String toBank, String userId, Date transferDate, String transferFrequency, Date nextSchedule,
			long numOfTransfers, String status) {
		this.transferRequestId = transferRequestId;
		this.transferMode = transferMode;
		this.transferType = transferType;

		this.transferRequestDate = transferRequestDate;
		this.amount = amount;
		this.currency = currency;
		this.currency = currency;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.toBank = toBank;
		this.userId = userId;
		this.transferDate = transferDate;
		this.transferFrequency = transferFrequency;
		this.nextSchedule = nextSchedule;
		this.numOfTransfers = numOfTransfers;
		this.status = status;
	}

	public String getTransferRequestId() {
		return transferRequestId;
	}

	public void setTransferRequestId(String transferRequestId) {
		this.transferRequestId = transferRequestId;
	}

	public TransactionType getTransferMode() {
		return transferMode;
	}
	public void setTransferMode(TransactionType transferMode) {
		this.transferMode = transferMode;
	}
	public TransactionCategory getTransferType() {
		return transferType;
	}
	public void setTransferType(TransactionCategory transferType) {
		this.transferType = transferType;
	}
	public Date getTransferRequestDate() {
		return transferRequestDate;
	}

	public void setTransferRequestDate(Date transferRequestDate) {
		this.transferRequestDate = transferRequestDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getToBank() {
		return toBank;
	}

	public void setToBank(String toBank) {
		this.toBank = toBank;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TransactionRequest [transferRequestId=" + transferRequestId + ", transferMode=" + transferMode
				+ ", transferType=" + transferType + ", transferRequestDate=" + transferRequestDate + ", amount="
				+ amount + ", currency=" + currency + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", toBank=" + toBank + ", userId=" + userId + ", transferDate=" + transferDate
				+ ", transferFrequency=" + transferFrequency + ", nextSchedule=" + nextSchedule + ", numOfTransfers="
				+ numOfTransfers + ", status=" + status + "]";
	}

}
