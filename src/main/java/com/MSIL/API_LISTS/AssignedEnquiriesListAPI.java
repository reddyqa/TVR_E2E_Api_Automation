package com.MSIL.API_LISTS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.ITestContext;

import com.MSIL.JSON_Creation.AssignedEnquiriesListJson;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssignedEnquiriesListAPI {
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");
	
	static int rowNum = 2;

	@SuppressWarnings({ "unused", "static-access" })
	public static void assignedEnquiries(Hashtable<String, String> data, ITestContext context, String sheetname) {
		Map<String, Object> map = new HashMap<>();		
		AssignedEnquiriesListJson AssignedEnquiries=new AssignedEnquiriesListJson();
		RequestSpecification request = RestAssured.given();
		String requestBody = AssignedEnquiries.AssignedEnquiries(data, context);
		request.header("Content-Type", "application/json");

		request.log().all().body(requestBody);
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of AssignedEnquiriesList API: " + response.getBody().asString());

		


		JsonPath jsonPathEvaluator = response.jsonPath();

	
		int status_code = response.getStatusCode();
		
       
		//JSONObject jsonObject = new JSONObject(response);
        // String message = jsonObject.getString("message");
       //  System.out.println("Message: " + message);

        // JSONArray dataArray = jsonObject.getJSONArray("data");
		
		for(int i=0;i<=2;i++) {
         	String dealerCode =jsonPathEvaluator.get("data["+i+"].dealerCode"); 
         	String compFa =jsonPathEvaluator.get("data["+ i +"].compFa"); 
            System.out.println("compFa: "+compFa);

            System.out.println("dealerCode: "+dealerCode);

           System.out.println("i"+i);
	         	//String dealerCode =jsonPathEvaluator.get("data["+i+"].dealerCode"); 
	         	//String compFa =jsonPathEvaluator.get("data["+ i +"].compFa"); 
	         	/*String compCd =jsonPathEvaluator.get("data["+i+ "].compCd"); 
	         	String dealerMapCode =jsonPathEvaluator.get("data["+i+"].dealerMapCode"); 
	         	String DSEName =jsonPathEvaluator.get("data["+i+"].dealerCode"); 
	         	String enquiryId =jsonPathEvaluator.get("data["+i+"].enquiryId"); 
	         	
		            System.out.println("dealerCode: " + dealerCode+compFa+compCd+dealerMapCode);
*/

			//rowNum1 = rowNum1+1;
		
		//i++;

	}

	  

       
		
		String DSEName = jsonPathEvaluator.get("data[1].DSEName"); 
        System.out.println("DSEName " + DSEName);

		
		  if(status_code!=200) {
			  String message = jsonPathEvaluator.get("message"); 
			  String API_Status = jsonPathEvaluator.get("status"); 

			  
			  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  }else {
		  
			  String message = jsonPathEvaluator.get("message"); 
			  String API_Status = jsonPathEvaluator.get("status"); 


			  
			//  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			//  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  
			//  JSONObject jsonObject = new JSONObject(response);
	           // String message = jsonObject.getString("message");
	          //  System.out.println("Message: " + message);

	         //   JSONArray dataArray = jsonObject.getJSONArray("data");
	          
		  
		  } 
		  rowNum = rowNum+1;
		 

	}


}
