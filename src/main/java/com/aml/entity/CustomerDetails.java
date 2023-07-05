package com.aml.entity;

import java.security.Timestamp;
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
@Table(name="AML_CUSTOMER_DETAILS")
public class CustomerDetails {
	
	@Column(name="CUST_DETAILS_ID")
	@Id
	private Long custDetailsId;
	
	@Column(name="DATA_ID")
	private Long dataId;
	
	@Column(name="CIF")
	private String cif;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="PROFESSION_PARTNER")
	private String professionPatner;
	
	@Column(name="MONTHLY_INCOME_AED")
	private String monthlyIncome;
	
	@Column(name="ANNUAL_TURNOVER_AED")
	private String annualTurnover;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="DOB")
	private Date date;
	
	@Column(name="PURPOSE_OF_ACCOUNT_OPENING")
	private String purposeofAccount;
	
	@Column(name="SOURCE_OF_INCOME")
	private String sourceOfIncome;
	
	@Column(name="ACCOUNT_OPEN_DATE")
	private Date accountOpenDate;
	
	@Column(name="COMPANY_TYPE")
	private String companyType;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="RECORD_ON")
	private Timestamp recordOn;
	
	@Column(name="RM_CODE")
	private String rmCode;
	
	@Column(name="RM_NAME")
	private String rmName;
	
	@Column(name="KYC_STS")
	private String kycSts;


}
