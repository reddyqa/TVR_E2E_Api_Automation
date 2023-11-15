package com.MSIL.JSON_Creation;




import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.aaTRVNewEnqPojo;
import com.MSIL.POJO.enquiry;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class aaTRVNewEnqJson extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String new_enq11(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		aaTRVNewEnqPojo NewEnq = new aaTRVNewEnqPojo();
		enquiry NewEnq1=new enquiry();

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value ;


		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq.setRegistrationNumber(null);
				} else {
					NewEnq.setRegistrationNumber(value);
				}
			} else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq.setCarCondition(null);
				} else {
					NewEnq.setCarCondition(value);
				}
			} else if (key.equals("evaluatorName")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq.setEvaluatorName(null);
				} else {
					NewEnq.setEvaluatorName(value);
				}
			} 
			
		
			
			else if (key.equals("type")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setType(null);
				} else {
					//List<String> type = new ArrayList<String>();
					//type.add(value);
					//NewEnq1.setType(value);
					NewEnq1.setType(value);
				}
			} else if (key.equals("dealerCode")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setDealerCode(null);
				} else {
					
					List<String> dealerCode = new ArrayList<String>();
					dealerCode.add(value);
					NewEnq1.setDealerCode(value);
				}
			} else if (key.equals("enquirySource")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setEnquirySource(null);
				} else {
					NewEnq1.setEnquirySource(value);
				}
			} else if (key.equals("newCarModel")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setNewCarModel(null);
				} else {
					NewEnq1.setNewCarModel(value);
				}
			} 
			
			
			else if (key.equals("newCarVariant")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setNewCarVariant(null);
				} else {
					NewEnq1.setNewCarVariant(value);
				}
			} 
			else if (key.equals("mspin")) {
				
			
				
				if (value.equals("null") || value.equals("")) {
					NewEnq1.setMspin(null);
				} else {
					NewEnq1.setMspin(value);
				}
			} 
			
			else if (key.equals("dealerParent")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq.setDealerParent(null);
				} else {
					NewEnq.setDealerParent(value);
				}
			} 
			else if (key.equals("searchWithVin")) {
				if (value.equals("null") || value.equals("")) {
					NewEnq.setSearchWithVin(null);
				} else {
					NewEnq.setSearchWithVin(value);
				}
			} 
			
		}
		//aaTRVNewEnqPojo NewEnq = new aaTRVNewEnqPojo();
	//	enquiry NewEnq1=new enquiry();
			
	//	List<String> enquiry1 = new ArrayList<String>();
		
		
		//enquiry1.addAll(0, enquiry1)
		//enquiry NewEnq2=new enquiry();
		//NewEnq.setEnquiry(NewEnq1);
		//enquiry1.addAll(NewEnq2);
	//	NewEnq.setEnquiry(null);
		//NewEnq.add(NewEnq2);
		
		//NewEnq.setEnquiry(enquiry1);
		
		
		//work
		
		  NewEnq.setEnquiry(NewEnq1);
		  
		  Gson gSon = new Gson(); 
		  jsonString = gSon.toJson(NewEnq);
		  
		  System.out.println(jsonString); return jsonString;
		 
		
	
				
				 // NewEnq.setEnquiry(NewEnq1);
				  
				 
			
			
			
			
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());


		

	//	System.out.println(jsonString);
	//	return jsonString;
		//return value;

	
	}}
