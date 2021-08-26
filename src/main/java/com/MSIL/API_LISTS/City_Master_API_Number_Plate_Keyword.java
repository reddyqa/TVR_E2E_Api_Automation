package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.City_Master_Json;
import com.MSIL.Response.Verify_Number_plate_Keyword;


import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class City_Master_API_Number_Plate_Keyword {

	
		static Verify_Number_plate_Keyword re = new Verify_Number_plate_Keyword();
		
		@SuppressWarnings({ "unused", "static-access" })
		public static void city_master_API(Hashtable<String, String> data, ITestContext context)
		{
			City_Master_Json city_json = new City_Master_Json();
			Queries q = new Queries();
			RequestSpecification request = RestAssured.given();
			String requestBody = City_Master_Json.citymaster_create_json(data, context);
			request.header("Content-Type", "application/json;charset=UTF-8");
			request.header("x-app-id", "4");
			request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
			request.header("Authorization", context.getAttribute("common_token"));
			request.body(requestBody);
			
			Response response = request.post(data.get("endpoint"));
			float f = Float.parseFloat(data.get("expectedErrorCode"));
			int v = (int) f;
					
			  if(v==200) { 
				  re.verify_Response(response, data.get("expectedMessage"), data.get("cityId")); 
			  }else {
				  //re.verify_Response_1(response, data.get("expectedErrorCode"), data.get("expectedMessage")); 
			  }
			 
			 
			
		}

	}

