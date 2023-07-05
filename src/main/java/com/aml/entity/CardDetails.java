package com.aml.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "AML_CARD_SUMMARY")
public class CardDetails {
	@Id
	@Column(name = "CARD_SUMMARY_ID")
	private int cardSummaryId;
	@Column(name = "DATA_ID")
	private int dataId;
	@Column(name = "CIF_NUMBER")
	private String cifNumber;
	@Column(name = "CARD_NUMBER")
	private String cardNumber;
	@Column(name = "CARD_STATUS")
	private String cardStatus;
	@Column(name = "CREDIT_LIMIT")
	private Float creditdLimit;
	@Column(name = "CARD_TYPE")
	private String cardType;
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	@Column(name = "ISSUANCE_DATE")
	private Timestamp issuanceDate;
	@Column(name = "EXPIRY_DATE")
	private Timestamp ExpiryDate;
	@Column(name = "PRIMARY_CARD")
	private String primaryCard;
	@Column(name = "CARD_CURRENCY")
	private String cardCurrency;
	@Column(name = "BALANCE")
	private String balance;
	@Column(name = "AVAILABLE_AMOUNT")
	private String availableAmount;
	@Column(name = "DUE_DATE")
	private Timestamp issueDate;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "Y_FLAG")
	private String yFlag;
	@Column(name = "TOTAL_CARD_TXN_AMOUNT")
	private String totalCardTaxAmount;
	@Column(name = "TOTAT_PYMNT_RECIVD_ON_CARD")
	private String totalpymntRecivdOnCard;
	@Column(name = "OVERDUE_AMOUNT")
	private String overDueAmount;
	@Column(name = "SHORT_CODE")
	private String ShortCode;
	@Column(name = "RECORD_ON")
	private Timestamp RecordOn;
	@Column(name = "CACCSERNO")
	private String caccSerno;
	@Column(name = "LAST_STATEMENT_BALANCE")
	private String lastStatementBalance;
	@Column(name = "MIN_PAYMENT_DUE")
	private String minPaymentDue;
	@Column(name = "PRODUCT_TYPE")
	private String productType;
	
	public CardDetails() {
		super();
	}

	public CardDetails(int cardSummaryId, int dataId, String cifNumber, String cardNumber, String cardStatus,
			String cardLimit, String cardType, String customerName, Timestamp issuanceDate, Timestamp expiryDate,
			String primaryCard, String cardCurrency, String balance, String availableAmount, Timestamp issueDate,
			String address, String yFlag, String totalCardTaxAmount, String totalpymntRecivdOnCard,
			String overDueAmount, String shortCode, Timestamp recordOn, String caccSerno, String lastStatementBalance,
			String minPaymentDue, String productType) {
		super();
		this.cardSummaryId = cardSummaryId;
		this.dataId = dataId;
		this.cifNumber = cifNumber;
		this.cardNumber = cardNumber;
		this.cardStatus = cardStatus;
		this.creditdLimit = creditdLimit;
		this.cardType = cardType;
		this.customerName = customerName;
		this.issuanceDate = issuanceDate;
		ExpiryDate = expiryDate;
		this.primaryCard = primaryCard;
		this.cardCurrency = cardCurrency;
		this.balance = balance;
		this.availableAmount = availableAmount;
		this.issueDate = issueDate;
		this.address = address;
		this.yFlag = yFlag;
		this.totalCardTaxAmount = totalCardTaxAmount;
		this.totalpymntRecivdOnCard = totalpymntRecivdOnCard;
		this.overDueAmount = overDueAmount;
		ShortCode = shortCode;
		RecordOn = recordOn;
		this.caccSerno = caccSerno;
		this.lastStatementBalance = lastStatementBalance;
		this.minPaymentDue = minPaymentDue;
		this.productType = productType;
	}

	public int getCardSummaryId() {
		return cardSummaryId;
	}

	public void setCardSummaryId(int cardSummaryId) {
		this.cardSummaryId = cardSummaryId;
	}

	public int getDataId() {
		return dataId;
	}

	public void setDataId(int dataId) {
		this.dataId = dataId;
	}

	public String getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(String cifNumber) {
		this.cifNumber = cifNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Float getCreditdLimit() {
		return creditdLimit;
	}

	public void setCardLimit(String cardLimit) {
		this.creditdLimit = creditdLimit;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Timestamp getIssuanceDate() {
		return issuanceDate;
	}

	public void setIssuanceDate(Timestamp issuanceDate) {
		this.issuanceDate = issuanceDate;
	}

	public Timestamp getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		ExpiryDate = expiryDate;
	}

	public String getPrimaryCard() {
		return primaryCard;
	}

	public void setPrimaryCard(String primaryCard) {
		this.primaryCard = primaryCard;
	}

	public String getCardCurrency() {
		return cardCurrency;
	}

	public void setCardCurrency(String cardCurrency) {
		this.cardCurrency = cardCurrency;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Timestamp getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Timestamp issueDate) {
		this.issueDate = issueDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getyFlag() {
		return yFlag;
	}

	public void setyFlag(String yFlag) {
		this.yFlag = yFlag;
	}

	public String getTotalCardTaxAmount() {
		return totalCardTaxAmount;
	}

	public void setTotalCardTaxAmount(String totalCardTaxAmount) {
		this.totalCardTaxAmount = totalCardTaxAmount;
	}

	public String getTotalpymntRecivdOnCard() {
		return totalpymntRecivdOnCard;
	}

	public void setTotalpymntRecivdOnCard(String totalpymntRecivdOnCard) {
		this.totalpymntRecivdOnCard = totalpymntRecivdOnCard;
	}

	public String getOverDueAmount() {
		return overDueAmount;
	}

	public void setOverDueAmount(String overDueAmount) {
		this.overDueAmount = overDueAmount;
	}

	public String getShortCode() {
		return ShortCode;
	}

	public void setShortCode(String shortCode) {
		ShortCode = shortCode;
	}

	public Timestamp getRecordOn() {
		return RecordOn;
	}

	public void setRecordOn(Timestamp recordOn) {
		RecordOn = recordOn;
	}

	public String getCaccSerno() {
		return caccSerno;
	}

	public void setCaccSerno(String caccSerno) {
		this.caccSerno = caccSerno;
	}

	public String getLastStatementBalance() {
		return lastStatementBalance;
	}

	public void setLastStatementBalance(String lastStatementBalance) {
		this.lastStatementBalance = lastStatementBalance;
	}

	public String getMinPaymentDue() {
		return minPaymentDue;
	}

	public void setMinPaymentDue(String minPaymentDue) {
		this.minPaymentDue = minPaymentDue;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "CardDetails [cardSummaryId=" + cardSummaryId + ", dataId=" + dataId + ", cifNumber=" + cifNumber
				+ ", cardNumber=" + cardNumber + ", cardStatus=" + cardStatus + ", cardLimit=" + creditdLimit
				+ ", cardType=" + cardType + ", customerName=" + customerName + ", issuanceDate=" + issuanceDate
				+ ", ExpiryDate=" + ExpiryDate + ", primaryCard=" + primaryCard + ", cardCurrency=" + cardCurrency
				+ ", balance=" + balance + ", availableAmount=" + availableAmount + ", issueDate=" + issueDate
				+ ", address=" + address + ", yFlag=" + yFlag + ", totalCardTaxAmount=" + totalCardTaxAmount
				+ ", totalpymntRecivdOnCard=" + totalpymntRecivdOnCard + ", overDueAmount=" + overDueAmount
				+ ", ShortCode=" + ShortCode + ", RecordOn=" + RecordOn + ", caccSerno=" + caccSerno
				+ ", lastStatementBalance=" + lastStatementBalance + ", minPaymentDue=" + minPaymentDue
				+ ", productType=" + productType + "]";
	}
	



}
