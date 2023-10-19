package com.MSIL.JSON_Creation.Certification;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.engine;
import com.MSIL.POJO.Certification.Certi_Engine_POJO;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Certi_Engine_Json extends BaseSetup {
	
	
	
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Engine(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
		Certi_Engine_POJO eng = new Certi_Engine_POJO();
		engine eng1 = new engine();
		
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
					eng.setCertificationId(null);
				} else {
					eng.setCertificationId(value);
				}
			}
				else if (key.equals("mspin")) {
					if (value.equals("null") || value.equals("")) {
						eng.setMspin(null);
					} else {
						eng.setMspin(value);
					}
				}
				else if (key.equals("registrationNumber")) {
					if (value.equals("null") || value.equals("")) {
						eng.setRegistrationNumber(null);
					} else {
						eng.setRegistrationNumber(value);
					}
				}
				else if (key.equals("evaluationId")) {
					if (value.equals("null") || value.equals("")) {
						eng.setEvaluationId(null);
					} else {
						eng.setEvaluationId(value);
					}
				}
				else if (key.equals("enquiryId")) {
					if (value.equals("null") || value.equals("")) {
						eng.setEnquiryId(null);
					} else {
						eng.setEnquiryId(value);
					}
				}
				else if (key.equals("carCondition")) {
					if (value.equals("null") || value.equals("")) {
						eng.setCarCondition(null);
					} else {
						eng.setCarCondition(value);
					}
				}
				else if (key.equals("regNumberFoundInDms")) {
					if (value.equals("null") || value.equals("")) {
						eng.setRegNumberFoundInDms(null);
					} else {
						eng.setRegNumberFoundInDms(value);
					}
				}
				else if (key.equals("stageCode")) {
					if (value.equals("null") || value.equals("")) {
						eng.setStageCode(null);
					} else {
						eng.setStageCode(value);
					}
				}
			
			
			//  Engine 1
			
			
				else if (key.equals("radiator")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setRadiator(null);
					} else {
						eng1.setRadiator(value);
					}
				}
				else if (key.equals("radiatorReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setRadiatorReason(null);
					} else {
						eng1.setRadiatorReason(value);
					}
				}
				else if (key.equals("catalyticConverter")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setCatalyticConverter(null);
					} else {
						eng1.setCatalyticConverter(value);
					}
				}
				else if (key.equals("starterMotor")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setStarterMotor(null);
					} else {
						eng1.setStarterMotor(value);
					}
				}
				else if (key.equals("starterMotorReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setStarterMotorReason(null);
					} else {
						eng1.setStarterMotorReason(value);
					}
				}
				else if (key.equals("engineOilLevelDipstik")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngineOilLevelDipstik(null);
					} else {
						eng1.setEngineOilLevelDipstik(value);
					}
				}
				else if (key.equals("coolantAvailability")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setCoolantAvailability(null);
					} else {
						eng1.setCoolantAvailability(value);
					}
				}
				else if (key.equals("engineMounting")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngineMounting(null);
					} else {
						eng1.setEngineMounting(value);
					}
				}
				else if (key.equals("battery")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setBattery(null);
					} else {
						eng1.setBattery(value);
					}
				}
				else if (key.equals("engineOilLeakage")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngineOilLeakage(null);
					} else {
						eng1.setEngineOilLeakage(value);
					}
				}
				else if (key.equals("engineOilLeakageReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngineOilLeakageReason(null);
					} else {
						eng1.setEngineOilLeakageReason(value);
					}
				}
				else if (key.equals("coolantLeakage")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setCoolantLeakage(null);
					} else {
						eng1.setCoolantLeakage(value);
					}
				}
				else if (key.equals("coolantLeakageReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setCoolantLeakageReason(null);
					} else {
						eng1.setCoolantLeakageReason(value);
					}
				}
				else if (key.equals("abnormalNoise")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setAbnormalNoise(null);
					} else {
						eng1.setAbnormalNoise(value);
					}
				}
				else if (key.equals("abnormalNoiseReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setAbnormalNoiseReason(null);
					} else {
						eng1.setAbnormalNoiseReason(value);
					}
				}
				else if (key.equals("blackSmokeWhiteSmoke")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setBlackSmokeWhiteSmoke(null);
					} else {
						eng1.setBlackSmokeWhiteSmoke(value);
					}
				}
				else if (key.equals("blackSmokeWhiteSmokeReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setBlackSmokeWhiteSmokeReason(null);
					} else {
						eng1.setBlackSmokeWhiteSmokeReason(value);
					}
				}
				else if (key.equals("defectiveBelts")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setDefectiveBelts(null);
					} else {
						eng1.setDefectiveBelts(value);
					}
				}
				else if (key.equals("defectiveBeltsReason")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setDefectiveBeltsReason(null);
					} else {
						eng1.setDefectiveBeltsReason(value);
					}
				}
				else if (key.equals("actualRefurbishmentCostTotal")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setActualRefurbishmentCostTotal(null);
					} else {
						eng1.setActualRefurbishmentCostTotal(value);
					}
				}
				else if (key.equals("allOk")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setAllOk(null);
					} else {
						eng1.setAllOk(value);
					}
				}
				else if (key.equals("engine")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngine(null);
					} else {
						eng1.setEngine(value);
					}
				}
				else if (key.equals("actualRefurbishmentCost")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setActualRefurbishmentCost(null);
					} else {
						eng1.setActualRefurbishmentCost(value);
					}
				}
				else if (key.equals("dateOfManufacture")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setDateOfManufacture(null);
					} else {
						eng1.setDateOfManufacture(value);
					}
				}
				else if (key.equals("highlightPositives")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setHighlightPositives(null);
					} else {
						eng1.setHighlightPositives(value);
					}
				}
				else if (key.equals("otherComments")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setOtherComments(null);
					} else {
						eng1.setOtherComments(value);
					}
				}
				else if (key.equals("engineImage")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setEngineImage(null);
					} else {
						eng1.setEngineImage(value);
					}
				}
				else if (key.equals("time_spent")) {
					if (value.equals("null") || value.equals("")) {
						eng1.setTime_spent(null);
					} else {
						eng1.setTime_spent(value);
					}
				}
				
			
}
		
		eng.setEngine(eng1);
		
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(eng);

		System.out.println(jsonString);
		return jsonString;
		
		
		
		
	}
}
