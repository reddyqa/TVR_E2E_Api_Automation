package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.frames;
import com.MSIL.POJO.Certification.framesPictures;
import com.MSIL.POJO.Certification.Certi_Frames_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_Frames_Json extends BaseSetup {
	
	
	 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Frames(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		Certi_Frames_POJO frames = new Certi_Frames_POJO();
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

			if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					frames.setCertificationId(null);
				} else {
					frames.setCertificationId(value);
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
				else if (key.equals("evaluationId")) {
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
				else if (key.equals("carCondition")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCarCondition(null);
					} else {
						frames.setCarCondition(value);
					}
				}	
				else if (key.equals("regNumberFoundInDms")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRegNumberFoundInDms(null);
					} else {
						frames.setRegNumberFoundInDms(value);
					}
				}	
				else if (key.equals("stageCode")) {
					if (value.equals("null") || value.equals("")) {
						frames.setStageCode(null);
					} else {
						frames.setStageCode(value);
					}
				}	
			
			// Frames 
			
				else if (key.equals("allOk")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setAllOk(null);
					} else {
						frames1.setAllOk(value);
					}
				}
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
				else if (key.equals("actualRefurbishmentCost")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setActualRefurbishmentCost(null);
					} else {
						frames1.setActualRefurbishmentCost(value);
					}
				}
				else if (key.equals("time_spent")) {
					if (value.equals("null") || value.equals("")) {
						frames1.setTime_spent(null);
					} else {
						frames1.setTime_spent(value);
					}
				}
				
			// Frames Pictures
			
			
				else if (key.equals("type")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setType(null);
					} else {
						frames2.setType(value);
					}
				}
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
				else if (key.equals("documentCategory")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setDocumentCategory(null);
					} else {
						frames2.setDocumentCategory(value);
					}
				}
				else if (key.equals("documentType")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setDocumentType(null);
					} else {
						frames2.setDocumentType(value);
					}
				}
				else if (key.equals("documentName")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setDocumentName(null);
					} else {
						frames2.setDocumentName(value);
					}
				}
				else if (key.equals("fileName")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFileName(null);
					} else {
						frames2.setFileName(value);
					}
				}
				else if (key.equals("fileExtension")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFileExtension(null);
					} else {
						frames2.setFileExtension(value);
					}
				}
				else if (key.equals("fileType")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFileType(null);
					} else {
						frames2.setFileType(value);
					}
				}
				else if (key.equals("tempS3Key")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setTempS3Key(null);
					} else {
						frames2.setTempS3Key(value);
					}
				}
				else if (key.equals("fixedS3Key")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFixedS3Key(null);
					} else {
						frames2.setFixedS3Key(value);
					}
				}
				else if (key.equals("tempS3Url")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setTempS3Url(null);
					} else {
						frames2.setTempS3Url(value);
					}
				}
				else if (key.equals("fixedS3Url")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFixedS3Url(null);
					} else {
						frames2.setFixedS3Url(value);
					}
				}
				else if (key.equals("fixedS3PresignedUrl")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFixedS3PresignedUrl(null);
					} else {
						frames2.setFixedS3PresignedUrl(value);
					}
				}
				else if (key.equals("tempS3PresignedUrl")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setTempS3PresignedUrl(null);
					} else {
						frames2.setTempS3PresignedUrl(value);
					}
				}
				else if (key.equals("fixedS3PresignedUrlExpDt")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setFixedS3PresignedUrlExpDt(null);
					} else {
						frames2.setFixedS3PresignedUrlExpDt(value);
					}
				}
				else if (key.equals("tempS3PresignedUrlExpDt")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setTempS3PresignedUrlExpDt(null);
					} else {
						frames2.setTempS3PresignedUrlExpDt(value);
					}
				}
				else if (key.equals("isAccepted")) {
					if (value.equals("null") || value.equals("")) {
						frames2.setIsAccepted(null);
					} else {
						frames2.setIsAccepted(value);
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
