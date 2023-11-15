package com.MSIL.POJO.Certification.RatingAndPricing_POJO;

public class Certi_RatingandPricing_POJO {

	private String certificationId;
	private String mspin;
	private String registrationNumber;
	private String stageCode;
	private String isFinalSubmission;
	private rating rating;


	
	public rating getRating() {
		return rating;
	}
	public void setRating(rating rating) {
		this.rating = rating;
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

	public String getIsFinalSubmission() {
		return isFinalSubmission;
	}

	public void setIsFinalSubmission(String isFinalSubmission) {
		this.isFinalSubmission = isFinalSubmission;
	}
	
	
	

}
