package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Sms_Microservice_JSON;
import com.MSIL.JSON_Creation.Vehicle_Configure_JSON;
import com.MSIL.Response.Verify_Sms_Microservice;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sms_Microservice_API {

	static Verify_Sms_Microservice re = new Verify_Sms_Microservice();
	@SuppressWarnings({ "unused", "static-access" })
	public static void generic_master_API(Hashtable<String, String> data, ITestContext context)
	{
		Sms_Microservice_JSON sms_json = new Sms_Microservice_JSON();
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = sms_json.Sms_microservice(data);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		//request.header("Accept", "application/json");
		//request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestBody);
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println(response.getBody().asString());
		
		/*
		 * if(v==200) { re.verify_Response(response,
		 * data.get("expectedErrorCode"),data.get("expectedMessage")); }else {
		 * re.verify_Response_1(response, data.get("expectedErrorCode"),
		 * data.get("expectedMessage")); }
		 */
		 
		
	}

}
