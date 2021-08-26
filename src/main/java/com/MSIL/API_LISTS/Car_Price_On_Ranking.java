package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Model_Ranking_response;
import com.MSIL.Response.Verify_Response_Hero_Image;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Car_Price_On_Ranking 
{ 
	static Model_Ranking_response re=new Model_Ranking_response();
	static Verify_Response_Hero_Image re_image= new Verify_Response_Hero_Image();
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void car_price_on_ranking_API(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		//request.header("Authorization", context.getAttribute("common_token"));
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("resolution", data.get("resolution"))
				.get(data.get("endpoint")+"/"+data.get("city"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response Wrapper API: "+response.getBody().asString());
		
		
		  if(v==200) 
		  { 
			  	re.verify_Response(response, data.get("expectedMessage"), data.get("city")); 
		  }else 
		  {
			//	re.verify_Response_1(response, data.get("expectedMessage")); 
		  }
		 
		 
		
	}

	
	@SuppressWarnings({ "unused", "static-access" })
	public static void hero_image(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		//request.header("Authorization", context.getAttribute("common_token"));
		//System.out.println(context.getAttribute("Authorization"));
		Response response = request.queryParam("model", data.get("model"))
				.queryParam("resolution", data.get("resolution"))
				.get(data.get("endpoint")+"/"+data.get("city"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
		System.out.println("Response Wrapper API: "+response.getBody().asString());
		
		
		  if(v==200) 
		  { 
			  	re_image.verify_Response(response, data.get("expectedMessage")); 
		  }else 
		  {
			//	re.verify_Response_1(response, data.get("expectedMessage")); 
		  }
		 
		 
		
	}

	
}
