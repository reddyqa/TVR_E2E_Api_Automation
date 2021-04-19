package com.MSIL.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Get_Whitelist {
static Map<String, String> object = new HashMap<String, String>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message, String cityGroupId)
	{
		System.out.println("Response of whitelist companies:  "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> res_data = jsonPathEvaluator.get("data.partnerList");
		System.out.println(res_data.size());
		List <String> partner_ids = q.whitelist_leasing_companies(cityGroupId);
		
	          if(res_data.size()!=0)
	          {
	        	  for(int i=0; i<res_data.size(); i++) 
	          {
	        		  object =(Map<String, String>) res_data.get(i); 
	        		  String Whitelist_Companies = String.valueOf(object.get("id"));
			          System.out.println(Whitelist_Companies);
			          
	        		  for(int j=0; j<partner_ids.size(); j++)
	        		  {
	        			  if(Whitelist_Companies.equals(partner_ids.get(j)))
	        			  {
	        				  Assert.assertEquals(Whitelist_Companies, partner_ids.get(j));  
	        			  }
	        			  else {
	        				  
	        			  }
	        			   
				        
				          
	        		  } 
	        		  
	        		   
			          }
			  
				  }
				  
				  
				  
				  }
				 
	

	}
