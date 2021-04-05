package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Verify_Response_Customer_Occupation;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetOccupationById 
{
	static Verify_Response_Customer_Occupation re = new Verify_Response_Customer_Occupation();
	@SuppressWarnings({ "unused", "static-access" })
	public static void occupation_get(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization", context.getAttribute("common_token"));
		Response response = request.get(data.get("endpoint")+"/"+q.get_occupation_id());
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		//System.out.println("Response of all master API: "+response.getBody().asString());
		re.verify_Response(response);
	}
	
	@SuppressWarnings("static-access")
	public static void occupation_get_uuid_id(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.header("Authorization", context.getAttribute("common_token"));
		Response response = request.get(data.get("endpoint")+"/"+q.get_uuid_id()+"/employment/"+q.get_occupation_id());
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		//System.out.println("Response of all master API: "+response.getBody().asString());
		re.verify_Response(response);
	}


}
