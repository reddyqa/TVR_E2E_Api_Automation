package com.MSIL.POJO.Certification;

public class CertEnginePOJO {
	
	
	private String certificationId;
	private String mspin;
	private String registrationNumber;
	private String stageCode;
	private engine engine;

	public engine getEngine() {
		return engine;
	}
	public void setEngine(engine engine) {
		this.engine = engine;
	}
	
	
	
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


}
