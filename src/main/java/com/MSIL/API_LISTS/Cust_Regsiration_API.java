package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Cust_Create_Json;
import com.MSIL.TestUtils.Verify_Response;
import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Cust_Regsiration_API
{
	static Cust_Create_Json ccj_obj = new Cust_Create_Json();
	static Verify_Response re =new Verify_Response();
		
	@SuppressWarnings({ "static-access", "unused" })
	public static void customer_registration_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("Authorization"));
		System.out.println("Autherization is : "+ context.getAttribute("Authorization"));
		request.body(requestBody);
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==201)
		{
			re.verify_Response(response, data.get("expectedErrorCode"), data.get("expectedMessage"));
		}else
		{
			re.verify_Response_1(response, data.get("expectedErrorCode"), data.get("expectedMessage"));
		}
		
	}
	
	@SuppressWarnings("static-access")
	public static void customer_update_API(Hashtable<String, String> data,ITestContext context)
	{
		
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.body(requestBody);
		Response response = request.put(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==201)
		{
			re.verify_Response_data(response, data.get("expectedErrorCode"), data.get("expectedMessage"), data);
		}else
		{
			re.verify_Response_data_1(response, data.get("expectedErrorCode"), data.get("expectedMessage"), data);
		}
		
	}
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void customer_exists_API(Hashtable<String, String> data, ITestContext context)
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
			re.verify_Response_customerexists(response, data.get("mobile"));
		}else
		{
			re.verify_Response_customerexists_inavlid_number(response, data.get("expectedMessage"));
		}
		
	}
	
	
	@SuppressWarnings("static-access")
	public static void get_customer_details_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		String uuid=q.getUuid();
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data,  context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Uuid",uuid);
		request.body(requestBody);
		Response response = request.get(data.get("endpoint"));
		re.verify_Response_getcustomerdetails(response, uuid);
		
	}


}
