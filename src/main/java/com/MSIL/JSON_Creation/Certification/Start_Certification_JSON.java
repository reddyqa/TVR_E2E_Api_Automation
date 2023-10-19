package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.Start_Certification_Pojo;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Start_Certification_JSON extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Start_Certifi(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Start_Certification_Pojo str = new Start_Certification_Pojo();
	

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value ;


		while (itr.hasNext()) {

			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					str.setMspin(null);
				} else {
					str.setMspin(value);
				}
			} else if (key.equals("buyingId")) {
				if (value.equals("null") || value.equals("")) {
					str.setBuyingId(null);
				} else {
					str.setBuyingId(value);
				}
			} else if (key.equals("parentGroup")) {
				if (value.equals("null") || value.equals("")) {
					str.setParentGroup(null);
				} else {
					str.setParentGroup(value);
				}
			} 

			else if (key.equals("dealerCode")) {
				if (value.equals("null") || value.equals("")) {
					str.setDealerCode(null);
				} else {

					str.setDealerCode(value);
				}
			} else if (key.equals("evaluatorName")) {
				if (value.equals("null") || value.equals("")) {
					str.setEvaluatorName(null);
				} else {


					str.setEvaluatorName(value);
				}
			} else if (key.equals("buyingPrice")) {
				if (value.equals("null") || value.equals("")) {
					str.setBuyingPrice(null);
				} else {
					str.setBuyingPrice(value);
				}
			} else if (key.equals("evaluatedRFCost")) {
				if (value.equals("null") || value.equals("")) {
					str.setEvaluatedRFCost(null);
				} else {
					str.setEvaluatedRFCost(value);
				}
			} 

			else if (key.equals("actualRFCost")) {
				if (value.equals("null") || value.equals("")) {
					str.setActualRFCost(null);
				} else {
					str.setActualRFCost(value);
				}
			} 

			else if (key.equals("dmsStatus")) {
				if (value.equals("null") || value.equals("")) {
					str.setDmsStatus(null);
				} else {
					str.setDmsStatus(value);
				}
			} 

		
			
			else if (key.equals("certificationNumber")) {
				if (value.equals("null") || value.equals("")) {
					str.setCertificationNumber(null);
				} else {
					str.setCertificationNumber(value);
				}
			} 
			else if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					str.setCertificationId(null);
				} else {
					str.setCertificationId(value);
				}
			} 

			 else if (key.equals("vehicleOnRoadPrice")) {
					if (value.equals("null") || value.equals("")) {
						str.setVehicleOnRoadPrice(null);
					} else {
						str.setVehicleOnRoadPrice(value);
					}
				} else if (key.equals("manufacturer")) {
					if (value.equals("null") || value.equals("")) {
						str.setManufacturer(null);
					} else {
						str.setManufacturer(value);
					}
				} 

				else if (key.equals("manufacturerName")) {
					if (value.equals("null") || value.equals("")) {
						str.setManufacturerName(null);
					} else {

						str.setManufacturerName(value);
					}
				} else if (key.equals("chassisNo")) {
					if (value.equals("null") || value.equals("")) {
						str.setChassisNo(null);
					} else {


						str.setChassisNo(value);
					}
				} 
				
			
			  
			 
				else if (key.equals("color")) {
					if (value.equals("null") || value.equals("")) {
						str.setColor(null);
					} else {
						str.setColor(value);
					}
				} else if (key.equals("engineNo")) {
					if (value.equals("null") || value.equals("")) {
						str.setEngineNo(null);
					} else {
						str.setEngineNo(value);
					}
				} 

				else if (key.equals("regNo")) {
					if (value.equals("null") || value.equals("")) {
						str.setRegNo(null);
					} else {
						str.setRegNo(value);
					}
				} 

				else if (key.equals("modelName")) {
					if (value.equals("null") || value.equals("")) {
						str.setModelName(null);
					} else {
						str.setModelName(value);
					}
				} 
				else if (key.equals("variantName")) {
					if (value.equals("null") || value.equals("")) {
						str.setVariantName(null);
					} else {
						str.setVariantName(value);
					}
				} else if (key.equals("variantCode")) {
					if (value.equals("null") || value.equals("")) {
						str.setVariantCode(null);
					} else {
						str.setVariantCode(value);
					}
				} 

				else if (key.equals("vinNo")) {
					if (value.equals("null") || value.equals("")) {
						str.setVinNo(null);
					} else {
						str.setVinNo(value);
					}
				} 

				else if (key.equals("colorCode")) {
					if (value.equals("null") || value.equals("")) {
						str.setColorCode(null);
					} else {
						str.setColorCode(value);
					}
				} 
				else if (key.equals("rfDate")) {
					if (value.equals("null") || value.equals("")) {
						str.setRfDate(null);
					} else {
						str.setRfDate(value);
					}
				} else if (key.equals("buyingDate")) {
					if (value.equals("null") || value.equals("")) {
						str.setBuyingDate(null);
					} else {
						str.setBuyingDate(value);
					}
				} 

			


		}




		Gson gSon = new Gson(); 
		jsonString = gSon.toJson(str);

		System.out.println(jsonString); 
		return jsonString;




	}}
