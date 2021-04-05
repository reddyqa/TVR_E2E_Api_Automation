package com.MSIL.POJO;

import java.util.ArrayList;
import java.util.List;

public class Customer_Address_POJO 
{
	//private Customer_Address[] customerAddresses;
	private  List<Customer_Address> customerAddresses =new ArrayList<>();
	

	public List<Customer_Address> getCustomerAddresses() {
		return customerAddresses;
	}

	public void setCustomerAddresses(List<Customer_Address> customerAddresses) {
		this.customerAddresses = customerAddresses;
	}

	

}
