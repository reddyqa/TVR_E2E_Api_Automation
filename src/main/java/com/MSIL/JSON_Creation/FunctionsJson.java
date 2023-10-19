package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.FramesPojo;
import com.MSIL.POJO.FunctionsPojo;
import com.MSIL.POJO.frames;
import com.MSIL.POJO.framesPictures;
import com.MSIL.POJO.functions;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class FunctionsJson extends BaseSetup {
	
	
	 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Functions(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		FunctionsPojo functions = new FunctionsPojo();
		functions functions1 = new functions();
		

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
					functions.setEvaluationId(null);
				} else {
					functions.setEvaluationId(value);
				}
			}
				else if (key.equals("enquiryId")) {
					if (value.equals("null") || value.equals("")) {
						functions.setEnquiryId(null);
					} else {
						functions.setEnquiryId(value);
					}
				}
				else if (key.equals("mspin")) {
					
					if (value.equals("null") || value.equals("")) {
						functions.setMspin(null);
					} else {
						functions.setMspin(value);
					}
				} 
				else if (key.equals("registrationNumber")) {
					if (value.equals("null") || value.equals("")) {
						functions.setRegistrationNumber(null);
					} else {
						functions.setRegistrationNumber(value);
					}
				}
		
				else if (key.equals("carCondition")) {
					if (value.equals("null") || value.equals("")) {
						functions.setCarCondition(null);
					} else {
						functions.setCarCondition(value);
					}
				}
				else if (key.equals("buyingId")) {
					if (value.equals("null") || value.equals("")) {
						functions.setBuyingId(null);
					} else {
						functions.setBuyingId(value);
					}
				}
				else if (key.equals("dealId")) {
					if (value.equals("null") || value.equals("")) {
						functions.setDealId(null);
					} else {
						functions.setDealId(value);
					}
				}
				else if (key.equals("stageCode")) {
					if (value.equals("null") || value.equals("")) {
						functions.setStageCode(null);
					} else {
						functions.setStageCode(value);
					}
				}
				else if (key.equals("quoteId")) {
					if (value.equals("null") || value.equals("")) {
						functions.setQuoteId(null);
					} else {
						functions.setQuoteId(value);
					}
				}
				else if (key.equals("submissionDateInString")) {
					if (value.equals("null") || value.equals("")) {
						functions.setSubmissionDateInString(null);
					} else {
						functions.setSubmissionDateInString(value);
					}
				}
				else if (key.equals("createdDateInString")) {
					if (value.equals("null") || value.equals("")) {
						functions.setCreatedDateInString(null);
					} else {
						functions.setCreatedDateInString(value);
					}
				}
				else if (key.equals("modifiedDateInString")) {
					if (value.equals("null") || value.equals("")) {
						functions.setModifiedDateInString(null);
					} else {
						functions.setModifiedDateInString(value);
					}
				}
				else if (key.equals("enquiryType")) {
					if (value.equals("null") || value.equals("")) {
						functions.setEnquiryType(null);
					} else {
						functions.setEnquiryType(value);
					}
				}
				else if (key.equals("evalName")) {
					if (value.equals("null") || value.equals("")) {
						functions.setEvalName(null);
					} else {
						functions.setEvalName(value);
					}
				}
				else if (key.equals("isReEvaluated")) {
					if (value.equals("null") || value.equals("")) {
						functions.setIsReEvaluated(null);
					} else {
						functions.setIsReEvaluated(value);
					}
				}
				else if (key.equals("offerPending")) {
					if (value.equals("null") || value.equals("")) {
						functions.setOfferPending(null);
					} else {
						functions.setOfferPending(value);
					}
				}
				else if (key.equals("offerPrice")) {
					if (value.equals("null") || value.equals("")) {
						functions.setOfferPrice(null);
					} else {
						functions.setOfferPrice(value);
					}
				}
				else if (key.equals("offerComment")) {
					if (value.equals("null") || value.equals("")) {
						functions.setOfferComment(null);
					} else {
						functions.setOfferComment(value);
					}
				}
				else if (key.equals("searchWithVin")) {
					if (value.equals("null") || value.equals("")) {
						functions.setSearchWithVin(null);
					} else {
						functions.setSearchWithVin(value);
					}
				}
				else if (key.equals("cqInProgress")) {
					if (value.equals("null") || value.equals("")) {
						functions.setCqInProgress(null);
					} else {
						functions.setCqInProgress(value);
					}
				}
				else if (key.equals("status")) {
					if (value.equals("null") || value.equals("")) {
						functions.setStatus(null);
					} else {
						functions.setStatus(value);
					}
				}
				else if (key.equals("regNumberFoundInDms")) {
					if (value.equals("null") || value.equals("")) {
						functions.setRegNumberFoundInDms(null);
					} else {
						functions.setRegNumberFoundInDms(value);
					}
				}
//      Functions...........
			
				else if (key.equals("steering")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setSteering(null);
					} else {
						functions1.setSteering(value);
					}
				}
				else if (key.equals("steeringReason")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setSteeringReason(null);
					} else {
						functions1.setSteeringReason(value);
					}
				}
				else if (key.equals("suspension")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setSuspension(null);
					} else {
						functions1.setSuspension(value);
					}
				}
				else if (key.equals("suspensionReasons")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setSuspensionReasons(null);
					} else {
						functions1.setSuspensionReasons(value);
					}
				}
				else if (key.equals("brake")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setBrake(null);
					} else {
						functions1.setBrake(value);
					}
				}
				else if (key.equals("brakeReasons")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setBrakeReasons(null);
					} else {
						functions1.setBrakeReasons(value);
					}
				}
				else if (key.equals("gearShifting")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setGearShifting(null);
					} else {
						functions1.setGearShifting(value);
					}
				}
				else if (key.equals("gearShiftingReasons")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setGearShiftingReasons(null);
					} else {
						functions1.setGearShiftingReasons(value);
					}
				}
				else if (key.equals("driveShaft")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setDriveShaft(null);
					} else {
						functions1.setDriveShaft(value);
					}
				}
				else if (key.equals("driveShaftReasons")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setDriveShaftReasons(null);
					} else {
						functions1.setDriveShaftReasons(value);
					}
				}
				else if (key.equals("clutch")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setClutch(null);
					} else {
						functions1.setClutch(value);
					}
				}
				else if (key.equals("clutchReason")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setClutchReason(null);
					} else {
						functions1.setClutchReason(value);
					}
				}
				else if (key.equals("gearBoxNoise")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setGearBoxNoise(null);
					} else {
						functions1.setGearBoxNoise(value);
					}
				}
				else if (key.equals("wheelBearing")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setWheelBearing(null);
					} else {
						functions1.setWheelBearing(value);
					}
				}
				else if (key.equals("wheelBearingReason")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setWheelBearingReason(null);
					} else {
						functions1.setWheelBearingReason(value);
					}
				}
				else if (key.equals("diffrentialNoise")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setDiffrentialNoise(null);
					} else {
						functions1.setDiffrentialNoise(value);
					}
				}
				else if (key.equals("transmissionOilLeakage")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setTransmissionOilLeakage(null);
					} else {
						functions1.setTransmissionOilLeakage(value);
					}
				}
				else if (key.equals("refurbishmentCost")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setRefurbishmentCost(null);
					} else {
						functions1.setRefurbishmentCost(value);
					}
				}
				else if (key.equals("highlightPositives")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setHighlightPositives(null);
					} else {
						functions1.setHighlightPositives(value);
					}
				}
				else if (key.equals("otherCommentsFiled")) {
					if (value.equals("null") || value.equals("")) {
						functions1.setOtherCommentsFiled(null);
					} else {
						functions1.setOtherCommentsFiled(value);
					}
				}
			
			
			
			
			
			
			
			
		}
		
		functions.setFunctions(functions1);
		

		Gson gSon = new Gson();
		jsonString = gSon.toJson(functions);

		System.out.println(jsonString);
		return jsonString;
		
		
	}
	
}
