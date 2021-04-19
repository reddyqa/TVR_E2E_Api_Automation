package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Vehicle_Details_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Vehicle_Details_JSON extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes"})
	public static String vehicle_details(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Vehicle_Details_POJO Vehicle_Details = new Vehicle_Details_POJO();
		
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

			if (key.equals("cityId")) 
			{
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setcityId(null);
				} else {
					Vehicle_Details.setcityId(value);
				}
			} else if (key.equals("modelCode")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setmodelCode(null);
				} else {
					Vehicle_Details.setmodelCode(value);
				}
			} else if (key.equals("variantCode")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setvariantCode(null);
				} else {
					Vehicle_Details.setvariantCode(value);
				}
			} else if (key.equals("colorType")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setcolorType(null);
				} else {
					Vehicle_Details.setcolorType(value);
				}
			} else if (key.equals("categoryId")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setcategoryId(null);
				} else {
					Vehicle_Details.setcategoryId(value);										
				}
			} else if (key.equals("tenureId")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.settenureId(null);
				} else {
					Vehicle_Details.settenureId(value);										
				}
			}
				else if (key.equals("partnerId")) {
					if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setpartnerId(null);
					} else {
					List<String> partnerId = new ArrayList<String>();
					partnerId.add(value);
					Vehicle_Details.setpartnerId(partnerId);
					}
					
			} else if (key.equals("registrationType")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setregistrationType(null);
				} else {
					Vehicle_Details.setregistrationType(value);										
				}
			} else if (key.equals("resolution")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Details.setresolution(null);
				} else {
					Vehicle_Details.setresolution(value); }}
			 else if (key.equals("mileageCode")) {
					if (value.equals("null") || value.equals("")) {
						Vehicle_Details.setmileageCode(null);
				} else {
						Vehicle_Details.setmileageCode(value);
			} 
			
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		
	}
		Gson gSon = new Gson();
		jsonString = gSon.toJson(Vehicle_Details);

		System.out.println(jsonString);
		return jsonString;
		//return value;

}}
