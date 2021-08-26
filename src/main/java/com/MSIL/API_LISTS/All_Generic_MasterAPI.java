package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class All_Generic_MasterAPI 
{
	
	@SuppressWarnings("unused")
	public static void generic_master_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		//request.header("Authorization", context.getAttribute("Authorization"));
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("variant", Boolean.parseBoolean(data.get("variant")))
				.queryParam("color", Boolean.parseBoolean(data.get("color")))
				.queryParam("bodyType", Boolean.parseBoolean(data.get("bodyType")))
				.queryParam("channelType", Boolean.parseBoolean(data.get("channelType")))
				.queryParam("registrationType", Boolean.parseBoolean(data.get("registrationType")))
				.queryParam("transmissionType", Boolean.parseBoolean(data.get("transmissionType")))
				.queryParam("fuelType", Boolean.parseBoolean(data.get("fuelType")))
				.queryParam("transmissionCategory", Boolean.parseBoolean(data.get("transmissionCategory")))
				.queryParam("mileage", Boolean.parseBoolean(data.get("mileage")))
				.get(data.get("endpoint"));
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
