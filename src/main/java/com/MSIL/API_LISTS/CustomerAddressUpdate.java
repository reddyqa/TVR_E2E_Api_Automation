package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Create_Customer_Address_POJO;
import com.MSIL.Response.Verify_Response_Customer_Address;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerAddressUpdate 
{
	
	static Create_Customer_Address_POJO custAdd = new Create_Customer_Address_POJO();
	static Verify_Response_Customer_Address re = new Verify_Response_Customer_Address();
	@SuppressWarnings("static-access")
	public static void update_customer_API(Hashtable<String, String> data, ITestContext context)
	{
		RequestSpecification request = RestAssured.given();
		String requestbody = custAdd.customer_address_json(data);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestbody);
		Response response = request.put(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==200)
		{
			re.verify_Response(response, data.get("expectedMessage"));
		}else
		{
			//re.verify_Response_dealernotfound(response,  data.get("expectedMessage"));
		}
		
	}


}
