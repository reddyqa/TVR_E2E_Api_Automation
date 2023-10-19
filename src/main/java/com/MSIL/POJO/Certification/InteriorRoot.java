package com.MSIL.POJO.Certification;

public class InteriorRoot
{
	public String certificationId;
    public String mspin;
    public String registrationNumber;
    public String carCondition;
    public String stageCode;
    public Interior interior;
	
	public String getCertificationId() {
		return certificationId;
	}
	public String getMspin() {
		return mspin;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public String getCarCondition() {
		return carCondition;
	}

	public String getStageCode() {
		return stageCode;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setCertificationId(String certificationId) {
		this.certificationId = certificationId;
	}
	public void setMspin(String mspin) {
		this.mspin = mspin;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void setCarCondition(String carCondition) {
		this.carCondition = carCondition;
	}
	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}


}
