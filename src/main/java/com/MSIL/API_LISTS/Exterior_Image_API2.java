package com.MSIL.API_LISTS;

import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.ITestContext;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Exterior_Image_API2 {
	
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");
	//static ExcelReader er = new ExcelReader("/Users/hanumaraddym/Documents/Apr2023WS/api-automation/testdata/CreateNewEnq.xlsx");

	static int rowNum = 2;
	
	
	@SuppressWarnings({ "unused", "static-access", "unchecked" }) 
	public static void Image(Hashtable<String, String> data, ITestContext context, String sheetname) {
		
		Map<String, Object> map = new HashMap<>();

		//Upload_Generic_Image_JSON image = new Upload_Generic_Image_JSON();
		
		///Users/hanumaraddym/Documents/Apr2023WS/api-automation/testdata/Generic_Images/VIN.jpg
		
		 File testUploadFile = new File(data.get("multipartFile")); //Specify your own location and file
		  

		RequestSpecification request = RestAssured.given();
		//String requestBody = image.Generic_Image(data, context);
		request.header("Content-Type", "multipart/form-data").formParam("evaluationId", data.get("evaluationId"))
        .formParam("documentName", data.get("documentName"))
        .multiPart("multipartFile",testUploadFile,"multipart/form-data")
		
			
        .log().all().post(data.get("endpoint"));
		
		//request.log().all().body(requestBody);
	//	System.out.println("bodyofff"+request.body(requestBody));
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of all master API: " + response.getBody().asString());

		
		
		// request.body("");
		// System.out.println(context.getAttribute("Authorization"));

		/*
		 * float f = Float.parseFloat(data.get("expectedErrorCode")); int v = (int) f;
		 * System.out.println("Response of all possible values: "+response.getBody().
		 * asString());
		 */
		/*
		 * if(v==200) { re.verify_Response(response,
		 * data.get("expectedErrorCode"),data.get("expectedMessage")); }else {
		 * re.verify_Response_1(response, data.get("expectedErrorCode"),
		 * data.get("expectedMessage")); }
		 */

		JsonPath jsonPathEvaluator = response.jsonPath();

		// String vin=jsonPathEvaluator.get("data.vin");
		// List<Object> res_data = jsonPathEvaluator.get("data");
		// System.out.println(vin);
		int status_code = response.getStatusCode();
		System.out.println(status_code);

		
		
		  System.out.println(status_code); if(status_code!=200) {
		  LinkedHashMap<String,String> hm = new LinkedHashMap<String,String>(); hm =
		  (LinkedHashMap<String, String>) jsonPathEvaluator.getList("errors").get(0);
		  
		  er.setCellData(sheetname, "errorMessage", rowNum, hm.get("errorMessage"));
		  
		  }else {
		  
		  String message = jsonPathEvaluator.get("message"); 
		  String image_url=jsonPathEvaluator.get("data.image_url");
		  
		  
		  
		  
		  
		  er.setCellData(sheetname, "message", rowNum,String.valueOf(message)); 
		  
		  er.setCellData(sheetname, "image_url", rowNum,String.valueOf(image_url)); 
		  
		  
		 
		//  ENGINE
		//  IMAGE_NUMBER1
		//  IMAGE_NUMBER2
		  System.out.println("doc name"+data.get("documentName"));
		  if(data.get("documentName").equalsIgnoreCase("VIN"))
		  {
			  er.setCellData("vehical", "vin_image", rowNum,String.valueOf(image_url)); 
 
		  }
		  else if (data.get("documentName").equalsIgnoreCase("CHASSIS"))
		  
		  {
			  er.setCellData("vehical", "chasis_image", rowNum,String.valueOf(image_url)); 

		  }
		  
		  else if (data.get("documentName").equalsIgnoreCase("FRONT"))
			  
		  {
			  er.setCellData("vehical", "rc_front_image", rowNum,String.valueOf(image_url)); 

		  }
		  else if (data.get("documentName").equalsIgnoreCase("BACK"))
			  
		  {
			  er.setCellData("vehical", "rc_back_image", rowNum,String.valueOf(image_url)); 

		  }
		  else if (data.get("documentName").equalsIgnoreCase("INSURANCE"))
			  
		  {
			  er.setCellData("vehical", "insurance_image", rowNum,String.valueOf(image_url)); 

		  }
		  else if (data.get("documentName").equalsIgnoreCase("ODOMETER"))
			  
		  {
			  er.setCellData("vehical", "rc_back_image", rowNum,String.valueOf(image_url)); 

		  }
		  else if (data.get("documentName").equalsIgnoreCase("IMAGE_NUMBER1"))
			  
		  {
			  er.setCellData("vehical", "insurance_image", rowNum,String.valueOf(image_url)); 

		  }
		  
		  }
		  rowNum = rowNum+1;
		 

	}


}
