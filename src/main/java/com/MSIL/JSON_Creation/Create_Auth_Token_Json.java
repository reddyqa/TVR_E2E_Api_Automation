package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import com.MSIL.POJO.Token;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.Setup.RestAssuredSetup;
import com.google.gson.Gson;

import Query.Queries;

public class Create_Auth_Token_Json extends BaseSetup
{
	@SuppressWarnings({ "static-access", "rawtypes" })
	public static String auth_generate_token(Hashtable<String, String> map)
	{
		RestAssuredSetup ras = new RestAssuredSetup();
		String jsonString=null;
		Queries q = new Queries();
		Token t = new Token();
		
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
		while(itr.hasNext())
		{
			key = (String) itr.next();
			value = map.get(key);
			
			if(key.equals("mobileNo"))
			{
				t.setMobileNo(value);
				
			}else if (key.equals("appId"))
			{
				t.setAppId(value);
			}else if(key.equals("otp"))
			{
				System.out.println("Mobile no: "+t.getMobileNo());
				t.setOtp(q.getOTP(t.getMobileNo()));
			}
		}
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(t);
		return jsonString;
		
	}

}
