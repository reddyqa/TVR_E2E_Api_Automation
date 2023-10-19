package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.CertExterioImgUploadRoot;
import com.google.gson.Gson;

public class CertExtImgUploadJson 
{
	public static String CertExteriorImageUploadAPI(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;

		CertExterioImgUploadRoot certextimageupload=new CertExterioImgUploadRoot();
		/* extract read the value from excel */
		@SuppressWarnings("rawtypes")
		Set keys = map.keySet();
		@SuppressWarnings("rawtypes")
		Iterator itr = keys.iterator();
		String key;
		String value = null;


		
		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);
			
	

			if (key.equals("certificationId")) 
			{
				if (value.equals("null") || value.equals("")) 
				{
					certextimageupload.setCertificationId(null);
				} else {
					certextimageupload.setCertificationId(value);
				}
			} 
			else if (key.equals("documentName")) 
			{
				if (value.equals("null") || value.equals("")) 
				{
					certextimageupload.setDocumentName(null);
				} else {
					certextimageupload.setDocumentName(value);
				}			
			}
			else if (key.equals("documentType")) 
			{
				if (value.equals("null") || value.equals("")) 
				{
					certextimageupload.setDocumentType(null);
				} else {
					certextimageupload.setDocumentType(value);
				}			
			} 
			
			else if (key.equals("multipartFile")) {
				if (value.equals("null") || value.equals("")) {
					certextimageupload.setMultipartFile(null);
				} else {
					certextimageupload.setMultipartFile(value);
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
		jsonString = gSon.toJson(certextimageupload);
		
		System.out.println(jsonString);
		return jsonString;
			
}

}
