package com.MSIL.JSON_Creation;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.MSIL.POJO.Token;
import com.MSIL.POJO.Vehicle_list;
import com.MSIL.POJO.Vl_sort;
import com.MSIL.POJO.vehicle_request;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class CreateJsonFile extends BaseSetup
{
	@SuppressWarnings("rawtypes")
	public static String createJson(Hashtable<String, String> map)
	{
		String jsonString=null;
		vehicle_request vr = new vehicle_request();
		Vehicle_list vl= new Vehicle_list();
		Vl_sort sort = new Vl_sort();
		Token t = new Token();
		
		/*extract read the value from excel*/
		
		Set keys = map.keySet();
		Iterator itr = keys.iterator();
		//System.out.println("The value of Itr "+itr.hasNext());
		String key;
		String value;
		int i;
		
		while(itr.hasNext())
		{
			vr.setFilter(vl);
			vr.setSort(sort);
			key = (String) itr.next();
			value = map.get(key);
			//System.out.println(key + " - "+ value);
			if(key.equals("cityId"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setCityId(null);
				}else
				{
					long f = (long) Float.parseFloat(value);
					vl.setCityId(f);					
				}
				
								
			}else if (key.equals("tenureId"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setTenureId(null);
				}else
				{
					long f = (long) Float.parseFloat(value);
					vl.setTenureId(f);
				}
				
			}else if(key.equals("resolution"))
			{
				vl.setResolution(value);
			}else if(key.equals("isNew"))
			{
				boolean bool_value = Boolean.parseBoolean(value);
				vl.setIsNew(bool_value);
			}else if(key.equals("categoryIds"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setCategoryIds(null);
				}else
				{
				String[] s_value = value.split(",");
				int size = s_value.length;
				Long[] arr = new Long [size];
				for(i=0; i<arr.length; i++)
				{
					System.out.println("The value fo s_value : "+s_value[i]);
					long f = (long) Float.parseFloat(s_value[i]);
					//arr[i] =Integer.parseInt(s_value[i]);
					arr[i]= f;
				}
				vl.setCategoryIds(arr);
				}
			}else if(key.equals("bodyType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setBodyType(null);
				}else
				{
					List<String> bodyType = new ArrayList<String>();
					bodyType.add(value);
					vl.setBodyType(bodyType);
				}
				
				//vl.setBodyType(value);
			}else if(key.equals("transmissionType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setTransmissionType(null);
				}else
				{
					List<String> transmissionType = new ArrayList<String>();
					transmissionType.add(value);
					vl.setTransmissionType(transmissionType);
				}
			
				//vl.setTransmissionType(value);
			}else if(key.equals("fuelType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setFuelType(null);
				}else
				{
					List<String> fuelType = new ArrayList<String>();
					fuelType.add(value);
					vl.setFuelType(fuelType);
				}
				
				//vl.setFuelType(value);
			}else if(key.equals("channelType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setChannelType(null);
				}else
				{
					List<String> channelType = new ArrayList<String>();
					channelType.add(value);
					vl.setChannelType(channelType);
				}
				
				//vl.setChannelType(value);
			}else if(key.equals("colorType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setColorType(null);
				}else
				{
					List<String> colorType = new ArrayList<String>();
					colorType.add(value);
					vl.setColorType(colorType);
				}
				
				//vl.setColorType(value);
			}else if(key.equals("registrationType"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setRegistrationType(null);
				}else
				{
					List<String> registrationType = new ArrayList<String>();
					registrationType.add(value);
					vl.setRegistrationType(registrationType);
				}
				
			}else if(key.equals("modelCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setModelCode(null);
				}else
				{
					List<String> model_cd = new ArrayList<String>();
					model_cd.add(value);
					vl.setModelCode(model_cd);
				}
				
			}else if(key.equals("variantCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setVariantCode(null);
				}else
				{
					List<String> variantCode = new ArrayList<String>();
					variantCode.add(value);
					vl.setVariantCode(variantCode);
				}
			
			}else if(key.equals("fromPrice"))
			{
				if(value.equals("null")||value.equals("")) 
				  { 
					  vl.setToPrice(null);
				  }else {
					  Long l = Long.parseLong(value);
					  vl.setFromPrice(l);
					  
				  }
				
			}else if(key.equals("toPrice"))
			{
				
				  if(value.equals("null")||value.equals("")) 
				  { 
					  vl.setToPrice(null);
				  }else {
					  Long l = Long.parseLong(value);
						vl.setToPrice(l);
					  
				  }
				 
				
			}else if(key.equals("filterSortOnPostGST"))
			{
				boolean bool_value = Boolean.parseBoolean(value);
				vl.setFilterSortOnPostGST(bool_value);
			}else if(key.equals("startDate"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setStartDate(null);
				}else
				{
					vl.setStartDate(value);
				}
				
			}else if(key.equals("forCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setForCode(null);
				}else
				{
					vl.setForCode(value);
				}
				
			}else if(key.equals("leasingCompCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setLeasingCompCode(null);
				}else
				{
					List<String> leasingcompCode = new ArrayList<String>();
					leasingcompCode.add(value);
					vl.setLeasingCompCode(leasingcompCode);
				}
				
			}else if(key.equals("mileageCode"))
			{
				if(value.equals("null")||value.equals(""))
				{
					vl.setMileageCode(null);
				}else
				{
					vl.setMileageCode(value);
				}
				
			}
			else if(key.equals("price"))
			{
				sort.setPrice(value);
			}else if(key.equals("popularity"))
			{
				sort.setPopularity(value);
			}else if(key.equals("newAddition"))
			{
				sort.setNewAddition(value);
			}
						
		}
		Gson gSon = new Gson();
		jsonString = gSon.toJson(vr);
		
		//System.out.println(jsonString);
		return jsonString;
	
	}

}
