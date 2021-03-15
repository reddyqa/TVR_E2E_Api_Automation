package com.MSIL.Response;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Model_Ranking_response {

	
	static Queries q = new Queries();
	@SuppressWarnings("static-access")
	public static void verify_Response(Response str_Reponse,  String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<String> variant_code = jsonPathEvaluator.get("data.variantCode");
		List<String> price = jsonPathEvaluator.get("data.minPrice");
		//List<String> name = jsonPathEvaluator.get("data.name");
		//ArrayList<ArrayList<String>> partnerlogo = jsonPathEvaluator.get("data.partnerLogos.id");
		//List<String> partner_logo = partnerlogo.get(0).get;
		String actual_price = String.valueOf(price.get(0));
		//int actualprice = Integer.valueOf(actual_price);
		//Assert.assertEquals(actualprice, q.minprice_payment(variant_code.get(0)));
		
		//Assert.assertEquals(String.valueOf(partnerlogo.get(0).get(0)), q.partnerlogoid(String.valueOf(id.get(0))));
	}
}
