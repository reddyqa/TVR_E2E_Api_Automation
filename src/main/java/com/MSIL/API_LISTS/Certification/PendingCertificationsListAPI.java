package com.MSIL.API_LISTS.Certification;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.JSON_Creation.Certification.Pending_Cert_List_Json;
import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PendingCertificationsListAPI {

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
		int status_code = response.getStatusCode();
		int j=0;
		if(status_code!=200) {
			String message = jsonPathEvaluator.get("message");
		}else {

			for(int i=0;i<=7;i++) {

				String mspin =jsonPathEvaluator.get("data.get("+i+").mspin");
				System.out.println("---mspin>"+mspin);

				String buyingId =jsonPathEvaluator.get("data.get("+i+").buyingId");
				String rfSubmissionDate =jsonPathEvaluator.get("data.get("+i+").rfSubmissionDate");
				String evaluatorName =jsonPathEvaluator.get("data.get("+i+").evaluatorName");
				String evaluatedRFCost =jsonPathEvaluator.get("data.get("+i+").evaluatedRFCost");


				Double buyingPrice = jsonPathEvaluator.getDouble("data.get("+i+").buyingPrice");
				int actualRFCost =jsonPathEvaluator.getInt("data.get("+i+").actualRFCost");
				String dmsStatus =jsonPathEvaluator.get("data.get("+i+").dmsStatus");


				String referencePRice =jsonPathEvaluator.get("data.get("+i+").referencePRice");
				String certificationId =jsonPathEvaluator.get("data.get("+i+").certificationId");
				int sellPrice =jsonPathEvaluator.getInt("data.get("+i+").sellPrice");
				System.out.println("---sellPrice>"+sellPrice);
				String dealerMulCode =jsonPathEvaluator.get("data.get("+i+").dealerMulCode");
				System.out.println("---dealerMulCode>"+dealerMulCode);

				String dealerMappedCode =jsonPathEvaluator.get("data.get("+i+").dealerMappedCode");

				String certificationDate =jsonPathEvaluator.get("data.get("+i+").certificationDate");
				String buyingDate =jsonPathEvaluator.get("data.get("+i+").buyingDate");
				String comments =jsonPathEvaluator.get("data.get("+i+").comments");
				System.out.println("---comments>"+comments);

				//vihecle deatils

				String vinNo =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.vinNo");
				String vehicleRegistrationNumber =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.vehicleRegistrationNumber");
				String chasisNo =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.chasisNo");
				String engineNo =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.engineNo");
				String modelDesc =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.modelDesc");
				String variant =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.variant");
				String manufacturer =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.manufacturer");
				String manufacturerCode =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.manufacturerCode");
				String model =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.model");
				String modelCode =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.modelCode");
				String variantCode =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.variantCode");
				String color =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.color");
				String colorCode =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.colorCode");
				boolean  trvVehicle =jsonPathEvaluator.getBoolean("data.get("+i+").vehicleDetails.trvVehicle");
				String ewValidUpto =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.ewValidUpto");
				String tvWarValidUpto =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.tvWarValidUpto");
				String scrapFlag =jsonPathEvaluator.get("data.get("+i+").vehicleDetails.scrapFlag");
				System.out.println("--->"+scrapFlag);


				//----->>registrationNumber
				er.setCellData("CertExterior", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("vehical", "registration_number", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Engine", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Functions", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Frames", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Refurbishment_Cost", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Rating_And_Pricing", "registrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));

				//----->>mspin
				er.setCellData("CertExterior", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("vehical", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Engine", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Functions", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Frames", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Refurbishment_Cost", "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Rating_And_Pricing", "mspin", rowNum, String.valueOf(mspin));



				er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));
				er.setCellData("Start_Certification", "mspin", rowNum, String.valueOf(mspin));


				er.setCellData(sheetname, "evaluatorName", rowNum, String.valueOf(evaluatorName));
				er.setCellData("Start_Certification", "evaluatorName", rowNum, String.valueOf(evaluatorName));

				er.setCellData(sheetname, "buyingId", rowNum, String.valueOf(buyingId));
				er.setCellData("Start_Certification", "buyingId", rowNum, String.valueOf(buyingId));

				er.setCellData(sheetname, "actualRFCost", rowNum, String.valueOf(actualRFCost));
				er.setCellData("Start_Certification", "actualRFCost", rowNum, String.valueOf(actualRFCost));

				er.setCellData(sheetname, "dmsStatus", rowNum, String.valueOf(dmsStatus));
				er.setCellData("Start_Certification", "dmsStatus", rowNum, String.valueOf(dmsStatus));

				er.setCellData(sheetname, "evaluatedRFCost", rowNum, String.valueOf(evaluatedRFCost));
				er.setCellData("Start_Certification", "evaluatedRFCost", rowNum, String.valueOf(evaluatedRFCost));

				er.setCellData(sheetname, "buyingPrice", rowNum, String.valueOf(buyingPrice));
				er.setCellData("Start_Certification", "buyingPrice", rowNum, String.valueOf(buyingPrice));

				er.setCellData(sheetname, "referencePRice", rowNum, String.valueOf(referencePRice));
				er.setCellData(sheetname, "certificationId", rowNum, String.valueOf(certificationId));
				er.setCellData("Start_Certification", "certificationId", rowNum, String.valueOf(certificationId));

				er.setCellData(sheetname, "sellPrice", rowNum, String.valueOf(sellPrice));
				er.setCellData(sheetname, "dealerMulCode", rowNum, String.valueOf(dealerMulCode));
				er.setCellData(sheetname, "dealerMappedCode", rowNum, String.valueOf(dealerMappedCode));
				er.setCellData(sheetname, "certificationDate", rowNum, String.valueOf(certificationDate));
				er.setCellData(sheetname, "buyingDate", rowNum, String.valueOf(buyingDate));
				er.setCellData("Start_Certification", "buyingDate", rowNum, String.valueOf(buyingDate));

				er.setCellData(sheetname, "comments", rowNum, String.valueOf(comments));
				er.setCellData(sheetname, "vinNo", rowNum, String.valueOf(vinNo));
				er.setCellData("Start_Certification", "vinNo", rowNum, String.valueOf(vinNo));

				er.setCellData(sheetname, "vehicleRegistrationNumber", rowNum, String.valueOf(vehicleRegistrationNumber));
				er.setCellData("Start_Certification", "regNo", rowNum, String.valueOf(vehicleRegistrationNumber));

				er.setCellData(sheetname, "chasisNo", rowNum, String.valueOf(chasisNo));
				er.setCellData("Start_Certification", "chassisNo", rowNum, String.valueOf(chasisNo));

				er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));
				er.setCellData(sheetname, "engineNo", rowNum, String.valueOf(engineNo));
				er.setCellData("Start_Certification", "engineNo", rowNum, String.valueOf(engineNo));

				er.setCellData(sheetname, "modelDesc", rowNum, String.valueOf(modelDesc));
				er.setCellData(sheetname, "variant", rowNum, String.valueOf(variant));//variantName
				er.setCellData("Start_Certification", "variantName", rowNum, String.valueOf(variant));

				er.setCellData(sheetname, "mspin", rowNum, String.valueOf(mspin));
				er.setCellData(sheetname, "manufacturer", rowNum, String.valueOf(manufacturer));
				er.setCellData("Start_Certification", "manufacturer", rowNum, String.valueOf(manufacturer));
				er.setCellData(sheetname, "manufacturerCode", rowNum, String.valueOf(manufacturerCode));
				er.setCellData(sheetname, "model", rowNum, String.valueOf(model));
				er.setCellData("Start_Certification", "modelName", rowNum, String.valueOf(model));

				er.setCellData(sheetname, "variantCode", rowNum, String.valueOf(variantCode));
				er.setCellData("Start_Certification", "variantCode", rowNum, String.valueOf(variantCode));

				er.setCellData(sheetname, "color", rowNum, String.valueOf(color));
				er.setCellData("Start_Certification", "color", rowNum, String.valueOf(color));

				er.setCellData(sheetname, "colorCode", rowNum, String.valueOf(colorCode));
				er.setCellData("Start_Certification", "colorCode", rowNum, String.valueOf(colorCode));

				er.setCellData(sheetname, "trvVehicle", rowNum, String.valueOf(trvVehicle));
				er.setCellData(sheetname, "ewValidUpto", rowNum, String.valueOf(ewValidUpto));
				er.setCellData(sheetname, "tvWarValidUpto", rowNum, String.valueOf(tvWarValidUpto));
				er.setCellData(sheetname, "scrapFlag", rowNum, String.valueOf(scrapFlag));

				er.setCellData(sheetname, "modelCode",rowNum, String.valueOf(modelCode));
				er.setCellData("Start_Certification", "modelCode", rowNum, String.valueOf(modelCode));

				rowNum++;
			}
		}

	}


}
