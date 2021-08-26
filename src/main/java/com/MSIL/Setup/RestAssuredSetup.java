package com.MSIL.Setup;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

import com.MSIL.ENUMS.Context;

import io.restassured.RestAssured;


public class RestAssuredSetup extends BaseSetup
{
	static ITestContext context;
	@BeforeSuite(alwaysRun=true)
	public void configure()
	{
		/*------------SIT Environment-----------------*/
		//RestAssured.baseURI = "https://dy8338njja.execute-api.ap-south-1.amazonaws.com/qa/";
		RestAssured.baseURI = "https://d1x3uucz02lohy.cloudfront.net";
	}
	
	public static  String generateRandomNumber() {
        String number = "9"+Integer.toString(ThreadLocalRandom.current().nextInt(111111111, 999999999));
        //context.setAttribute("Mobile_number", number);
		//System.out.println("Random Integers: " + number);
        return number;
	}
}
