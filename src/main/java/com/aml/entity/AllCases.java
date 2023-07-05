package com.aml.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
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
	private Timestamp createdDate;
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
	public AllCases() {
		super();
	}
	public AllCases(int caseDetailsId, String alertId, String assignedUser, String caseRefNo, String caseStatus,
			String cifNo, String closedBy, Timestamp createdDate, String currentStep, int dataId, String instanceId,
			String previousStep, String taskId, String alertedEntityNumber, String primaryEntityName,
			Date alertCreationDate, String sasCaseId, String closedDate, String createdUserId, String ageing,
			String isHighCrs) {
		super();
		this.caseDetailsId = caseDetailsId;
		this.alertId = alertId;
		this.assignedUser = assignedUser;
		this.caseRefNo = caseRefNo;
		this.caseStatus = caseStatus;
		this.cifNo = cifNo;
		this.closedBy = closedBy;
		this.createdDate = createdDate;
		this.currentStep = currentStep;
		this.dataId = dataId;
		this.instanceId = instanceId;
		this.previousStep = previousStep;
		this.taskId = taskId;
		this.alertedEntityNumber = alertedEntityNumber;
		this.primaryEntityName = primaryEntityName;
		this.alertCreationDate = alertCreationDate;
		this.sasCaseId = sasCaseId;
		this.closedDate = closedDate;
		this.createdUserId = createdUserId;
		this.ageing = ageing;
		this.isHighCrs = isHighCrs;
	}
	public int getCaseDetailsId() {
		return caseDetailsId;
	}
	public void setCaseDetailsId(int caseDetailsId) {
		this.caseDetailsId = caseDetailsId;
	}
	public String getAlertId() {
		return alertId;
	}
	public void setAlertId(String alertId) {
		this.alertId = alertId;
	}
	public String getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}
	public String getCaseRefNo() {
		return caseRefNo;
	}
	public void setCaseRefNo(String caseRefNo) {
		this.caseRefNo = caseRefNo;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public String getCifNo() {
		return cifNo;
	}
	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}
	public String getClosedBy() {
		return closedBy;
	}
	public void setClosedBy(String closedBy) {
		this.closedBy = closedBy;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getCurrentStep() {
		return currentStep;
	}
	public void setCurrentStep(String currentStep) {
		this.currentStep = currentStep;
	}
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getPreviousStep() {
		return previousStep;
	}
	public void setPreviousStep(String previousStep) {
		this.previousStep = previousStep;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getAlertedEntityNumber() {
		return alertedEntityNumber;
	}
	public void setAlertedEntityNumber(String alertedEntityNumber) {
		this.alertedEntityNumber = alertedEntityNumber;
	}
	public String getPrimaryEntityName() {
		return primaryEntityName;
	}
	public void setPrimaryEntityName(String primaryEntityName) {
		this.primaryEntityName = primaryEntityName;
	}
	public Date getAlertCreationDate() {
		return alertCreationDate;
	}
	public void setAlertCreationDate(Date alertCreationDate) {
		this.alertCreationDate = alertCreationDate;
	}
	public String getSasCaseId() {
		return sasCaseId;
	}
	public void setSasCaseId(String sasCaseId) {
		this.sasCaseId = sasCaseId;
	}
	public String getClosedDate() {
		return closedDate;
	}
	public void setClosedDate(String closedDate) {
		this.closedDate = closedDate;
	}
	public String getCreatedUserId() {
		return createdUserId;
	}
	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}
	public String getAgeing() {
		return ageing;
	}
	public void setAgeing(String ageing) {
		this.ageing = ageing;
	}
	public String getIsHighCrs() {
		return isHighCrs;
	}
	public void setIsHighCrs(String isHighCrs) {
		this.isHighCrs = isHighCrs;
	}
	@Override
	public String toString() {
		return "AllCases [caseDetailsId=" + caseDetailsId + ", alertId=" + alertId + ", assignedUser=" + assignedUser
				+ ", caseRefNo=" + caseRefNo + ", caseStatus=" + caseStatus + ", cifNo=" + cifNo + ", closedBy="
				+ closedBy + ", createdDate=" + createdDate + ", currentStep=" + currentStep + ", dataId=" + dataId
				+ ", instanceId=" + instanceId + ", previousStep=" + previousStep + ", taskId=" + taskId
				+ ", alertedEntityNumber=" + alertedEntityNumber + ", primaryEntityName=" + primaryEntityName
				+ ", alertCreationDate=" + alertCreationDate + ", sasCaseId=" + sasCaseId + ", closedDate=" + closedDate
				+ ", createdUserId=" + createdUserId + ", ageing=" + ageing + ", isHighCrs=" + isHighCrs + "]";
	}
	
	
}
