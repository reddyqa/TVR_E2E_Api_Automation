package com.MSIL.JSON_Creation.Certification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Refurbishment_Cost_Page_POJO;
import com.MSIL.POJO.Certification.RFCost_POJO.refurbishment;
import com.MSIL.POJO.Certification.RFCost_POJO.summaryDetails;
import com.MSIL.POJO.Certification.RFCost_POJO.vehicleImages;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_RFCost_Json extends BaseSetup{ 
	private Object listOf;

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Refurbishment_Cost(Hashtable<String, String> map, ITestContext context) {
		
		
		String jsonString = null;
		Refurbishment_Cost_Page_POJO RatingPricing_Page_POJO=new Refurbishment_Cost_Page_POJO();
		
		refurbishment  refurbishment =  new refurbishment ();
		vehicleImages vehicleImages= new vehicleImages ();
		summaryDetails summaryDetails=new summaryDetails();
		
		
		List<vehicleImages> vihelicedeatilname1 = new ArrayList<vehicleImages>();
		List<vehicleImages> vihelicedeatilname = new ArrayList<vehicleImages>();


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

			if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEnquiryId(null);
				} else {
					RatingPricing_Page_POJO.setEvaluationId(value);
				}
			} else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEnquiryId(null);
				} else {
					RatingPricing_Page_POJO.setEnquiryId(value);
				}
	
	
	

}
			
			
			
			
		}	
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(RatingPricing_Page_POJO);

		System.out.println(jsonString);
		return jsonString;

	}
}
