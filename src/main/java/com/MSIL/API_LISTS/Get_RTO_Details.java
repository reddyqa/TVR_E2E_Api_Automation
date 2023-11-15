package com.MSIL.API_LISTS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.GetVehicleDetailsJSON;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_RTO_Details {
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");

	//ExcelReader er=new ExcelReader("");
	//static ExcelReader er = new ExcelReader("/Users/hanumaraddym/Documents/API_Workspace_Updated123/API_Workspace/gurenderkush_automation/New folder/api-automation/api-automation/testdata/vdsheet.xlsx");
	static int rowNum=2;
	@SuppressWarnings({ "unused", "static-access" })
	public static void Get_RTO_Details_API(Hashtable<String, String> data, ITestContext context, String sheetname)
	{
		//Map<String, Object> map = new HashMap<>();

		//aatrvjson vehicle_json1 = new aatrvjson();
		RequestSpecification request = RestAssured.given();
		//String requestBody = GetVehicleDetailsJSON.vehicle_detail(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");

		
		//request.body(requestBody);
		Response response = request.get(data.get("endpoint")+data.get("regNo"));
		System.out.println("Response of all master API: "+response.getBody().asString());

		
		 
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
				
				String stateName = jsonPathEvaluator.get("data.stateName");
				String cityName = jsonPathEvaluator.get("data.cityName");
				String rtoLocationName = jsonPathEvaluator.get("data.rtoLocationName");
				
				er.setCellData("vehical", "registration_state", rowNum, String.valueOf(stateName));
				  
				  
				  
				  er.setCellData("vehical", "registration_city", rowNum, String.valueOf(cityName));
				  
				  

				  er.setCellData("vehical", "rto", rowNum, String.valueOf(rtoLocationName));
				
				

				
				  er.setCellData(sheetname, "stateName", rowNum, String.valueOf(stateName));
				  
				  
				  
				  er.setCellData(sheetname, "cityName", rowNum, String.valueOf(cityName));
				  
				  

				  er.setCellData(sheetname, "rtoLocationName", rowNum, String.valueOf(rtoLocationName));
				
					
			
		
			}
		 rowNum = rowNum+1;
		
		 
		
	}

}
