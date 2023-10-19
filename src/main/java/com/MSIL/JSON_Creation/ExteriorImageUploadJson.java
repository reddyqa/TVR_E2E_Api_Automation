package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.ExteriorImageUploadPojo;
import com.google.gson.Gson;


public class ExteriorImageUploadJson 
{
	@SuppressWarnings({ "rawtypes"})
	public static String ExteriorImageUploadAPI(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;

		ExteriorImageUploadPojo extimageupload=new ExteriorImageUploadPojo();
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;


		
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);
			
	

			if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					extimageupload.setEvaluationId(null);
				} else {
					extimageupload.setEvaluationId(value);
				}
			} else if (key.equals("documentName")) {
				if (value.equals("null") || value.equals("")) {
					extimageupload.setDocumentName(null);
				} else {
					extimageupload.setDocumentName(value);
				}
			} else if (key.equals("multipartFile")) {
				if (value.equals("null") || value.equals("")) {
					extimageupload.setMultipartFile(null);
				} else {
					extimageupload.setMultipartFile(value);
				}
			} 	
		}
			
			
		//List<enquiry> enquiry1 = new ArrayList<enquiry>();
		
		//enquiry NewEnq1=new enquiry();
		
		//NewEnq.add(NewEnq1);
		
	//	NewEnq.setEnquiry(NewEnq1);
		//cust_address.add(customer_add);
	//	customeraddress.setCustomerAddresses(cust_address);
		Gson gSon = new Gson();
		jsonString = gSon.toJson(extimageupload);
		
		System.out.println(jsonString);
		return jsonString;
		
}

}
