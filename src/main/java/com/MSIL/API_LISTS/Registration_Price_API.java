package com.MSIL.API_LISTS;

import java.util.Hashtable;
import java.util.List;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Registration_price_Json;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Registration_Price_API {
	
	@SuppressWarnings("static-access")
	public static void registration_price_api(Hashtable<String, String> data, ITestContext context)
	{
		Registration_price_Json rpj = new Registration_price_Json();
		RequestSpecification request = RestAssured.given();
		String requestbody = rpj.registrationpricejson(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.body(requestbody);
		Response response = request.post(data.get("endpoint"));
		System.out.println("Regisrtaion Prices: "+response.asString());
		
		JsonPath jsonPathEvaluator = response.jsonPath();
		Float roadtax = jsonPathEvaluator.get("roadTax");
		System.out.println("SMP DB value : "+roadtax);
		
		
	}

}
