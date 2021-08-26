package com.MSIL.TestUtils;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response
{
	public static void verify_Response(Response str_Reponse, String expected_code, String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		String lhmap = jsonPathEvaluator.get("data");
		System.out.println("Error Message: "+lhmap);
		Assert.assertEquals(lhmap, expected_message);
	}
	
	public static void verify_Response_1(Response str_Reponse, String expected_code, String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<String> lhmap = new ArrayList<String>();	
		lhmap = jsonPathEvaluator.get("errors.errorMessage");
		
		System.out.println("Error Message: "+lhmap.get(0));
		Assert.assertEquals(lhmap.get(0), expected_message);
	}
	
	public static void verify_Response_data(Response str_Reponse, String expected_code, String expected_message, Hashtable<String, String> data)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		String lhmap = jsonPathEvaluator.get("data.firstName");
		String lhmap1 = jsonPathEvaluator.get("data.middleName");
		String lhmap2 = jsonPathEvaluator.get("data.gender");
		
		
		System.out.println("Error Message: "+lhmap);
				
		Assert.assertEquals(lhmap, data.get("firstName"));
		Assert.assertEquals(lhmap1, data.get("middleName"));
		Assert.assertEquals(lhmap2, data.get("gender"));
		
	}
	
	public static void verify_Response_data_1(Response str_Reponse, String expected_code, String expected_message, Hashtable<String, String> data)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<String> lhmap = new ArrayList<String>();	
		 lhmap = jsonPathEvaluator.get("errors.errorMessage");
		
		System.out.println("Error Message: "+lhmap.get(0));
		System.out.println("Exepected Error Message: "+expected_message);
		Assert.assertEquals(lhmap.get(0), expected_message);		
	}
	
	@SuppressWarnings("static-access")
	public static void verify_Response_customerexists(Response str_Reponse, String number)
	{
		Queries q = new Queries();
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		String lhmap = jsonPathEvaluator.get("data.userUuid");
		System.out.println("Error Message: "+lhmap);
		Assert.assertEquals(lhmap, q.customer_exists(number) );
	}
	
	public static void verify_Response_customerexists_inavlid_number(Response str_Reponse, String expected_message)
	{
		Queries q = new Queries();
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<String> lhmap = new ArrayList<String>();	
		lhmap = jsonPathEvaluator.get("errors.errorMessage");
		System.out.println("Error Message: "+lhmap.get(0));
		System.out.println("Exepected Error Message: "+expected_message);
		Assert.assertEquals(lhmap.get(0), expected_message);
	}
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void verify_Response_getcustomerdetails(Response str_Reponse, String uuid)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		Queries q = new Queries();			
		Map<String, String> lhmap = new HashMap<String, String>();	
		lhmap.put("firstName", jsonPathEvaluator.get("data.firstName"));
		lhmap.put("middleName", jsonPathEvaluator.get("data.middleName"));
		lhmap.put("lastName", jsonPathEvaluator.get("data.lastName"));
		lhmap.put("email", jsonPathEvaluator.get("data.email"));
		lhmap.put("mobile", jsonPathEvaluator.get("data.mobile"));
		lhmap.put("gender", jsonPathEvaluator.get("data.gender"));
		lhmap.put("dob", jsonPathEvaluator.get("data.dob"));
		lhmap.put("businessType", jsonPathEvaluator.get("data.businessType"));
		lhmap.put("sourceAppId", jsonPathEvaluator.get("data.sourceAppId"));
		lhmap.put("occupationTypeCode", jsonPathEvaluator.get("data.occupationTypeCode"));
		lhmap.put("referredBy", jsonPathEvaluator.get("data.referredBy"));
		lhmap.put("referralCode", jsonPathEvaluator.get("data.referralCode"));
		lhmap.put("userUuid", jsonPathEvaluator.get("data.userUuid"));
					
		Assert.assertEquals(lhmap.get("mobile"), "8130009677");
		
	}

}
