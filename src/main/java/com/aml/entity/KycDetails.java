package com.aml.entity;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
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
	public KycDetails() {
		super();
	}
	public KycDetails(int kycUserId, int dataId, String acClasification, String callCenterIvr, String nationality,
			String eddFlag, String employerCode, String favoriteCity, String kycCriteria1, String kycCriteria2,
			String kycCriteria3, String kycCriteria4, String kycCriteria5, String kycCriteria6, String kycCriteria7,
			String modeOfPurchase, String oneOfCashDepTran, String oneOfCashWithdrwTran,
			String oneOfChqueCashWithdrwTran, Timestamp recordOn) {
		super();
		KycUserId = kycUserId;
		this.dataId = dataId;
		this.acClasification = acClasification;
		this.callCenterIvr = callCenterIvr;
		this.nationality = nationality;
		this.eddFlag = eddFlag;
		this.employerCode = employerCode;
		this.favoriteCity = favoriteCity;
		this.kycCriteria1 = kycCriteria1;
		this.kycCriteria2 = kycCriteria2;
		this.kycCriteria3 = kycCriteria3;
		this.kycCriteria4 = kycCriteria4;
		this.kycCriteria5 = kycCriteria5;
		this.kycCriteria6 = kycCriteria6;
		this.kycCriteria7 = kycCriteria7;
		this.modeOfPurchase = modeOfPurchase;
		this.oneOfCashDepTran = oneOfCashDepTran;
		this.oneOfCashWithdrwTran = oneOfCashWithdrwTran;
		this.oneOfChqueCashWithdrwTran = oneOfChqueCashWithdrwTran;
		this.recordOn = recordOn;
	}
	public int getKycUserId() {
		return KycUserId;
	}
	public void setKycUserId(int kycUserId) {
		KycUserId = kycUserId;
	}
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getAcClasification() {
		return acClasification;
	}
	public void setAcClasification(String acClasification) {
		this.acClasification = acClasification;
	}
	public String getCallCenterIvr() {
		return callCenterIvr;
	}
	public void setCallCenterIvr(String callCenterIvr) {
		this.callCenterIvr = callCenterIvr;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getEddFlag() {
		return eddFlag;
	}
	public void setEddFlag(String eddFlag) {
		this.eddFlag = eddFlag;
	}
	public String getEmployerCode() {
		return employerCode;
	}
	public void setEmployerCode(String employerCode) {
		this.employerCode = employerCode;
	}
	public String getFavoriteCity() {
		return favoriteCity;
	}
	public void setFavoriteCity(String favoriteCity) {
		this.favoriteCity = favoriteCity;
	}
	public String getKycCriteria1() {
		return kycCriteria1;
	}
	public void setKycCriteria1(String kycCriteria1) {
		this.kycCriteria1 = kycCriteria1;
	}
	public String getKycCriteria2() {
		return kycCriteria2;
	}
	public void setKycCriteria2(String kycCriteria2) {
		this.kycCriteria2 = kycCriteria2;
	}
	public String getKycCriteria3() {
		return kycCriteria3;
	}
	public void setKycCriteria3(String kycCriteria3) {
		this.kycCriteria3 = kycCriteria3;
	}
	public String getKycCriteria4() {
		return kycCriteria4;
	}
	public void setKycCriteria4(String kycCriteria4) {
		this.kycCriteria4 = kycCriteria4;
	}
	public String getKycCriteria5() {
		return kycCriteria5;
	}
	public void setKycCriteria5(String kycCriteria5) {
		this.kycCriteria5 = kycCriteria5;
	}
	public String getKycCriteria6() {
		return kycCriteria6;
	}
	public void setKycCriteria6(String kycCriteria6) {
		this.kycCriteria6 = kycCriteria6;
	}
	public String getKycCriteria7() {
		return kycCriteria7;
	}
	public void setKycCriteria7(String kycCriteria7) {
		this.kycCriteria7 = kycCriteria7;
	}
	public String getModeOfPurchase() {
		return modeOfPurchase;
	}
	public void setModeOfPurchase(String modeOfPurchase) {
		this.modeOfPurchase = modeOfPurchase;
	}
	public String getOneOfCashDepTran() {
		return oneOfCashDepTran;
	}
	public void setOneOfCashDepTran(String oneOfCashDepTran) {
		this.oneOfCashDepTran = oneOfCashDepTran;
	}
	public String getOneOfCashWithdrwTran() {
		return oneOfCashWithdrwTran;
	}
	public void setOneOfCashWithdrwTran(String oneOfCashWithdrwTran) {
		this.oneOfCashWithdrwTran = oneOfCashWithdrwTran;
	}
	public String getOneOfChqueCashWithdrwTran() {
		return oneOfChqueCashWithdrwTran;
	}
	public void setOneOfChqueCashWithdrwTran(String oneOfChqueCashWithdrwTran) {
		this.oneOfChqueCashWithdrwTran = oneOfChqueCashWithdrwTran;
	}
	public Timestamp getRecordOn() {
		return recordOn;
	}
	public void setRecordOn(Timestamp recordOn) {
		this.recordOn = recordOn;
	}
	@Override
	public String toString() {
		return "KycDetails [KycUserId=" + KycUserId + ", dataId=" + dataId + ", acClasification=" + acClasification
				+ ", callCenterIvr=" + callCenterIvr + ", nationality=" + nationality + ", eddFlag=" + eddFlag
				+ ", employerCode=" + employerCode + ", favoriteCity=" + favoriteCity + ", kycCriteria1=" + kycCriteria1
				+ ", kycCriteria2=" + kycCriteria2 + ", kycCriteria3=" + kycCriteria3 + ", kycCriteria4=" + kycCriteria4
				+ ", kycCriteria5=" + kycCriteria5 + ", kycCriteria6=" + kycCriteria6 + ", kycCriteria7=" + kycCriteria7
				+ ", modeOfPurchase=" + modeOfPurchase + ", oneOfCashDepTran=" + oneOfCashDepTran
				+ ", oneOfCashWithdrwTran=" + oneOfCashWithdrwTran + ", oneOfChqueCashWithdrwTran="
				+ oneOfChqueCashWithdrwTran + ", recordOn=" + recordOn + "]";
	}

	
}
