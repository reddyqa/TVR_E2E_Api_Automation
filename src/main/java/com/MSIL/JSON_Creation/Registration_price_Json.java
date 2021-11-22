package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Registration_Price;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Registration_price_Json extends BaseSetup {
	
	public static String registrationpricejson(Hashtable<String, String> map, ITestContext context)
	{
		String jsonString = null;
		Registration_Price rp = new Registration_Price();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
		
		while(itr.hasNext())
		{
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);
			
			if (key.equals("state")) {
				if (value.equals("null") || value.equals("")) {
					rp.setState(null);
				} else {
					rp.setState(value);
				}
			} else if (key.equals("model")) {
				if (value.equals("null") || value.equals("")) {
					rp.setModel(null);
				} else {
					rp.setModel(value);
				}
			}else if (key.equals("variant")) {
				if (value.equals("null") || value.equals("")) {
					rp.setVariant(null);
				} else {
					rp.setVariant(value);
				}
			}else if (key.equals("forcode")) {
				if (value.equals("null") || value.equals("")) {
					rp.setForCode(null);
				} else {
					rp.setForCode(value);
				}
			}
			else if (key.equals("colorType")) {
				if (value.equals("null") || value.equals("")) {
					rp.setColorType(null);
				} else {
					rp.setColorType(value);
				}
			}else if (key.equals("acNac")) {
				if (value.equals("null") || value.equals("")) {
					rp.setAcNac(null);
				} else {
					rp.setAcNac(value);
				}
			}else if (key.equals("salesType")) {
				if (value.equals("null") || value.equals("")) {
					rp.setSalesType(null);
				} else {
					rp.setSalesType(value);
				}
			}else if (key.equals("buyerType")) {
				if (value.equals("null") || value.equals("")) {
					rp.setBuyerType(null);
				} else {
					rp.setBuyerType(value);
				}
			}else if (key.equals("cutomerType")) {
				if (value.equals("null") || value.equals("")) {
					rp.setCustomerType(null);
				} else {
					rp.setCustomerType(value);
				}
			}
			else if (key.equals("shareCap")) {
				if (value.equals("null") || value.equals("")) {
					rp.setShareCap(null);
				} else {
					rp.setShareCap(value);
				}
			}
			else if (key.equals("taxTenure")) {
				if (value.equals("null") || value.equals("")) {
					rp.setTaxTenure(null);
				} else {
					rp.setTaxTenure(value);
				}
			}
		}
		Gson gSon = new Gson();
		jsonString = gSon.toJson(rp);

		System.out.println(jsonString);
		return jsonString;
		
	}

}
