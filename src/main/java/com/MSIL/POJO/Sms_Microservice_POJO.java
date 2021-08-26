package com.MSIL.POJO;

public class Sms_Microservice_POJO {
	
	private String phonenumber;
	private String templateId;
	private Meta meta;
	private String locale;
	private String source;
	

	public String getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String gettemplateId() {
		return templateId;
	}

	public void settemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public String getlocale() {
		return locale;
	}

	public void setlocale(String locale) {
		this.locale = locale;
	}
	
	
	public String getsource() {
		return source;
	}

	public void setsource(String source) {
		this.source = source;
	}
	public static class Meta {
	    private String otp_val;

	    public String getOtp_val() {
	        return otp_val;
	    }

	    public void setOtp_val(String otp_val) {
	        this.otp_val = otp_val;
	    }

}}
