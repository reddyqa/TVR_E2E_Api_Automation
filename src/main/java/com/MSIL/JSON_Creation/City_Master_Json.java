package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;
import com.MSIL.POJO.City_Master_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class City_Master_Json extends BaseSetup
{
	@SuppressWarnings({ "rawtypes"})
	public static String citymaster_create_json(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		City_Master_POJO city_master = new City_Master_POJO();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("cityId")) {
				if (value.equals("null") || value.equals("")) {
					city_master.setCityId(null);
				} else {
					city_master.setCityId(value);
				}
			} else if (key.equals("regType")) {
				if (value.equals("null") || value.equals("")) {
					city_master.setRegType(null);
				} else {
					city_master.setRegType(value);
				}
			} else if (key.equals("isNew")) {
				if (value.equals("null") || value.equals("")) {
					city_master.setIsNew(null);
				} else {
					city_master.setIsNew(value);
				}
			} else if (key.equals("currentDate")) {
				if (value.equals("null") || value.equals("")) {
					city_master.setCurrentDate(null);
				} else {
					city_master.setCurrentDate(value);
				}
			} else if (key.equals("isFuture")) {
				if (value.equals("null") || value.equals("")) {
					city_master.setIsFuture(null);
				} else {
					city_master.setIsFuture(value);										
				}
			} 
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(city_master);

		System.out.println(jsonString);
		return jsonString;
	}

}
