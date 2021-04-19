package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Verify_Response_Nearest_Dealer;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fetch_Nearest_Dealer_API 
{
	static Verify_Response_Nearest_Dealer re = new Verify_Response_Nearest_Dealer();
	@SuppressWarnings("static-access")
	public static void nearest_dealer_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		//request.header("Authorization", context.getAttribute("common_token"));
		System.out.println("Autherization is : "+ context.getAttribute("common_token"));
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("latitude", data.get("latitude"))
				.queryParam("longitude", data.get("longitude"))
				.queryParam("pinCode", data.get("pinCode"))
				.queryParam("distance", data.get("distance"))
				.queryParam("citycode", data.get("citycode"))
				.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		if(v==200)
		{
			re.verify_Response(response, data.get("expectedErrorCode"), data.get("distance"));
		}else
		{
			re.verify_Response_dealernotfound(response,  data.get("expectedMessage"));
		}
		
	}

}
