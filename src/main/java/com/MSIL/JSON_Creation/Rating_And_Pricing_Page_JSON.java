package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Rating_And_Pricing_Page_POJO;
import com.MSIL.POJO.pricing;
import com.MSIL.POJO.rating;
import com.MSIL.POJO.summaryDetails;
import com.MSIL.POJO.uploadPhotoImage;
import com.MSIL.POJO.vehicleRating;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Rating_And_Pricing_Page_JSON extends BaseSetup{ 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Rating_And_Pricing_Page(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Rating_And_Pricing_Page_POJO Rating_And_Pricing1=new Rating_And_Pricing_Page_POJO();
		rating rating = new rating();
		vehicleRating vehicleRating=new vehicleRating();
		pricing pricing =new pricing();
		uploadPhotoImage uploadPhotoImage=new uploadPhotoImage();

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;


		while (itr.hasNext()) {

			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("evaluationId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEnquiryId(null);
				} else {
					Rating_And_Pricing1.setEvaluationId(value);
				}
			} else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEnquiryId(null);
				} else {
					Rating_And_Pricing1.setEnquiryId(value);
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
					Rating_And_Pricing1.setRegistrationNumber(value);
				} else {
					Rating_And_Pricing1.setRegistrationNumber(value);
				}
			} else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setCarCondition(null);
				} else {
					Rating_And_Pricing1.setCarCondition(value);
				}
			} else if (key.equals("buyingId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setBuyingId(null);
				} else {
					Rating_And_Pricing1.setBuyingId(value);
				}
			} else if (key.equals("dealId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setDealId(null);
				} else {
					Rating_And_Pricing1.setDealId(value);
				}
			} 
		
		
		
			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setStageCode(null);
				} else {
					Rating_And_Pricing1.setStageCode(value);
				}
			} 
			else if (key.equals("quoteId")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setQuoteId(null);
				} else {
					Rating_And_Pricing1.setQuoteId(value);
				}
			} 

			else if (key.equals("submissionDateInString")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setSubmissionDateInString(null);
				} else {
					Rating_And_Pricing1.setSubmissionDateInString(value);
				}
			} 
			else if (key.equals("createdDateInString")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setCreatedDateInString(null);
				} else {
					Rating_And_Pricing1.setCreatedDateInString(value);
				}
			} 

			else if (key.equals("modifiedDateInString")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setModifiedDateInString(null);
				} else {
					Rating_And_Pricing1.setModifiedDateInString(value);
				}
			} else if (key.equals("enquiryType")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEnquiryType(null);
				} else {
					Rating_And_Pricing1.setEnquiryType(value);
				}
			} else if (key.equals("evalName")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setEvalName(null);
				} else {
					Rating_And_Pricing1.setEvalName(value);
				}
			} 
			
		
			
	
			else if (key.equals("isReEvaluated")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setIsReEvaluated(null);
				} else {
					Rating_And_Pricing1.setIsReEvaluated(value);
				}
			} 
			else if (key.equals("offerPending")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setOfferPending(null);
				} else {
					Rating_And_Pricing1.setOfferPending(value);
				}
			} 

			else if (key.equals("offerPrice")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setOfferPrice(null);
				} else {
					Rating_And_Pricing1.setOfferPrice(value);
				}
			} 
			else if (key.equals("offerComment")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setOfferComment(null);
				} else {
					Rating_And_Pricing1.setOfferComment(value);
				}
			} 

			else if (key.equals("searchWithVin")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setSearchWithVin(null);
				} else {
					Rating_And_Pricing1.setSearchWithVin(value);
				}
			} 
			else if (key.equals("cqInProgress")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setCqInProgress(null);
				} else {
					Rating_And_Pricing1.setCqInProgress(value);
				}
			}
			else if (key.equals("status")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setStatus(null);
				} else {
					Rating_And_Pricing1.setStatus(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setRegNumberFoundInDms(null);
				} else {
					Rating_And_Pricing1.setRegNumberFoundInDms(value);
				}
			} 
		
			else if (key.equals("isFinalSubmission")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setIsFinalSubmission(null);
				} else {
					Rating_And_Pricing1.setIsFinalSubmission(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setRegNumberFoundInDms(null);
				} else {
					Rating_And_Pricing1.setRegNumberFoundInDms(value);
				}
			} else if (key.equals("rating")) {
				if (value.equals("null") || value.equals("")) {
					Rating_And_Pricing1.setRating(null);
				} else {
					Rating_And_Pricing1.setRating(rating);
				}
			}
			
			//raating
			
			else if (key.equals("drivingExperience")) {
				if (value.equals("null") || value.equals("")) {
					rating.setDrivingExperience(null);
				} else {
					rating.setDrivingExperience(value);
				}
			} 
			else if (key.equals("evaluatorRating")) {
				if (value.equals("null") || value.equals("")) {
					rating.setEvaluatorRating(null);
				} else {
					rating.setEvaluatorRating(value);
				}
			} else if (key.equals("otherComment")) {
				if (value.equals("null") || value.equals("")) {
					rating.setOtherComment(null);
				} else {
					rating.setOtherComment(value);
				}
			}
			
			//vehicleRating
			
			
			
			
			
			else if (key.equals("exterior")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setExterior(null);
				} else {
					vehicleRating.setExterior(5);
				}
			} else if (key.equals("interior")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setInterior(null);
				} else {
					vehicleRating.setInterior(4);
				}
			}
			
			
			else if (key.equals("functions")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setFunctions(null);
				} else {
					vehicleRating.setFunctions(5);
				}
			} 
			else if (key.equals("frames")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setFrames(null);
				} else {
					vehicleRating.setFrames(5);
				}
			} else if (key.equals("engine")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setEngine(null);
				} else {
					vehicleRating.setEngine(5);
				}
			}
			else if (key.equals("finalVehicleRating")) {
				if (value.equals("null") || value.equals("")) {
					vehicleRating.setFinalVehicleRating(null);
				} else {
					vehicleRating.setFinalVehicleRating(5);
				}
			}
			
			//pricing
			

			
			
			else if (key.equals("customerExpectedPrice")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setCustomerExpectedPrice(null);
				} else {
					pricing.setCustomerExpectedPrice(value);
				}
			} else if (key.equals("evaluatorQuotedPrice")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setEvaluatorQuotedPrice(null);
				} else {
					pricing.setEvaluatorQuotedPrice(value);
				}
			}
			
			
			else if (key.equals("referencePriceMin")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setReferencePriceMin(null);
				} else {
					pricing.setReferencePriceMin(value);
				}
			} 
			else if (key.equals("referencePriceMax")) {
				if (value.equals("null") || value.equals("")) {
					pricing.setReferencePriceMax(null);
				} else {
					pricing.setReferencePriceMax(value);
				}
			} else if (key.equals("nonTrueValue")) {
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
			//uploadPhotoImage
		
			
			/*
			 * else if (key.equals("name")) { if (value.equals("null") || value.equals(""))
			 * { uploadPhotoImage.setName(null); } else {
			 * 
			 * List<String> name = new ArrayList<String>(); name.add(value);
			 * uploadPhotoImage.setName(name); //uploadPhotoImage.setName(value); } } else
			 * if (key.equals("presignedURL")) { if (value.equals("null") ||
			 * value.equals("")) { uploadPhotoImage.setPresignedURL(null); } else {
			 * List<String> presignedURL = new ArrayList<String>(); presignedURL.add(value);
			 * uploadPhotoImage.setPresignedURL(presignedURL); } } else if
			 * (key.equals("type")) { if (value.equals("null") || value.equals("")) {
			 * uploadPhotoImage.setType(null); } else { List<String> type = new
			 * ArrayList<String>(); type.add(value); uploadPhotoImage.setType(type); } }
			 */
			
			
			else if (key.equals("name")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setName(null);
				} else {
					
					
					uploadPhotoImage.setName(value);
				}
			} else if (key.equals("presignedURL")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setPresignedURL(null);
				} else {
					
					uploadPhotoImage.setPresignedURL(value);
					//uploadPhotoImage.setPresignedURL(value);
				}
			}
			else if (key.equals("type")) {
				if (value.equals("null") || value.equals("")) {
					uploadPhotoImage.setType(null);
				} else {
					
					uploadPhotoImage.setType(value);
				}
			}
			
}

/*
 * Rating_And_Pricing_Page_POJO Rating_And_Pricing1=new
 * Rating_And_Pricing_Page_POJO(); rating rating = new rating(); vehicleRating
 * vehicleRating=new vehicleRating(); pricing pricing =new pricing();
 * uploadPhotoImage uploadPhotoImage=new uploadPhotoImage();
 */
		
		List<uploadPhotoImage> uploadPhotoImage1 = new ArrayList<uploadPhotoImage>();

		uploadPhotoImage1.add(uploadPhotoImage);
		rating.setVehicleRating(vehicleRating);
		pricing.setUploadPhotoImage(uploadPhotoImage1);
		
		
Rating_And_Pricing1.setRating(rating);
Rating_And_Pricing1.setPricing(pricing);

//Rating_And_Pricing1.setVehical(vehicle3);

Gson gSon = new Gson();
jsonString = gSon.toJson(Rating_And_Pricing1);

System.out.println(jsonString);
return jsonString;



}}	

