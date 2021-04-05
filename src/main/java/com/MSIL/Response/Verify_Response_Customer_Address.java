package com.MSIL.Response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_Customer_Address 
{
	public static void verify_Response(Response str_Reponse,String expected_message)
	{
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		String lhmap = jsonPathEvaluator.get("data");
		System.out.println("Error Message: "+lhmap);
		Assert.assertEquals(lhmap, expected_message);
	}
	
	@SuppressWarnings({ "unchecked", "static-access" })
	public static void verify_get_customer_address_Response(Response str_Reponse,String expected_message)
	{
		Queries q = new Queries();
		System.out.println("Message: "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> lhmap = jsonPathEvaluator.get("data.customerAddressDetails");
		System.out.println("Error Message: "+lhmap.size());
		List<Object> address= new ArrayList<>();
		LinkedHashMap<Object, Object> map = new LinkedHashMap<Object, Object>();
		LinkedHashMap<Object, String> mapaddress = new LinkedHashMap<>();
		if(lhmap.size()!=0)
		{
			for(int i=0; i<lhmap.size(); i++)
			{
				address.add(lhmap.get(i));
				System.out.println("Address of "+i+" Message: "+address.get(i));				
				map=  (LinkedHashMap<Object, Object>) address.get(i);
				//System.out.println(map.get("id"));
				int id = (int) map.get("id");
				System.out.println(id);
				System.out.println(map.get("address"));				
				mapaddress = (LinkedHashMap<Object, String>) map.get("address");
				System.out.println(mapaddress.get("addressLine1"));
				String addressline = mapaddress.get("addressLine1");
				Assert.assertEquals(addressline, q.get_customer_address(id));
			}
			
		}
		
					
		//Assert.assertEquals(lhmap, expected_message);
	}

}
