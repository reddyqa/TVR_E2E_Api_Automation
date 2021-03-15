package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Model_Ranking_response;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Car_Price_On_Ranking 
{ 
	static Model_Ranking_response re=new Model_Ranking_response();
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void car_price_on_ranking_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("Authorization"));
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("resolution", data.get("hdpi"))
				.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response car price on basis ranking: "+response.getBody().asString());
		
		
		  if(v==200) 
		  { 
			  	re.verify_Response(response, data.get("expectedMessage")); 
		  }else 
		  {
			//	re.verify_Response_1(response, data.get("expectedMessage")); 
		  }
		 
		 
		
	}

}
