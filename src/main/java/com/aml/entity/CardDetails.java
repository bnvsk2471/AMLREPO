package com.aml.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
}
