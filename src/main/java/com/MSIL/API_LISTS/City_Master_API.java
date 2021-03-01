package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.City_Master_Json;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class City_Master_API
{
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void city_master_API(Hashtable<String, String> data, ITestContext context)
	{
		City_Master_Json city_json = new City_Master_Json();
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = city_json.citymaster_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("Authorization"));
		request.body(requestBody);
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response of all master API: "+response.getBody().asString());
		
		/*
		 * if(v==200) { re.verify_Response(response,
		 * data.get("expectedErrorCode"),data.get("expectedMessage")); }else {
		 * re.verify_Response_1(response, data.get("expectedErrorCode"),
		 * data.get("expectedMessage")); }
		 */
		 
		
	}

}
