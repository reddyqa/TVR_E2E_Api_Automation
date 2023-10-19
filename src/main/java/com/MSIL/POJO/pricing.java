package com.MSIL.POJO;

import java.util.List;

public class pricing {
	
	private String	customerExpectedPrice;
	private String	evaluatorQuotedPrice;
	private String	referencePriceMin;
	private String	referencePriceMax;
	private String	nonTrueValue;
	private String	vehicleCategoryInput;
	private List<uploadPhotoImage> uploadPhotoImage;
	
	public String getCustomerExpectedPrice() {
		return customerExpectedPrice;
	}
	public void setCustomerExpectedPrice(String customerExpectedPrice) {
		this.customerExpectedPrice = customerExpectedPrice;
	}
	public String getEvaluatorQuotedPrice() {
		return evaluatorQuotedPrice;
	}
	public void setEvaluatorQuotedPrice(String evaluatorQuotedPrice) {
		this.evaluatorQuotedPrice = evaluatorQuotedPrice;
	}
	public String getReferencePriceMin() {
		return referencePriceMin;
	}
	public void setReferencePriceMin(String referencePriceMin) {
		this.referencePriceMin = referencePriceMin;
	}
	public String getReferencePriceMax() {
		return referencePriceMax;
	}
	public void setReferencePriceMax(String referencePriceMax) {
		this.referencePriceMax = referencePriceMax;
	}
	public String getNonTrueValue() {
		return nonTrueValue;
	}
	public void setNonTrueValue(String nonTrueValue) {
		this.nonTrueValue = nonTrueValue;
	}
	public String getVehicleCategoryInput() {
		return vehicleCategoryInput;
	}
	public void setVehicleCategoryInput(String vehicleCategoryInput) {
		this.vehicleCategoryInput = vehicleCategoryInput;
	}
	public List<uploadPhotoImage> getUploadPhotoImage() {
		return uploadPhotoImage;
	}
	public void setUploadPhotoImage(List<uploadPhotoImage> uploadPhotoImage) {
		this.uploadPhotoImage = uploadPhotoImage;
	}
	
	
	
    
}
