package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.MSIL_Registration;
import com.MSIL.POJO.Registration_Price;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class MSIL_Registration_Json extends BaseSetup{
	
	public static String msil_json(Hashtable<String, String> map, ITestContext context)
	{
		String jsonString = null;
		MSIL_Registration msil = new MSIL_Registration();
		
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
			
			if (key.equals("dealer_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setDealer_code(null);
				} else {
					msil.setDealer_code(value);
				}
			} else if (key.equals("model_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setModel_code(null);
				} else {
					msil.setModel_code(value);
				}
			}else if (key.equals("for_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setFor_code(null);
				} else {
					msil.setFor_code(value);
				}
			}else if (key.equals("variant_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setVariant_code(null);
				} else {
					msil.setVariant_code(value);
				}
			}else if (key.equals("color_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setColor_code(null);
				} else {
					msil.setColor_code(value);
				}
			}else if (key.equals("state_code")) {
				if (value.equals("null") || value.equals("")) {
					msil.setState_code(null);
				} else {
					msil.setState_code(value);
				}
			}else if (key.equals("company_id")) {
				if (value.equals("null") || value.equals("")) {
					msil.setCompany_id(null);
				} else {
					msil.setCompany_id(value);
				}
			}else if (key.equals("registration_tenure")) {
				if (value.equals("null") || value.equals("")) {
					msil.setRegistration_tenure(null);
				} else {
					msil.setRegistration_tenure(value);
				}
			}else if (key.equals("customer_type")) {
				if (value.equals("null") || value.equals("")) {
					msil.setCustomer_type(null);
				} else {
					msil.setCustomer_type(value);
				}
			}else if (key.equals("buyer_type")) {
				if (value.equals("null") || value.equals("")) {
					msil.setBuyer_type(null);
				} else {
					msil.setBuyer_type(value);
				}
			}else if (key.equals("fuel_type")) {
				if (value.equals("null") || value.equals("")) {
					msil.setFuel_type(null);
				} else {
					msil.setFuel_type(value);
				}
			}else if (key.equals("sales_type")) {
				if (value.equals("null") || value.equals("")) {
					msil.setSales_type(null);
				} else {
					msil.setSales_type(value);
				}
			}else if (key.equals("ac_type")) {
				if (value.equals("null") || value.equals("")) {
					msil.setAc_type(null);
				} else {
					msil.setAc_type(value);
				}
			}else if (key.equals("share_captial")) {
				if (value.equals("null") || value.equals("")) {
					msil.setShare_captial(null);
				} else {
					msil.setShare_captial(value);
				}
			}else if (key.equals("warranty_year")) {
				if (value.equals("null") || value.equals("")) {
					msil.setWarranty_year(null);
				} else {
					msil.setWarranty_year(value);
				}
			}else if (key.equals("exshowrrom_price")) {
				if (value.equals("null") || value.equals("")) {
					msil.setExshowrrom_price(null);
				} else {
					msil.setExshowrrom_price(value);
				}
			}
		}
		Gson gSon = new Gson();
		jsonString = gSon.toJson(msil);

		System.out.println(jsonString);
		return jsonString;
	}

}
