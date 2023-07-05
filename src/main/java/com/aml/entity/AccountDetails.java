package com.aml.entity;

import java.sql.Timestamp;
import java.util.Date;

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
@Table(name="AML_ACCOUNT_DETAILS")
public class AccountDetails {
	
	@Column(name="ACCOUNT_DETAILS_ID")
	@Id
	private Long accountDetailsId;
	
	@Column(name="DATA_ID")
	private Long dataId;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="CIF_NUM")
	private String cifNum;
	
	@Column(name="ACCOUNT_NUM")
	private String accountNum;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="ACCOUNT_DESC")
	private String accountDesc;
	
	@Column(name="ACCOUNT_OPEN_DATE")
	private Date accountOpenDate;
	
	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;
	
	@Column(name="ALTERNATE_ACC_NUM")
	private String alternateAccNum;
	
	@Column(name="CURRENT_BALANCE")
	private String currentBalance;
	
	@Column(name="OFFSET_SUB_ACCOUNT")
	private String offsetSubAccount;
	
	@Column(name="SUB_ACCOUNT_NUMBER")
	private String subAccountNumber;
	
	@Column(name="UNCOLLECTED_BALANCE")
	private String uncollectedBalance;
	
	@Column(name="BLOCKED_BALANCE")
	private String blockedBalance;
	
	@Column(name="TOTAL_NUM_OF_TRNX")
	private String totalNumOfTrnx;
	
	@Column(name="ACCOUNT_BRANCH")
	private String accountBranch;
	
	@Column(name="DORMANT")
	private String dormant;
	
	@Column(name="LAST_ACTIVITY_DATE")
	private Date lastActivityDate;
	
	@Column(name="SUB_ACCOUNT")
	private String subAccount;
	
	@Column(name="CREDIT_TURNOVER")
	private String creditTurnover;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="PO_BOX")
	private String poBox;
	
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	
	@Column(name="MODE_OF_OPERATION")
	private String modeOfOperation;
	
	@Column(name="AMOUNTS_AND_DATES")
	private String amountsAndDates;
	
	@Column(name="CLEARING_BANK_CODE")
	private String clearingBankCode;
	
	@Column(name="CLEARING_ACCOUNT_NUMBER")
	private String clearingAccountNumber;
	
	@Column(name="BAN_ACCOUNT_NUMBER")
	private String banAccountNumber;
	
	@Column(name="ORGANIZATION_NAME")
	private String organizationName;
	
	@Column(name="DEPARTMENT")
	private String department;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="MEDIA")
	private String media;
	
	@Column(name="FAX")
	private String fax;
	
	@Column(name="DORMACY_PARAMETERS")
	private String dormacyParameters;
	
	@Column(name="MAIL_DELIVARY_OPTION")
	private String mailDelivaryOption;
	
	@Column(name="REJECT_CODE")
	private String rejectCode;
	
	@Column(name="REMARKS")
	private String remarks;
	
	@Column(name="OPTIONS")
	private String options;
	
	@Column(name="PRE_FACT_SCREENING")
	private String preFactScreening;
	
	@Column(name="TURNOVER_LIMIT_PREFERENCES")
	private String turnoverLimitPreferences;
	
	@Column(name="R_MANAGER_CODE")
	private String rManagerCode;
	
	@Column(name="R_NAME")
	private String rName;
	
	@Column(name="SINCE")
	private Date since;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TRACK_RECEIVABLE")
	private String trackReceivable;
	
	@Column(name="FUNDS")
	private String funds;
	
	@Column(name="REFERAL_REQUIRED")
	private String referalRequired;
	
	@Column(name="REPLICATE_CUST_SIGNATURE")
	private String replicateCustSignature;
	
	@Column(name="SALARY_ACCOUNT")
	private String salaryAccount;
	
	@Column(name="PROJECT_ACCOUNT")
	private String projectAccount;
	
	@Column(name="CHARGE_ON_SHIFT_COPY_ADVISE")
	private String chargeOnShiftCopyAdvise;
	
	@Column(name="READY_CREDIT")
	private String readyCredit;
	
	@Column(name="ACCOUNT_DELIVERED_STATUS")
	private String accountDeliveredStatus;
	
	@Column(name="FORCE_POST")
	private String forcePost;
	
	@Column(name="AUTO_ALLOCATE_TOD")
	private String autoAllocateTod;
	
	@Column(name="RECORD_ON")
	private Timestamp recordOn;
	
	@Column(name="TOTAL_LOAN_AMOUNT")
	private Long totalLoanAmount;
	
	@Column(name="DISBURSED_AMOUNT")
	private Long disbursedAmount;
	
	@Column(name="PRINCIPAL_OUTSTANDING")
	private Long principalOutstanding;
	
	@Column(name="TOTAL_OUTSTANDING")
	private Long totalOutstanding;
	
	@Column(name="LOAN_ACCOUNT_TYPE")
	private String loanAccountType;
	
	@Column(name="BRANCH_ID")
	private String branchId;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="LOAN_CURRENCY")
	private String loanCurrency;
	
	@Column(name="LOAN_CLOSURE_DATE")
	private Date loanClosureDate;
	
	@Column(name="SCHEME")
	private String scheme;
	
	@Column(name="IS_LOAN_ACCOUNT")
	private String isLoanAccount;
	
	@Column(name="SWIFT_COPY_ADVCHG")
	private String swiftCopyAdvchg;
	
	@Column(name="MANUAL_TRACKED_FUNDS")
	private String manualTrackedFunds;
	
	@Column(name="NO_DEBIT_FOR_KYC_EXPR")
	private String noDebitForKycExpr;
	
	@Column(name="SKIP_KYC_ID_EXP")
	private String skipKycIdExp;
	
	@Column(name="POSTING_ALLOWED")
	private String postingAllowed;
	
	@Column(name="AUTO_STAT_CHANGE")
	private String autoStatChange;
	
	@Column(name="IBAN_REQD")
	private String ibanReqd;
}
