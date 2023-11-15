package com.MSIL.JSON_Creation;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.testng.ITestContext;

import com.MSIL.POJO.FilterDto;
import com.MSIL.POJO.SearchDto;
import com.MSIL.POJO.WorkshopRoot;
import com.MSIL.Setup.BaseSetup;
import com.google.gson.Gson;

public class WorkShopEnqJson extends BaseSetup
{
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static String workshopEnq(Hashtable<String, String> map, ITestContext context)
    {
        String jsonString = null;
        WorkshopRoot ws = new WorkshopRoot();

        FilterDto ft = new FilterDto();
        SearchDto sc = new SearchDto();

        /* extract read the value from excel */
        Set keys = map.keySet();
        Iterator itr = keys.iterator();
        String key;
        String value;


        while (itr.hasNext()) {

            key = (String) itr.next();
            value = map.get(key);
            System.out.println(key + " - " + value);

            if (key.equals("mspin"))
            {
                if (value.equals("null") || value.equals("")) {
                    ft.setMspin(null);
                } else {
                    ft.setMspin(value);
                }
            } else if (key.equals("fromDate")) {
                if (value.equals("null") || value.equals("")) {
                    ft.setFromDate(null);
                } else {
                    ft.setFromDate(value);
                }
            } else if (key.equals("toDate")) {
                if (value.equals("null") || value.equals("")) {
                    ft.setToDate(null);
                } else {
                    ft.setToDate(value);
                }
            } else if (key.equals("registrationNumber")) {
                if (value.equals("null") || value.equals("")) {
                    sc.setRegistrationNumber(null);
                } else {
                    sc.setRegistrationNumber(value);
                }

            }
        }
        ws.setFilterDto(ft);
        ws.setSearchDto(sc);

        Gson gSon = new Gson();
        jsonString = gSon.toJson(ws);

        System.out.println("jsonString==>"+jsonString);
        return jsonString;

    }

}
