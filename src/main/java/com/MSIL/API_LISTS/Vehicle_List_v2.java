package com.MSIL.API_LISTS;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import com.MSIL.JSON_Creation.CreateJsonFile;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class Vehicle_List_v2
{
	static Create_Header res_Obj = new Create_Header();
	static CreateJsonFile createjosnObj = new CreateJsonFile();
	
	@SuppressWarnings({"static-access" })
	public static void verify_price_listing(Hashtable<String, String> data, Object object)
	{
		int status_code=200;		
		String reqBody = createjosnObj.createJson(data);
		System.out.println("The request body is: "+reqBody);
		Response res = res_Obj.setHeader(data, reqBody, object);
    	int statusCode = res.getStatusCode(); 
		System.out.println("Response code: "+statusCode);
		
		Assert.assertEquals(statusCode,status_code);
		
		System.out.println("Response Body: "+res.getBody().asString());
		
		 // First get the JsonPath object instance from the Response interface
		JsonPath jsonPathEvaluator = res.jsonPath();
		
		LinkedHashMap<String, List<T>> lhmap = new LinkedHashMap<String, List<T>>();
		
		lhmap = jsonPathEvaluator.get("data");
		
		int p_tenure = jsonPathEvaluator.get("data.tenure");
		
		System.out.println("Data body: "+p_tenure);
		
		
		  Set set = lhmap.entrySet();
		  
		  // Displaying elements of LinkedHashMap 
		/*
		 * Iterator iterator = set.iterator(); while(iterator.hasNext()) { Map.Entry me
		 * = (Map.Entry)iterator.next(); //System.out.print("Key is: "+ me.getKey() +
		 * "& Value is: "+me.getValue()+"\n"); System.out.println(me.getKey()); }
		 */
		 
		
		
		 
	}
	
	@SuppressWarnings({"static-access" })
	public static void verify_price_listing_invalidcity(Hashtable<String, String> data, Object object)
	{
		int status_code=400;
		String reqBody = createjosnObj.createJson(data);
		System.out.println("The request body is: "+reqBody);	
		Response res = res_Obj.setHeader(data, reqBody, object);
		int statusCode= res.getStatusCode();
		System.out.println("Response code: "+statusCode);
		Assert.assertEquals(statusCode,status_code);
		 
		 
	}


}
