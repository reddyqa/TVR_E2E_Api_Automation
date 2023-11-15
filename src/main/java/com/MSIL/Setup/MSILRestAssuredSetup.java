package com.MSIL.Setup;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class MSILRestAssuredSetup extends BaseSetup {
	static ITestContext context;
	@BeforeSuite(alwaysRun=true)
	public  void configure1()
	{
		/*------------SIT Environment-----------------*/
		RestAssured.baseURI = "https://int.marutifinancemarketplace.com/maruti/financing/v1/sales-tool/";
		//RestAssured.baseURI = "https://d1x3uucz02lohy.cloudfront.net";
	}
	

}
