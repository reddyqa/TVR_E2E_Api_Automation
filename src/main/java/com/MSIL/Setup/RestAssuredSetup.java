package com.MSIL.Setup;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;



import io.restassured.RestAssured;


public class RestAssuredSetup extends BaseSetup
{
	static ITestContext context;
	@BeforeSuite(alwaysRun=true)
	public void configure()
	{
		
		
		//eve
	//RestAssured.baseURI = "http://43.205.167.27:9072/evaluation/v1";
		
	//certification
	RestAssured.baseURI = "http://3.110.39.35:9075/certification/v1";
	
		//vehicle deatils
     //RestAssured.baseURI ="http://115.113.250.98:98/DmsServiceTest.svc/";
		
		//RTO deatils
	//RestAssured.baseURI = "https://evaluator-int-dev.sg-s1.cloudhub.io/trv-evaluator/v1/";
		
	}
	
	
}
