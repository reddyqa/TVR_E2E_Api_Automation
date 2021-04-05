package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.CustomerOccupationJson;
import com.MSIL.Response.Verify_Response_Customer_Occupation;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SaveOccupation 
{
	static CustomerOccupationJson cust_occupation = new CustomerOccupationJson();
	static Verify_Response_Customer_Occupation re = new Verify_Response_Customer_Occupation();
	@SuppressWarnings({ "unused", "static-access" })
	public static void occupation_save(Hashtable<String, String> data, ITestContext context)
	{
		RequestSpecification request = RestAssured.given();
		String requestbody = cust_occupation.occupation_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestbody);
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response of all master API: "+response.getBody().asString());
		re.verify_Response(response);
	}
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void occupation_update(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestbody = cust_occupation.occupation_create_json(data, context);
		request.header("Content-Type", "application/merge-patch+json");
		request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestbody);
		Response response = request.patch(data.get("endpoint")+"/"+q.get_occupation_id());
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		//System.out.println("Response of all master API: "+response.getBody().asString());
		re.verify_Response(response);
	}
}
