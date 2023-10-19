package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.InteriorPojo;
import com.MSIL.POJO.interior;
import com.MSIL.POJO.interiorPictures;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class InteriorJson extends BaseSetup {
	
	
	 
		@SuppressWarnings({ "rawtypes", "unchecked"})
		public static String Interior(Hashtable<String, String> map, ITestContext context) {
			String jsonString = null;
			
			InteriorPojo interior = new InteriorPojo();
			interior interior1=new interior();
			interiorPictures interior2 = new interiorPictures();

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
						interior.setEvaluationId(null);
					} else {
						interior.setEvaluationId(value);
					}
				}
					else if (key.equals("enquiryId")) {
						if (value.equals("null") || value.equals("")) {
							interior.setEnquiryId(null);
						} else {
							interior.setEnquiryId(value);
						}
					}
				
					else if (key.equals("mspin")) {
						
						if (value.equals("null") || value.equals("")) {
							interior.setMspin(null);
						} else {
							interior.setMspin(value);
						}
					} 
					else if (key.equals("registrationNumber")) {
						if (value.equals("null") || value.equals("")) {
							interior.setRegistrationNumber(null);
						} else {
							interior.setRegistrationNumber(value);
						}
					}
			
					else if (key.equals("carCondition")) {
						if (value.equals("null") || value.equals("")) {
							interior.setCarCondition(null);
						} else {
							interior.setCarCondition(value);
						}
					}
					else if (key.equals("buyingId")) {
						if (value.equals("null") || value.equals("")) {
							interior.setBuyingId(null);
						} else {
							interior.setBuyingId("");
						}
					}
					else if (key.equals("dealId")) {
						if (value.equals("null") || value.equals("")) {
							interior.setDealId(null);
						} else {
							interior.setDealId("");
						}
					}
					else if (key.equals("stageCode")) {
						if (value.equals("null") || value.equals("")) {
							interior.setStageCode(null);
						} else {
							interior.setStageCode(value);
						}
					}
					else if (key.equals("quoteId")) {
						if (value.equals("null") || value.equals("")) {
							interior.setQuoteId(null);
						} else {
							interior.setQuoteId(value);
						}
					}
					else if (key.equals("submissionDateInString")) {
						if (value.equals("null") || value.equals("")) {
							interior.setSubmissionDateInString(null);
						} else {
							interior.setSubmissionDateInString(value);
						}
					}
					else if (key.equals("createdDateInString")) {
						if (value.equals("null") || value.equals("")) {
							interior.setCreatedDateInString(null);
						} else {
							interior.setCreatedDateInString(value);
						}
					}
					else if (key.equals("modifiedDateInString")) {
						if (value.equals("null") || value.equals("")) {
							interior.setModifiedDateInString(null);
						} else {
							interior.setModifiedDateInString(value);
						}
					}
					else if (key.equals("enquiryType")) {
						if (value.equals("null") || value.equals("")) {
							interior.setEnquiryType(null);
						} else {
							interior.setEnquiryType(value);
						}
					}
					else if (key.equals("evalName")) {
						if (value.equals("null") || value.equals("")) {
							interior.setEvalName(null);
						} else {
							interior.setEvalName(value);
						}
					}
					else if (key.equals("isReEvaluated")) {
						if (value.equals("null") || value.equals("")) {
							interior.setIsReEvaluated(null);
						} else {
							interior.setIsReEvaluated(value);
						}
					}
					else if (key.equals("offerPending")) {
						if (value.equals("null") || value.equals("")) {
							interior.setOfferPending(null);
						} else {
							interior.setOfferPending(value);
						}
					}
					else if (key.equals("offerPrice")) {
						if (value.equals("null") || value.equals("")) {
							interior.setOfferPrice(null);
						} else {
							interior.setOfferPrice(value);
						}
					}
					else if (key.equals("offerComment")) {
						if (value.equals("null") || value.equals("")) {
							interior.setOfferComment(null);
						} else {
							interior.setOfferComment(value);
						}
					}
					else if (key.equals("searchWithVin")) {
						if (value.equals("null") || value.equals("")) {
							interior.setSearchWithVin(null);
						} else {
							interior.setSearchWithVin(value);
						}
					}
					else if (key.equals("cqInProgress")) {
						if (value.equals("null") || value.equals("")) {
							interior.setCqInProgress(null);
						} else {
							interior.setCqInProgress(value);
						}
					}
					else if (key.equals("status")) {
						if (value.equals("null") || value.equals("")) {
							interior.setStatus(null);
						} else {
							interior.setStatus(value);
						}
					}
					else if (key.equals("regNumberFoundInDms")) {
						if (value.equals("null") || value.equals("")) {
							interior.setRegNumberFoundInDms(null);
						} else {
							interior.setRegNumberFoundInDms(value);
						}
					}
						
				
//		Interior 1		
					else if (key.equals("acEffectiveness")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setAcEffectiveness(null);
						} else {
							interior1.setAcEffectiveness(value);
						}
					}
					else if (key.equals("acGrillEfficiency")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setAcGrillEfficiency(null);
						} else {
							interior1.setAcGrillEfficiency(value);
						}
					}
					else if (key.equals("climateControlAc")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setClimateControlAc(null);
						} else {
							interior1.setClimateControlAc(value);
						}
					}
//				------------
					else if (key.equals("heater")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setHeater(null);
						} else {
							interior1.setHeater(value);
						}
					}
					else if (key.equals("wheelSpeedSensor")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setWheelSpeedSensor(null);
						} else {
							interior1.setWheelSpeedSensor(value);
						}
					}
					else if (key.equals("steeringMountedControls")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setSteeringMountedControls(null);
						} else {
							interior1.setSteeringMountedControls(value);
						}
					}
					else if (key.equals("abs")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setAbs(null);
						} else {
							interior1.setAbs(value);
						}
					}
					else if (key.equals("reverseParkingSensor")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setReverseParkingSensor(null);
						} else {
							interior1.setReverseParkingSensor(value);
						}
					}
					else if (key.equals("reverseCamera")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setReverseCamera(null);
						} else {
							interior1.setReverseCamera(value);
						}
					}
					else if (key.equals("musicSystem")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setMusicSystem(null);
						} else {
							interior1.setMusicSystem(value);
						}
					}
					else if (key.equals("seatCovers")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setSeatCovers(null);
						} else {
							interior1.setSeatCovers(value);
						}
					}
					else if (key.equals("sunRoof")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setSunRoof(null);
						} else {
							interior1.setSunRoof(value);
						}
					}
					else if (key.equals("carAntena")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setCarAntena(null);
						} else {
							interior1.setCarAntena(value);
						}
					}
					else if (key.equals("noPowerWindows")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setNoPowerWindows(null);
						} else {
							interior1.setNoPowerWindows(value);
						}
					}
					else if (key.equals("noAirBags")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setNoAirBags(null);
						} else {
							interior1.setNoAirBags(value);
						}
					}
					else if (key.equals("powerWindows")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setPowerWindows(null);
						} else {
							interior1.setPowerWindows(value);
						}
					}
					else if (key.equals("powerWindowsReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setPowerWindowsReason(null);
						} else {
							interior1.setPowerWindowsReason(value);
						}
					}
					else if (key.equals("airbags")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setAirbags(null);
						} else {
							interior1.setAirbags(value);
						}
					}
					else if (key.equals("parkingBrakeLever")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setParkingBrakeLever(null);
						} else {
							interior1.setParkingBrakeLever(value);
						}
					}
					else if (key.equals("horn")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setHorn(null);
						} else {
							interior1.setHorn(value);
						}
					}
					else if (key.equals("instrumentCluster")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setInstrumentCluster(null);
						} else {
							interior1.setInstrumentCluster(value);
						}
					}
					else if (key.equals("instrumentClusterReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setInstrumentClusterReason(null);
						} else {
							interior1.setInstrumentClusterReason(value);
						}
					}
					else if (key.equals("wiper")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setWiper(null);
						} else {
							interior1.setWiper(value);
						}
					}
					else if (key.equals("wiperReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setWiperReason(null);
						} else {
							interior1.setWiperReason(value);
						}
					}
					else if (key.equals("headLamp")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setHeadLamp(null);
						} else {
							interior1.setHeadLamp(value);
						}
					}
					else if (key.equals("headLampReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setHeadLampReason(null);
						} else {
							interior1.setHeadLampReason(value);
						}
					}
					else if (key.equals("tailLamp")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setTailLamp(null);
						} else {
							interior1.setTailLamp(value);
						}
					}
					else if (key.equals("tailLampReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setTailLampReason(null);
						} else {
							interior1.setTailLampReason(value);
						}
					}
					else if (key.equals("fogLamp")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setFogLamp(null);
						} else {
							interior1.setFogLamp(value);
						}
					}
					else if (key.equals("cabinLight")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setCabinLight(null);
						} else {
							interior1.setCabinLight(value);
						}
					}
					else if (key.equals("blinkerLight")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setBlinkerLight(null);
						} else {
							interior1.setBlinkerLight(value);
						}
					}
					else if (key.equals("seatBelts")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setSeatBelts(null);
						} else {
							interior1.setSeatBelts(value);
						}
					}
					else if (key.equals("keylessCenterLocking")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setKeylessCenterLocking(null);
						} else {
							interior1.setKeylessCenterLocking(value);
						}
					}
					else if (key.equals("keylessCenterLockingReason")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setKeylessCenterLockingReason(null);
						} else {
							interior1.setKeylessCenterLockingReason(value);
						}
					}
					else if (key.equals("detailInput")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setDetailInput(null);
						} else {
							interior1.setDetailInput(value);
						}
					}
					else if (key.equals("odometerImage")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setOdometerImage(null);
						} else {
							interior1.setOdometerImage(value);
						}
					}
					else if (key.equals("refurbishmentCost")) {
						if (value.equals("null") || value.equals("")) {
							interior1.setRefurbishmentCost(null);
						} else {
							interior1.setRefurbishmentCost(value);
						}
					}
				
				
//				Interior  2
				
				
					else if (key.equals("name")) {
						if (value.equals("null") || value.equals("")) {
							interior2.setName(null);
						} else {
							interior2.setName(value);
						}
					}
					else if (key.equals("presignedURL")) {
						if (value.equals("null") || value.equals("")) {
							interior2.setPresignedURL(null);
						} else {
							interior2.setPresignedURL(value);
						}
					}
					else if (key.equals("type")) {
						if (value.equals("null") || value.equals("")) {
							interior2.setType(null);
						} else {
							interior2.setType(value);
						}
					}
			}
				
				
						
			List<interiorPictures> interiorPictures1 = new ArrayList<interiorPictures>();
		
			interiorPictures1.add(interior2);
			interior1.setInteriorPictures(interiorPictures1);
			interior.setInterior(interior1);
			//interior.setInteriorPictures(interior2);
			//interior.setInteriorPictures(interior2);
			
			
			
//				interior.setInteriorPojo1(interior1);
//				interior.setInteriorPojo2(interior2);
						
						
						Gson gSon = new Gson();
						jsonString = gSon.toJson(interior);
			
						System.out.println(jsonString);
						return jsonString;
					
				
				

		
}
}
