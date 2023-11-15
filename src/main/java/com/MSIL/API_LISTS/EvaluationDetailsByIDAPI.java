package com.MSIL.API_LISTS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;
import org.json.*;

import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EvaluationDetailsByIDAPI {

	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");

	static int rowNum = 2;
	static	String names = "";
	
	static StringBuilder namestrbul = new StringBuilder();
	static StringBuilder urlsstrbul= new StringBuilder();
	

	@SuppressWarnings({ "unused", "static-access" })
	public static void EvaluationDetails(Hashtable<String, String> data, ITestContext context, String sheetname) {
	

		Map<String, Object> map = new HashMap<>();

	

		RequestSpecification request = RestAssured.given(); 
		
		
		request.header("Content-Type", "application/json");

		
		Response response = request
				.get(data.get("endpoint")+"/"+data.get("evaluationId"));
		
		

		
       String body1=response.getBody().asString();
       System.out.println("body1"+body1);
		// assuming the API response is stored in a String variable called "response"
		JSONObject jsonObject = new JSONObject(body1);
		JSONArray vehicleImages = jsonObject.getJSONObject("data").getJSONObject("refurbishment").getJSONArray("vehicleImages");

		// Create empty strings to store the names and urls
		

		// Loop through each image object in the vehicleImages array and append its name and URL to the respective strings
		for (int i = 0; i < vehicleImages.length(); i++) {
		    JSONObject imageObject = vehicleImages.getJSONObject(i);
		    String name = imageObject.getString("name");
		    JSONArray urlArray = imageObject.getJSONArray("urls");
		    String url = urlArray.getString(0);
		    namestrbul=namestrbul.append(name).append(",");
		    urlsstrbul=urlsstrbul.append(url).append(",");;
		    
		    
		 
		}

		

		
		
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
			//  er.setCellData(sheetname, "name", rowNum, String.valueOf(namestrbul));
			//	er.setCellData(sheetname, "urls", rowNum, String.valueOf(urlsstrbul));


//before rf cost
		er.setCellData("Refurbishment_Cost", "name", rowNum, String.valueOf(namestrbul));
			er.setCellData("Refurbishment_Cost", "urls", rowNum, String.valueOf(urlsstrbul));
			  System.out.println("Names: " + namestrbul);
				System.out.println("URLs: " + urlsstrbul);
				System.out.println("Running:-->" + rowNum+" "+"evaluation");

				namestrbul=new StringBuilder();
				urlsstrbul=new StringBuilder();
				
				
				System.out.println("Running:-->" + rowNum+" "+"name:"+namestrbul);
				System.out.println("Running:-->" + rowNum+" "+"url:"+urlsstrbul);

	
			//final submition getting buying id
			  
		//	 String buyingId = jsonPathEvaluator.get("data.buyingId"); 

			
		//	er.setCellData("Rating_And_Pricing", "dmsbuyingId", rowNum, String.valueOf(buyingId));
		



			//System.out.println("Running:-->" + rowNum+" "+"evaluation:"+buyingId);

			
			





		} 
		rowNum = rowNum+1;
		


	}



}
