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
@Table(name = "AML_KYC_USER_DETAILS")
public class KycDetails {
    @Id
    @Column(name = "KYC_USER_ID")
	private int KycUserId;
    @Column(name = "DATA_ID")
	private int dataId;
    @Column(name = "AC_CLASIFICATION")
	private String acClasification;
    @Column(name = "CALL_CENTER_IVR")
	private String callCenterIvr;
    @Column(name = "NATIONALITY")
	private String nationality;
    @Column(name = "EDD_FLAG")
	private String eddFlag;
    @Column(name = "EMPLOYER_CODE")
	private String employerCode;
    @Column(name = "FAVORITE_CITY")
	private String favoriteCity;
    @Column(name = "KYC_CRITERIA1")
	private String kycCriteria1;
    @Column(name = "KYC_CRITERIA2")
	private String kycCriteria2;
    @Column(name = "KYC_CRITERIA3")
	private String kycCriteria3;
    @Column(name = "KYC_CRITERIA4")
	private String kycCriteria4;
    @Column(name = "KYC_CRITERIA5")
	private String kycCriteria5;
    @Column(name = "KYC_CRITERIA6")
	private String kycCriteria6;
    @Column(name = "KYC_CRITERIA7")
	private String kycCriteria7;
    @Column(name = "MODE_OF_PURCHASE")
	private String modeOfPurchase;
    @Column(name = "ONE_OF_CASH_DEP_TRAN")
	private String oneOfCashDepTran;
    @Column(name = "ONE_OF_CASH_WTHDRW_TRAN")
	private String oneOfCashWithdrwTran;
    @Column(name = "ONE_OF_CHQUE_WTHDRW_TRAN")
	private String oneOfChqueCashWithdrwTran;
    @Column(name = "RECORD_ON")
	private Timestamp recordOn;
}
