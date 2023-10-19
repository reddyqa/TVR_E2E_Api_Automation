package com.MSIL.JSON_Creation.Certification;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.Certification.vehical;
import com.MSIL.POJO.Certification.vehicalPojo;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.TestUtils.RandomNameGenerator;
import com.google.gson.Gson;

public class CarDeatilsJSON1 extends BaseSetup{ 
	static RandomNameGenerator EvName=new RandomNameGenerator();
	static String date;
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String vehicle(Hashtable<String, String> map, ITestContext context) {
		
		
		String jsonString = null;
		vehicalPojo carDeatils1=new vehicalPojo();
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

			if (key.equals("mspin")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setMspin(null);
				} else {
					carDeatils1.setMspin(value);
				}
			}  else if (key.equals("certificationId")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setCertificationId(null);
				} else {
					carDeatils1.setCertificationId(value);
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
			} 

			else if (key.equals("stageCode")) {
				if (value.equals("null") || value.equals("")) {
					carDeatils1.setStageCode(null);
				} else {
					carDeatils1.setStageCode(value);
				}
			} 
			
			//vehivl
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
			else if (key.equals("registration_number")) {
				if (value.equals("null") || value.equals("")) {
					vehicle3.setRegistration_number(null);
				} else {
					vehicle3.setRegistration_number(value);
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
			else if (key.equals("year_of_manufacturing")) {
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
				//date= RandomNameGenerator.generateDateWithYear(value);

				System.out.println("date_of_registration----->"+date);
				vehicle3.setDate_of_registration(value);
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
		

		else if (key.equals("last_transaction_dealer_name")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setLast_transaction_dealer_name(null);
			} else {
				vehicle3.setLast_transaction_dealer_name(value);
			}
		} 
		 else if (key.equals("name_on_rc")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setName_on_rc(null);
			} else {
				
			String rcname=	RandomNameGenerator.generateName();
			
			log.info("rcname-------->"+rcname);
				vehicle3.setName_on_rc(rcname);
			}
		} 

		
		 else if (key.equals("rc_front_image")) {
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
		else if (key.equals("time_spent")) {
			if (value.equals("null") || value.equals("")) {
				vehicle3.setTime_spent(null);
			} else {
				vehicle3.setTime_spent(value);
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



