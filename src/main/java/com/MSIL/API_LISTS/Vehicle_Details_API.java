package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Vehicle_Configure_JSON;
import com.MSIL.JSON_Creation.Vehicle_Details_JSON;
import com.MSIL.Response.Verify_Vehicle_Configure;
import com.MSIL.Response.Verify_Vehicle_Details;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Vehicle_Details_API {

	static Verify_Vehicle_Details re = new Verify_Vehicle_Details();
	@SuppressWarnings({ "unused", "static-access" })
	public static void generic_master_API(Hashtable<String, String> data, ITestContext context)
	{
		Vehicle_Details_JSON vehicle_json = new Vehicle_Details_JSON();
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = vehicle_json.vehicle_details(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("Accept", "application/json");
		request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestBody);
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response of all possible values: "+response.getBody().asString());
		
		/*
		 * if(v==200) { re.verify_Response(response,
		 * data.get("expectedErrorCode"),data.get("expectedMessage")); }else {
		 * re.verify_Response_1(response, data.get("expectedErrorCode"),
		 * data.get("expectedMessage")); }
		 */
		 
		
	}

}
