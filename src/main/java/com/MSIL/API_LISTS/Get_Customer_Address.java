package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Verify_Response_Customer_Address;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Customer_Address 
{
	static Verify_Response_Customer_Address re = new Verify_Response_Customer_Address();
	@SuppressWarnings("static-access")
	public static void get_customer_address_API(Hashtable<String, String> data, ITestContext context)
	{
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("Authorization", context.getAttribute("common_token"));
		Response response = request.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==200)
		{
			re.verify_get_customer_address_Response(response, data.get("expectedMessage"));
		}else
		{
			//re.verify_Response_dealernotfound(response,  data.get("expectedMessage"));
		}
		
	}


}
