package com.MSIL.API_LISTS.Certification;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Certification.Certi_UploadGenImage_Json;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CertUploadGenImageAPI {
	
	
	
	
	
	static ExcelReader er = new ExcelReader("./testdata/Certification.xlsx");

	static int rowNum = 2;
	static int  vin_image=2;
	static int  CHASSIS=2;

	static int FRONT = 2;
	static int  BACK=2;
	static int  INSURANCE=2;
	
	static int ODOMETER = 2;
	static int  IMAGE_NUMBER1=2;
	
	static int IMAGE_NUMBER2=2;
	static int ENGINE=2;
	
	@SuppressWarnings({ "unused", "static-access" }) 
	public static void Upload_Generic_Image(Hashtable<String, String> data, ITestContext context, String sheetname) {
		
		Map<String, Object> map = new HashMap<>();

		//aaTRVCreateEnqAPI aaTRVCreateEnqAPI=new aaTRVCreateEnqAPI();
		Certi_UploadGenImage_Json image = new Certi_UploadGenImage_Json();
		
		
		 File testUploadFile = new File(data.get("multipartFile")); //Specify your own location and file
		  
		 

		RequestSpecification request = RestAssured.given();
		//String requestBody = image.Generic_Image(data, context);
		Response response=request.header("Content-Type", "multipart/form-data").formParam("certificationId",data.get("certificationId") )
        .formParam("documentName", data.get("documentName"))
        .formParam("documentType",data.get("documentType")).multiPart("multipartFile",testUploadFile,"multipart/form-data")
		.log().all().post(data.get("endpoint"));
		
		
		//request.log().all().body(requestBody);
	//	System.out.println("bodyofff"+request.body(requestBody));
		//Response response = request.post(data.get("endpoint"));
		System.out.println("Response of Generic Images API: " + response.getBody().asString());

		
		

		JsonPath jsonPathEvaluator = response.jsonPath();

		// String vin=jsonPathEvaluator.get("data.vin");
		// List<Object> res_data = jsonPathEvaluator.get("data");
		// System.out.println(vin);
		int status_code = response.getStatusCode();

		
		
		  System.out.println(status_code); 
		  if(status_code!=200) {
			  String expectedMessage = jsonPathEvaluator.get("message"); 
			  String expectedErrorCode = jsonPathEvaluator.get("status"); 

			  
			  er.setCellData(sheetname, "expectedMessage", rowNum, String.valueOf(expectedMessage));
			  er.setCellData(sheetname, "expectedErrorCode", rowNum, String.valueOf(expectedErrorCode));
		  
		  }else {
		  
		  String message = jsonPathEvaluator.get("message"); 
		  String image_url=jsonPathEvaluator.get("data.image_url");
		  
		  
		  
		  
		  
		  er.setCellData(sheetname, "message", rowNum,String.valueOf(message)); 
		  
		 // er.setCellData(sheetname, "image_url", rowNum,String.valueOf(image_url)); 
		  
		  
		 
		//  ENGINE
		//  IMAGE_NUMBER1
		//  IMAGE_NUMBER2
		  System.out.println("doc name::--->"+data.get("documentName")+"running for-->"+rowNum);
		  
		  if(data.get("documentName").equalsIgnoreCase("VIN"))
		  {
			  er.setCellData("vehical", "vin_image", vin_image,String.valueOf(image_url)); 
			  vin_image=vin_image+1;

 
		  }
		  else if (data.get("documentName").equalsIgnoreCase("CHASSIS"))
		  
		  {
			  er.setCellData("vehical", "chasis_image", CHASSIS,String.valueOf(image_url)); 
			  CHASSIS=CHASSIS+1;
		  }
		  
		  else if (data.get("documentName").equalsIgnoreCase("FRONT"))
			  
		  {
			  er.setCellData("vehical", "rc_front_image", FRONT,String.valueOf(image_url)); 
			  FRONT = FRONT+1;

		  }
		  else if (data.get("documentName").equalsIgnoreCase("BACK"))
			  
		  {
			  er.setCellData("vehical", "rc_back_image", BACK,String.valueOf(image_url)); 
			  BACK=BACK+1;


		  }
		  else if (data.get("documentName").equalsIgnoreCase("INSURANCE"))
			  
		  {
			  System.out.println("INSURANCE row number"+INSURANCE);
			  er.setCellData("vehical", "insurance_image", INSURANCE,String.valueOf(image_url)); 
			  INSURANCE=INSURANCE+1;

		  }
		  else if (data.get("documentName").equalsIgnoreCase("ODOMETER"))
			  
		  {
			  er.setCellData("Interior", "odometerImage", ODOMETER, String.valueOf(image_url)); 
			  ODOMETER = ODOMETER+1;

		  }
		  else if (data.get("documentName").equals("IMAGE_NUMBER1") && data.get("documentType").equals("INTERIOR"))
			  
		  {
			  er.setCellData("Interior", "presignedURL", IMAGE_NUMBER1,String.valueOf(image_url)); 
			  IMAGE_NUMBER1=IMAGE_NUMBER1+1;


		  }
		  else if (data.get("documentName").equals("IMAGE_NUMBER1") && data.get("documentType").equals("PRICING_SUBMISSION_IMAGES"))
			  
		  {
			  er.setCellData("Rating_And_Pricing", "presignedURL", IMAGE_NUMBER2,String.valueOf(image_url)); 
			  IMAGE_NUMBER2=IMAGE_NUMBER2+1;

		  }
		  else if (data.get("documentName").equals("ENGINE"))
			  
		  {
			  er.setCellData("Engine", "engineImage", ENGINE,String.valueOf(image_url)); 
			  ENGINE=ENGINE+1;

		  }
		  
		  }
		  rowNum = rowNum+1;
		

	
		
			
			
		 
	
	
	}

}
