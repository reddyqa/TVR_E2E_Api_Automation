package com.MSIL.API_LISTS.Certification;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.ExteriorJson;
import com.MSIL.JSON_Creation.Certification.CertExteriorJson;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CertExteriorImagesAPI 
{
	
	static ExcelReader er = new ExcelReader("./testdata/Certification1.xlsx");
	//static ExcelReader er = new ExcelReader("/Users/hanumaraddym/Documents/Apr2023WS/api-automation/testdata/CreateNewEnq.xlsx");

	static int rowNum = 2;

	@SuppressWarnings({ "unused", "static-access", "unchecked" })
	public static void extApi(Hashtable<String, String> data, ITestContext context, String sheetname) {
		// ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");

		// static ExcelReader er = new
		// ExcelReader("/Users/hanumaraddym/Documents/Apr2023WS/api-automation/testdata/CreateNewEnq.xlsx");

		Map<String, Object> map = new HashMap<>();

		CertExteriorJson certExteriorJson = new CertExteriorJson(); //change

		RequestSpecification request = RestAssured.given();
		String requestBody = certExteriorJson.exteriorDetails(data, context);// change
		request.header("Content-Type", "application/json");
		
		System.out.println("requestBody"+requestBody);
		
		request.log().all().body(requestBody);
		System.out.println("bodyofff"+request.body(requestBody));
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
		
		 
		  
		  
		  } rowNum = rowNum+1;
		 


}


}
