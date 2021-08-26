package com.MSIL.API_LISTS;

import java.util.Hashtable;
import java.util.List;

import org.testng.ITestContext;


import com.MSIL.JSON_Creation.Whitelist_Ref_JSON;
import com.MSIL.Response.Verify_Whitelist_Ref_ishybrid_Response;

import Query.Queries;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WhiteList_Ref_API {

	
	static Verify_Whitelist_Ref_ishybrid_Response re = new Verify_Whitelist_Ref_ishybrid_Response();
	
	@SuppressWarnings({ "unused", "static-access" })
	public static void Whitelist_Ref_API(Hashtable<String, String> data, ITestContext context)
	{
		Whitelist_Ref_JSON WL_Ref_json = new Whitelist_Ref_JSON();
		Queries q = new Queries();
		RequestSpecification request = RestAssured.given();
		String requestBody = Whitelist_Ref_JSON.whitelist_ref_json(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.header("x-app-id", "4");
		request.header("Authorization", context.getAttribute("common_token"));
		request.body(requestBody);
		
		Response response = request.post(data.get("endpoint"));
		float f = Float.parseFloat(data.get("expectedErrorCode"));
		int v = (int) f;
				
		  if(v==200) { 
			  re.verify_Response(response, data.get("expectedMessage"), data.get("variantCodes")); 
		  }else {
			  //re.verify_Response_1(response, data.get("expectedErrorCode"), data.get("expectedMessage")); 
		  }
		 
		 
		
	}

}

