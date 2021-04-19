package com.MSIL.TestUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class ReadFromDB 
{
	public static final Logger log = Logger.getLogger(ReadFromDB.class);
	
	public static List<String> getData(String dbName, String query) 
	{

		log.info("Executing query: " + query);
		List<String> reqData = new ArrayList<>();
		Connection connection = DBConnectionUtils.getconnection(dbName);

		try (PreparedStatement stm = connection.prepareStatement(query)) {
			try (ResultSet resultSet = stm.executeQuery()) {
				while (resultSet.next()) {
					reqData.add(resultSet.getString(1));
				}
			}

		} catch (SQLException e1) {
			log.error(e1.getMessage());
		}

		return reqData;
	}

}
