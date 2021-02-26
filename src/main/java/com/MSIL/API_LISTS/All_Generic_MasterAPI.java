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
		request.header("Authorization", context.getAttribute("Authorization"));
		//request.body(requestBody);
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("variant", data.get("variant"))
				.queryParam("color", data.get("color"))
				.queryParam("bodyType", data.get("bodyType"))
				.queryParam("channelType", data.get("channelType"))
				.queryParam("registrationType", data.get("registrationType"))
				.queryParam("transmissionType", data.get("transmissionType"))
				.queryParam("fuelType", data.get("fuelType"))
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
