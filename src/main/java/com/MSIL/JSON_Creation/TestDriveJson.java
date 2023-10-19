package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.TestDrivePojo;
import com.MSIL.POJO.endLocation;
import com.MSIL.POJO.startLocation;
import com.MSIL.POJO.travelledPoints;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class TestDriveJson extends BaseSetup {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String TestDrive(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		
//		List<TD_TravelledPoints> test_drivepoints = new ArrayList<TD_TravelledPoints>();
		
		
		TestDrivePojo testdrive = new TestDrivePojo();
		com.MSIL.POJO.test_drive testdriveRoot=new com.MSIL.POJO.test_drive();
		startLocation testdrive1 = new startLocation();
		endLocation testdrive2 = new endLocation();
		
		travelledPoints testdrive3 = new travelledPoints();
		
//		List<TD_TravelledPoints> cust_address= new ArrayList<TD_TravelledPoints>();	
//		TD_TravelledPoints td=new TD_TravelledPoints();
		

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value = null;


		while (itr.hasNext()) {
			
			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("distanceTravelled")) {
				if (value.equals("null") || value.equals("")) {
					testdriveRoot.setDistanceTravelled(null);
				} else {
					testdriveRoot.setDistanceTravelled(value);
				}
			}
				else if (key.equals("timeTaken")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setTimeTaken(null);
					} else {
						testdriveRoot.setTimeTaken(value);
					}
				}		
				else if (key.equals("drivingExperience")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setDrivingExperience(null);
					} else {
						testdriveRoot.setDrivingExperience(value);
					}
				}
				else if (key.equals("specifyProblem")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setSpecifyProblem(null);
					} else {
						testdriveRoot.setSpecifyProblem(value);
					}
				}
				else if (key.equals("incompleteReason")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setIncompleteReason(null);
					} else {
						testdriveRoot.setIncompleteReason(value);
					}
				}
				else if (key.equals("additionalRemark")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setAdditionalRemark(null);
					} else {
						testdriveRoot.setAdditionalRemark(value);
					}
				}
				else if (key.equals("specifyProblemDetail")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setSpecifyProblemDetail(null);
					} else {
						testdriveRoot.setSpecifyProblemDetail(value);
					}
				}
				else if (key.equals("incompleteReasonDetail")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setIncompleteReasonDetail(null);
					} else {
						testdriveRoot.setIncompleteReasonDetail(value);
					}
				}
				else if (key.equals("isCompleteTestDrive")) {
					if (value.equals("null") || value.equals("")) {
						testdriveRoot.setIsCompleteTestDrive(null);
					} else {
						testdriveRoot.setIsCompleteTestDrive(value);
					}
				}
			
//			TD_StartLocation 
			
				else if (key.equals("latitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive1.setLatitude(null);
					} else {
						testdrive1.setLatitude(value);
					}
				}
				else if (key.equals("longitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive1.setLongitude(null);
					} else {
						testdrive1.setLongitude(value);
					}
				}
			
//			TD_EndLocation
			
				else if (key.equals("latitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive2.setLatitude(null);
					} else {
						testdrive2.setLatitude("14.6817642");
					}
				}
				else if (key.equals("longitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive2.setLongitude(null);
					} else {
						testdrive2.setLongitude("78.6116772");
					}
				}
			
//			TD_TravelledPoints 
			
				else if (key.equals("latitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive3.setLatitude(null);
					} else {
						
						testdrive3.setLatitude("14.6817642");
						
						
						

					}
				}
				else if (key.equals("longitude")) {
					if (value.equals("null") || value.equals("")) {
						testdrive3.setLongitude(null);
					} else {
						
						testdrive3.setLongitude("78.6116772");

					}
				}
			
			
				else if (key.equals("evaluationId")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setEvaluationId(null);
                    } else {
                    	testdrive.setEvaluationId(value);
                    }
              }
              else if (key.equals("enquiryId")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setEnquiryId(null);
                    } else {
                    	testdrive.setEnquiryId(value);
                    }
              }
              else if (key.equals("mspin")) {
                   
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setMspin(null);
                    } else {
                    	testdrive.setMspin(value);
                    }
              }
              else if (key.equals("registrationNumber")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setRegistrationNumber(null);
                    } else {
                    	testdrive.setRegistrationNumber(value);
                    }
              }
 
              else if (key.equals("carCondition")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setCarCondition(null);
                    } else {
                    	testdrive.setCarCondition(value);
                    }
              }
              else if (key.equals("buyingId")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setBuyingId(null);
                    } else {
                    	testdrive.setBuyingId(value);
                    }
              }
              else if (key.equals("dealId")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setDealId(null);
                    } else {
                    	testdrive.setDealId(value);
                    }
              }
              else if (key.equals("stageCode")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setStageCode(null);
                    } else {
                    	testdrive.setStageCode(value);
                    }
              }
              else if (key.equals("quoteId")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setQuoteId(null);
                    } else {
                    	testdrive.setQuoteId(value);
                    }
              }
              else if (key.equals("submissionDateInString")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setSubmissionDateInString(null);
                    } else {
                    	testdrive.setSubmissionDateInString(value);
                    }
              }
              else if (key.equals("createdDateInString")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setCreatedDateInString(null);
                    } else {
                    	testdrive.setCreatedDateInString(value);
                    }
              }
              else if (key.equals("modifiedDateInString")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setModifiedDateInString(null);
                    } else {
                    	testdrive.setModifiedDateInString(value);
                    }
              }
              else if (key.equals("enquiryType")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setEnquiryType(null);
                    } else {
                    	testdrive.setEnquiryType(value);
                    }
              }
              else if (key.equals("evalName")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setEvalName(null);
                    } else {
                    	testdrive.setEvalName(value);
                    }
              }
              else if (key.equals("isReEvaluated")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setIsReEvaluated(null);
                    } else {
                    	testdrive.setIsReEvaluated(value);
                    }
              }
              else if (key.equals("offerPending")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setOfferPending(null);
                    } else {
                    	testdrive.setOfferPending(value);
                    }
              }
              else if (key.equals("offerPrice")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setOfferPrice(null);
                    } else {
                    	testdrive.setOfferPrice(value);
                    }
              }
              else if (key.equals("offerComment")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setOfferComment(null);
                    } else {
                    	testdrive.setOfferComment(value);
                    }
              }
              else if (key.equals("searchWithVin")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setSearchWithVin(null);
                    } else {
                    	testdrive.setSearchWithVin(value);
                    }
              }
              else if (key.equals("cqInProgress")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setCqInProgress(null);
                    } else {
                    	testdrive.setCqInProgress(value);
                    }
              }
              else if (key.equals("status")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setStatus(null);
                    } else {
                    	testdrive.setStatus(value);
                    }
              }
              else if (key.equals("regNumberFoundInDms")) {
                    if (value.equals("null") || value.equals("")) {
                    	testdrive.setRegNumberFoundInDms(null);
                    } else {
                    	testdrive.setRegNumberFoundInDms(value);
                    }
              }
			
			
		}
		
		testdrive2.setLatitude("14.6817642");
		testdrive2.setLongitude("78.6116772");
		testdrive3.setLatitude("14.6817642");
		testdrive3.setLongitude("78.6116772");

		
		List<travelledPoints> test_drivepoints = new ArrayList<travelledPoints>();
//		
//		
//		TestDrivePojo testdrive = new TestDrivePojo();
//		TD_Startlocation testdrive1 = new TD_Startlocation();
//		TD_Endlocation testdrive2 = new TD_Endlocation();
//		TD_TravelledPoints testdrive3 = new TD_TravelledPoints();
//		
		
//		test_drivepoints.add(testdrive3);
		List<travelledPoints> TD_TravelledPoints1 = new ArrayList<travelledPoints>();

		
		
		TD_TravelledPoints1.add(testdrive3);
		testdriveRoot.setStartLocation(testdrive1);
		testdriveRoot.setEndLocation(testdrive2);

		testdriveRoot.setTravelledPoints(TD_TravelledPoints1);
		
		testdrive.setTest_drive(testdriveRoot);

		
		//testdrive.setTD_TravelledPoints(TD_TravelledPoints1);
//		testdrive.setTD_TravelledPoints(test_drivepoints);
		
//		testdrive.setTD_TravelledPoints(testdrive3);
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(testdrive);

		System.out.println(jsonString);
		return jsonString;
	}
}
