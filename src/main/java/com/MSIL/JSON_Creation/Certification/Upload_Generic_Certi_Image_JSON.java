package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.Upload_Generic_Certi_Image_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Upload_Generic_Certi_Image_JSON extends BaseSetup
{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Generic_Image(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;

		Upload_Generic_Certi_Image_POJO GI=new Upload_Generic_Certi_Image_POJO();
		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;



		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);
			
	

			if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					GI.setCertificationId(null);
				} else {
					GI.setCertificationId(value);
				}
			} else if (key.equals("documentName")) {
				if (value.equals("null") || value.equals("")) {
					GI.setDocumentName(null);
				} else {
					GI.setDocumentName(value);
				}
			} else if (key.equals("documentType")) {
				if (value.equals("null") || value.equals("")) {
					GI.setDocumentType(null);
				} else {
					GI.setDocumentType(value);
				}
			} 
			
			else if (key.equals("multipartFile")) {
				if (value.equals("null") || value.equals("")) {
					GI.setMultipartFile(null);
				} else {
					GI.setMultipartFile(value);
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
		jsonString = gSon.toJson(GI);
		
		System.out.println(jsonString);
		return jsonString;
		
		
			
			
			
			
		
		//excel.setCellData("customer_exists", "mobile", 2, cust.getMobile());


		

	//	System.out.println(jsonString);
	//	return jsonString;
		//return value;

	
	}}
