package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Verify_Get_Whitelist;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Whitelist_API {
	
	static Verify_Get_Whitelist re = new Verify_Get_Whitelist();
	@SuppressWarnings("unused")
	public static void generic_master_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		//request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("common_token"));
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.queryParam("cityGroupId", data.get("cityGroupId"))
				.queryParam("resolution", data.get("resolution"))
				.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response of whitelist companies: "+response.getBody().asString());
		
		
		  if(v==200)
		  { 
			  re.verify_Response(response, data.get("expectedErrorCode"), data.get("cityGroupId"));
			  }
		  else 
		  {
		      //re.verify_Response_1(response, data.get("expectedErrorCode"), data.get("expectedMessage"));
		  }
		 
		 
		
	}


}
