package com.MSIL.POJO.Certification.RFCost_POJO;

public class RfcostRoot
{
    private String certificationId;
    private String mspin;
    private String registrationNumber;
    private String stageCode;
    private refurbishment refurbishment;

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

    public com.MSIL.POJO.Certification.RFCost_POJO.refurbishment getRefurbishment() {
        return refurbishment;
    }

    public void setRefurbishment(com.MSIL.POJO.Certification.RFCost_POJO.refurbishment refurbishment) {
        this.refurbishment = refurbishment;
    }



}
