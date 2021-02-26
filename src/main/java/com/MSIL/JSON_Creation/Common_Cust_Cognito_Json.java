package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.CustomerRegisterReqDto;
import com.MSIL.POJO.CustomerRegistration_Cognito;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.Setup.RestAssuredSetup;
import com.google.gson.Gson;


public class Common_Cust_Cognito_Json extends BaseSetup
{
	
	@SuppressWarnings({ "rawtypes"})
	public static String cust_create_json(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		CustomerRegistration_Cognito comm_cust = new CustomerRegistration_Cognito();
		CustomerRegisterReqDto cust = new CustomerRegisterReqDto();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			comm_cust.setCustomerRegisterReqDto(cust);
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("firstName")) {
				if (value.equals("null") || value.equals("")) {
					cust.setFirstName(null);
				} else {
					cust.setFirstName(value);
				}
			} else if (key.equals("middleName")) {
				if (value.equals("null") || value.equals("")) {
					cust.setMiddleName(null);
				} else {
					cust.setMiddleName(value);
				}
			} else if (key.equals("lastName")) {
				if (value.equals("null") || value.equals("")) {
					cust.setLastName(null);
				} else {
					cust.setLastName(value);
				}
			} else if (key.equals("email")) {
				if (value.equals("null") || value.equals("")) {
					cust.setEmail(null);
				} else {
					cust.setEmail(value);
				}
			} else if (key.equals("mobile")) {
				if (value.equals("null") || value.equals("")) {
					cust.setMobile(null);
				} else {
					if(map.get("endpoint").equals("qa/customer/api/v1/exists"))
					{
						cust.setMobile(value);
					}else
					{
						cust.setMobile(context.getAttribute("mobile"));
					}
										
				}
			} else if (key.equals("gender")) {
				if (value.equals("null") || value.equals("")) {
					cust.setGender(null);
				} else {
					cust.setGender(value);
				}
			} else if (key.equals("dob")) {
				if (value.equals("null") || value.equals("")) {
					cust.setDob(null);
				} else {
					
					cust.setDob(value);
				}
			} else if (key.equals("businessType")) {
				if (value.equals("null") || value.equals("")) {
					cust.setBusinessType(null);
				} else {
					cust.setBusinessType(value);
				}
			} else if (key.equals("occupationTypeCode")) {
				if (value.equals("null") || value.equals("")) {
					cust.setOccupationTypeCode(null);
				} else {
					cust.setOccupationTypeCode(value);
				}
			} else if (key.equals("referredBy")) {
				if (value.equals("null") || value.equals("")) {
					cust.setReferredBy(null);
					;
				} else {
					cust.setReferredBy(value);
				}
			} else if (key.equals("referralCode")) {
				if (value.equals("null") || value.equals("")) {
					cust.setReferralCode(null);
				} else {
					cust.setReferralCode(value);
				}
			}else if (key.equals("uuid")) {
				if (value.equals("null") || value.equals("")) {
					comm_cust.setUuid(null);
				} else {
					comm_cust.setUuid(value);
				}
			}
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(comm_cust);

		System.out.println(jsonString);
		return jsonString;
	}


}
