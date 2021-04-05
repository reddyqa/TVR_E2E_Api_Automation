package com.MSIL.Response;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_Customer_Occupation 
{
	@SuppressWarnings("static-access")
	public static void verify_Response(Response str_Reponse)
	{
		Queries q = new Queries();
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		int lhmap = jsonPathEvaluator.get("data.id");
		String occuplation_code = jsonPathEvaluator.get("data.occupationTypeCode");
		Assert.assertEquals(occuplation_code, q.get_occupation_code(lhmap));
		
	}

}
