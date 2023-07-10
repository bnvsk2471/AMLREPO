package com.aml.entity;

import java.time.LocalDate;
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
@Table(name = "AML_CASE_DETAILS")
public class AllCases {
    @Id
    @Column(name = "CASE_DETAILS_ID")
	private int caseDetailsId;
    @Column(name = "ALERT_ID")
	private String alertId;
    @Column(name = "ASSIGNED_USER")
	private String assignedUser;
    @Column(name = "CASE_REF_NO")
	private String caseRefNo;
    @Column(name = "CASE_STATUS")
	private String caseStatus;
    @Column(name = "CIF_NO")
	private String cifNo;
    @Column(name = "CLOSED_BY")
	private String closedBy;
    @Column(name = "CREATED_DATE")
	private LocalDate createdDate;
    @Column(name = "CURRENT_STEP")
	private String currentStep;
    @Column(name = "DATA_ID")
	private int dataId;
    @Column(name = "INSTANCE_ID")
	private String instanceId;
    @Column(name = "PREVIOUS_STEP")
	private String previousStep;
    @Column(name = "TASK_ID")
	private String taskId;
	@Column(name = "ALERTED_ENTITY_NUMBER")
	private String alertedEntityNumber;
	@Column(name = "PRIMARY_ENTITY_NAME")
	private String primaryEntityName;
	@Column(name = "ALERT_CREATION_DATE")
	private Date alertCreationDate;
	@Column(name = "SAS_CASE_ID")
	private String sasCaseId;
	@Column(name = "CLOSED_DATE")
	private String closedDate;
	@Column(name = "CREATED_USER_ID")
	private String createdUserId;
	@Column(name = "AGEING")
	private String ageing;
	@Column(name = "IS_HIGH_CRS")
	private String isHighCrs;
	@Column(name = "RISK_SCORE")
	private String riskScore;
	
}
