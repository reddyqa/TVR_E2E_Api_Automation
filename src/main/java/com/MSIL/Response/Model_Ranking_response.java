package com.MSIL.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Model_Ranking_response {
	
	static Map<String, String> object = new HashMap<String, String>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message, String city_id)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> res_data = jsonPathEvaluator.get("data");
		System.out.println(res_data.size());
		
		if(res_data.size()!=0)
		{
		for(int i=0; i<res_data.size(); i++)
		{
			object = (Map<String, String>) res_data.get(i);
			
			String actual_price = String.valueOf(object.get("minPrice"));
			System.out.println(actual_price);
			double actualprice = Math.round(Double.valueOf(actual_price));
			System.out.println(actualprice);
			Assert.assertEquals(actualprice, q.minprice_payment(object.get("variantCode"), city_id));
		}

		}
		
		//object = (Map<String, String>) res_data.get(0);
		//List<String> name = jsonPathEvaluator.get("data.name");
		//ArrayList<ArrayList<String>> partnerlogo = jsonPathEvaluator.get("data.partnerLogos.id");
		//List<String> partner_logo = partnerlogo.get(0).get;
		/*String actual_price = String.valueOf(object.get("minPrice"));
		System.out.println(actual_price);
		double actualprice = Math.round(Double.valueOf(actual_price));
		System.out.println(actualprice);
		Assert.assertEquals(actualprice, q.minprice_payment(object.get("variantCode")));*/
		
		//Assert.assertEquals(String.valueOf(partnerlogo.get(0).get(0)), q.partnerlogoid(String.valueOf(id.get(0))));
	}
}
