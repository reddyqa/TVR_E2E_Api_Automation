package com.MSIL.JSON_Creation.Certification;

import java.util.*;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.frames;
import com.MSIL.POJO.Certification.framesPictures;
import com.MSIL.POJO.Certification.CertFramesPOJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_Frames_Json extends BaseSetup {
	
	
	 
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Frames(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		CertFramesPOJO framesroot = new CertFramesPOJO();
		frames frames=new frames();
		framesPictures framespics = new framesPictures();

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
					framesroot.setCertificationId(null);
				} else {
					framesroot.setCertificationId(value);
				}
			}
				else if (key.equals("mspin")) {
					if (value.equals("null") || value.equals("")) {
						framesroot.setMspin(null);
					} else {
						framesroot.setMspin(value);
					}
				}	
				else if (key.equals("registrationNumber")) {
					if (value.equals("null") || value.equals("")) {
						framesroot.setRegistrationNumber(null);
					} else {
						framesroot.setRegistrationNumber(value);
					}
				}	

				else if (key.equals("stageCode")) {
					if (value.equals("null") || value.equals("")) {
						framesroot.setStageCode(null);
					} else {
						framesroot.setStageCode(value);
					}
				}	
			
			// Frames 
			
				else if (key.equals("allOk")) {
					if (value.equals("null") || value.equals("")) {
						frames.setAllOk(null);
					} else {
						frames.setAllOk(value);
					}
				}
				else if (key.equals("bonnetSupportMemberSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setBonnetSupportMemberSelected(null);
					} else {
						frames.setBonnetSupportMemberSelected(value);
					}
				}
				else if (key.equals("bonnetSupportMember")) {
					if (value.equals("null") || value.equals("")) {
						frames.setBonnetSupportMember(null);
					} else {
						frames.setBonnetSupportMember(value);
					}
				}
				else if (key.equals("crossMemberSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCrossMemberSelected(null);
					} else {
						frames.setCrossMemberSelected(value);
					}
				}
				else if (key.equals("crossMember")) {
					if (value.equals("null") || value.equals("")) {
						frames.setCrossMember(null);
					} else {
						frames.setCrossMember(value);
					}
				}
				else if (key.equals("lampSupportSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLampSupportSelected(null);
					} else {
						frames.setLampSupportSelected(value);
					}
				}
				else if (key.equals("lampSupport")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLampSupport(null);
					} else {
						frames.setLampSupport(value);
					}
				}
				else if (key.equals("leftApronSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftApronSelected(null);
					} else {
						frames.setLeftApronSelected(value);
					}
				} 
				else if (key.equals("leftApron")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftApron(null);
					} else {
						frames.setLeftApron(value);
					}
				}
				else if (key.equals("rightApronSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightApronSelected(null);
					} else {
						frames.setRightApronSelected(value);
					}
				}
				else if (key.equals("rightApron")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightApron(null);
					} else {
						frames.setRightApron(value);
					}
				}
				else if (key.equals("leftAPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftAPillarSelected(null);
					} else {
						frames.setLeftAPillarSelected(value);
					}
				}
				else if (key.equals("leftAPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftAPillar(null);
					} else {
						frames.setLeftAPillar(value);
					}
				}
				else if (key.equals("leftBPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftBPillarSelected(null);
					} else {
						frames.setLeftBPillarSelected(value);
					}
				}
				else if (key.equals("leftBPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftBPillar(null);
					} else {
						frames.setLeftBPillar(value);
					}
				}
				else if (key.equals("leftCPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftCPillarSelected(null);
					} else {
						frames.setLeftCPillarSelected(value);
					}
				}
				else if (key.equals("leftCPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setLeftCPillar(null);
					} else {
						frames.setLeftCPillar(value);
					}
				}
				else if (key.equals("rightAPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightAPillarSelected(null);
					} else {
						frames.setRightAPillarSelected(value);
					}
				}
				else if (key.equals("rightAPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightAPillar(null);
					} else {
						frames.setRightAPillar(value);
					}
				}
				else if (key.equals("rightBPillarSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightBPillarSelected(null);
					} else {
						frames.setRightBPillarSelected(value);
					}
				}
				else if (key.equals("rightBPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightBPillar(null);
					} else {
						frames.setRightBPillar(value);
					}
				}
				else if (key.equals("rightCPillarSeleced")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightCPillarSeleced(null);
					} else {
						frames.setRightCPillarSeleced(value);
					}
				}
				else if (key.equals("rightCPillar")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRightCPillar(null);
					} else {
						frames.setRightCPillar(value);
					}
				}
				else if (key.equals("rearLeftQuarterPanelSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearLeftQuarterPanelSelected(null);
					} else {
						frames.setRearLeftQuarterPanelSelected(value);
					}
				}
				else if (key.equals("rearLeftQuarterPanel")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearLeftQuarterPanel(null);
					} else {
						frames.setRearLeftQuarterPanel(value);
					}
				}
				else if (key.equals("rearRightQuarterPanelSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearRightQuarterPanelSelected(null);
					} else {
						frames.setRearRightQuarterPanelSelected(value);
					}
				}
				else if (key.equals("rearRightQuarterPanel")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearRightQuarterPanel(null);
					} else {
						frames.setRearRightQuarterPanel(value);
					}
				}
				else if (key.equals("rearDickeySelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearDickeySelected(null);
					} else {
						frames.setRearDickeySelected(value);
					}
				}
				else if (key.equals("rearDickey")) {
					if (value.equals("null") || value.equals("")) {
						frames.setRearDickey(null);
					} else {
						frames.setRearDickey(value);
					}
				}
				else if (key.equals("floodAffectedVehicleSelected")) {
					if (value.equals("null") || value.equals("")) {
						frames.setFloodAffectedVehicleSelected(null);
					} else {
						frames.setFloodAffectedVehicleSelected(value);
					}
				}
				else if (key.equals("floodAffectedVehicle")) {
					if (value.equals("null") || value.equals("")) {
						frames.setFloodAffectedVehicle(null);
					} else {
						frames.setFloodAffectedVehicle(value);
					}
				}
				else if (key.equals("comment")) {
					if (value.equals("null") || value.equals("")) {
						frames.setComment(null);
					} else {
						frames.setComment(value);
					}
				}
				else if (key.equals("actualRefurbishmentCost")) {
					if (value.equals("null") || value.equals("")) {
						frames.setActualRefurbishmentCost(null);
					} else {
						frames.setActualRefurbishmentCost(value);
					}
				}
				else if (key.equals("time_spent")) {
					if (value.equals("null") || value.equals("")) {
						frames.setTime_spent(null);
					} else {
						frames.setTime_spent(value);
					}
				}

			
				else if (key.equals("type")) {
					if (value.equals("null") || value.equals("")) {
						framespics.setType(null);
					} else {
						framespics.setType(value);
					}
				}
				else if (key.equals("name")) {
					if (value.equals("null") || value.equals("")) {
						framespics.setName(null);
					} else {
						framespics.setName(value);
					}
				}
				else if (key.equals("presignedURL")) {
					if (value.equals("null") || value.equals("")) {
						framespics.setPresignedURL(null);
					} else {
						framespics.setPresignedURL(value);
					}
				}

}

		List<framesPictures> framesPictures= new ArrayList<>();
		framesPictures.add(framespics);
		frames.setFramesPictures(framesPictures);
		framesroot.setFrames(frames);


		Gson gSon = new Gson();
		jsonString = gSon.toJson(framesroot);

		System.out.println(jsonString);
		return jsonString;
		
		
		
	}
}
