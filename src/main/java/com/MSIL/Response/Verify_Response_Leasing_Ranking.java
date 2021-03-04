package com.MSIL.Response;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_Leasing_Ranking 
{
	static Queries q = new Queries();
	@SuppressWarnings("static-access")
	public static void verify_Response(Response str_Reponse,  String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<String> id = jsonPathEvaluator.get("data.id");
		List<String> name = jsonPathEvaluator.get("data.name");
		ArrayList<ArrayList<String>> partnerlogo = jsonPathEvaluator.get("data.partnerLogos.id");
		//List<String> partner_logo = partnerlogo.get(0).get;
		Assert.assertEquals(name.get(0), q.partnerName(String.valueOf(id.get(0))));
		Assert.assertEquals(String.valueOf(partnerlogo.get(0).get(0)), q.partnerlogoid(String.valueOf(id.get(0))));
	}
	public static void verify_Response_invalid(Response str_Reponse, String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		String lhmap = jsonPathEvaluator.get("data");
		System.out.println("Error Message: "+lhmap);
		Assert.assertEquals(lhmap, expected_message);
	}

}
