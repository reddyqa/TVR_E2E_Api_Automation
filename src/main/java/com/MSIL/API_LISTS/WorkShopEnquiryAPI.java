package com.MSIL.API_LISTS;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.WorkShopEnqJson;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WorkShopEnquiryAPI 
{
	
	static int rowNum = 2;
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");
	
	public static void workshopEnqAPI(Hashtable<String, String> data, ITestContext context, String sheetname) {

        Map<String, Object> map = new HashMap<>();

        RequestSpecification request = RestAssured.given();
        String requestBody = WorkShopEnqJson.workshopEnq(data, context);
        request.header("Content-Type", "application/json");
        request.queryParam("pageNo", "1");
        request.queryParam("pageSize", "100");

        request.log().all().body(requestBody);
        System.out.println("bodyofff" + request.body(requestBody));
        Response response = request.post(data.get("endpoint"));
        //System.out.println("Response of Workshop enquiry API: " + response.getBody().asString());
        
        
        JsonPath js= new JsonPath(response.asString());
        
        for(int i=0;i<5;i++)
        {
        	String dealerCode=js.get("data["+i+"].dealerCode").toString();
        	String regNo=js.get("data["+i+"].vehicleDetails.registrationNumber").toString();
        	
        	System.out.println(dealerCode);
        	System.out.println(regNo);
        	
    		int status_code = response.getStatusCode();
    		//System.out.println(status_code);
    		
        	if(status_code!=200) 
        	{
  			  String message = js.get("message"); 
  			  String API_Status = js.get("status"); 

  			  
  			  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
  			  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
  		  
  		  }else {
  			  
  			  //er.setCellData("CreateNewEnq", "registrationNumber", rowNum, String.valueOf(regNo));
  			  er.setCellData("CreateNewEnq", "dealerCode", rowNum, String.valueOf(dealerCode));
  			  er.setCellData("GetVehicleDetailsReg", "regNo", rowNum, String.valueOf(regNo));	
        }
        
    		rowNum = rowNum+1;
        }

	}

}
