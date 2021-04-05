package com.MSIL.Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Whitelist_Ref_ishybrid_Response {

	static Map<String, String> object = new HashMap<String, String>();

	static Queries q = new Queries();
	@SuppressWarnings("static-access")
	public static void verify_Response(Response str_Reponse,  String expected_message , String variantCodes)
	
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<List<Object>> res_data = jsonPathEvaluator.get("data.modelVariants.variants.isHybrid");
		//object= jsonPathEvaluator.get("data.modelVariants");
		//Map<Object, String> variants = res_data.get("variants");
		List<Object> hybrid_value=res_data.get(0);
		String hybrid_data=hybrid_value.toString();
		boolean hybrid_bool=Boolean.parseBoolean(hybrid_data);
		System.out.println(hybrid_bool);

		Assert.assertEquals(hybrid_bool,q.Whitelist_Ref_ishybrid_query(variantCodes));
		  
		 
		 
		 
		  
	}

}

