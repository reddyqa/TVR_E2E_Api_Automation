package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;
import com.MSIL.POJO.FramesPojo;
import com.MSIL.POJO.frames;
import com.MSIL.POJO.framesPictures;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class FramesJson extends BaseSetup {
	
	
	 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Frames(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		FramesPojo frames = new FramesPojo();
		frames frames1=new frames();
		framesPictures frames2 = new framesPictures();

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
					frames.setEvaluationId(null);
				} else {
					frames.setEvaluationId(value);
				}
			}
				else if (key.equals("enquiryId")) {
					if (value.equals("null") || value.equals("")) {
						frames.setEnquiryId(null);
					} else {
						frames.setEnquiryId(value);
					}
				}		
				else if (key.equals("mspin")) {
					
					if (value.equals("null") || value.equals("")) {
						frames.setMspin(null);
					} else {
						frames.setMspin(value);
					}
				} 
				else if (key.equals("registrationNumber")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRegistrationNumber(null);
					} else {
						frames.setRegistrationNumber(value);
					}
				}
		
				else if (key.equals("carCondition")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCarCondition(null);
					} else {
						frames.setCarCondition(value);
					}
				}
				else if (key.equals("buyingId")) {
					if (value.equals("null") || value.equals("")) {
						frames.setBuyingId(null);
					} else {
						frames.setBuyingId(value);
					}
				}
				else if (key.equals("dealId")) {
					if (value.equals("null") || value.equals("")) {
						frames.setDealId(null);
					} else {
						frames.setDealId(value);
					}
				}
				else if (key.equals("stageCode")) {
					if (value.equals("null") || value.equals("")) {
						frames.setStageCode(null);
					} else {
						frames.setStageCode(value);
					}
				}
				else if (key.equals("quoteId")) {
					if (value.equals("null") || value.equals("")) {
						frames.setQuoteId(null);
					} else {
						frames.setQuoteId(value);
					}
				}
				else if (key.equals("submissionDateInString")) {
					if (value.equals("null") || value.equals("")) {
						frames.setSubmissionDateInString(null);
					} else {
						frames.setSubmissionDateInString(value);
					}
				}
				else if (key.equals("createdDateInString")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCreatedDateInString(null);
					} else {
						frames.setCreatedDateInString(value);
					}
				}
				else if (key.equals("modifiedDateInString")) {
					if (value.equals("null") || value.equals("")) {
						frames.setModifiedDateInString(null);
					} else {
						frames.setModifiedDateInString(value);
					}
				}
				else if (key.equals("enquiryType")) {
					if (value.equals("null") || value.equals("")) {
						frames.setEnquiryType(null);
					} else {
						frames.setEnquiryType(value);
					}
				}
				else if (key.equals("evalName")) {
					if (value.equals("null") || value.equals("")) {
						frames.setEvalName(null);
					} else {
						frames.setEvalName(value);
					}
				}
				else if (key.equals("isReEvaluated")) {
					if (value.equals("null") || value.equals("")) {
						frames.setIsReEvaluated(null);
					} else {
						frames.setIsReEvaluated(value);
					}
				}
				else if (key.equals("offerPending")) {
					if (value.equals("null") || value.equals("")) {
						frames.setOfferPending(null);
					} else {
						frames.setOfferPending(value);
					}
				}
				else if (key.equals("offerPrice")) {
					if (value.equals("null") || value.equals("")) {
						frames.setOfferPrice(null);
					} else {
						frames.setOfferPrice(value);
					}
				}
				else if (key.equals("offerComment")) {
					if (value.equals("null") || value.equals("")) {
						frames.setOfferComment(null);
					} else {
						frames.setOfferComment(value);
					}
				}
				else if (key.equals("searchWithVin")) {
					if (value.equals("null") || value.equals("")) {
						frames.setSearchWithVin(null);
					} else {
						frames.setSearchWithVin(value);
					}
				}
				else if (key.equals("cqInProgress")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCqInProgress(null);
					} else {
						frames.setCqInProgress(value);
					}
				}
				else if (key.equals("status")) {
					if (value.equals("null") || value.equals("")) {
						frames.setStatus(null);
					} else {
						frames.setStatus(value);
					}
				}
				else if (key.equals("regNumberFoundInDms")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRegNumberFoundInDms(null);
					} else {
						frames.setRegNumberFoundInDms(value);
					}
				}
//		frames...
				else if (key.equals("bonnetSupportMemberSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setBonnetSupportMemberSelected(null);
					} else {
						frames1.setBonnetSupportMemberSelected(value);
					}
				}
				else if (key.equals("bonnetSupportMember")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setBonnetSupportMember(null);
					} else {
						frames1.setBonnetSupportMember(value);
					}
				}
				else if (key.equals("crossMemberSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setCrossMemberSelected(null);
					} else {
						frames1.setCrossMemberSelected(value);
					}
				}
				else if (key.equals("crossMember")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setCrossMember(null);
					} else {
						frames1.setCrossMember(value);
					}
				}
				else if (key.equals("lampSupportSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLampSupportSelected(null);
					} else {
						frames1.setLampSupportSelected(value);
					}
				}
				else if (key.equals("lampSupport")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLampSupport(null);
					} else {
						frames1.setLampSupport(value);
					}
				}
				else if (key.equals("leftApronSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftApronSelected(null);
					} else {
						frames1.setLeftApronSelected(value);
					}
				}
				else if (key.equals("leftApron")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftApron(null);
					} else {
						frames1.setLeftApron(value);
					}
				}
				else if (key.equals("rightApronSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightApronSelected(null);
					} else {
						frames1.setRightApronSelected(value);
					}
				}
				else if (key.equals("rightApron")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightApron(null);
					} else {
						frames1.setRightApron(value);
					}
				}
				else if (key.equals("leftAPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftAPillarSelected(null);
					} else {
						frames1.setLeftAPillarSelected(value);
					}
				}
				else if (key.equals("leftAPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftAPillar(null);
					} else {
						frames1.setLeftAPillar(value);
					}
				}
				else if (key.equals("leftBPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftBPillarSelected(null);
					} else {
						frames1.setLeftBPillarSelected(value);
					}
				}
				else if (key.equals("leftBPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftBPillar(null);
					} else {
						frames1.setLeftBPillar(value);
					}
				}
				else if (key.equals("leftCPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftCPillarSelected(null);
					} else {
						frames1.setLeftCPillarSelected(value);
					}
				}
				else if (key.equals("leftCPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setLeftCPillar(null);
					} else {
						frames1.setLeftCPillar(value);
					}
				}
				else if (key.equals("rightAPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightAPillarSelected(null);
					} else {
						frames1.setRightAPillarSelected(value);
					}
				}
				else if (key.equals("rightAPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightAPillar(null);
					} else {
						frames1.setRightAPillar(value);
					}
				}
				else if (key.equals("rightBPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightBPillarSelected(null);
					} else {
						frames1.setRightBPillarSelected(value);
					}
				}
				else if (key.equals("rightBPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightBPillar(null);
					} else {
						frames1.setRightBPillar(value);
					}
				}
				else if (key.equals("rightCPillarSeleced")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightCPillarSeleced(null);
					} else {
						frames1.setRightCPillarSeleced(value);
					}
				}
				else if (key.equals("rightCPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRightCPillar(null);
					} else {
						frames1.setRightCPillar(value);
					}
				}
				else if (key.equals("rearLeftQuarterPanelSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearLeftQuarterPanelSelected(null);
					} else {
						frames1.setRearLeftQuarterPanelSelected(value);
					}
				}
				else if (key.equals("rearLeftQuarterPanel")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearLeftQuarterPanel(null);
					} else {
						frames1.setRearLeftQuarterPanel(value);
					}
				}
				else if (key.equals("rearRightQuarterPanelSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearRightQuarterPanelSelected(null);
					} else {
						frames1.setRearRightQuarterPanelSelected(value);
					}
				}
				else if (key.equals("rearRightQuarterPanel")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearRightQuarterPanel(null);
					} else {
						frames1.setRearRightQuarterPanel(value);
					}
				}
				else if (key.equals("rearDickeySelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearDickeySelected(null);
					} else {
						frames1.setRearDickeySelected(value);
					}
				}
				else if (key.equals("rearDickey")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRearDickey(null);
					} else {
						frames1.setRearDickey(value);
					}
				}
				else if (key.equals("floodAffectedVehicleSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setFloodAffectedVehicleSelected(null);
					} else {
						frames1.setFloodAffectedVehicleSelected(value);
					}
				}
				else if (key.equals("floodAffectedVehicle")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setFloodAffectedVehicle(null);
					} else {
						frames1.setFloodAffectedVehicle(value);
					}
				}
				else if (key.equals("comment")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setComment(null);
					} else {
						frames1.setComment(value);
					}
				}
				else if (key.equals("refurbishmentCost")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setRefurbishmentCost(null);
					} else {
						frames1.setRefurbishmentCost(value);
					}
				}
			
//			frames Pictures
			
				else if (key.equals("name")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setName(null);
					} else {
						frames2.setName(value);
					}
				}
				else if (key.equals("presignedURL")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setPresignedURL(null);
					} else {
						frames2.setPresignedURL(value);
					}
				}
				else if (key.equals("type")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setType(null);
					} else {
						frames2.setType(value);
					}
				}
				
		
	
		}
		
		
		frames.setFrames(frames1);
		frames.setFramesPictures(frames2);
	
		
		
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(frames);

		System.out.println(jsonString);
		return jsonString;
		
		
		}
	}
