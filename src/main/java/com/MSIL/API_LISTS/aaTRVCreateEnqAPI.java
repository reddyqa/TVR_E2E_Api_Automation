package com.MSIL.API_LISTS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.aaTRVNewEnqJson;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class aaTRVCreateEnqAPI {
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");
	
	static int rowNum = 2;
	static int rowNum1=2;
	static int vehicalrowNum=2;
	static int rowNum2=2;

	@SuppressWarnings({ "unused", "static-access" })
	public static void CreateEnqAPI(Hashtable<String, String> data, ITestContext context, String sheetname) {
		
		Map<String, Object> map = new HashMap<>();

		aaTRVNewEnqJson createnew = new aaTRVNewEnqJson();

		RequestSpecification request = RestAssured.given();
		String requestBody = createnew.new_enq11(data, context);
		request.header("Content-Type", "application/json");

		request.log().all().body(requestBody);
		System.out.println("bodyofff"+request.body(requestBody));
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of CreateEnq API: " + response.getBody().asString());




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
		  
			String evaluationId =jsonPathEvaluator.get("data.evaluationId"); 
			String enquiryId =jsonPathEvaluator.get("data.enquiryId"); 
			
			for(int i=1;i<=9;i++) {
		
					er.setCellData("genericImage", "evaluationId1", rowNum1, String.valueOf(evaluationId));
					er.setCellData("genericImage", "endpoint", rowNum1, String.valueOf("/save/generic/image"));


					rowNum1 = rowNum1+1;
				
				// i++;

			}
			
			for(int i=1;i<=14;i++) {
				
				er.setCellData("ExtImgUpload", "evaluationId", rowNum2, String.valueOf(evaluationId));
				er.setCellData("ExtImgUpload", "endpoint", rowNum2, String.valueOf("/save/exterior/image"));

				rowNum2 = rowNum2+1;
			}
			
		
			String endpoint="/save/evaluation";
			
			er.setCellData("vehical", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("vehical", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("vehical", "endpoint", rowNum, String.valueOf(endpoint));


			er.setCellData("Exterior", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Exterior", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Exterior", "endpoint", rowNum, String.valueOf(endpoint));

			
			
			er.setCellData("Interior", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Interior", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Interior", "endpoint", rowNum, String.valueOf(endpoint));



			er.setCellData("TestDrive", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("TestDrive", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("TestDrive", "endpoint", rowNum, String.valueOf(endpoint));

			
			er.setCellData("Engine", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Engine", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Engine", "endpoint", rowNum, String.valueOf(endpoint));

			
			er.setCellData("Functions", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Functions", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Functions", "endpoint", rowNum, String.valueOf(endpoint));

			
			er.setCellData("Frames", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Frames", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Frames", "endpoint", rowNum, String.valueOf(endpoint));

			
			
			er.setCellData("EvaluationDetailsByID", "evaluationId", rowNum, String.valueOf(evaluationId));

			
			er.setCellData("Refurbishment_Cost", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Refurbishment_Cost", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Refurbishment_Cost", "endpoint", rowNum, String.valueOf(endpoint));



			er.setCellData("Rating_And_Pricing", "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData("Rating_And_Pricing", "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("Rating_And_Pricing", "endpoint", rowNum, String.valueOf(endpoint));



			System.out.println("evaluationId  values: "+evaluationId);
			er.setCellData(sheetname, "evaluationId", rowNum, String.valueOf(evaluationId));
			er.setCellData(sheetname, "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData(sheetname, "message", rowNum, String.valueOf(message));

	
		} 
		rowNum = rowNum+1;
		vehicalrowNum=vehicalrowNum+1;
		//rowNum1 = rowNum1+1;


	}



}
