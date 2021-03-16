package com.MSIL.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_Nearest_Dealer 
{
	static Map<String, String> object = new HashMap<String, String>();
	@SuppressWarnings({ "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message, String distance)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> dealers = jsonPathEvaluator.get("data.dealers");
		//System.out.println("count of dealers"+dealers.size());
		if(dealers.size()!=0)
		{
			for(int i=0; i<dealers.size(); i++)
			{
				object = (Map<String, String>) dealers.get(i);
				Float actual_distance = Float.valueOf(String.valueOf(object.get("distance")));
				if(Integer.valueOf(distance)>=actual_distance)
				{
					System.out.println("Nearest Dealer: "+ actual_distance);
				}else
				{
					System.out.println("Invalid Nearest Dealer: "+ actual_distance);
				}
			}
			
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void verify_Response_dealernotfound(Response str_Reponse,  String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> error = jsonPathEvaluator.get("errors");
		object = (Map<String, String>) error.get(0);
		String error_msg = object.get("errorMessage");
		System.out.println("Error msg is : "+error_msg);
		Assert.assertEquals(error_msg, expected_message);
		
		
		
	}

}
