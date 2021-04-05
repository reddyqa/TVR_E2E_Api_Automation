package com.MSIL.POJO;

import java.util.ArrayList;
import java.util.List;

public class Customer_Address
{
	//private Cus_Addresses[] addresses;
	private  List<Cus_Addresses> addresses = new ArrayList<>();
	private String addressType;
	private String addressCategory;
	private String gstNumber;
	private String standard;
	
	
	public List<Cus_Addresses> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Cus_Addresses> addresses) {
		this.addresses = addresses;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddressCategory() {
		return addressCategory;
	}
	public void setAddressCategory(String addressCategory) {
		this.addressCategory = addressCategory;
	}
	public String getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	

}
