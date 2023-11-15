package com.MSIL.API_LISTS.Certification;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.testng.ITestContext;

import com.MSIL.TestUtils.ExcelReader;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CertExteriorImageUploadAPI
{

		static ExcelReader er = new ExcelReader("./testdata/Certification1.xlsx");

		static int rowNum = 2;
		static int h=2;

		static int dac = h-1;
		static String FinalData;
		//static StringBuilder str= new StringBuilder();
		static StringBuilder tempS3KeySTRBUld = new StringBuilder();
		static StringBuilder fixedS3KeySTRBUld= new StringBuilder();
		static StringBuilder tempS3UrlSTRBUld= new StringBuilder();
		static StringBuilder fixedS3UrlSTRBUld= new StringBuilder();
		static StringBuilder fixedS3PresignedUrlSTRBULd= new StringBuilder();
		static StringBuilder tempS3PresignedUrlSTRBUld= new StringBuilder();
		static StringBuilder tempS3PresignedUrlExpDtSTRBuld= new StringBuilder();
		static StringBuilder fixedS3PresignedUrlExpDtSTRBuld= new StringBuilder();

		@SuppressWarnings({"unused"})
		public static void uploadCertEximg(Hashtable<String, String> data, ITestContext context, String sheetname)
		{

			Map<String, Object> map = new HashMap<>();
			File testUploadFile = new File(data.get("multipartFile")); //Specify your own location and file
			RequestSpecification request = RestAssured.given().log().all();
			//String requestBody = ExteriorImageUploadJson.ExteriorImageUploadAPI(data, context);
			request.header("Content-Type", "multipart/form-data")
			.formParam("certificationId", data.get("certificationId"))
			.formParam("documentName", data.get("documentName"))
			.formParam("documentType", data.get("documentType"))
			.multiPart("multipartFile",testUploadFile,"multipart/form-data")
			.log().all().post(data.get("endpoint"));

			System.out.println("certificationId->"+data.get("certificationId"));


			//request.log().all().body(requestBody);
			//	System.out.println("bodyofff"+request.body(requestBody));
			Response response = request.log().all().post(data.get("endpoint"));
			System.out.println("Response of all master API: " + response.getBody().asString());


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
				  
				  


				
				String certificationId =jsonPathEvaluator.get("message"); 
				String fileName=jsonPathEvaluator.get("data.imageS3Info.fileName");
				String fileExtension=jsonPathEvaluator.get("data.imageS3Info.fileExtension");
				String fileType=jsonPathEvaluator.get("data.imageS3Info.fileType");
				String documentName=jsonPathEvaluator.get("data.imageS3Info.documentName");

				/*String tempS3Key=jsonPathEvaluator.get("data.imageS3Info.tempS3Key");
				String fixedS3Key=jsonPathEvaluator.get("data.imageS3Info.fixedS3Key");
				String tempS3Url=jsonPathEvaluator.get("data.imageS3Info.tempS3Url");
				String fixedS3Url=jsonPathEvaluator.get("data.imageS3Info.fixedS3Url");
				*/
				String fixedS3PresignedUrl=jsonPathEvaluator.get("data.imageS3Info.fixedS3PresignedUrl");
				/*String tempS3PresignedUrl=jsonPathEvaluator.get("data.imageS3Info.tempS3PresignedUrl");
				long fixedS3PresignedUrlExpDt=jsonPathEvaluator.get("data.imageS3Info.fixedS3PresignedUrlExpDt");
				long tempS3PresignedUrlExpDt=jsonPathEvaluator.get("data.imageS3Info.tempS3PresignedUrlExpDt");
				
				String fixedS3PresignedUrlExpDtStr = Long.toString(fixedS3PresignedUrlExpDt);
				String tempS3PresignedUrlExpDtStr = Long.toString(tempS3PresignedUrlExpDt);
				*/
				
				System.out.println("presignedurl"+ fixedS3PresignedUrl);
				
			/*
				String isDefect=jsonPathEvaluator.get("data.imageS3Info.isDefect");
				String totalCost=jsonPathEvaluator.get("data.imageS3Info.totalCost");
				String damageImageURLs=jsonPathEvaluator.get("data.imageS3Info.damageImageURLs");
				String discountedCost=jsonPathEvaluator.get("data.imageS3Info.discountedCost");
			*/

				

			
				
				/*tempS3KeySTRBUld=tempS3KeySTRBUld.append(tempS3Key).append(",");
				fixedS3KeySTRBUld=fixedS3KeySTRBUld.append(fixedS3Key).append(",");
				tempS3UrlSTRBUld=tempS3UrlSTRBUld.append(tempS3Url).append(",");
				fixedS3UrlSTRBUld=fixedS3UrlSTRBUld.append(fixedS3Url).append(",");
				*/
				fixedS3PresignedUrlSTRBULd=fixedS3PresignedUrlSTRBULd.append(fixedS3PresignedUrl).append(",");
				/*tempS3PresignedUrlSTRBUld=tempS3PresignedUrlSTRBUld.append(tempS3PresignedUrl).append(",");
				tempS3PresignedUrlExpDtSTRBuld=tempS3PresignedUrlExpDtSTRBuld.append(fixedS3PresignedUrlExpDtStr).append(",");
				fixedS3PresignedUrlExpDtSTRBuld=fixedS3PresignedUrlExpDtSTRBuld.append(tempS3PresignedUrlExpDtStr).append(",");
				*/
			

				//FinalData=tempS3Key+","+tempS3Url+","+fixedS3Url+","+fixedS3PresignedUrl+","+tempS3PresignedUrl;
				FinalData=fixedS3PresignedUrl;

				er.setCellData(sheetname, "UploadedData", rowNum, String.valueOf(FinalData));
				//  String extData= str.append(fileName+":reddy").toString();
				System.out.println("extData--------->+extData"+FinalData); 



				if((rowNum-1)%14==0)//num % 14 == 0:
				{



					/*er.setCellData("Exterior", "tempS3Key", h, String.valueOf(tempS3KeySTRBUld));
					er.setCellData("Exterior", "fixedS3Key", h, String.valueOf(fixedS3KeySTRBUld));
					
					er.setCellData("Exterior", "tempS3Url", h, String.valueOf(tempS3UrlSTRBUld));
					er.setCellData("Exterior", "fixedS3Url", h, String.valueOf(fixedS3UrlSTRBUld));
					*/
					er.setCellData("CertExterior", "fixedS3PresignedUrl", h, String.valueOf(fixedS3PresignedUrlSTRBULd));
					/*er.setCellData("Exterior", "tempS3PresignedUrl", h, String.valueOf(tempS3PresignedUrlSTRBUld));
					
					er.setCellData("Exterior", "tempS3PresignedUrlExpDt", h, String.valueOf(tempS3PresignedUrlExpDtSTRBuld));
					er.setCellData("Exterior", "fixedS3PresignedUrlExpDt", h, String.valueOf(fixedS3PresignedUrlExpDtSTRBuld));
					*/
					//  er.setCellData("Exterior", "adfileType", h, String.valueOf(fileType1));
					tempS3KeySTRBUld=new StringBuilder();
					fixedS3KeySTRBUld=new StringBuilder();
					tempS3UrlSTRBUld=new StringBuilder();
					fixedS3UrlSTRBUld=new StringBuilder();
					fixedS3PresignedUrlSTRBULd=new StringBuilder();
					tempS3PresignedUrlSTRBUld=new StringBuilder();
					tempS3PresignedUrlExpDtSTRBuld=new StringBuilder();
					fixedS3PresignedUrlExpDtSTRBuld=new StringBuilder();
					
					
					
					


					h=h+1;
					// dac=dac+1;
				}


				//String fixedS3PresignedUrlExpDt=jsonPathEvaluator.get("data.imageS3Info.fixedS3PresignedUrlExpDt");
				//String tempS3PresignedUrlExpDt=jsonPathEvaluator.get("data.imageS3Info.tempS3PresignedUrlExpDt");

				// er.setCellData("Exterior", "fileName", h, String.valueOf(extData));


				//System.out.println("extData--------->+extData"+extData); 

			}

			rowNum = rowNum+1;




		}


	}



