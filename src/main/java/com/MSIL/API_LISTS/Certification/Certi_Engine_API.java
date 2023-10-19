package com.MSIL.API_LISTS.Certification;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Certification.Certi_Engine_Json;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Certi_Engine_API {
	
	
	static ExcelReader er = new ExcelReader("./testdata/Certification.xlsx");

	static int rowNum = 2;

	@SuppressWarnings({ "unused", "static-access" })
	public static void EngineAPI1(Hashtable<String, String> data, ITestContext context, String sheetname) {
	

		Map<String, Object> map = new HashMap<>();

		Certi_Engine_Json engine = new Certi_Engine_Json();

		RequestSpecification request = RestAssured.given(); 
		
		String requestBody = engine.Engine(data, context);
		
		request.header("Content-Type", "application/json");

		request.log().all().body(requestBody);
		System.out.println("bodyofff"+request.body(requestBody));
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of all master API: " + response.getBody().asString());

	
		JsonPath jsonPathEvaluator = response.jsonPath();

		int status_code = response.getStatusCode();
		System.out.println(status_code);

		
		  System.out.println(status_code); 
		  if(status_code!=200) {
			  String message = jsonPathEvaluator.get("message"); 
			  String API_Status = jsonPathEvaluator.get("status"); 

			  
			  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  }else {
		  
			  String message = jsonPathEvaluator.get("message"); 
			  String API_Status = jsonPathEvaluator.get("status"); 

			  
			  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  
			/*
			 * er.setCellData(sheetname, "evaluationId", rowNum,
			 * String.valueOf(evaluationId)); er.setCellData(sheetname, "enquiryId", rowNum,
			 * String.valueOf(enquiryId)); er.setCellData(sheetname, "message", rowNum,
			 * String.valueOf(message));
			 */
		 
		  
		  
		  
		  
		  
		  } rowNum = rowNum+1;
		 

	}

	
	

}
