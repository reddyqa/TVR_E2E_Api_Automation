package com.MSIL.API_LISTS;

import static org.testng.Assert.assertEquals;
import java.util.Hashtable;
import com.MSIL.JSON_Creation.Send_otp_Json;
import com.MSIL.Setup.BaseSetup;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class send_OTP 
{
	
	@SuppressWarnings("static-access")
	public static void sendotp(Hashtable<String, String> data)
	{
		int status_code=200;
		RequestSpecification request = RestAssured.given().config(RestAssured.config().encoderConfig(EncoderConfig.encoderConfig().encodeContentTypeAs("application.json", ContentType.TEXT)));
		Send_otp_Json jsonObj = new Send_otp_Json();
		String reqBody = jsonObj.send_otp(data);
		System.out.println("The request body is: "+reqBody);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/77.0.3865.90 Safari/537.36");
		request.header("x-app-id", "4");
		request.header("x-mac-id", "1");
		request.body(reqBody);		
		Response response = request.post(data.get("endpoint"));
		System.out.println("Message: "+response.getBody().asString());
		//System.out.println("Response code: "+(response.getStatusCode()));
		assertEquals(status_code, response.getStatusCode());
		
	}

}
