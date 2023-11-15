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
	@SuppressWarnings({ "rawtypes"})
	public static String Rating_And_Pricing_Page(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		Certi_RatingandPricing_POJO Rating_And_Pricing1=new Certi_RatingandPricing_POJO();
		rating rating = new rating();
		vehicleRating vehicleRating1 = new vehicleRating();
		pricing pricing = new pricing();


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
			
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setStageCode(null);
				} else {
					Rating_And_Pricing1.setStageCode(value);
				}
			}

			else if (key.equals("isFinalSubmission")) {
				if (value.equals("null") || value.isEmpty()) {
					Rating_And_Pricing1.setIsFinalSubmission(null);
				} else {
					Rating_And_Pricing1.setIsFinalSubmission(value);
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
			
			
			
			
			else if (key.equals("time_spent")) {
				if (value.equals("null") || value.isEmpty()) {
					pricing.setTime_spent(null);
				} else {
					pricing.setTime_spent(value);
				}
			} 
			
}
		
	
		rating.setVehicleRating(vehicleRating1);
		Rating_And_Pricing1.setRating(rating);
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(Rating_And_Pricing1);

		System.out.println(jsonString);
		return jsonString;

		
		
		
	}
}
