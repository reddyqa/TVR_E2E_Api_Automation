package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Cust_Create_Json;
import com.MSIL.TestUtils.Verify_Response;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Common_cutomer_send_otp
{
	static Cust_Create_Json ccj_obj = new Cust_Create_Json();
	static Verify_Response re =new Verify_Response();
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void common_customer_sendotp_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.body(requestBody);
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==200)
		{
			re.verify_Response(response, data.get("expectedErrorCode"), data.get("expectedMessage"));
		}else
		{
			re.verify_Response_1(response, data.get("expectedErrorCode"), data.get("expectedMessage"));
		}
		
	}
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void common_customer_verifyotp_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.body(requestBody);
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==200)
		{
			Assert.assertEquals(response.getStatusCode(), v);
		}
	}

}
