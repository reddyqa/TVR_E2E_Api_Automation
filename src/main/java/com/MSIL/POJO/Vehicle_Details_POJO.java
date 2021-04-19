package com.MSIL.POJO;

import java.util.List;

public class Vehicle_Details_POJO {
	private String cityId;
	private String modelCode;
	private String variantCode;
	private String colorType;
	private String categoryId;
	private String tenureId;
	private List<String> partnerId;
	private String registrationType;
	private String resolution;
	private String mileageCode;

	public String getcityId() {
		return cityId;
	}

	public void setcityId(String cityId) {
		this.cityId = cityId;
	}
	
	public String getmodelCode() {
		return modelCode;
	}

	public void setmodelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	public String getvcolorType() {
		return colorType;
	}

	public void setcolorType(String colorType) {
		this.colorType = colorType;
	}
	
	public String getvariantCode() {
		return variantCode;
	}

	public void setvariantCode(String variantCode) {
		this.variantCode = variantCode;
	}

	public String getcategoryId() {
		return categoryId;
	}

	public void setcategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	
	public String gettenureId() {
		return tenureId;
	}

	public void settenureId(String tenureId) {
		this.tenureId = tenureId;
	}
	
	public List <String> getpartnerId() {
		return partnerId;
	}

	public void setpartnerId(List<String> partnerId) {
		this.partnerId = partnerId;
	}
	
	public String getregistrationType() {
		return registrationType;
	}

	public void setregistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	
	public String getresolution() {
		return resolution;
	}

	public void setresolution(String resolution) {
		this.resolution = resolution;
	}
	public String getmileageCode() {
		return mileageCode;
	}

	public void setmileageCode(String mileageCode) {
		this.mileageCode = mileageCode;
}

}
