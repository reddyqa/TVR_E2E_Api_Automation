package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.RatingAndPricing_POJO.Certi_RatingandPricing_POJO;
import com.MSIL.POJO.Certification.RatingAndPricing_POJO.pricing;
import com.MSIL.POJO.Certification.RatingAndPricing_POJO.rating;
import com.MSIL.POJO.Certification.RatingAndPricing_POJO.uploadPhotoImage;
import com.MSIL.POJO.Certification.RatingAndPricing_POJO.uploadPhotoImagee;
import com.MSIL.POJO.Certification.RatingAndPricing_POJO.vehicleRating;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_RatingAndPricing_Json extends BaseSetup{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Rating_And_Pricing_Page(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		Certi_RatingandPricing_POJO Rating_And_Pricing1=new Certi_RatingandPricing_POJO();
		rating rating = new rating();
		vehicleRating vehicleRating1 = new vehicleRating();
		uploadPhotoImagee uploadImage = new uploadPhotoImagee();
		
		pricing pricing = new pricing();
		uploadPhotoImage uploadPhotoImage = new uploadPhotoImage();

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;


		while (itr.hasNext()) {

			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setCertificationId(null);
				} else {
					Rating_And_Pricing1.setCertificationId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setMspin(null);
				} else {
					Rating_And_Pricing1.setMspin(value);
				}
			}
			else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setRegistrationNumber(null);
				} else {
					Rating_And_Pricing1.setRegistrationNumber(value);
				}
			} 
			else if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEvaluationId(null);
				} else {
					Rating_And_Pricing1.setEvaluationId(value);
				}
			} 
			else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEnquiryId(null);
				} else {
					Rating_And_Pricing1.setEnquiryId(value);
				}
			} 
			else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setCarCondition(null);
				} else {
					Rating_And_Pricing1.setCarCondition(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setRegNumberFoundInDms(null);
				} else {
					Rating_And_Pricing1.setRegNumberFoundInDms(value);
				}
			} 
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setStageCode(null);
				} else {
					Rating_And_Pricing1.setStageCode(value);
				}
			} 
			
			// Vehicle Rating...
			
			else if (key.equals("exterior")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setExterior(null);
				} else {
					vehicleRating1.setExterior(value);
				}
			} 
			else if (key.equals("interior")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setInterior(null);
				} else {
					vehicleRating1.setInterior(value);
				}
			} 
			
			else if (key.equals("functions")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setFunctions(null);
				} else {
					vehicleRating1.setFunctions(value);
				}
			} 
			
			else if (key.equals("frames")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setFrames(null);
				} else {
					vehicleRating1.setFrames(value);
				}
			} 
			
			else if (key.equals("engine")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setEngine(null);
				} else {
					vehicleRating1.setEngine(value);
				}
			} 
			
			else if (key.equals("finalVehicleRating")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating1.setFinalVehicleRating(null);
				} else {
					vehicleRating1.setFinalVehicleRating(value);
				}
			} 
			
			// Rating....
			
			else if (key.equals("evaluatedRfCost")) {
				if (value.equals("null") || value.equals("")) {
					rating.setEvaluatedRfCost(null);
				} else {
					rating.setEvaluatedRfCost(value);
				}
			} 
			else if (key.equals("actualRfCost")) {
				if (value.equals("null") || value.equals("")) {
					rating.setActualRfCost(null);
				} else {
					rating.setActualRfCost(value);
				}
			} 
			else if (key.equals("vehicleOnRoadPrice")) {
				if (value.equals("null") || value.equals("")) {
					rating.setVehicleOnRoadPrice(null);
				} else {
					rating.setVehicleOnRoadPrice(value);
				}
			} 
			else if (key.equals("buyingPrice")) {
				if (value.equals("null") || value.equals("")) {
					rating.setBuyingPrice(null);
				} else {
					rating.setBuyingPrice(value);
				}
			} 
			else if (key.equals("certificationRating")) {
				if (value.equals("null") || value.equals("")) {
					rating.setCertificationRating(null);
				} else {
					rating.setCertificationRating(value);
				}
			} 
			else if (key.equals("nonTrueValue")) {
				if (value.equals("null") || value.equals("")) {
					rating.setNonTrueValue(null);
				} else {
					rating.setNonTrueValue(value);
				}
			} 
			else if (key.equals("vehicleCategoryInput")) {
				if (value.equals("null") || value.equals("")) {
					rating.setVehicleCategoryInput(null);
				} else {
					rating.setVehicleCategoryInput(value);
				}
			} 
			else if (key.equals("trueValueChecklistDone")) {
				if (value.equals("null") || value.equals("")) {
					rating.setTrueValueChecklistDone(null);
				} else {
					rating.setTrueValueChecklistDone(value);
				}
			} 
			else if (key.equals("trueValueChecklistImage")) {
				if (value.equals("null") || value.equals("")) {
					rating.setTrueValueChecklistImage(null);
				} else {
					rating.setTrueValueChecklistImage(value);
				}
			} 
			
			// uploadPhotoImagee
			
			else if (key.equals("type")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setType(null);
				} else {
					uploadImage.setType(value);
				}
			} 
			else if (key.equals("name")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setName(null);
				} else {
					uploadImage.setName(value);
				}
			} 
			else if (key.equals("presignedURL")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setPresignedURL(null);
				} else {
					uploadImage.setPresignedURL(value);
				}
			} 
			else if (key.equals("documentCategory")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setDocumentCategory(null);
				} else {
					uploadImage.setDocumentCategory(value);
				}
			} 
			else if (key.equals("documentType")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setDocumentType(null);
				} else {
					uploadImage.setDocumentType(value);
				}
			} 
			else if (key.equals("documentName")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setDocumentName(null);
				} else {
					uploadImage.setDocumentName(value);
				}
			} 
			else if (key.equals("fileName")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFileName(null);
				} else {
					uploadImage.setFileName(value);
				}
			} 
			else if (key.equals("fileExtension")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFileExtension(null);
				} else {
					uploadImage.setFileExtension(value);
				}
			} 
			else if (key.equals("fileType")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFileType(null);
				} else {
					uploadImage.setFileType(value);
				}
			} 
			else if (key.equals("tempS3Key")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setTempS3Key(null);
				} else {
					uploadImage.setTempS3Key(value);
				}
			} 
			else if (key.equals("fixedS3Key")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFixedS3Key(null);
				} else {
					uploadImage.setFixedS3Key(value);
				}
			} 
			else if (key.equals("tempS3Url")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setTempS3Url(null);
				} else {
					uploadImage.setTempS3Url(value);
				}
			} 
			else if (key.equals("fixedS3Url")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFixedS3Url(null);
				} else {
					uploadImage.setFixedS3Url(value);
				}
			} 
			else if (key.equals("fixedS3PresignedUrl")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFixedS3PresignedUrl(null);
				} else {
					uploadImage.setFixedS3PresignedUrl(value);
				}
			} 
			else if (key.equals("tempS3PresignedUrl")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setTempS3PresignedUrl(null);
				} else {
					uploadImage.setTempS3PresignedUrl(value);
				}
			} 
			else if (key.equals("fixedS3PresignedUrlExpDt")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setFixedS3PresignedUrlExpDt(null);
				} else {
					uploadImage.setFixedS3PresignedUrlExpDt(value);
				}
			} 
			else if (key.equals("tempS3PresignedUrlExpDt")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setTempS3PresignedUrlExpDt(null);
				} else {
					uploadImage.setTempS3PresignedUrlExpDt(value);
				}
			} 
			else if (key.equals("isAccepted")) {
				if (value.equals("null") || value.equals("")) {
					uploadImage.setIsAccepted(null);
				} else {
					uploadImage.setIsAccepted(value);
				}
			} 
			
			// pricing
			
			else if (key.equals("customerExpectedPrice")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setCustomerExpectedPrice(null);
				} else {
					pricing.setCustomerExpectedPrice(value);
				}
			} 
			else if (key.equals("evaluatorQuotedPrice")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setEvaluatorQuotedPrice(null);
				} else {
					pricing.setEvaluatorQuotedPrice(value);
				}
			} 
			else if (key.equals("nonTrueValue")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setNonTrueValue(null);
				} else {
					pricing.setNonTrueValue(value);
				}
			} 
			else if (key.equals("vehicleCategoryInput")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setVehicleCategoryInput(null);
				} else {
					pricing.setVehicleCategoryInput(value);
				}
			} 
			else if (key.equals("time_spent")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setTime_spent(null);
				} else {
					pricing.setTime_spent(value);
				}
			} 
			
			// uploadPhotoImage
			
			else if (key.equals("type")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("name")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("presignedURL")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("documentCategory")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("documentType")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("documentName")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fileName")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fileExtension")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fileType")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("tempS3Key")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fixedS3Key")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fixedS3PresignedUrl")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("tempS3PresignedUrl")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("fixedS3PresignedUrlExpDt")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("tempS3PresignedUrlExpDt")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			else if (key.equals("isAccepted")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					uploadPhotoImage.setType(value);
				}
			} 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(Rating_And_Pricing1);

		System.out.println(jsonString);
		return jsonString;

		
		
		
	}
}
