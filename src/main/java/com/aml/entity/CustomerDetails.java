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
@Table(name="AML_CUSTOMER_DETAILS")
public class CustomerDetails {
	
	@Column(name="CUST_DETAILS_ID")
	@Id
	private Integer custDetailsId;
	
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
	private Timestamp date;
	
	@Column(name="PURPOSE_OF_ACCOUNT_OPENING")
	private String purposeofAccount;
	
	@Column(name="SOURCE_OF_INCOME")
	private String sourceOfIncome;
	
	@Column(name="ACCOUNT_OPEN_DATE")
	private Timestamp accountOpenDate;
	
	@Column(name="COMPANY_TYPE")
	private String companyType;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="RECORD_ON")
	private String recordOn;
	
	@Column(name="RM_CODE")
	private String rmCode;
	
	@Column(name="RM_NAME")
	private String rmName;
	
	@Column(name="KYC_STS")
	private String kycSts;


}
