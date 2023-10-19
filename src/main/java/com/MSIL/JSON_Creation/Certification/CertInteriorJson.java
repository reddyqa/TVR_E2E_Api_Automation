package com.MSIL.JSON_Creation.Certification;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.Interior;
import com.MSIL.POJO.Certification.InteriorImageS3info;
import com.MSIL.POJO.Certification.InteriorPics;
import com.MSIL.POJO.Certification.InteriorRoot;
import com.google.gson.Gson;

public class CertInteriorJson 
{ 
			@SuppressWarnings({ "rawtypes", "unchecked"})
			public static String CertInterior(Hashtable<String, String> map, ITestContext context) {
				String jsonString = null;
				
				Interior interior = new Interior();
				InteriorImageS3info intimageS3info = new InteriorImageS3info();
				InteriorPics interiorPics = new InteriorPics();
				InteriorRoot interiorRoot= new InteriorRoot();

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
							interiorRoot.setCertificationId(null);
						} else {
							interiorRoot.setCertificationId(value);
						}
					}
						else if (key.equals("mspin")) {
							
							if (value.equals("null") || value.equals("")) {
								interiorRoot.setMspin(null);
							} else {
								interiorRoot.setMspin(value);
							}
						} 
						else if (key.equals("registrationNumber")) {
							if (value.equals("null") || value.equals("")) {
								interiorRoot.setRegistrationNumber(null);
							} else {
								interiorRoot.setRegistrationNumber(value);
							}
						}
				
						else if (key.equals("stageCode")) {
							if (value.equals("null") || value.equals("")) {
								interiorRoot.setStageCode(null);
							} else {
								interiorRoot.setStageCode(value);
							}
						}
					
//			Interior 1		
						else if (key.equals("acEffectiveness")) {
							if (value.equals("null") || value.equals("")) {
								interior.setAcEffectiveness(null);
							} else {
								interior.setAcEffectiveness(value);
							}
						}
						else if (key.equals("acGrillEfficiency")) {
							if (value.equals("null") || value.equals("")) {
								interior.setAcGrillEfficiency(null);
							} else {
								interior.setAcGrillEfficiency(value);
							}
						}
						else if (key.equals("climateControlAc")) {
							if (value.equals("null") || value.equals("")) {
								interior.setClimateControlAc(null);
							} else {
								interior.setClimateControlAc(value);
							}
						}
//					------------
						else if (key.equals("heater")) {
							if (value.equals("null") || value.equals("")) {
								interior.setHeater(null);
							} else {
								interior.setHeater(value);
							}
						}
						else if (key.equals("wheelSpeedSensor")) {
							if (value.equals("null") || value.equals("")) {
								interior.setWheelSpeedSensor(null);
							} else {
								interior.setWheelSpeedSensor(value);
							}
						}
						else if (key.equals("steeringMountedControls")) {
							if (value.equals("null") || value.equals("")) {
								interior.setSteeringMountedControls(null);
							} else {
								interior.setSteeringMountedControls(value);
							}
						}
						else if (key.equals("abs")) {
							if (value.equals("null") || value.equals("")) {
								interior.setAbs(null);
							} else {
								interior.setAbs(value);
							}
						}
						else if (key.equals("reverseParkingSensor")) {
							if (value.equals("null") || value.equals("")) {
								interior.setReverseParkingSensor(null);
							} else {
								interior.setReverseParkingSensor(value);
							}
						}
						else if (key.equals("reverseCamera")) {
							if (value.equals("null") || value.equals("")) {
								interior.setReverseCamera(null);
							} else {
								interior.setReverseCamera(value);
							}
						}
						else if (key.equals("musicSystem")) {
							if (value.equals("null") || value.equals("")) {
								interior.setMusicSystem(null);
							} else {
								interior.setMusicSystem(value);
							}
						}
						else if (key.equals("seatCovers")) {
							if (value.equals("null") || value.equals("")) {
								interior.setSeatCovers(null);
							} else {
								interior.setSeatCovers(value);
							}
						}
						else if (key.equals("sunRoof")) {
							if (value.equals("null") || value.equals("")) {
								interior.setSunRoof(null);
							} else {
								interior.setSunRoof(value);
							}
						}
						else if (key.equals("carAntena")) {
							if (value.equals("null") || value.equals("")) {
								interior.setCarAntena(null);
							} else {
								interior.setCarAntena(value);
							}
						}
						else if (key.equals("noPowerWindows")) {
							if (value.equals("null") || value.equals("")) {
								interior.setNoPowerWindows(null);
							} else {
								interior.setNoPowerWindows(value);
							}
						}
						else if (key.equals("noAirBags")) {
							if (value.equals("null") || value.equals("")) {
								interior.setNoAirBags(null);
							} else {
								interior.setNoAirBags(value);
							}
						}
						else if (key.equals("powerWindows")) {
							if (value.equals("null") || value.equals("")) {
								interior.setPowerWindows(null);
							} else {
								interior.setPowerWindows(value);
							}
						}
					
						else if (key.equals("airbags")) {
							if (value.equals("null") || value.equals("")) {
								interior.setAirbags(null);
							} else {
								interior.setAirbags(value);
							}
						}
						else if (key.equals("parkingBrakeLever")) {
							if (value.equals("null") || value.equals("")) {
								interior.setParkingBrakeLever(null);
							} else {
								interior.setParkingBrakeLever(value);
							}
						}
						else if (key.equals("horn")) {
							if (value.equals("null") || value.equals("")) {
								interior.setHorn(null);
							} else {
								interior.setHorn(value);
							}
						}
						else if (key.equals("instrumentCluster")) {
							if (value.equals("null") || value.equals("")) {
								interior.setInstrumentCluster(null);
							} else {
								interior.setInstrumentCluster(value);
							}
						}

						else if (key.equals("wiper")) {
							if (value.equals("null") || value.equals("")) {
								interior.setWiper(null);
							} else {
								interior.setWiper(value);
							}
						}

						else if (key.equals("headLamp")) {
							if (value.equals("null") || value.equals("")) {
								interior.setHeadLamp(null);
							} else {
								interior.setHeadLamp(value);
							}
						}

						else if (key.equals("tailLamp")) {
							if (value.equals("null") || value.equals("")) {
								interior.setTailLamp(null);
							} else {
								interior.setTailLamp(value);
							}
						}

						else if (key.equals("fogLamp")) {
							if (value.equals("null") || value.equals("")) {
								interior.setFogLamp(null);
							} else {
								interior.setFogLamp(value);
							}
						}
						else if (key.equals("cabinLight")) {
							if (value.equals("null") || value.equals("")) {
								interior.setCabinLight(null);
							} else {
								interior.setCabinLight(value);
							}
						}
						else if (key.equals("blinkerLight")) {
							if (value.equals("null") || value.equals("")) {
								interior.setBlinkerLight(null);
							} else {
								interior.setBlinkerLight(value);
							}
						}
						else if (key.equals("seatBelts")) {
							if (value.equals("null") || value.equals("")) {
								interior.setSeatBelts(null);
							} else {
								interior.setSeatBelts(value);
							}
						}
						else if (key.equals("keylessCenterLocking")) {
							if (value.equals("null") || value.equals("")) {
								interior.setKeylessCenterLocking(null);
							} else {
								interior.setKeylessCenterLocking(value);
							}
						}
						else if (key.equals("keylessCenterLockingReason")) {
							if (value.equals("null") || value.equals("")) {
								interior.setKeylessCenterLockingReason(null);
							} else {
								interior.setKeylessCenterLockingReason(value);
							}
						}
						else if (key.equals("detailInput")) {
							if (value.equals("null") || value.equals("")) {
								interior.setDetailInput(null);
							} else {
								interior.setDetailInput(value);
							}
						}
						else if (key.equals("odometerImage")) {
							if (value.equals("null") || value.equals("")) {
								interior.setOdometerImage(null);
							} else {
								interior.setOdometerImage(value);
							}
						}
						else if (key.equals("actualRefurbishmentCost")) {
							if (value.equals("null") || value.equals("")) {
								interior.setActualRefurbishmentCost(null);
							} else {
								interior.setActualRefurbishmentCost(value);
							}
						}
					
					
//					Interior  2
					
						else if (key.equals("type")) {
							if (value.equals("null") || value.equals("")) {
								interiorPics.setType(null);
							} else {
								interiorPics.setType(value);
							}
						}
						else if (key.equals("name")) {
							if (value.equals("null") || value.equals("")) {
								interiorPics.setName(null);
							} else {
								interiorPics.setName(value);
							}
						}
						else if (key.equals("presignedURL")) {
							if (value.equals("null") || value.equals("")) {
								interiorPics.setPresignedURL(null);
							} else {
								interiorPics.setPresignedURL(value);
							}
						}
						else if (key.equals("documentCategory")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setDocumentCategory(null);
							} else {
								intimageS3info.setDocumentCategory(value);
							}
						}
						else if (key.equals("documentType")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setDocumentType(null);
							} else {
								intimageS3info.setDocumentType(value);
							}
						}
						else if (key.equals("documentName")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setDocumentName(null);
							} else {
								intimageS3info.setDocumentName(value);
							}
						}
						else if (key.equals("fileName")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setFileName(null);
							} else {
								intimageS3info.setFileName(value);
							}
						}
						else if (key.equals("fileType")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setFileType(null);
							} else {
								intimageS3info.setFileType(value);
							}
						}
						else if (key.equals("fixedS3PresignedUrl")) {
							if (value.equals("null") || value.equals("")) {
								intimageS3info.setFixedS3PresignedUrl(null);
							} else {
								intimageS3info.setFixedS3PresignedUrl(value);
							}
						}


				}	
							
				List<InteriorPics> interiorPics1 = new ArrayList<InteriorPics>();
				List<InteriorImageS3info> images3info= new ArrayList <InteriorImageS3info>();
			
				interiorPics1.add(interiorPics);
				images3info.add(intimageS3info);
				//intimageinfo.add(intimageS3info);
				//intimageinfo.add(intimageS3info);
				interiorPics.setIntimageS3Info(intimageS3info);;
				interior.setInteriorPictures(interiorPics1);

				interiorRoot.setInterior(interior);
				//interior.setInteriorPictures(interiorPics1);
				//interior.setInteriorPictures(interior2);
				//interior.setInteriorPictures(interior2);
				
				
				
//					interior.setInteriorPojo1(interior1);
//					interior.setInteriorPojo2(interior2);
							
							
							Gson gSon = new Gson();
							jsonString = gSon.toJson(interiorRoot);
				
							System.out.println(jsonString);
							return jsonString;
						
					
					

			
	}

}
