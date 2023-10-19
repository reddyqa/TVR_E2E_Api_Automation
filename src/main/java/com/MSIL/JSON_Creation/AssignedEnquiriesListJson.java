package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.filter;
import com.MSIL.POJO.search;
import com.MSIL.POJO.AssignedEnquiriesListRoot;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class AssignedEnquiriesListJson extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String AssignedEnquiries(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		AssignedEnquiriesListRoot assEnq=new AssignedEnquiriesListRoot();
		filter AssignEnq = new filter();
		search se=new search();

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value ;


		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("loc_cd")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setLoc_cd(null);
				} else {
					AssignEnq.setLoc_cd(value);
				}
			} else if (key.equals("enquiryNumber")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setEnquiryNumber(null);
				} else {
					AssignEnq.setEnquiryNumber(value);
				}
			} else if (key.equals("fromDate")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setFromDate(null);
				} else {
					AssignEnq.setFromDate(value);
				}
			} 
			
		
			
			 else if (key.equals("toDate")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setToDate(null);
				} else {
					AssignEnq.setToDate(value);
				}
			} else if (key.equals("enquiryType")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setEnquiryType(null);
				} else {
					AssignEnq.setEnquiryType(value);
				}
			} 
			
			else if (key.equals("enquirySource")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setEnquirySource(null);
				} else {
					AssignEnq.setEnquirySource(value);
				}
			} 
			else if (key.equals("mspin")) {
				
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setMspin(null);
				} else {
					AssignEnq.setMspin(value);
				}
			} 
			
			else if (key.equals("parent_grp")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setParent_grp(null);
				} else {
					AssignEnq.setParent_grp(value);
				}
			} 
			else if (key.equals("dealer_map_cd")) {
				if (value.equals("null") || value.equals("")) {
					AssignEnq.setDealer_map_cd(null);
				} else {
					AssignEnq.setDealer_map_cd(value);
				}
			} 
			
			//serach
	else if (key.equals("enquiryNumber")) {
				
				if (value.equals("null") || value.equals("")) {
					se.setEnquiryNumber(null);
				} else {
					se.setEnquiryNumber(value);
				}
			} 
			
			else if (key.equals("customerName")) {
				if (value.equals("null") || value.equals("")) {
					se.setCustomerName(null);
				} else {
					se.setCustomerName(value);
				}
			} 
			else if (key.equals("customerPhone")) {
				if (value.equals("null") || value.equals("")) {
					se.setCustomerPhone(null);
				} else {
					se.setCustomerPhone(value);
				}
			} 
			
			
		}
	
		
		assEnq.setFilter(AssignEnq);
		assEnq.setSearch(se);

		  
		  Gson gSon = new Gson(); 
		  jsonString = gSon.toJson(assEnq);
		  
		  System.out.println(jsonString); 
		  return jsonString;
		 
		
	
				
			

	
	}}
