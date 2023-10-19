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

public class GetVehicleDetailsAPI {
	static ExcelReader er = new ExcelReader("./testdata/CreateNewEnq.xlsx");

	//ExcelReader er=new ExcelReader("");
	//static ExcelReader er = new ExcelReader("/Users/hanumaraddym/Documents/API_Workspace_Updated123/API_Workspace/gurenderkush_automation/New folder/api-automation/api-automation/testdata/vdsheet.xlsx");
	static int rowNum=2;
	@SuppressWarnings({ "unused", "static-access" })
	public static void Vehicle_Details_API1(Hashtable<String, String> data, ITestContext context, String sheetname)
	{
		//Map<String, Object> map = new HashMap<>();

		//aatrvjson vehicle_json1 = new aatrvjson();
		RequestSpecification request = RestAssured.given();
		String requestBody = GetVehicleDetailsJSON.vehicle_detail(data, context);
		request.header("Content-Type", "application/json;charset=UTF-8");
		request.header("token", "dR$545#h^jjmanJ");		
		
		request.body(requestBody);
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of all master API: "+response.getBody().asString());

		//request.body("");
		//System.out.println(context.getAttribute("Authorization"));
		
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
		
		//String vin=jsonPathEvaluator.get("data.vin");
		//List<Object> res_data = jsonPathEvaluator.get("data");
		//System.out.println(vin);
		int status_code = response.getStatusCode();
		System.out.println(status_code);
		
						
		
		System.out.println(status_code);
		if(status_code!=200) {
			
			String message = jsonPathEvaluator.get("message"); 
			  String API_Status = jsonPathEvaluator.get("status"); 

			  
			  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
	}
			  else {
				  
				  String message = jsonPathEvaluator.get("message"); 
			//	  String API_Status = jsonPathEvaluator.get("code"); 

				  
				  er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
				//  er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
				
				String CHASSIS = jsonPathEvaluator.get("result.CHASSIS");
				String COLOR = jsonPathEvaluator.get("result.COLOR");
				String COLOR_DESC = jsonPathEvaluator.get("result.COLOR_DESC");
				String ENGINE_NUMBER = jsonPathEvaluator.get("result.ENGINE_NUMBER");
				String EW_VALID_UPTO = jsonPathEvaluator.get("result.EW_VALID_UPTO");
				String FUELTYPE_CD = jsonPathEvaluator.get("result.FUELTYPE_CD");
				String FUEL_TYPE = jsonPathEvaluator.get("result.FUEL_TYPE");
				String LAST_ODOMETER_READING = jsonPathEvaluator.get("result.LAST_ODOMETER_READING");
				String M = jsonPathEvaluator.get("result.M");
				String MARUTI = jsonPathEvaluator.get("result.MARUTI");
				String MODEL_CD = jsonPathEvaluator.get("result.MODEL_CD");
				String MODEL_DESC = jsonPathEvaluator.get("result.MODEL_DESC");
				String SRL_NUM = jsonPathEvaluator.get("result.SRL_NUM");
				String TV_WARRANTY_VALID_UPTO = jsonPathEvaluator.get("result.TV_WARRANTY_VALID_UPTO");
				String UNAUTH_FITMENT = jsonPathEvaluator.get("result.UNAUTH_FITMENT");
				String VARIANT_CD = jsonPathEvaluator.get("result.VARIANT_CD");
				String VARIANT_DESC = jsonPathEvaluator.get("result.VARIANT_DESC");
				String VIN_NUMBER = jsonPathEvaluator.get("result.VIN_NUMBER");
				String YOM = jsonPathEvaluator.get("result.YOM");
				String REG_NUM=jsonPathEvaluator.get("result.REG_NUM");
				
				
				
				  er.setCellData("CreateNewEnq", "searchWithVin", rowNum, String.valueOf(VIN_NUMBER));

				System.out.println("REG_NUM---->"+REG_NUM);
				
				//create new enq sheet
				  er.setCellData("CreateNewEnq", "registrationNumber", rowNum, String.valueOf(REG_NUM));
				  
				  er.setCellData("Refurbishment_Cost", "registrationNumber", rowNum, String.valueOf(REG_NUM));
				  er.setCellData("Rating_And_Pricing", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  
				  er.setCellData("vehical", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("Exterior", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("Interior", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("TestDrive", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("Engine", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("Functions", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				  er.setCellData("Frames", "registrationNumber", rowNum, String.valueOf(REG_NUM));

				 
				  
				  er.setCellData("Rating_And_Pricing", "searchWithVin", rowNum, String.valueOf(VIN_NUMBER));
				  


				  //rto
				  er.setCellData("RTO", "regNo", rowNum, String.valueOf(REG_NUM));

				
				  //vihecle sheet
				  
				  if(MARUTI.equals("MARUTI"))
				  {
				  er.setCellData("vehical", "manufacturer", rowNum, String.valueOf("MSIL"));
				  }
				  
				  er.setCellData("vehical", "vin_number", rowNum, String.valueOf(VIN_NUMBER));
				  
				  er.setCellData("vehical", "chasis_number", rowNum, String.valueOf(CHASSIS));
				  er.setCellData("vehical", "engine_number", rowNum, String.valueOf(ENGINE_NUMBER));

				  er.setCellData("vehical", "ayear_of_manufacturing", rowNum, String.valueOf(YOM));
				  er.setCellData("vehical", "date_of_registration", rowNum, String.valueOf(YOM));

				  
				  if(MARUTI.equals("MARUTI")) {
				  er.setCellData("vehical", "manufacturer_name", rowNum, String.valueOf("MSIL"));
				  }
				  
				  er.setCellData("vehical", "modelCode", rowNum, String.valueOf(MODEL_CD));


				  er.setCellData("vehical", "variantCode", rowNum, String.valueOf(VARIANT_CD));
				  
				  er.setCellData("vehical", "colorCode", rowNum, String.valueOf(COLOR));

				  er.setCellData("vehical", "variant_name", rowNum, String.valueOf(VARIANT_DESC));

				 

				  er.setCellData("vehical", "model_name", rowNum, String.valueOf(MODEL_DESC));

				  er.setCellData("vehical", "manufacturer_code", rowNum, String.valueOf(M));

				  er.setCellData("vehical", "colour", rowNum, String.valueOf(COLOR_DESC));

			
				  er.setCellData("vehical", "fuel_type", rowNum, String.valueOf(FUEL_TYPE));

				  er.setCellData("vehical", "ew_tv_warranty", rowNum, String.valueOf(TV_WARRANTY_VALID_UPTO));

		
			}
		 rowNum = rowNum+1;
		
		 
		
	}

}
