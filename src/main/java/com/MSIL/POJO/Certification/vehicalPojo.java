package com.MSIL.POJO.Certification;

public class vehicalPojo {
	private String certificationId;
	private String mspin;
    private String registrationNumber;
    private String carCondition;
    private String regNumberFoundInDms;
    public String getRegNumberFoundInDms() {
		return regNumberFoundInDms;
	}
	public void setRegNumberFoundInDms(String regNumberFoundInDms) {
		this.regNumberFoundInDms = regNumberFoundInDms;
	}
	private String stageCode;
    
    public vehical getVehical() {
		return vehical;
	}
	public void setVehical(vehical vehical) {
		this.vehical = vehical;
	}
	private vehical vehical;
    
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
	public String getCarCondition() {
		return carCondition;
	}
	public void setCarCondition(String carCondition) {
		this.carCondition = carCondition;
	}

	public String getStageCode() {
		return stageCode;
	}
	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}


}
