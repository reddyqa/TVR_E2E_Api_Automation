package com.MSIL.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Vehicle_Details {

static Map<String, String> object = new HashMap<String, String>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message)
	{
		System.out.println("Response of all vehicle details:  "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		//List<Object> res_data = jsonPathEvaluator.get("data.cityId");
		//System.out.println(res_data.size());
		//Map<String, String> lhmap = jsonPathEvaluator.getMap("data[0]");
		//String cityId = lhmap.get("cityId");
		
	        List<Object> res_data = jsonPathEvaluator.get("data");
	        //System.out.println(res_data.size());
	        
	          if(res_data.size()!=0) { for(int i=0; i<res_data.size(); i++) 
	          { 
	          object =(Map<String, String>) res_data.get(i);
	          
	          String cityID = String.valueOf(object.get("cityId"));
	          String [] CityID=cityID.split("/");
	          System.out.println(CityID);
	          
	          //Assert.assertEquals(image[8],q.model_hero_image(object.get("modelCode")));
	          
	          }
	          
	          }
	        
	    
	    }}

