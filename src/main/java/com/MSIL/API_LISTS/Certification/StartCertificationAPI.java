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

public class StartCertificationAPI {

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
		int status_code = response.getStatusCode();



		if(status_code!=200) {
			String message = jsonPathEvaluator.get("message");
			er.setCellData(sheetname, "message", rowNum, String.valueOf(message));
		}else {

			String certificationId =jsonPathEvaluator.get("data.certificationId");
			String evaluationId =jsonPathEvaluator.get("data.evaluationId");
			String enquiryId =jsonPathEvaluator.get("data.enquiryId");
			String stageCode =jsonPathEvaluator.get("data.stageCode");
			// String certStartDate =jsonPathEvaluator.get("data.certStartDate");
			// String lastOdometerReading =jsonPathEvaluator.get("data.lastOdometerReading");
			Boolean msilVehicle =jsonPathEvaluator.get("data.msilVehicle");
			Boolean trvVehicle =jsonPathEvaluator.get("data.trvVehicle");


			System.out.println("------------>"+certificationId+" "+evaluationId+" "+stageCode+" "+trvVehicle);
			er.setCellData(sheetname, "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("genericCertiImage", "certificationId", rowNum, String.valueOf(certificationId));

			er.setCellData(sheetname, "enquiryId", rowNum, String.valueOf(enquiryId));
			er.setCellData("CertExterior", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("vehical", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("Engine", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("Functions", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("Frames", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("Refurbishment_Cost", "certificationId", rowNum, String.valueOf(certificationId));
			er.setCellData("Rating_And_Pricing", "certificationId", rowNum, String.valueOf(certificationId));

			for(int i=1;i<=9;i++) {

				er.setCellData("genericCertiImage", "certificationId", rowNum1, String.valueOf(certificationId));
				er.setCellData("genericCertiImage", "endpoint", rowNum1, String.valueOf("/save/generic/image"));


				rowNum1 = rowNum1+1;

				i++;

			}


			rowNum++;


		}

	}


}
