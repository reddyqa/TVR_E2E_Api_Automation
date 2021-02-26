package com.MSIL.API_LISTS;

import java.util.Hashtable;

import org.json.JSONObject;

import com.MSIL.JSON_Creation.CreateJsonFile;
import com.MSIL.JSON_Creation.Create_Auth_Token_Json;
import com.MSIL.JSON_Creation.Validate_Response;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class generate_Token
{
	@SuppressWarnings({"static-access" })
	public static String  generatetoken(Hashtable<String, String> data)
	{
		RequestSpecification request = RestAssured.given();
		Create_Auth_Token_Json jsonObj = new Create_Auth_Token_Json();
		String reqBody = jsonObj.auth_generate_token(data);
		System.out.println("The request body is: "+reqBody);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("x-app-id", "4");
		request.body(reqBody);
		Response response = request.post(data.get("endpoint"));
		//System.out.println("Message: "+response.getBody().asString());
		String v = response.jsonPath().getString("data");
		String[] v1 = v.split(",");
		String[] v2 = v1[0].split(":");
		System.out.println(v2[1]);
		return v2[1];
		
		
	}

}
