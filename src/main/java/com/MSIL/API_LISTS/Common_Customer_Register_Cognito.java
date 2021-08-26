package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Common.Customer.Token.Common_Customer_Token_Generation;
import com.MSIL.JSON_Creation.Common_Cust_Cognito_Json;

import com.MSIL.TestUtils.Verify_Response;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Common_Customer_Register_Cognito 
{
	static Common_Cust_Cognito_Json ccj_obj = new Common_Cust_Cognito_Json();
	static Verify_Response re =new Verify_Response();
	static Common_Customer_Token_Generation common_token= new Common_Customer_Token_Generation();
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void common_customer_registercognito_API(Hashtable<String, String> data, ITestContext context) throws InterruptedException
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = ccj_obj.cust_create_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.body(requestBody);
		context.setAttribute("common_token", common_token.token_generation(context.getAttribute("mobile")));
		System.out.println("Common_Customer Token value: "+context.getAttribute("common_token"));
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

}
