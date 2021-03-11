package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import com.MSIL.POJO.Token;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.Setup.RestAssuredSetup;
import com.google.gson.Gson;


public class Send_otp_Json extends BaseSetup
{
	
	  static Token t = new Token();
	  static RestAssuredSetup ras = new RestAssuredSetup();
	  

	 
	@SuppressWarnings({ "rawtypes", "static-access" })
	public static String send_otp(Hashtable<String, String> map)
	{
		String jsonString=null;
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		//System.out.println("The value of Itr "+itr.hasNext());
		String key;
		String value;
		while(itr.hasNext())
		{
			key = (String) itr.next();
			value = map.get(key);
			
			if(key.equals("mobileNo"))
			{
				t.setMobileNo(ras.generateRandomNumber());
				
			}else if (key.equals("appId"))
			{
				float f = Float.parseFloat(value);
				int v = (int) f;
				String s = Integer.toString(v);
				t.setAppId(s);
			}
		}
		
		excel.setCellData("gen_auth_token", "mobileNo", 2, t.getMobileNo());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(t);
		return jsonString;
		
	}
	
}
