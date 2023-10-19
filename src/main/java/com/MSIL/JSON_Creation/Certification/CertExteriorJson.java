package com.MSIL.JSON_Creation.Certification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.ImageS3Info;
import com.MSIL.POJO.Certification.CertExterior;
import com.MSIL.POJO.Certification.CertExteriorImage;
import com.MSIL.POJO.Certification.CertExteriorRoot;
import com.MSIL.POJO.Certification.CertImageS3Info;
import com.MSIL.POJO.Certification.ExteriorImageS3Info;
import com.MSIL.POJO.Certification.Image;
import com.google.gson.Gson;


public class CertExteriorJson 
{
	
	public static String exteriorDetails(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		CertExteriorRoot newextRoot= new CertExteriorRoot();
		CertExterior newexterior = new CertExterior();
		CertImageS3Info newextS3info= new CertImageS3Info();
		Image img= new Image();
		
		List<CertExteriorImage>newextImgList= new ArrayList<CertExteriorImage>();
		newexterior.setExteriorImages(newextImgList);
		
		
		List<Image>ImageList= new ArrayList<Image>();
		newexterior.setImages(ImageList);
		newexterior.setExteriorImages(newextImgList);
		newextRoot.setExterior(newexterior);
		//newextRoot.setExterior(newexterior);
		
		
		
		//List<exteriorImages> vihelicedeatilname = new ArrayList<vehicleImages>();

		/* extract read the value from excel */
		/*
		 * Set keys = map.keySet(); Iterator itr = keys.iterator(); String key;
		 */
		@SuppressWarnings("rawtypes")
		Set keys1 = map.keySet();
		   @SuppressWarnings("unchecked")
		List<Integer> keys = new ArrayList<>(keys1);
			System.out.println("before sort"+keys);

	        // Sort the list
	        Collections.sort(keys);

		//keys.stream().sorted().collect(Collector)
		System.out.println(" sort"+keys);

		@SuppressWarnings("rawtypes")
		Iterator itr = keys.iterator();
		String key;
		String value = null;

		
		
		List<String>nameValues= new ArrayList<String>();
		List<String>exDocCategoryValues= new ArrayList<String>();
		List<String>exDoctypeValues= new ArrayList<String>();
		List<String>exDocNameValues= new ArrayList<String>();
		List<String>exFileNameValues= new ArrayList<String>();
		List<String>exFileExtensionValues= new ArrayList<String>();
		List<String>exFileTypevalues= new ArrayList<String>();
		List<String>exFixedS3UrlValues= new ArrayList<String>();
		
		List<String>cqImageName= new ArrayList<>();
		List<String>cqImageFileName= new ArrayList<>();
		List<String>cqImageFiletype= new ArrayList<>();
		List<String>cqImageFileExtension= new ArrayList<>();
		List<String>cqImageDocName= new ArrayList<>();
		List<String>cqImagePreUrl= new ArrayList<>();

		while (itr.hasNext()) 
		{
			CertExteriorImage newextImage= new CertExteriorImage();
			CertImageS3Info exts3info=new CertImageS3Info();

			List<CertExteriorImage>newextImgList1= new ArrayList<CertExteriorImage>();
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);


			
			if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setCertificationId(null);
				} else {
					newextRoot.setCertificationId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setMspin(null);
				} else {
					newextRoot.setMspin(value);
				}
			} 
			
			else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setRegistrationNumber(null);
				} else {
					newextRoot.setRegistrationNumber(value);
				}
			} 
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					newextRoot.setStageCode(null);
				} else {
					newextRoot.setStageCode(value);
				}
			} 
		
			else if (key.equals("name"))
				if (value.equals("null") || value.equals("")) {
					img.setName(null);
				} else {
					//newextImage.setName(value);
					nameValues = Arrays.asList(value.split(","));
					

				}
			
			
			else if (key.equals("exdocCategory")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setDocumentCategory(null);
				} else {
					exDocCategoryValues = Arrays.asList(value.split(","));

					
				}
			} 
			
			else if (key.equals("exdoctype")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setDocumentType(null);
				} else {
					exDoctypeValues = Arrays.asList(value.split(","));

				
				}
			}
			
			else if (key.equals("exdocname")) {
				if (value.equals("null") || value.equals("")) {
				    newextS3info.setDocumentName(null);
				} else {
					exDocNameValues = Arrays.asList(value.split(","));

				 
				    
				}


			} 
			
			else if (key.equals("exfilename")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setFileName(null);
				} else {
					exFileNameValues = Arrays.asList(value.split(","));

					
				}
			} 
			
			else if (key.equals("exfileExtension")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setFileExtension(null);
				} else {
					exFileExtensionValues = Arrays.asList(value.split(","));	

				
				}
			} 
			
			else if (key.equals("exfiletype")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setFileType(null);
				} else {
					exFileTypevalues = Arrays.asList(value.split(","));	

			
				}
			} 
			
			else if (key.equals("exfixedS3PresignedUrl")) {
				if (value.equals("null") || value.equals("")) {
					newextS3info.setFixedS3PresignedUrl(null);
				} else {
					exFixedS3UrlValues = Arrays.asList(value.split(","));	
					

			
				}
			} 
			
			
			
			
			else if(key.equals("aaaname"))
			{
				//log.info("-----------if name>");
				if(value.equals("null")|| value.equals(""))
				{
					newextImage.setName(null);
				}
				else {
					//newextImage.setName(value);
					cqImageName=Arrays.asList(value.split(","));
				}
			}
			else if(key.equals("abfileName"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFileName(null);
				}
				else {
					cqImageFileName=Arrays.asList(value.split(","));
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
					cqImageFileExtension=Arrays.asList(value.split(","));
						
				}
			}
			else if(key.equals("adfileType"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFileType(null);
				}
				else {
					cqImageFiletype=Arrays.asList(value.split(","));
				}
			}
			else if(key.equals("aedocumentName"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setDocumentName(null);
				}
				else {
					cqImageDocName=	Arrays.asList(value.split(","));
				}
			}
			
			
			else if(key.equals("fixedS3PresignedUrl"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newextS3info.setFixedS3PresignedUrl(null);
				}
				else {
					cqImagePreUrl=Arrays.asList(value.split(","));
				}
			}
			
			else if(key.equals("repaintDone"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setRepaintDone(null);
				}
				else {
					newexterior.setRepaintDone(value);
				}
			}
			
			else if(key.equals("rePaintListMode"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setRePaintListMode(null);
				}
				else {
					newexterior.setRePaintListMode(value);
				}
			}
			else if(key.equals("actualRefurbishmentCost"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setActualRefurbishmentCost(null);
				}
				else {
					newexterior.setActualRefurbishmentCost(value);
				}
			}
			else if(key.equals("front_right"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setFrontRight(null);
				}
				else {
					newexterior.setFrontRight(value);
				}
			}
			
			else if(key.equals("front_left"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setFrontLeft(null);
				}
				else {
					newexterior.setFrontLeft(value);
				}
			}
			
			else if(key.equals("rear_right"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setRearRight(null);
				}
				else {
					newexterior.setRearRight(value);
				}
			}
			
			else if(key.equals("rear_left"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setRearLeft(null);
				}
				else {
					newexterior.setRearLeft(value);
				}
			}
			
			else if(key.equals("spare"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setSpare(null);
				}
				else {
					newexterior.setSpare(value);
				}
			}
			
			else if(key.equals("wheel_type"))
			{
				if(value.equals("null")|| value.equals(""))
				{
					newexterior.setWheelType(null);
				}
				else {
					newexterior.setWheelType(value);
				}
			}
			
		}

			
			for(int i=0; i<nameValues.size();i++)
			{
				//List<CertImageS3Info> newImageS3List=new ArrayList<CertImageS3Info>();
				
				CertImageS3Info s3info= new CertImageS3Info();
				s3info.setDocumentName(exDocNameValues.get(i));
				s3info.setDocumentCategory(exDocCategoryValues.get(i));
				s3info.setDocumentType(exDoctypeValues.get(i));
				s3info.setFileExtension(exFileExtensionValues.get(i));
				s3info.setFileName(exFileNameValues.get(i));
				s3info.setFileType(exFileTypevalues.get(i));
				s3info.setFixedS3PresignedUrl(exFixedS3UrlValues.get(i));
				
				Image image= new Image();
				image.setName(nameValues.get(i));
				image.setType(exDoctypeValues.get(i));
				image.setImageS3Info(s3info);

				
				newextRoot.getExterior().getImages().add(image);
				

			}
			
			for(int i=0;i<cqImageName.size();i++)	
			{
				ExteriorImageS3Info extS3info= new ExteriorImageS3Info();
				extS3info.setDocumentName(cqImageDocName.get(i));
				extS3info.setFileExtension(cqImageFileExtension.get(i));
				extS3info.setFileName(cqImageFileName.get(i));
				extS3info.setFileType(cqImageFiletype.get(i));
				extS3info.setFixedS3PresignedUrl(cqImagePreUrl.get(i));
				
				CertExteriorImage certImage= new CertExteriorImage();
				certImage.setName(cqImageDocName.get(i));
				certImage.setImageS3Info(extS3info);
				
				newextRoot.getExterior().getExteriorImages().add(certImage);
				
			}
			
			
		
	
		

		Gson gSon = new Gson();
		jsonString = gSon.toJson(newextRoot);
		
		System.out.println("chet-----:"+jsonString);
		return jsonString;
		

}

}
