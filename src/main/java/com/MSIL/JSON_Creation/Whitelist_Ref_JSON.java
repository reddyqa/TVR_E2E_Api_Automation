package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.testng.ITestContext;
import com.MSIL.POJO.Whitelist_Ref_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Whitelist_Ref_JSON extends BaseSetup
{
	@SuppressWarnings({ "rawtypes"})
	public static String whitelist_ref_json(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Whitelist_Ref_POJO whitelist_ref = new Whitelist_Ref_POJO();
		
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value;
	
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("modelCodes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setmodelCodes(null);
				} else {
					List<String> modelCodes = new ArrayList<String>();
					modelCodes.add(value);
					whitelist_ref.setmodelCodes(modelCodes);
				}
			} 
			
			else if (key.equals("variantCodes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setvariantCodes(null);
				} else {
					List<String> variantCodes = new ArrayList<String>();
					variantCodes.add(value);
					whitelist_ref.setvariantCodes(variantCodes);
		
				}
			} 
			
			else if (key.equals("bodyTypes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setbodyTypes(null);
				} else {
					List<String> bodyTypes = new ArrayList<String>();
					bodyTypes.add(value);
					whitelist_ref.setbodyTypes(bodyTypes);
					
				}
			} 
			
			else if (key.equals("enginTypes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setenginTypes(null);
				} else {
					List<String> enginTypes = new ArrayList<String>();
					enginTypes.add(value);
					whitelist_ref.setenginTypes(enginTypes);
					
				}
			} 
			
			else if (key.equals("channelTypes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setchannelTypes(null);
				} else {
					List<String> channelTypes = new ArrayList<String>();
					channelTypes.add(value);
					whitelist_ref.setchannelTypes(channelTypes);
														
				}
			}
			
			else if (key.equals("colorCodes")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setcolorCodes(null);
				} else {
					List<String> colorCodes = new ArrayList<String>();
					colorCodes.add(value);
					whitelist_ref.setcolorCodes(colorCodes);
														
				}
			}
				
			else if (key.equals("colorsRequired")) {
				
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.setcolorsRequired(bool_value);
			}
			
			else if (key.equals("bodyTypesRequired")) {
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.setbodyTypesRequired(bool_value);
			}
			
			else if (key.equals("enginTypesRequired")) {
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.setenginTypesRequired(bool_value);
			}
				
			else if (key.equals("channelTypesRequired")) {
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.setchannelTypesRequired(bool_value);
			}
			
			else if (key.equals("transmissionTypesRequired")) {
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.settransmissionTypesRequired(bool_value);
			}
				
			else if (key.equals("fuelTypesRequired")) {
				boolean bool_value = Boolean.parseBoolean(value);
				whitelist_ref.setfuelTypesRequired(bool_value);
			}
				
			else if (key.equals("resolution")) {
				if (value.equals("null") || value.equals("")) {
					whitelist_ref.setresolution(null);
				} else {
					whitelist_ref.setresolution(value);										
				}
		}
			
		}
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());
		Gson gSon = new Gson();
		jsonString = gSon.toJson(whitelist_ref);

		System.out.println(jsonString);
		return jsonString;
	}

}


