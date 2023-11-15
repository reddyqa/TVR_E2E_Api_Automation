package com.MSIL.JSON_Creation;

import com.MSIL.POJO.CarDeatilsAPIPOJO1;
import com.MSIL.POJO.vehical;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.TestUtils.RandomNameGenerator;
import com.google.gson.Gson;
import org.testng.ITestContext;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class CarDeatilsJSON extends BaseSetup{ 
	static RandomNameGenerator EvName=new RandomNameGenerator();
	static String date;
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String vehicle(Hashtable<String, String> map, ITestContext context) {
		
		
		String jsonString = null;
		CarDeatilsAPIPOJO1 carDeatils1=new CarDeatilsAPIPOJO1();
	//	dealerInfo dealerInfo2 = new dealerInfo();
		vehical vehicle3=new vehical();
	

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
					carDeatils1.setEnquiryId(null);
				} else {
					carDeatils1.setEvaluationId(value);
				}
			} else if (key.equals("enquiryId")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setEnquiryId(null);
				} else {
					carDeatils1.setEnquiryId(value);
				}
			} else if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setMspin(null);
				} else {
					carDeatils1.setMspin(value);
				}
			} 

			else if (key.equals("registrationNumber")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setRegistrationNumber(value);
				} else {
					carDeatils1.setRegistrationNumber(value);
				}
			} else if (key.equals("carCondition")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setCarCondition(null);
				} else {
					carDeatils1.setCarCondition(value);
				}
			} else if (key.equals("buyingId")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setBuyingId(null);
				} else {
					carDeatils1.setBuyingId(value);
				}
			} else if (key.equals("dealId")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setDealId(null);
				} else {
					carDeatils1.setDealId(value);
				}
			} 

			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setStageCode(null);
				} else {
					carDeatils1.setStageCode(value);
				}
			} 
			else if (key.equals("quoteId")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setQuoteId(null);
				} else {
					carDeatils1.setQuoteId(value);
				}
			} 

			else if (key.equals("submissionDateInString")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setSubmissionDateInString(null);
				} else {
					carDeatils1.setSubmissionDateInString(value);
				}
			} 
			else if (key.equals("createdDateInString")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setCreatedDateInString(null);
				} else {
					carDeatils1.setCreatedDateInString(value);
				}
			} 

			else if (key.equals("modifiedDateInString")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setModifiedDateInString(null);
				} else {
					carDeatils1.setModifiedDateInString(value);
				}
			} else if (key.equals("enquiryType")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setEnquiryType(null);
				} else {
					carDeatils1.setEnquiryType(value);
				}
			} else if (key.equals("evalName")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setEvalName(null);
				} else {
					
					
					String evalName=RandomNameGenerator.generateName();
					carDeatils1.setEvalName(evalName);
				}
			} 

			else if (key.equals("isReEvaluated")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setIsReEvaluated(null);
				} else {
					carDeatils1.setIsReEvaluated(value);
				}
			} 
			else if (key.equals("offerPending")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setOfferPending(null);
				} else {
					carDeatils1.setOfferPending(value);
				}
			} 

			else if (key.equals("offerPrice")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setOfferPrice(null);
				} else {
					carDeatils1.setOfferPrice(value);
				}
			} 
			else if (key.equals("offerComment")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setOfferComment(null);
				} else {
					carDeatils1.setOfferComment(value);
				}
			} 

			else if (key.equals("searchWithVin")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setSearchWithVin(null);
				} else {
					carDeatils1.setSearchWithVin(value);
				}
			} 
			else if (key.equals("cqInProgress")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setCqInProgress(null);
				} else {
					carDeatils1.setCqInProgress(value);
				}
			} 
			else if (key.equals("status")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setStatus(null);
				} else {
					carDeatils1.setStatus(value);
				}
			} 
			else if (key.equals("regNumberFoundInDms")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setRegNumberFoundInDms(null);
				} else {
					carDeatils1.setRegNumberFoundInDms(value);
				}
			} 

//pojo 2		
		
	/*
		
		else if (key.equals("dealerMapCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setDealerMapCode(null);
			} else {
				dealerInfo2.setDealerMapCode(value);
			}
		} else if (key.equals("cityCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setCityCode(null);
			} else {
				dealerInfo2.setCityCode(value);
			}
		} 

		else if (key.equals("cityDesc")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setCityDesc(value);
			} else {
				dealerInfo2.setCityDesc(value);
			}
		} else if (key.equals("address")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setAddress(null);
			} else {
				dealerInfo2.setAddress(value);
			}
		} else if (key.equals("name")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setName(null);
			} else {
				dealerInfo2.setName(value);
			}
		} else if (key.equals("locCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setLocCode(null);
			} else {
				dealerInfo2.setLocCode(value);;
			}
		} 

		else if (key.equals("location")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setLocation(null);
			} else {
				dealerInfo2.setLocation(value);;
			}
		} 
		else if (key.equals("outletCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setOutletCode(null);
			} else {
				dealerInfo2.setOutletCode(value);
			}
		} 

		else if (key.equals("pin")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setPin(null);
			} else {
				dealerInfo2.setPin(value);
			}
		} 
		else if (key.equals("region")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setRegion(null);
			} else {
				dealerInfo2.setRegion(value);;
			}
		} 

		else if (key.equals("regionCd")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setRegionCd(null);
			} else {
				dealerInfo2.setRegionCd(value);
			}
		} else if (key.equals("stateDesc")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setStateDesc(null);
			} else {
				dealerInfo2.setStateDesc(value);
			}
		} else if (key.equals("stateCd")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setStateCd(null);
			} else {
				dealerInfo2.setStateCd(value);
			}
		} 
	
	
		
		else if (key.equals("zone")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setZone(null);
			} else {
				dealerInfo2.setZone(value);
			}
		} 
		else if (key.equals("phone")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setPhone(null);
			} else {
				dealerInfo2.setPhone("9912466681");
			}
		} 

		else if (key.equals("parentGroup")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setParentGroup(null);
			} else {
				dealerInfo2.setParentGroup(value);
			}
		} 
		else if (key.equals("muleCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setMuleCode(null);
			} else {
				dealerInfo2.setMuleCode(value);
			}
		} 

		
		else if (key.equals("forCode")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setForCode(null);
			} else {
				dealerInfo2.setForCode(value);
			}
		} 

		else if (key.equals("compFa")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setCompFa(null);
			} else {
				dealerInfo2.setCompFa(value);
			}
		} 
		else if (key.equals("compCd")) {
			if (value.equals("null") || value.equals("")) {
				dealerInfo2.setCompCd(null);
			} else {
				dealerInfo2.setCompCd(value);
			}
		} */
		
	//pojo 3
			
		 else if (key.equals("modelCode")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setModelCode(null);
				} else {
					vehicle3.setModelCode(value);
				}
			} 

			else if (key.equals("variantCode")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setVariantCode(null);
				} else {
					vehicle3.setVariantCode(value);
				}
			} 
			else if (key.equals("colorCode")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setColorCode(null);
				} else {
					vehicle3.setColorCode(value);
				}
			} 
			
			
			else if (key.equals("manufacturer")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setManufacturer(null);
				} else {
					vehicle3.setManufacturer(value);
				}
			} 
			else if (key.equals("vin_number")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setVin_number(null);
				} else {
					vehicle3.setVin_number(value);
				}
			} 

			else if (key.equals("vin_image")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setVin_image(null);
				} else {
					vehicle3.setVin_image(value);
				}
			} else if (key.equals("chasis_number")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setChasis_number(null);
				} else {
					vehicle3.setChasis_number(value);
				}
			} else if (key.equals("chasis_number_embossing")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setChasis_number_embossing(null);
				} else {
					vehicle3.setChasis_number_embossing(value);
				}
			} 
			else if (key.equals("chasis_image")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setChasis_image(null);
				} else {
					vehicle3.setChasis_image(value);
				}
			} 
			else if (key.equals("engine_number")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setEngine_number(null);
				} else {
					vehicle3.setEngine_number(value);
				}
			} 
			
			
			

			else if (key.equals("engine_cc")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setEngine_cc(null);
				} else {
					vehicle3.setEngine_cc(value);
				}
			} 
			else if (key.equals("ayear_of_manufacturing")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setYear_of_manufacturing(null);
				} else {

					vehicle3.setYear_of_manufacturing(value);
					

				}
			} 

			else if (key.equals("manufacturer_name")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setManufacturer_name(null);
				} else {
					vehicle3.setManufacturer_name(value);
				}
			} 
			else if (key.equals("manufacturer_code")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setManufacturer_code(null);
				} else {
					vehicle3.setManufacturer_code(value);
				}
			} 

			else if (key.equals("car_type")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setCar_type(null);
				} else {
					vehicle3.setCar_type(value);
				}
			} 
			else if (key.equals("model_name")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setModel_name(null);
				} else {
					vehicle3.setModel_name(value);
				}
			} 
			else if (key.equals("variant_name")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setVariant_name(null);
				} else {
					vehicle3.setVariant_name(value);
				}
			} 
			else if (key.equals("colour")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setColour(null);
				} else {
					vehicle3.setColour(value);
				}
			} 

	
		else if (key.equals("paint")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setPaint(null);
			} else {
				vehicle3.setPaint(value);
			}
		} else if (key.equals("transmission")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setTransmission(null);
			} else {
				vehicle3.setTransmission(value);
			}
		} 
		
			
		
		else if (key.equals("emission")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setEmission(value);
			} else {
				vehicle3.setEmission(value);
			}
		} else if (key.equals("date_of_registration")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setDate_of_registration(null);
			} else {
				date= RandomNameGenerator.generateDateWithYear(value);

				System.out.println("date_of_registration----->"+date);
				vehicle3.setDate_of_registration(date);
			}
		} else if (key.equals("km_run")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setKm_run(null);
			} else {
				int km=RandomNameGenerator.GenerateKM();
					
				String kms = String.valueOf(km);
				
				vehicle3.setKm_run(kms);
			}
		} else if (key.equals("fuel_type")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setFuel_type(null);
			} else {
				vehicle3.setFuel_type(value);;
			}
		} 

		else if (key.equals("cng_lpg_fitment_in_rc")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setCng_lpg_fitment_in_rc(null);
			} else {
				vehicle3.setCng_lpg_fitment_in_rc(value);;
			}
		} 
		else if (key.equals("cng_kit_removed")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setCng_kit_removed(null);
			} else {
				vehicle3.setCng_kit_removed(value);;
			}
		} 
			
			

		else if (key.equals("cng_endowsed_rc")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setCng_endowsed_rc(null);
			} else {
				vehicle3.setCng_endowsed_rc(value);
			}
		} 

		else if (key.equals("cng_type")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setCng_type(null);
			} else {
				vehicle3.setCng_type(value);;
			}
		} 

		else if (key.equals("no_of_owners")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setNo_of_owners(null);
			} else {
				vehicle3.setNo_of_owners(value);
			}
		} else if (key.equals("duplicate_key")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setDuplicate_key(null);
			} else {
				vehicle3.setDuplicate_key(value);
			}
		} else if (key.equals("vin_plate_available")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setVin_plate_available(null);
			} else {
				vehicle3.setVin_plate_available(value);
			}
		} 
	
	
		
		else if (key.equals("jack_tool_kit_available")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setJack_tool_kit_available(null);
			} else {
				vehicle3.setJack_tool_kit_available(value);
			}
		} 
		else if (key.equals("spare_wheel_available")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setSpare_wheel_available(null);
			} else {
				vehicle3.setSpare_wheel_available(value);
			}
		} 

		else if (key.equals("insurance_image")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_image(null);
			} else {
				vehicle3.setInsurance_image(value);
			}
		} 
		else if (key.equals("insurance_type")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_type(null);
			} else {
				vehicle3.setInsurance_type(value);
			}
		} 

		
	
		else if (key.equals("insurance_expiry_date")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_expiry_date(null);
			} else {
				vehicle3.setInsurance_expiry_date(value);
			}
		} 

		else if (key.equals("insurance_idv_value")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_idv_value(null);
			} else {
				vehicle3.setInsurance_idv_value(value);
			}
		} 
		else if (key.equals("last_transaction_buying_id")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setLast_transaction_buying_id(null);
			} else {
				vehicle3.setLast_transaction_buying_id(value);
			}
		} 
		else if (key.equals("last_transaction_old_customer_name")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setLast_transaction_old_customer_name(null);
			} else {
				vehicle3.setLast_transaction_old_customer_name(value);
			}
		} 

		else if (key.equals("last_transaction_dealer_name")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setLast_transaction_dealer_name(null);
			} else {
				vehicle3.setLast_transaction_dealer_name(value);
			}
		} 
		else if (key.equals("last_transaction_date")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setLast_transaction_date(null);
			} else {
				vehicle3.setLast_transaction_date(value);
			}
		} else if (key.equals("name_on_rc")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setName_on_rc(null);
			} else {
				
			String rcname=	RandomNameGenerator.generateName();
			
			log.info("rcname-------->"+rcname);
				vehicle3.setName_on_rc(rcname);
			}
		} 

		else if (key.equals("phone_number")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setPhone_number(null);
			} else {
				String phone=	RandomNameGenerator.PhoneNumberGenerator();

				vehicle3.setPhone_number(phone);
			}
		} 
		else if (key.equals("address")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setAddress(null);
			} else {
				vehicle3.setAddress(value);
			}
		} 
		else if (key.equals("email_id")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setEmail_id(null);
			} else {
				vehicle3.setEmail_id(value);
			}
		} 
		else if (key.equals("profession")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setProfession(null);
			} else {
				vehicle3.setProfession(value);
			}
		} else if (key.equals("rc_front_image")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRc_front_image(null);
			} else {
				vehicle3.setRc_front_image(value);
			}
		} 
		else if (key.equals("rc_back_image")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRc_back_image(null);
			} else {
				vehicle3.setRc_back_image(value);
			}
		} 
			
		
			

			
		else if (key.equals("rc_availability")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRc_availability(null);
			} else {
				vehicle3.setRc_availability(value);
			}
		} 

		else if (key.equals("rc_condition")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRc_condition(null);
			} else {
				vehicle3.setRc_condition(value);;
			}
		} 

		else if (key.equals("mismatch_in_rc")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setMismatch_in_rc(null);
			} else {
				vehicle3.setMismatch_in_rc(value);
			}
		} else if (key.equals("rto")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRto(null);
			} else {
				vehicle3.setRto(value);
			}
		} else if (key.equals("registration_state")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRegistration_state(null);
			} else {
				vehicle3.setRegistration_state(value);
			}
		} 
	
	
		
		else if (key.equals("registration_city")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRegistration_city(null);
			} else {
				vehicle3.setRegistration_city(value);
			}
		} 
		else if (key.equals("rto_noc_issued")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRto_noc_issued(null);
			} else {
				vehicle3.setRto_noc_issued(value);
			}
		} 

		else if (key.equals("insurance_image")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_image(null);
			} else {
				vehicle3.setInsurance_image(value);
			}
		} 
		else if (key.equals("insurance_type")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_type(null);
			} else {
				vehicle3.setInsurance_type(value);
			}
		} 

		
	
		else if (key.equals("insurance_expiry_date")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_expiry_date(null);
			} else {
				vehicle3.setInsurance_expiry_date(value);
			}
		} 

		else if (key.equals("insurance_idv_value")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setInsurance_idv_value(null);
			} else {
				vehicle3.setInsurance_idv_value(value);
			}
		} 
		else if (key.equals("registration_valid")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRegistration_valid(null);
			} else {
				vehicle3.setRegistration_valid(value);
			}
		} 
		else if (key.equals("registration_valid_upto")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRegistration_valid_upto(null);
			} else {
				vehicle3.setRegistration_valid_upto(value);
			}
		} 

		else if (key.equals("road_tax_paid")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setRoad_tax_paid(null);
			} else {
				vehicle3.setRoad_tax_paid(value);
			}
		} 
		else if (key.equals("commercial_vehicle")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setCommercial_vehicle(null);
			} else {
				vehicle3.setCommercial_vehicle(value);
			}
		} else if (key.equals("fitness_upto")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setFitness_upto(null);
			} else {
				vehicle3.setFitness_upto(value);
			}
		} 

		else if (key.equals("under_hypothecation")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setUnder_hypothecation(null);
			} else {
				vehicle3.setUnder_hypothecation(value);
			}
		} 
		else if (key.equals("financial_name")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setFinancial_name(null);
			} else {
				vehicle3.setFinancial_name(value);
			}
		} 
		else if (key.equals("financial_name_other")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setFinancial_name_other(null);
			} else {
				vehicle3.setFinancial_name_other(value);
			}
		} 
		else if (key.equals("ew_tv_warranty")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setEw_tv_warranty(null);
			} else {
				vehicle3.setEw_tv_warranty(value);
			}
		} 
		}

	
		
		
		//carDeatils1.setDealerInfo(dealerInfo2);
		carDeatils1.setVehical(vehicle3);
		
		Gson gSon = new Gson();
		jsonString = gSon.toJson(carDeatils1);

		System.out.println(jsonString);
		return jsonString;
		


	}}	



