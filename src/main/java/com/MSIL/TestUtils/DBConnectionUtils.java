package com.MSIL.TestUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class DBConnectionUtils
{
	public static Map<String, Connection> connectionmap = new HashMap<String, Connection>();
	public static boolean sslFlag = Boolean.parseBoolean(ReadFromProperty.getProperty(Properties.SSL));
	public static String addSSLtrue = "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory&sslmode=require";
	public static Logger log = Logger.getLogger(DBConnectionUtils.class);
	//public static Connection connection=null;
	
	public static Connection getconnection(String dbName)
	{
		Connection connection;
		if(connectionmap.containsKey(getURL(dbName)))
		{
			connection = connectionmap.get(getURL(dbName));
			try {
				if(connection.isClosed())
					connectionmap.replace(dbName, setUpDBConnection(dbName));
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			return connection;
		}else 
		{
			connectionmap.put(getURL(dbName), setUpDBConnection(dbName));
			System.out.println("The value: "+connectionmap.get(getURL(dbName)));
			//System.out.println(connectionmap.get(getURL(dbName)));
			return connectionmap.get(getURL(dbName));
		}
				
	}
	
	public static void closeConnection() 
	{
		log.info("closing DB Connection");

		for (Entry<String, Connection> temp : connectionmap.entrySet()) {
			try {
				if (!temp.getValue().isClosed())
					temp.getValue().close();
			} catch (SQLException e) {
				log.error(e.getMessage());
			}
		}
	}

	public static Connection setUpDBConnection(String dbName)
	{
		Connection connection =null;
		try
		{
			log.info("Setting Up Database Connection");
			switch (System.getProperty(Properties.ENVIRONMENT))
			{
			case Environment.LOCAL:
				connection = DBConnectionUtils.forLocal(dbName);
				break;
			case Environment.DEV:
				connection = DBConnectionUtils.forDev(dbName);
				break;
			case Environment.QA:
				connection = DBConnectionUtils.forQA(dbName);
				break;
			case Environment.PREPROD:
				connection = DBConnectionUtils.forPreprod(dbName);
				break;
			case Environment.HOTFIX:
				connection = DBConnectionUtils.forHotfix(dbName);
				break;
			case Environment.PROD:
				connection = DBConnectionUtils.forProd(dbName);
			default:
				log.error("please enter the correct environment");
				break;
			
			}
			log.info("Database connection established successfully on " + System.getProperty(Properties.ENVIRONMENT)
			+ " environment");
			
		}catch (Exception e) {
			e.getMessage();
		}
			
			
		
		return connection;
	}

	public static String getURL(String dbName)
	{
		switch (System.getProperty(Properties.ENVIRONMENT)) 
		{
		case Environment.LOCAL:
			if(sslFlag)
				return DBConnString.LOCAL.URL+"/"+dbName+addSSLtrue;
			else
				return DBConnString.LOCAL.URL+"/"+dbName+"?";			
		case Environment.QA:
			if(sslFlag)
				return DBConnString.QA.URL+"/"+dbName+addSSLtrue;
			else
				return DBConnString.QA.URL+"/"+dbName+"?";
		case Environment.PROD:
			if(sslFlag)
				return DBConnString.PROD.URL+"/"+dbName+addSSLtrue;
			else
				return DBConnString.PROD.URL+"/"+dbName+"?";
		case Environment.PREPROD:
			if(sslFlag)
				return DBConnString.PREPROD.URL+"/"+dbName+addSSLtrue;
			else 
				return DBConnString.PREPROD.URL+"/"+dbName+"?";					
		case Environment.HOTFIX:
			if(sslFlag)
				return DBConnString.HOTFIX.URL+"/"+dbName+addSSLtrue;
			else
				return DBConnString.HOTFIX.URL+"/"+dbName+"?";
		case Environment.DEV:
			if(sslFlag)
				return DBConnString.DEV.URL+"/"+dbName+addSSLtrue;
			else
				return DBConnString.DEV.URL+"/"+dbName+"?";
			

		default:
			break;
		}
		return null;
	}
	
	public static Connection forLocal(String dbName) throws SQLException
	{
		return DriverManager.getConnection(getURL(dbName), DBConnString.LOCAL.USERNAME, DBConnString.LOCAL.PASSWORD);
	}
	
	public static Connection forDev(String dbName) throws SQLException
	{
		return DriverManager.getConnection(getURL(dbName), DBConnString.DEV.USERNAME, DBConnString.DEV.PASSWORD);
	}
	public static Connection forQA(String dbName) throws SQLException
	{
		Connection connection = null;
		switch (dbName)
		{
		case Database.PAYMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.PAYMENT.USERNAME,
					DBConnString.QA.PAYMENT.PASSWORD);
			
			break;
		case Database.SUBSCRIBE_VEHICLE_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.SUBSCRIBE_VEHICLE_MANAGEMENT.USERNAME,
					DBConnString.QA.SUBSCRIBE_VEHICLE_MANAGEMENT.PASSWORD);

			break;
		case Database.COMMON_MASTERDATA:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.COMMON_MASTERDATA.USERNAME,
					DBConnString.QA.COMMON_MASTERDATA.PASSWORD);
			break;
		case Database.COMMON_USER_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.COMMON_USER_MANAGEMENT.USERNAME,
					DBConnString.QA.COMMON_USER_MANAGEMENT.PASSWORD);
			break;
		case Database.COMMON_CUSTOMER:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.COMMON_CUSTOMER.USERNAME, 
					DBConnString.QA.COMMON_CUSTOMER.PASSWORD);
			break;
		case Database.PARTNER_ACL:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.QA.PARTNER_ACL.USERNAME, 
					DBConnString.QA.PARTNER_ACL.PASSWORD);
			break;
		default:
			log.error("Enter correct Database name");
			break;
		}
		return connection;
	}
	
	public static Connection forHotfix(String dbName) throws SQLException {
		return DriverManager.getConnection(getURL(dbName), DBConnString.HOTFIX.USERNAME, DBConnString.HOTFIX.PASSWORD);
	}

	public static Connection forPreprod(String dbName) throws SQLException {

		Connection connection = null;

		switch (dbName) {
		case Database.PAYMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PREPROD.PAYMENT.USERNAME,
					DBConnString.PREPROD.PAYMENT.PASSWORD);
			break;

		case Database.PARTNER_ACL:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PREPROD.PARTNER_ACL.USERNAME,
					DBConnString.PREPROD.PARTNER_ACL.PASSWORD);
			break;

		case Database.SUBSCRIBE_VEHICLE_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName),
					DBConnString.PREPROD.SUBSCRIBE_VEHICLE_MANAGEMENT.USERNAME,
					DBConnString.PREPROD.SUBSCRIBE_VEHICLE_MANAGEMENT.PASSWORD);
			break;

		case Database.COMMON_MASTERDATA:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PREPROD.COMMON_MASTERDATA.USERNAME,
					DBConnString.PREPROD.COMMON_MASTERDATA.PASSWORD);
			break;
			
		case Database.COMMON_CUSTOMER:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PREPROD.COMMON_CUSTOMER.USERNAME, 
					DBConnString.PREPROD.COMMON_CUSTOMER.PASSWORD);
			break;
		case Database.COMMON_USER_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PREPROD.COMMON_USER_MANAGEMENT.USERNAME,
					DBConnString.PREPROD.COMMON_USER_MANAGEMENT.PASSWORD);
			break;

		default:
			log.error("Enter correct Database name");
			break;

		}

		return connection;
	}
	public static Connection forProd(String dbName) throws SQLException {

		Connection connection = null;

		switch (dbName) {
		case Database.COMMON_USER_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PROD.COMMON_USER_MANAGEMENT.USERNAME,
					DBConnString.PROD.COMMON_USER_MANAGEMENT.PASSWORD);
			break;

		case Database.SUBSCRIBE_BOOKING_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName),
					DBConnString.PROD.SUBSCRIBE_BOOKING_MANAGEMENT.USERNAME,
					DBConnString.PROD.SUBSCRIBE_BOOKING_MANAGEMENT.PASSWORD);
			break;

		case Database.SUBSCRIBE_VEHICLE_MANAGEMENT:
			connection = DriverManager.getConnection(getURL(dbName),
					DBConnString.PROD.SUBSCRIBE_VEHICLE_MANAGEMENT.USERNAME,
					DBConnString.PROD.SUBSCRIBE_VEHICLE_MANAGEMENT.PASSWORD);
			break;

		case Database.PAYMENT:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PROD.PAYMENT.USERNAME,
					DBConnString.PROD.PAYMENT.PASSWORD);
			break;

		case Database.COMMON_MASTERDATA:
			connection = DriverManager.getConnection(getURL(dbName), DBConnString.PROD.COMMON_MASTERDATA.USERNAME,
					DBConnString.PROD.COMMON_MASTERDATA.PASSWORD);
			break;

		default:
			log.info("Enter correct Database name");
			break;

		}

		return connection;
	}

	
}
