package com.MSIL.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Vehicle_Configure {
static Map<String, String> object = new HashMap<String, String>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message)
	{
		System.out.println("Response of all possible values:  "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> res_data = jsonPathEvaluator.get("data");
		List<Object> abc = (List<Object>) res_data.get(0);
		System.out.println(abc);
		LinkedHashMap<Object,String> hm=new LinkedHashMap<Object,String>();
		hm = jsonPathEvaluator.get("data");
		
		Set<Object> configure = hm.keySet();
		System.out.println(hm.get("categories"));
		
		//for(Map.Entry m:hm.entrySet()){  
			   //System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		
		
		  	/*
			 * if(res_data.size()!=0) { for(int i=0; i<res_data.size(); i++) { object
			 * =(Map<String, String>) res_data.get(i); String Whitelist_Companies =
			 * String.valueOf(object.get("partnerList"));
			 * System.out.println(Whitelist_Companies); //Assert.assertEquals(image_url,
			 * //q.minprice_payment(object.get("variantCode"))); }
			 */ /*
				 * }
				 * 
				 * 
				 * 
				 * }
				 */

}
