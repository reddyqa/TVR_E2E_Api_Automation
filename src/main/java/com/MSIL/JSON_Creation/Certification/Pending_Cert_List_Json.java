package com.MSIL.JSON_Creation.Certification;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.ITestContext;


import com.MSIL.POJO.Certification.Pending_Cert_Pojo;
import com.MSIL.POJO.Certification.filter;
import com.MSIL.POJO.Certification.search;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class Pending_Cert_List_Json extends BaseSetup
{
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String Pending_Cert(Hashtable<String, String> map, ITestContext context) {
		String jsonString = null;
		Pending_Cert_Pojo rootcert = new Pending_Cert_Pojo();
		search ser=new search();
		filter fl=new filter();

		/* extract read the value from excel */
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		String key;
		String value ;


		while (itr.hasNext()) {

			key = (String) itr.next();
			value = map.get(key);
			System.out.println(key + " - " + value);

			if (key.equals("parent_grp")) {
				if (value.equals("null") || value.equals("")) {
					fl.setParent_grp(null);
				} else {
					fl.setParent_grp(value);
				}
			} else if (key.equals("dealer_map_cd")) {
				if (value.equals("null") || value.equals("")) {
					fl.setDealer_map_cd(null);
				} else {
					fl.setDealer_map_cd(value);
				}
			} else if (key.equals("loc_cd")) {
				if (value.equals("null") || value.equals("")) {
					fl.setLoc_cd(null);
				} else {
					fl.setLoc_cd(value);
				}
			}


			else if (key.equals("comp_fa")) {
				if (value.equals("null") || value.equals("")) {
					fl.setComp_fa(null);
				} else {

					fl.setComp_fa(value);
				}
			} else if (key.equals("fromDate")) {
				if (value.equals("null") || value.equals("")) {
					fl.setFromDate(null);
				} else {


					fl.setFromDate(value);
				}
			} else if (key.equals("toDate")) {
				if (value.equals("null") || value.equals("")) {
					fl.setToDate(null);
				} else {
					fl.setToDate(value);
				}
			} else if (key.equals("Status")) {
				if (value.equals("null") || value.equals("")) {
					fl.setStatus(null);
				} else {
					fl.setStatus(value);
				}
			}

			else if (key.equals("trvVehicle")) {
				if (value.equals("null") || value.equals("")) {
					fl.setTrvVehicle(null);
				} else {
					fl.setTrvVehicle(value);
				}
			}

			else if (key.equals("msilVehicle")) {
				if (value.equals("null") || value.equals("")) {
					fl.setMsilVehicle(null);
				} else {
					fl.setMsilVehicle(value);
				}
			}

			else if (key.equals("buyingId")) {
				if (value.equals("null") || value.equals("")) {
					ser.setBuyingId(null);
				} else {
					ser.setBuyingId(value);
				}
			}
			else if (key.equals("registrationNumber")) {



				if (value.equals("null") || value.equals("")) {
					ser.setRegistrationNumber(null);
				} else {
					ser.setRegistrationNumber(value);
				}
			}

		}


		//work

		rootcert.setFilter(fl);
		rootcert.setSearch(ser);

		Gson gSon = new Gson();
		jsonString = gSon.toJson(rootcert);

		System.out.println(jsonString); return jsonString;




	}}
