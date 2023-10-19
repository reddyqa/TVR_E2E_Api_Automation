package com.MSIL.API_LISTS.Certification;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Certification.Pending_Cert_List_Json;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Pending_Certifications_List_API {

static ExcelReader er = new ExcelReader("./testdata/Certification.xlsx");
	
	static int rowNum = 2;
	static int rowNum1=2;

	@SuppressWarnings({ "unused", "static-access" })
	public static void Pending_Certi_List_API(Hashtable<String, String> data, ITestContext context, String sheetname) {
		Map<String, Object> map = new HashMap<>();	
		Pending_Cert_List_Json Pending_Cert=new Pending_Cert_List_Json();
		RequestSpecification request = RestAssured.given();
		
		String requestBody = Pending_Cert.Pending_Cert(data, context);
		request.header("Content-Type", "application/json");

		request.log().all().body(requestBody);
		Response response = request.post(data.get("endpoint"));
		System.out.println("Response of AssignedEnquiriesList API: " + response.getBody().asString());

		


		JsonPath jsonPathEvaluator = response.jsonPath();

		 // String mspin = jsonPathEvaluator.get("data.mspin"); 
		  
		 

       

		//	 er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));
			 

		// JSONObject apiData = new JSONObject(response);

		    // Access the 'data' field in the response
		  //  JSONArray dataList = apiData.getJSONArray("data");
		    
		  //  System.out.println("dataList--->"+dataList.length());
		
		
		int status_code = response.getStatusCode();
		int j=2;
		
		 String vinNo1 =jsonPathEvaluator.get("data["+j+"].vehicleDetails.vinNo"); 

         System.out.println("vinNo--------->: "+vinNo1);

		  if(status_code!=200) {
			//  String message = jsonPathEvaluator.get("message"); 
			//  String API_Status = jsonPathEvaluator.get("status"); 

			  
			// er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
			 // er.setCellData(sheetname, "API_Status", rowNum, String.valueOf(API_Status));
		  }else {
			  
			  for(int i=1;i<=3;i++) {
				  try {
			  String mspin =jsonPathEvaluator.get("data["+i+"].mspin"); 

		         System.out.println("mspin: "+mspin);
				 String buyingId =jsonPathEvaluator.get("data["+i+"].buyingId"); 
				// String dealerCode =jsonPathEvaluator.get("data["+i+"].dealerCode"); 
		         System.out.println("buyingId: "+buyingId);

				 String rfSubmissionDate =jsonPathEvaluator.get("data["+i+"].rfSubmissionDate"); 
		         System.out.println("rfSubmissionDate: "+rfSubmissionDate);

				 String evaluatorName =jsonPathEvaluator.get("data["+i+"].evaluatorName"); 
		         System.out.println("evaluatorName: "+evaluatorName);

				// String evaluatedRFCost =jsonPathEvaluator.get("data["+i+"].evaluatedRFCost"); 
				 String buyingPrice =jsonPathEvaluator.get("data["+i+"].buyingPrice"); 
		         System.out.println("buyingPrice: "+buyingPrice);

				// String actualRFCost =jsonPathEvaluator.get("data["+i+"].actualRFCost"); 
		        // System.out.println("actualRFCost: "+actualRFCost);

				 String dmsStatus =jsonPathEvaluator.get("data["+i+"].dmsStatus"); 
		         System.out.println("dmsStatus: "+dmsStatus);

				 String referencePRice =jsonPathEvaluator.get("data["+i+"].referencePRice"); 
		         System.out.println("referencePRice: "+referencePRice);

				// String certificationId =jsonPathEvaluator.get("data["+i+"].certificationId"); 
				// String vehicleOnRoadPrice =jsonPathEvaluator.get("data["+i+"].vehicleOnRoadPrice"); 
				// String certStatus =jsonPathEvaluator.get("data["+i+"].certStatus"); 
		        // System.out.println("certStatus: "+certStatus);


				 String sellPrice =jsonPathEvaluator.get("data["+i+"].sellPrice"); 
				 String dealerMulCode =jsonPathEvaluator.get("data["+i+"].dealerMulCode"); 
				 String dealerMappedCode =jsonPathEvaluator.get("data["+i+"].dealerMappedCode"); 
				// String rejectionReason =jsonPathEvaluator.get("data["+i+"].rejectionReason"); 
				 String certificationDate =jsonPathEvaluator.get("data["+i+"].certificationDate"); 
				// String buyingDate =jsonPathEvaluator.get("data["+i+"].buyingDate"); 
				// String comments =jsonPathEvaluator.get("data["+i+"].comments"); 
		         System.out.println("certificationDate: "+certificationDate);


				 //vihecle deatils
				// String vehicleRegistrationNumber =jsonPathEvaluator.get("$.data[" + i + "].vehicleDetails.vehicleRegistrationNumber"); 

				 String vinNo =jsonPathEvaluator.get("data["+i+"].vehicleDetails.vinNo"); 

		        // System.out.println("vehicleRegistrationNumber: "+vehicleRegistrationNumber);
		         System.out.println("vinNo: "+vinNo);


				
			
				   
				 
		  
			// String message = jsonPathEvaluator.get("message"); 
			 // String mspin = jsonPathEvaluator.get("data.mspin"); 

			//	 er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));

				 
				 
				  }catch(Exception e) {
				         System.out.println("catch: ");

				  } 
			  }
		  }

	}


}
