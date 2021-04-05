package com.MSIL.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Number_plate_Keyword {

		static Map<String, String> object = new HashMap<String, String>();
	
		static Queries q = new Queries();
		@SuppressWarnings("static-access")
		public static void verify_Response(Response str_Reponse,  String expected_message, String cityId)
		{
			System.out.println("Message: "+str_Reponse.getBody().asString());
			JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
			List<List<Object>> res_data = jsonPathEvaluator.get("data.cityDetails.licensePlateCode");
			System.out.println(res_data.get(0));
			int list_size=res_data.get(0).size();
			
			List <String> query_res=q.city_master_number_plate(cityId);
			
			  if(list_size!=0) 
			  { 
				  for(int i=0; i<list_size; i++) 
				  {
					  String license_plate_code=(String) res_data.get(0).get(i);
					  System.out.println(license_plate_code);
					  
					  for(int j=0; j<query_res.size();j++) {
						  
						  Assert.assertEquals(license_plate_code, query_res.get(j));
						  
					  }
				  }	
				  
				  
		}
			  
		}
	
}
