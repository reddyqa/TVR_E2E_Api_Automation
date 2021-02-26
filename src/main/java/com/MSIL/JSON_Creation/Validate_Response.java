package com.MSIL.JSON_Creation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.path.json.JsonPath;



public class Validate_Response
{
	public static String validate_response(String filename)
	{
		JsonPath json_path = new JsonPath(filename);
		String auth_token = json_path.get().toString();
		//String auth_token = json_path.get("$.error.errors.data").toString();
		
		return auth_token;
		
		/*
		 * FileReader reader = null; try { reader = new FileReader(filename); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } JSONParser jsonParser = new JSONParser(); try { return
		 * jsonParser.parse(reader); } catch (IOException | ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } return jsonParser;
		 */
		
	}

}
