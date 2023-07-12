package com.aml.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AML_SAS_ALERTED_TRANSACTIONS")
public class AlertedTransactions {
	
	    @Id
	    @Column(name = "ALERT_ID")
	    private Long alertId;

	    @Column(name = "DATA_ID")
	    private Long dataId;

	    @Column(name = "ACCOUNT_NO")
	    private String accountNo;

	    @Column(name = "TRANSACTION_DATE")
	    private String transactionDate;

	    @Column(name = "TRANSACTION_AMT")
	    private String transactionAmt;

	    @Column(name = "TRANSACTION_CDI")
	    private String transactionCdi;

	    @Column(name = "PRIMARY_MEDIUM")
	    private String primaryMedium;

	    @Column(name = "SECONDARY_MEDIUM")
	    private String secondaryMedium;

	    @Column(name = "MECHANISM")
	    private String mechanism;

	    @Column(name = "BENEFICIARY_NAME")
	    private String beneficiaryName;

	    @Column(name = "ASSOCIATE_NAME")
	    private String associateName;

	    @Column(name = "BRANCH")
	    private String branch;

	    @Column(name = "DESCRIPTION")
	    private String description;

	    @Column(name = "STATUS_DESC")
	    private String statusDesc;

	    @Column(name = "TRANSACTION_REF_NO")
	    private String transactionRefNo;

	    @Column(name = "CALENDAR_DATE")
	    private String calendarDate;

	    @Column(name = "POSTED_DATE")
	    private String postedDate;

	    @Column(name = "BASE_CUR_AMT")
	    private String baseCurAmt;

	    @Column(name = "TRANSACTION_CUR_AMT")
	    private String transactionCurAmt;

	    @Column(name = "ACCOUNT_CUR_AMT")
	    private String accountCurAmt;

	    @Column(name = "REMITTER_COUNTRY")
	    private String remitterCountry;

	    @Column(name = "FUNDS_SECURITIES_DESC")
	    private String fundsSecuritiesDesc;

	    @Column(name = "TRANSACTION_TYPE")
	    private String transactionType;

	    @Column(name = "STATUS_REASON")
	    private String statusReason;

	    @Column(name = "ACCOUNT_NAME")
	    private String accountName;

	    @Column(name = "ALERTED_TRANSACTION_ID")
	    private Long alertedTransactionId;

	    @Column(name = "TRIGGERING")
	    private String triggering;

	    @Column(name = "TRANSACTION_CUR_CODE")
	    private String transactionCurCode;

	    @Column(name = "ACCOUNT_CUR_CODE")
	    private String accountCurCode;

	    @Column(name = "REMITTER_EXT_PARTY")
	    private String remitterExtParty;

	    @Column(name = "BENEFICIARY_EXT_PARTY")
	    private String beneficiaryExtParty;

	    @Column(name = "REMITTER_NAME")
	    private String remitterName;

	    @Column(name = "COUNTER_PARTY")
	    private String counterParty;

	    @Column(name = "EXTERNAL_ACCOUNT_NO")
	    private String externalAccountNo;

	    @Column(name = "EXTERNAL_BRANCH_NO")
	    private String externalBranchNo;

	    @Column(name = "EXTERNAL_BRANCH_NAME")
	    private String externalBranchName;

	    @Column(name = "EXTERNAL_BANK_NO")
	    private String externalBankNo;

	    @Column(name = "EXTERNAL_BANK_NAME")
	    private String externalBankName;


}
