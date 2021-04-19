package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Vehicle_Configure_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Vehicle_Configure_JSON extends BaseSetup
{
	@SuppressWarnings({ "rawtypes"})
	public static String vehicle_configure(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Vehicle_Configure_POJO Vehicle_Configure = new Vehicle_Configure_POJO();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("model")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setmodel(null);
				} else {
					Vehicle_Configure.setmodel(value);
				}
			} else if (key.equals("variant")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setvariant(null);
				} else {
					Vehicle_Configure.setvariant(value);
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
			} else if (key.equals("mileage")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setmileage(null);
				} else {
					Vehicle_Configure.setcolorType(value);										
				}
			} else if (key.equals("category")) {
				if (value.equals("null") || value.equals("")) {
					Vehicle_Configure.setcategory(null);
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
