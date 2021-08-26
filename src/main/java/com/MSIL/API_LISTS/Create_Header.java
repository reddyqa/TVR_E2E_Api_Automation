package com.MSIL.API_LISTS;

import java.util.Hashtable;

import com.MSIL.JSON_Creation.CreateJsonFile;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Create_Header
{
	@SuppressWarnings("unused")
	public static Response setHeader(Hashtable<String, String> data, String body, Object object)
	{
		RequestSpecification request = RestAssured.given();
		CreateJsonFile createjosnObj = new CreateJsonFile();
		//request.header("Authorization", object);
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.header("Content-Type", "application/json");
		request.header("x-app-id", 4);
		request.body(body.toString());
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of the request :"+response.getBody().asString());
		return response;
	}

}
