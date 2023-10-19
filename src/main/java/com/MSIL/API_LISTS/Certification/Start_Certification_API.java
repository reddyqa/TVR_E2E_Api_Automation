package com.MSIL.API_LISTS.Certification;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Certification.Pending_Cert_List_Json;
import com.MSIL.JSON_Creation.Certification.Start_Certification_JSON;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Start_Certification_API {

static ExcelReader er = new ExcelReader("./testdata/Certification.xlsx");
	
	static int rowNum = 2;
	static int rowNum1=2;

	@SuppressWarnings({ "unused", "static-access" })
	public static void Start_CertificationAPI(Hashtable<String, String> data, ITestContext context, String sheetname) {
		Map<String, Object> map = new HashMap<>();	
		Start_Certification_JSON Start_Certifi=new Start_Certification_JSON();
		RequestSpecification request = RestAssured.given();
		
		String requestBody = Start_Certifi.Start_Certifi(data, context);
		request.header("Content-Type", "application/json");

		request.log().all().body(requestBody);
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of AssignedEnquiriesList API: " + response.getBody().asString());

		


		JsonPath jsonPathEvaluator = response.jsonPath();

		 String message = jsonPathEvaluator.get("message"); 
		 // String mspin = jsonPathEvaluator.get("data.mspin"); 
		  
		 
		 String mspin =jsonPathEvaluator.get("data[1].mspin"); 

         System.out.println("mspin: "+mspin);
		 String mspin1 =jsonPathEvaluator.get("data[2].evaluatorName"); 
         System.out.println("mspin: "+mspin1);

		  System.out.println("message"+message+"mspin"+"mspin"+"sheetname"+sheetname+"row"+rowNum);
		  

		//	 er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));
			 
			 er.setCellData(sheetname, "message", rowNum, String.valueOf(message));

		// JSONObject apiData = new JSONObject(response);

		    // Access the 'data' field in the response
		  //  JSONArray dataList = apiData.getJSONArray("data");
		    
		  //  System.out.println("dataList--->"+dataList.length());
		
		
		int status_code = response.getStatusCode();
		
   
		
		  if(status_code!=200) {
			//  String message = jsonPathEvaluator.get("message"); 
			//  String API_Status = jsonPathEvaluator.get("status"); 

			  
			// er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			 // er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  }else {
		  
			// String message = jsonPathEvaluator.get("message"); 
			 // String mspin = jsonPathEvaluator.get("data.mspin"); 

			//	 er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));

		  }

	}


}
