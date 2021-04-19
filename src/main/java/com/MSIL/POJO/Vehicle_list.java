package com.MSIL.POJO;

import java.util.List;

//import com.fasterxml.jackson.annotation.JsonRootName;
//@JsonRootName("filter")
public class Vehicle_list {
	private Long cityId;
	private Long tenureId;
	private String resolution;
	private Boolean isNew;
	private Long[] categoryIds;
	private List<String> bodyType;
	private List<String> transmissionType;
	private List<String> fuelType;
	private List<String> channelType;
	private List<String> colorType;
	private List<String> registrationType;
	private List<String> modelCode;
	private List<String> variantCode;
	private Long fromPrice;
	private Long toPrice;
	private Boolean filterSortOnPostGST;
	private String startDate;
	private String forCode;
	private List<String> leasingCompCode;
	private String mileageCode;

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getTenureId() {
		return tenureId;
	}

	public void setTenureId(Long tenureId) {
		this.tenureId = tenureId;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public List<String> getBodyType() {
		return bodyType;
	}

	public void setBodyType(List<String> bodyType) {
		this.bodyType = bodyType;
	}

	public List<String> getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(List<String> tranmissionType) {
		this.transmissionType = tranmissionType;
	}

	public List<String> getFuelType() {
		return fuelType;
	}

	public void setFuelType(List<String> fuelType) {
		this.fuelType = fuelType;
	}

	public List<String> getChannelType() {
		return channelType;
	}

	public void setChannelType(List<String> channelType) {
		this.channelType = channelType;
	}

	public List<String> getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(List<String> registrationType) {
		this.registrationType = registrationType;
	}

	public List<String> getModelCode() {
		return modelCode;
	}

	public void setModelCode(List<String> modelCode) {
		this.modelCode = modelCode;
	}

	public List<String> getVariantCode() {
		return variantCode;
	}

	public void setVariantCode(List<String> variantCode) {
		this.variantCode = variantCode;
	}

	public Long getFromPrice() {
		return fromPrice;
	}

	public void setFromPrice(Long fromPrice) {
		this.fromPrice = fromPrice;
	}

	public Long getToPrice() {
		return toPrice;
	}

	public void setToPrice(Long toPrice) {
		this.toPrice = toPrice;
	}

	public Boolean getFilterSortOnPostGST() {
		return filterSortOnPostGST;
	}

	public void setFilterSortOnPostGST(boolean filterSortOnPostGST) {
		this.filterSortOnPostGST = filterSortOnPostGST;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Long[] getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(Long[] categoryIds) {
		this.categoryIds = categoryIds;
	}

	public List<String> getColorType() {
		return colorType;
	}

	public void setColorType(List<String> colorType) {
		this.colorType = colorType;
	}

	public String getForCode() {
		return forCode;
	}

	public void setForCode(String forCode) {
		this.forCode = forCode;
	}

	public List<String> getLeasingCompCode() {
		return leasingCompCode;
	}

	public void setLeasingCompCode(List<String> leasingCompCode) {
		this.leasingCompCode = leasingCompCode;
	}

	public String getMileageCode() {
		return mileageCode;
	}

	public void setMileageCode(String mileageCode) {
		this.mileageCode = mileageCode;
	}

	public void setFilterSortOnPostGST(Boolean filterSortOnPostGST) {
		this.filterSortOnPostGST = filterSortOnPostGST;
	}
	
	

}
