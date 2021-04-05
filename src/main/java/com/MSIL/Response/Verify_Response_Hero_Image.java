package com.MSIL.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_Hero_Image {

static Map<String, String> object = new HashMap<String, String>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> res_data = jsonPathEvaluator.get("data");
		
		/*
		 * ArrayList<ArrayList<String>> image_url =
		 * jsonPathEvaluator.get("data.imageUrl"); System.out.println(image_url);
		 * Assert.assertEquals(String.valueOf(image_url.get(0).get(0)),
		 * q.model_hero_image(String.valueOf()));
		 */
		//System.out.println(res_data.size());
		
		  if(res_data.size()!=0) { for(int i=0; i<res_data.size(); i++) 
		  { 
		  object =(Map<String, String>) res_data.get(i);
		  
		  String image_url = String.valueOf(object.get("imageUrl"));
		  String [] image=image_url.split("/");
		  System.out.println(image);
		  
		  Assert.assertEquals(image[4],q.model_hero_image(object.get("modelCode")));
		  
		  }
		  
		  }
		 
		
	
	}
	
		
	
	
	
}

