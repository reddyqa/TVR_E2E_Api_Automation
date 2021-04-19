package com.MSIL.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import Query.Queries;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Subscription_Tenure {
static Map<String, Integer> object = new HashMap<String, Integer>();

	
	static Queries q = new Queries();
	@SuppressWarnings({ "static-access", "unchecked" })
	public static void verify_Response(Response str_Reponse,  String expected_message, String cityId)
	{
		System.out.println("Response of all possible tenures:  "+str_Reponse.getBody().asString());
		JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
		List<Object> res_data = jsonPathEvaluator.get("data.tenureIds");
		System.out.println(res_data.size());
		List <String> Tenure_ids = q.Subscription_tenure(cityId);
		
	          if(res_data.size()!=0)
	          {
	        	  for(int i=0; i<res_data.size(); i++) 
	          {
	        		  int tenure_id = (int) res_data.get(i); 
	        		  System.out.println(" Value of tenure id " + tenure_id );
			          
	        		  for(int j=0; j<Tenure_ids.size(); j++)
	        		  {
	        			  if(String.valueOf(tenure_id).equals(Tenure_ids.get(j)))
	        			  {
	        				  Assert.assertEquals(String.valueOf(tenure_id), Tenure_ids.get(j));  
	        			  }
	        			  else {
	        				  
	        			  }
	        			   
				        
				          
	        		  } 
	        		  
	        		   
			          }
			  
				  }
				  
				  
				  
				  }
				 
	

	}