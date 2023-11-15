package com.MSIL.POJO.Certification;

public class CertExteriorRoot 
{
	public String certificationId;
    public String mspin;
    public String registrationNumber;
    public String stageCode;
    public CertExterior exterior;
	
    public String getCertificationId() {
		return certificationId;
	}
	public void setCertificationId(String certificationId) {
		this.certificationId = certificationId;
	}
	public String getMspin() {
		return mspin;
	}
	public void setMspin(String mspin) {
		this.mspin = mspin;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getStageCode() {
		return stageCode;
	}
	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}
	public CertExterior getExterior() {
		return exterior;
	}
	public void setExterior(CertExterior exterior) {
		this.exterior = exterior;
	}


}
