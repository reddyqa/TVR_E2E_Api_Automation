package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;

import org.testng.ITestContext;

import com.MSIL.POJO.Refurbishment_Cost_Page_POJO;
import com.MSIL.POJO.refurbishment;
import com.MSIL.POJO.summaryDetails;
import com.MSIL.POJO.urls;
import com.MSIL.POJO.vehicleImages;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

import io.restassured.mapper.ObjectMapper;

public class Refurbishment_Cost_Page_JSON extends BaseSetup{ 
	private Object listOf;

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Refurbishment_Cost(Hashtable<String, String> map, ITestContext context) {
		
		
		String jsonString = null;
		Refurbishment_Cost_Page_POJO RatingPricing_Page_POJO=new Refurbishment_Cost_Page_POJO();
		refurbishment  refurbishment =  new refurbishment ();
		vehicleImages vehicleImages= new vehicleImages ();
		summaryDetails summaryDetails=new summaryDetails();
		urls urls=new urls();
		List<vehicleImages> vihelicedeatilname1 = new ArrayList<vehicleImages>();
		List<vehicleImages> vihelicedeatilname = new ArrayList<vehicleImages>();


		//List<vehicleImages> vihelicedeatilname = new ArrayList<vehicleImages>();

		/* extract read the value from excel */
		Set keys1 = map.keySet();
		   List<Integer> keys = new ArrayList<>(keys1);
			System.out.println("before sort"+keys);

	        // Sort the list
	        Collections.sort(keys);

		//keys.stream().sorted().collect(Collector)
		System.out.println(" sort"+keys);

		Iterator itr = keys.iterator();
		String key;
		String value = null;


		while (itr.hasNext()) {
		//	List<vehicleImages> vihelicedeatilUrls = new ArrayList<vehicleImages>();


			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEnquiryId(null);
				} else {
					RatingPricing_Page_POJO.setEvaluationId(value);
				}
			} else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEnquiryId(null);
				} else {
					RatingPricing_Page_POJO.setEnquiryId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setMspin(null);
				} else {
					RatingPricing_Page_POJO.setMspin(value);
				}
			} 
		
			
			
		
		
			else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setRegistrationNumber(value);
				} else {
					RatingPricing_Page_POJO.setRegistrationNumber(value);
				}
			} else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setCarCondition(null);
				} else {
					RatingPricing_Page_POJO.setCarCondition(value);
				}
			} else if (key.equals("buyingId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setBuyingId(null);
				} else {
					RatingPricing_Page_POJO.setBuyingId(value);
				}
			} else if (key.equals("dealId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setDealId(null);
				} else {
					RatingPricing_Page_POJO.setDealId(value);
				}
			} 
		
		
		
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setStageCode(null);
				} else {
					RatingPricing_Page_POJO.setStageCode(value);
				}
			} 
			else if (key.equals("quoteId")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setQuoteId(null);
				} else {
					RatingPricing_Page_POJO.setQuoteId(value);
				}
			} 

			else if (key.equals("submissionDateInString")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setSubmissionDateInString(null);
				} else {
					RatingPricing_Page_POJO.setSubmissionDateInString(value);
				}
			} 
			else if (key.equals("createdDateInString")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setCreatedDateInString(null);
				} else {
					RatingPricing_Page_POJO.setCreatedDateInString(value);
				}
			} 

			else if (key.equals("modifiedDateInString")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setModifiedDateInString(null);
				} else {
					RatingPricing_Page_POJO.setModifiedDateInString(value);
				}
			} else if (key.equals("enquiryType")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEnquiryType(null);
				} else {
					RatingPricing_Page_POJO.setEnquiryType(value);
				}
			} else if (key.equals("evalName")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setEvalName(null);
				} else {
					RatingPricing_Page_POJO.setEvalName(value);
				}
			} 
			
		
			
	
			else if (key.equals("isReEvaluated")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setIsReEvaluated(null);
				} else {
					RatingPricing_Page_POJO.setIsReEvaluated(value);
				}
			} 
			else if (key.equals("offerPending")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setOfferPending(null);
				} else {
					RatingPricing_Page_POJO.setOfferPending(value);
				}
			} 

			else if (key.equals("offerPrice")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setOfferPrice(null);
				} else {
					RatingPricing_Page_POJO.setOfferPrice(value);
				}
			} 
			else if (key.equals("offerComment")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setOfferComment(null);
				} else {
					RatingPricing_Page_POJO.setOfferComment(value);
				}
			} 

			else if (key.equals("searchWithVin")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setSearchWithVin(null);
				} else {
					RatingPricing_Page_POJO.setSearchWithVin(value);
				}
			} 
			else if (key.equals("cqInProgress")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setCqInProgress(null);
				} else {
					RatingPricing_Page_POJO.setCqInProgress(value);
				}
			}
			else if (key.equals("status")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setStatus(null);
				} else {
					RatingPricing_Page_POJO.setStatus(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setRegNumberFoundInDms(null);
				} else {
					RatingPricing_Page_POJO.setRegNumberFoundInDms(value);
				}
			} 
		
			else if (key.equals("isFinalSubmission")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setStatus(null);
				} else {
					RatingPricing_Page_POJO.setStatus(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setRegNumberFoundInDms(null);
				} else {
					RatingPricing_Page_POJO.setRegNumberFoundInDms(value);
				}
			} else if (key.equals("rating")) {
				if (value.equals("null") || value.equals("")) {
					RatingPricing_Page_POJO.setStatus(null);
				} else {
					RatingPricing_Page_POJO.setStatus(value);
				}
			}
			
			//refurbishment --vehicleImages
			
			else if (key.equals("name")) {
				
				if (value.equals("null") || value.equals("")) {
					vehicleImages.setName(null);
				} else {
				String[] values = value.split(",");
				System.out.println("values----->"+values.length);
				
				for(int i=0;i<values.length;i++) {
					vehicleImages vehicleImages1=new vehicleImages();
					//String[] valuesUrls=values[i].split(":");
					
					vehicleImages1.setName(values[i]);
					//vehicleImages1.setUrls(List.of(valuesUrls[1]));
					vihelicedeatilname.add(vehicleImages1);

					}

				}
			}
			
			

			
			else if (key.equals("urls")) {
				if (value.equals("null") || value.equals("")) {
					vehicleImages.setUrls(null);
				} else {
					
			      

				
					String[] values = value.split(",");
					for(int i=0;i<vihelicedeatilname.size();i++) {

						vehicleImages vehicleImages1=vihelicedeatilname.get(i);
						
						vihelicedeatilname.get(i).setUrls(List.of(values[i]));
						
					
						}
					
				}
			}
			
			 
			
			//summary Details
			
			
			
			
			
			else if (key.equals("defectPanel")) {
				if (value.equals("null") || value.equals("")) {
					summaryDetails.setDefectPanel(null);
				} else {
					summaryDetails.setDefectPanel(value);
				}
			} else if (key.equals("defectType")) {
				if (value.equals("null") || value.equals("")) {
					summaryDetails.setDefectType(null);
				} else {
					summaryDetails.setDefectType(value);
				}
			}
			
			
			else if (key.equals("defectintensity")) {
				if (value.equals("null") || value.equals("")) {
					summaryDetails.setDefectintensity(null);
				} else {
					summaryDetails.setDefectintensity("1");
				}
			} 
			else if (key.equals("evaluatorRfCost")) {
				if (value.equals("null") || value.equals("")) {
					summaryDetails.setEvaluatorRfCost(null);
				} else {
					summaryDetails.setEvaluatorRfCost(value);
				}
			} else if (key.equals("cqRfCost")) {
				if (value.equals("null") || value.equals("")) {
					summaryDetails.setCqRfCost(null);
				} else {
					summaryDetails.setCqRfCost(value);
				}
			}
			
			
			
		
			
			
			
		vihelicedeatilname1.addAll(vihelicedeatilname) ;


}

		
		List<summaryDetails> summaryDetails1 = new ArrayList<summaryDetails>();
		summaryDetails1.add(summaryDetails);
		refurbishment.setVehicleImages(vihelicedeatilname);
		refurbishment.setSummaryDetails(summaryDetails1);
		RatingPricing_Page_POJO.setRefurbishment(refurbishment);
	
		
		

Gson gSon = new Gson();
jsonString = gSon.toJson(RatingPricing_Page_POJO);

System.out.println(jsonString);
return jsonString;



}

}	

