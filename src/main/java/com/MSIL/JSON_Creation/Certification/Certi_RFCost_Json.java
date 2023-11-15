package com.MSIL.JSON_Creation.Certification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.MSIL.POJO.Certification.RFCost_POJO.*;
import org.testng.ITestContext;

import com.MSIL.POJO.Refurbishment_Cost_Page_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_RFCost_Json extends BaseSetup{ 
	private Object listOf;

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Refurbishment_Cost(Hashtable<String, String> map, ITestContext context) {

		String jsonString = null;
		RfcostRoot rfcostRoot= new RfcostRoot();
        refurbishment  refurbishment =  new refurbishment ();
		popularWorkDemand pwd= new  popularWorkDemand();
		interiorCleaning ic= new interiorCleaning();
		rubbingAndPolishing rp = new rubbingAndPolishing();
		spareKeys sk= new spareKeys();
		accessoriesRepair ar= new accessoriesRepair();
		otherRefurbishmentCostDataCertifier otherRFcost= new otherRefurbishmentCostDataCertifier();


		//List<vehicleImages> vihelicedeatilname = new ArrayList<vehicleImages>();

		/* extract read the value from excel */
		Set keys1 = map.keySet();
		   List<Integer> keys = new ArrayList<>(keys1);
			System.out.println("before sort"+keys);

	        // Sort the list
	        Collections.sort(keys);

		//keys.stream().sorted().collect(Collector)
		System.out.println(" sort"+keys);

		Iterator itr = keys.iterator();
		String key;
		String value = null;


		while (itr.hasNext()) {
		//	List<vehicleImages> vihelicedeatilUrls = new ArrayList<vehicleImages>();


			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					rfcostRoot.setCertificationId(null);
				} else {
					rfcostRoot.setCertificationId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					rfcostRoot.setMspin(null);
				} else {
					rfcostRoot.setMspin(value);
				}
			}
				else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					rfcostRoot.setRegistrationNumber(null);
				} else {
					rfcostRoot.setRegistrationNumber(value);
				}
			}
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					rfcostRoot.setStageCode(null);
				} else {
					rfcostRoot.setStageCode(value);
				}
			}
			else if (key.equals("pwdactualcost")) {
				if (value.equals("null") || value.equals("")) {
					pwd.setActualRfCost(null);
				} else {
					pwd.setActualRfCost(value);
				}
			}
			else if (key.equals("pwdisEnabled")) {
				if (value.equals("null") || value.equals("")) {
					pwd.setIsEnabled(null);
				} else {
					pwd.setIsEnabled(value);
				}
			}
			else if (key.equals("icactualRfCost")) {
				if (value.equals("null") || value.equals("")) {
					ic.setActualRfCost(null);
				} else {
					ic.setActualRfCost(value);
				}
			}
			else if (key.equals("icisEnabled")) {
				if (value.equals("null") || value.equals("")) {
					ic.setIsEnabled(null);
				} else {
					ic.setIsEnabled(value);
				}
			}
			else if (key.equals("rpactualRfCost")) {
				if (value.equals("null") || value.equals("")) {
					rp.setActualRfCost(null);
				} else {
					rp.setActualRfCost(value);
				}
			}
			else if (key.equals("rpisEnabled")) {
				if (value.equals("null") || value.equals("")) {
					rp.setIsEnabled(null);
				} else {
					rp.setIsEnabled(value);
				}
			}
			else if (key.equals("skactualRfCost")) {
				if (value.equals("null") || value.equals("")) {
					sk.setActualRfCost(null);
				} else {
					sk.setActualRfCost(value);
				}
			}
			else if (key.equals("skisEnabled")) {
				if (value.equals("null") || value.equals("")) {
					sk.setIsEnabled(null);
				} else {
					sk.setIsEnabled(value);
				}
			}
			else if (key.equals("aractualRfCost")) {
				if (value.equals("null") || value.equals("")) {
					ar.setActualRfCost(null);
				} else {
					ar.setActualRfCost(value);
				}
			}
			else if (key.equals("arisEnabled")) {
				if (value.equals("null") || value.equals("")) {
					ar.setIsEnabled(null);
				} else {
					ar.setIsEnabled(value);
				}
			}
			else if (key.equals("time_spent")) {
				if (value.equals("null") || value.equals("")) {
					refurbishment.setTime_spent(null);
				} else {
					refurbishment.setTime_spent(value);
				}
			}
			
		}

		otherRFcost.setPopularWorkDemand(pwd);
		otherRFcost.setInteriorCleaning(ic);
		otherRFcost.setSpareKeys(sk);
		otherRFcost.setRubbingAndPolishing(rp);
		otherRFcost.setAccessoriesRepair(ar);
		refurbishment.setOtherrfcost(otherRFcost);
		rfcostRoot.setRefurbishment(refurbishment);



		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(rfcostRoot);

		System.out.println(jsonString);
		return jsonString;

	}
}
