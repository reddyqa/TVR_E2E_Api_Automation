package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.GetVehicleDetailsPOJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class GetVehicleDetailsJSON extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes"})
	public static String vehicle_detail(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		GetVehicleDetailsPOJO Vehicle_Details1 = new GetVehicleDetailsPOJO();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;
		
	
		while (itr.hasNext()) 
		{
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("regNo")) 
			{
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details1.setRegNo(null);
				} else {
					Vehicle_Details1.setRegNo(value);
				}
			} else if (key.equals("vinNo")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details1.setVinNo(null);
				} else {
					Vehicle_Details1.setVinNo(value);
				}
			}
			else if (key.equals("p_pmc")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details1.setP_pmc(null);
				} else {
					Vehicle_Details1.setP_pmc(value);
				}
			}
			else if (key.equals("p_model")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details1.setP_model(null);
				} else {
					Vehicle_Details1.setP_model(value);
				}
				
				
			}
			
			else if (key.equals("p_chassis")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details1.setP_chassis(null);
				} else {
					Vehicle_Details1.setP_chassis(value);
				}
			}
			 			
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		
	
		Gson gSon = new Gson();
		jsonString = gSon.toJson(Vehicle_Details1);

		System.out.println(jsonString);
		return jsonString;
		//return value;

}}
