package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.Response.Verify_Image_URL_leasing_company_rating;
import com.MSIL.Response.Verify_Response_Leasing_Ranking;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Leasing_Partner_Ranking_API
{
	static Verify_Response_Leasing_Ranking re = new Verify_Response_Leasing_Ranking();
	static Verify_Image_URL_leasing_company_rating re_imageurl =new Verify_Image_URL_leasing_company_rating();
	@SuppressWarnings({ "static-access" })
	public static void leasing_partner_ranking(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("Authorization"));
		Response response = request.queryParam("cityGroupId", q.citygroupid())
				.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;		
		  if(v==200) 
		  { 
			  re.verify_Response(response, data.get("expectedMessage")); 
		  }else {
			  re.verify_Response_invalid(response, data.get("expectedMessage"));
		  }			
	}
	
	public static void leasing_company_imageURL(Hashtable<String, String> data, ITestContext context)
	{
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("Authorization"));
		Response response = request.queryParam("cityGroupId", data.get("cityId"))
				.queryParam("resolution", data.get("resolution"))
				.get(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;		
		  if(v==200) 
		  { 
			  re_imageurl.verify_Response(response, data.get("expectedMessage")); 
		  }else {
			  //re_imageurl.verify_Response_invalid(response, data.get("expectedMessage"));
		  }			
	}

}
