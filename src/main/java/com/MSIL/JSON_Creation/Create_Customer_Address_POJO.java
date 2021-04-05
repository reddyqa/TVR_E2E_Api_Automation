package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.MSIL.POJO.Cus_Addresses;
import com.MSIL.POJO.Customer_Address;
import com.MSIL.POJO.Customer_Address_POJO;
import com.google.gson.Gson;

import Query.Queries;

public class Create_Customer_Address_POJO 
{
	@SuppressWarnings({ "static-access", "rawtypes" })
	public static String customer_address_json(Hashtable<String, String> map)
	{
		String jsonString = null;
		Customer_Address_POJO customeraddress = new Customer_Address_POJO();		
		List<Customer_Address> cust_address= new ArrayList<Customer_Address>();
		Cus_Addresses add = new Cus_Addresses();
		Customer_Address customer_add = new Customer_Address();
		Queries q = new Queries();
		
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
		
		while(itr.hasNext())
		{
			
			key = (String) itr.next();
			value = map.get(key);
			if(key.equals("id"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setId(null);;
				}else
				{
					add.setId(q.get_customer_id());					
				}
			}else if(key.equals("addressLine1"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setAddressLine1(null);
				}else
				{
					add.setAddressLine1(value);					
				}
			}else if(key.equals("addressLine2"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setAddressLine2(null);
				}else
				{
					add.setAddressLine2(value);					
				}
			}else if(key.equals("addressLine3"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setAddressLine3(null);
				}else
				{
					add.setAddressLine3(value);					
				}
			}else if(key.equals("area"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setArea(null);
				}else
				{
					add.setArea(value);					
				}				
			}else if(key.equals("pincode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setPincode(null);
				}else
				{
					add.setPincode(value);				
				}	
			}else if(key.equals("state"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setState(null);
				}else
				{
					add.setState(value);			
				}	
			}else if(key.equals("city"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setCity(null);
				}else
				{
					add.setCity(value);			
				}	
			}else if(key.equals("latitude"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setLatitude(null);
				}else
				{
					add.setLatitude(value);		
				}					
			}else if(key.equals("longitude"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setLongitude(null);
				}else
				{
					add.setLongitude(value);	
				}	
			}else if(key.equals("dmsCityCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setDmsCityCode(null);
				}else
				{
					add.setDmsCityCode(value);	
				}	
			}else if(key.equals("cibilStateCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					add.setCibilStateCode(null);
				}else
				{
					add.setCibilStateCode(value);	
				}	
			}else if(key.equals("addressType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					customer_add.setAddressType(null);
				}else
				{
					customer_add.setAddressType(value);
				}	
			}else if(key.equals("addressCategory"))
			{
				if(value.equals("null")||value.equals(""))
				{
					customer_add.setAddressCategory(null);
				}else
				{
					customer_add.setAddressCategory(value);
				}	
			}else if(key.equals("gstNumber"))
			{
				if(value.equals("null")||value.equals(""))
				{
					customer_add.setGstNumber(null);
				}else
				{
					customer_add.setGstNumber(value);
				}	
			}else if(key.equals("standard"))
			{
				if(value.equals("null")||value.equals(""))
				{
					customer_add.setStandard(null);
				}else
				{
					customer_add.setStandard(value);
				}	
				
			}
			
			
		}
		List<Cus_Addresses> address = new ArrayList<Cus_Addresses>();
		address.add(add);
		customer_add.setAddresses(address);
		cust_address.add(customer_add);
		customeraddress.setCustomerAddresses(cust_address);
		Gson gSon = new Gson();
		jsonString = gSon.toJson(customeraddress);
		
		System.out.println(jsonString);
		return jsonString;
	}

}
