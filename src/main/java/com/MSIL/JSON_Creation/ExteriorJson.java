package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Exterior;
import com.MSIL.POJO.ExteriorImage;
import com.MSIL.POJO.ExteriorRoot;
import com.MSIL.POJO.ImageS3Info;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class ExteriorJson extends BaseSetup
{
	
	public static String exteriorDetails(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		ExteriorRoot newextRoot= new ExteriorRoot();
		Exterior newexterior = new Exterior();
		ImageS3Info newextS3info= new ImageS3Info();
				
		List<ExteriorImage>newextImgList= new ArrayList<ExteriorImage>();
		List<ImageS3Info> newImageS3List=new ArrayList<ImageS3Info>();
		
		//List<exteriorImages> vihelicedeatilname = new ArrayList<vehicleImages>();

		/* extract read the value from excel */
		/*
		 * Set keys = map.keySet(); Iterator itr = keys.iterator(); String key;
		 */
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
			ExteriorImage newextImage= new ExteriorImage();
			ImageS3Info exts3info=new ImageS3Info();

			List<ExteriorImage>newextImgList1= new ArrayList<ExteriorImage>();
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setEvaluationId(null);
				} else {
					newextRoot.setEvaluationId(value);
				}
			} else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setEnquiryId(null);
				} else {
					newextRoot.setEnquiryId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setMspin(null);
				} else {
					newextRoot.setMspin(value);
				}
			} 
			
			else if (key.equals("evalName")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setEvalName(null);
				} else {
					newextRoot.setEvalName(value);
				}
			} else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setRegistrationNumber(null);
				} else {
					newextRoot.setRegistrationNumber(value);
				}
			} else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setCarCondition(null);
				} else {
					newextRoot.setCarCondition(value);
				}
			} else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setStageCode(null);
				} else {
					newextRoot.setStageCode(value);
				}
			} 
			
			else if (key.equals("dmsEnquiryId")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setDmsEnquiryId(null);
				} else {
					newextRoot.setDmsEnquiryId(value);
				}
			} 
			else if (key.equals("enquirySource")) {
					
				if (value.equals("null") || value.equals("")) {
					newextRoot.setEnquirySource(null);
				} else {
					newextRoot.setEnquirySource("518639");
				}
			} 
			
			else if (key.equals("submissionDate")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setSubmissionDate(null);
				} else {
					newextRoot.setSubmissionDate(value);
				}
			} 
			else if (key.equals("createdDate")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setCreatedDate(null);
				} else {
					newextRoot.setCreatedDate(value);
				}
			} 
			
	
			else if(key.equals("enquiryType"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextRoot.setEnquiryType(null);
				}
				else {
					newextRoot.setEnquiryType(value);
				}
			}
			else if(key.equals("isFinalSubmission"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextRoot.setIsFinalSubmission(null);
				}
				else {
					newextRoot.setIsFinalSubmission(value);
				}
			}
			else if(key.equals("aaaname"))
			{
				log.info("-----------if name>");
				if(value.equals("null")|| value.equals(""))
				{
					newextImage.setName(null);;
				}
				else {
					//newextImage.setName(value);
					String[] values = value.split(",");
					
					for(int i=0;i<values.length;i++) {
						ExteriorImage extImages1=new ExteriorImage();
						//extImages1.setName(values[i]);
						log.info("setname--->");
						extImages1.setName(values[i]);
						extImages1.setImageS3Info(new ImageS3Info() );
						newextImgList.add(extImages1);
						//newextImgList.add(newextImage);
					
					}					
				}
			}
			else if(key.equals("abfileName"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFileName(null);
				}
				else {
					System.out.println("values1"+newextImgList.size());

					String[] values = value.split(",");
						for(int i=0;i<newextImgList.size();i++) {
							//	exts3info.setFileExtension(values[i]);
								//newextImgList1.addAll(exts3info);
								
		//vehicleImages vehicleImages1=vihelicedeatilname.get(i);
								
								
								ExteriorImage exteriorImage = newextImgList.get(i);	
									exteriorImage.getImageS3Info().setFileName(values[i]);
								}
						}	
					
					System.out.println("newextImgList------>"+newextImgList.size());
				}
			
			
			
			
			
			else if(key.equals("acfileExtension"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFileExtension(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
					//	exts3info.setFileExtension(values[i]);
						//newextImgList1.addAll(exts3info);
						
//vehicleImages vehicleImages1=vihelicedeatilname.get(i);
						
						
							ExteriorImage exteriorImage = newextImgList.get(i);	
							exteriorImage.getImageS3Info().setFileExtension(values[i]);
						}		
				}
			}
			else if(key.equals("adfileType"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFileType(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
					//	exts3info.setFileType(values[i]);
						
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setFileType(values[i]);
						//newextImgList1.addAll(exts3info);
						}		
				}
			}
			else if(key.equals("aedocumentName"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setDocumentName(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						//	exts3info.setFileType(values[i]);
							
							ExteriorImage exteriorImage = newextImgList.get(i);	
							exteriorImage.getImageS3Info().setDocumentName(values[i]);
							//newextImgList1.addAll(exts3info);
							}		
				}
			}
			else if(key.equals("tempS3Key"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setTempS3Key(null);
				}
				
					else {
						String[] values = value.split(",");
						for(int i=0;i<newextImgList.size();i++) {
							//	exts3info.setFileType(values[i]);
								
								ExteriorImage exteriorImage = newextImgList.get(i);	
								exteriorImage.getImageS3Info().setTempS3Key(values[i]);
								//newextImgList1.addAll(exts3info);
								}		
						
				}
			}
			else if(key.equals("fixedS3Key"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFixedS3Key(null);
				}
				String[] values = value.split(",");
				for(int i=0;i<newextImgList.size();i++) {
					//	exts3info.setFileType(values[i]);
						
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setFixedS3Key(values[i]);
						//newextImgList1.addAll(exts3info);
						}	
			}
			else if(key.equals("tempS3Url"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setTempS3Url(null);
				}
				String[] values = value.split(",");
				for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setTempS3Url(values[i]);
						}	
			}
			else if(key.equals("fixedS3Url"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFixedS3Url(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setFixedS3Url(values[i]);
						}		
				}
			}
			else if(key.equals("fixedS3PresignedUrl"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFixedS3PresignedUrl(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setFixedS3PresignedUrl(values[i]);
						}	
				}
			}
			else if(key.equals("tempS3PresignedUrl"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setTempS3PresignedUrl(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setTempS3PresignedUrl(values[i]);
						}	
				}
			}
			else if(key.equals("fixedS3PresignedUrlExpDt"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFixedS3PresignedUrlExpDt(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setFixedS3PresignedUrlExpDt(values[i]);
						}		
				}
			}
			else if(key.equals("tempS3PresignedUrlExpDt"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setTempS3PresignedUrl(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setTempS3PresignedUrlExpDt(values[i]);
						}		
				}
			}
			else if(key.equals("isDefect"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setIsDefect(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setIsDefect(values[i]);
						}	
				}
			}
			else if(key.equals("totalCost"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setTotalCost(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setTotalCost(values[i]);
						}		
				}
			}
			else if(key.equals("discountedCost"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setDiscountedCost(null);
				}
				else {
					String[] values = value.split(",");
					for(int i=0;i<newextImgList.size();i++) {
						ExteriorImage exteriorImage = newextImgList.get(i);	
						exteriorImage.getImageS3Info().setDiscountedCost(values[i]);
						}	
				}
			}
			
			else if(key.equals("tyreReplacementRFCost"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setTyreReplacementRFCost(null);
				}
				else {
					newexterior.setTyreReplacementRFCost(value);
				}
				
			}
			//newextImage.setImageS3Info(newextS3info);
		//	newextImage.setImageS3Info(exts3info);
		//	newextImgList.addAll(newextImgList1);	
		//	newextImgList.add(newextImage);
			
			
			
		}
		//newextImage.setImageS3Info(newextS3info);
		//newextImgList.add(newextImage);
		//exts3info
		//newexterior.se
		newexterior.setExteriorImages(newextImgList);
		
		//snewextRoot.setExterior(new Exterior());
		System.out.println("ddddddd------"+newextRoot.toString());
		newextRoot.setExterior(newexterior);
		
		//newextRoot.setExterior(newextImgList);

		
		//cust_address.add(customer_add);
	//	customeraddress.setCustomerAddresses(cust_address);
		Gson gSon = new Gson();
		jsonString = gSon.toJson(newextRoot);
		
		System.out.println("chet-----:"+jsonString);
		return jsonString;
		

}
}