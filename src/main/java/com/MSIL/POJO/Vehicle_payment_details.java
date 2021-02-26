package com.MSIL.POJO;

import java.util.List;

public class Vehicle_payment_details 
{
	private Long cityId;
	private List<String> colorType;
	private Long tenure;
	private String startDate;
	private String endDate;
	//private List<Categories_VPD> Categories;
	
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public List<String> getColorType() {
		return colorType;
	}
	public void setColorType(List<String> colorType) {
		this.colorType = colorType;
	}
	public Long getTenure() {
		return tenure;
	}
	public void setTenure(Long tenure) {
		this.tenure = tenure;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/*
	 * public List<Categories_VPD> getCategories() { return Categories; } public
	 * void setCategories(List<Categories_VPD> categories) { Categories =
	 * categories; }
	 */
	

}
