package com.MSIL.TestUtils;
import java.util.Map;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Verify_Response_city 
{
	public static void verify_Response(Response str_Reponse, String expected_code, String expected_message)
    {
        System.out.println("Message: "+str_Reponse.getBody().asString());
        JsonPath jsonPathEvaluator = str_Reponse.jsonPath();
        //Queries q = new Queries();
        
        Map<String, String> lhmap = jsonPathEvaluator.getMap("data[0]");
        System.out.println("Error Message: "+lhmap.get("cityName"));
       
    }
}
