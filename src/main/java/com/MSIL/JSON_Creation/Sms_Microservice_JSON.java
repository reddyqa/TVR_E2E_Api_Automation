package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import com.MSIL.POJO.Sms_Microservice_POJO;
import com.MSIL.POJO.Vehicle_Configure_POJO;
import com.google.gson.Gson;

public class Sms_Microservice_JSON {

	public String Sms_microservice(Hashtable<String, String> map) {
		String jsonString = null;
		Sms_Microservice_POJO Sms_Microservice = new Sms_Microservice_POJO();
		Vehicle_Configure_POJO Vehicle_Configure = new Vehicle_Configure_POJO();
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("phonenumber")) {
				if (value.equals("null") || value.equals("")) {
					Sms_Microservice.setphonenumber(null);
				} else {
					Sms_Microservice.setphonenumber(value);
				}
			} else if (key.equals("templateId")) {
				if (value.equals("null") || value.equals("")) {
					Sms_Microservice.settemplateId(null);
				} else {
					Sms_Microservice.settemplateId(value);
				}
			} else if (key.equals("city")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setcity(null);
				} else {
					Vehicle_Configure.setcity(value);
				}
			} else if (key.equals("tenure")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.settenure(null);
				} else {
					Vehicle_Configure.settenure(value);
				}
			} else if (key.equals("colorType")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setcolorType(null);
				} else {
					Vehicle_Configure.setcolorType(value);										
				}
			
			} else if (key.equals("leasingCompany")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setleasingCompany(null);
				} else {
					Vehicle_Configure.setcolorType(value);										
				}
			} 
			
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(Vehicle_Configure);

		System.out.println(jsonString);
		return jsonString;
	}
	

}
