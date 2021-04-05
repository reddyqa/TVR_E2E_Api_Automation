package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;
import com.MSIL.POJO.CustomerOccupationSavePOJO;
import com.google.gson.Gson;

public class CustomerOccupationJson 
{
	
	public static String occupation_create_json(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		CustomerOccupationSavePOJO occupation = new CustomerOccupationSavePOJO();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("occupationTypeCode")) {
				if (value.equals("null") || value.equals("")) {
					occupation.setOccupationTypeCode(null);
				} else {
					occupation.setOccupationTypeCode(value);
				}
			} else if (key.equals("employerType")) {
				if (value.equals("null") || value.equals("")) {
					occupation.setEmployerType(null);
				} else {
					occupation.setEmployerType(value);
				}
			} else if (key.equals("companyName")) {
				if (value.equals("null") || value.equals("")) {
					occupation.setCompanyName(null);
				} else {
					occupation.setCompanyName(value);
				}
			} else if (key.equals("grossIncome")) {
				if (value.equals("null") || value.equals("")) {
					occupation.setGrossIncome(null);
				} else {
					occupation.setGrossIncome(value);
				}
			} else if (key.equals("netIncome")) {
				if (value.equals("null") || value.equals("")) {
					occupation.setNetIncome(null);
				} else {
					occupation.setNetIncome(value);									
				}
			}else if(key.equals("workEx")){
				if (value.equals("null") || value.equals("")) {
					occupation.setWorkEx(null);
				} else {
					occupation.setWorkEx(value);									
				}
				
			}else if(key.equals("validFrom")){
				if (value.equals("null") || value.equals("")) {
					occupation.setValidFrom(null);
				} else {
					occupation.setValidFrom(value);									
				}
				
			}else if(key.equals("validTill")){
				if (value.equals("null") || value.equals("")) {
					occupation.setValidTill(null);
				} else {
					occupation.setValidTill(value);									
				}
				
			}
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(occupation);

		System.out.println(jsonString);
		return jsonString;
	}


}
