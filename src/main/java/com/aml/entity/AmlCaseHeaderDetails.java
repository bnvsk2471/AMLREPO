package com.aml.entity;

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
@Table(name="AML_CASE_HEADER_DETAILS")
public class AmlCaseHeaderDetails {
	
	@Id
	@Column(name="DATA_ID")
	private Integer dataId;
	
	@Column(name="CASE_REF_NO")
	private String caseRefNo;
	
	@Column(name="CIF_NO")
	private String cifNo;
	
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="CUSTOMER_TYPE")
	private String customerType;
	
	@Column(name="AGE_OF_RELATIONSHIP")
	private String ageOfRelationship;
	
	@Column(name="RM_NAME")
	private String rmName;
	
	@Column(name="DIVISION_NAME")
	private String divisionName;
	
	@Column(name="NATIONALITY")
	private String nationality;
	
	@Column(name="RISKSCORE")
	private String riskScore;
	
	@Column(name="NO_OF_LBOS")
	private String noOfLbos;
	
	@Column(name="DOB")
	private String DOB;
	
	@Column(name="PROFESSION")
	private String profession;
	
	@Column(name="SOURCE_OF_INCOME")
	private String sourceOfIncome;
	
	@Column(name="CASE_STATUS")
	private String caseStatus;
	
	@Column(name="CREATEDDATE")
	private String createDate;
	
	@Column(name="DEADLINE")
	private String deadLine;
	
	@Column(name="ASSIGNEDTO")
	private String assignedTo;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="CIF_STATUS")
	private String cifStatus;
	
}
