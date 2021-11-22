package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.MSIL_Registration_Json;


import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MSIL_Registration_API {
	
	@SuppressWarnings("static-access")
	public static void msil_registration_price_api(Hashtable<String, String> data, ITestContext context)
	{
		MSIL_Registration_Json msil_reg = new MSIL_Registration_Json();
		RestAssured.baseURI = "https://int.marutifinancemarketplace.com/maruti/financing/v1/sales-tool/";
		RequestSpecification request = RestAssured.given();
		String requestbody = msil_reg.msil_json(data, context);
		
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("Authorization", "Basic c2FsZXNUb29sVXNlcjE6czFUb29sQCMkJA==");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.body(requestbody);
		//System.out.println(data.get("endpoint"));
		Response response = request.post(data.get("endpoint"));
		System.out.println("Regisrtaion Prices: "+response.asString());
			
	}

}
