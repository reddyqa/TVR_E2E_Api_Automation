package com.MSIL.Setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import com.MSIL.TestUtils.Environment;
import com.MSIL.TestUtils.ExcelReader;
import com.MSIL.TestUtils.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class BaseSetup
{
	public int lStartTime;
	public int lEndTime;
	public static Logger log = Logger.getLogger(BaseSetup.class);
	public static ExcelReader excel = new ExcelReader("./testdata/TestData.xlsx");
	public static Properties config = new Properties();
	public static ExtentReports extent;
	public static ThreadLocal<ExtentTest> parentTest= new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testLog = new ThreadLocal<ExtentTest>();
	
	public Map<String, ExtentTest> map = new HashMap<String, ExtentTest>();
	
	public static Properties configProperty;
	
	public static String propertyFilepath ="./propertiesFiles/config.properties";
	
	@BeforeSuite
	public void setup()
	{
		try {
			FileInputStream fi = new FileInputStream(new File(propertyFilepath));
			configProperty = new Properties();
			try {
				configProperty.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extent = ExtentManager.GetExtent();	
	}
	
	@BeforeClass
	public void beforClass()
	{
		String className = getClass().getName();
		className= className.substring(className.lastIndexOf(".")+1);
		ExtentTest parent = extent.createTest(className);
		parentTest.set(parent);
		
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		;
	}
	@Parameters({ "env" })
	@BeforeTest
	public void beforeTest(String environment)
	{
		log.info("Starting execution ");
		lStartTime = (int) new Date().getTime();
		
		switch (environment) {

		case Environment.LOCAL:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.LOCAL);
			break;
		case Environment.DEV:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.DEV);
			break;
		case Environment.QA:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.QA);
			break;
		case Environment.HOTFIX:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.HOTFIX);
			break;
		case Environment.PREPROD:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.PREPROD);
			break;
		case Environment.PROD:
			System.setProperty(com.MSIL.TestUtils.Properties.ENVIRONMENT, Environment.PROD);
			break;

		default:
			log.error("Please rerun again and enter correct environment.");
			Assert.fail("Could not execute the scripts due to incorrect evironment specified");
			break;
		}
	}
	
	@AfterMethod
	public void afterMethod()
	{
		extent.flush();
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
	}
	
	public void assertStatusCode(int statusCode, String expectedStatusCode)
	{
		String expectedcode = expectedStatusCode.split(".")[0];
		Assert.assertEquals(Integer.toString(statusCode), expectedcode);
	}
	
	public String getExpStatusCode(String expectedcode) 
	{
		return expectedcode.substring(0, expectedcode.indexOf('.'));
		
	}
	
	public void assignAuthor(String authorName)
	{
		testLog.get().assignAuthor(authorName);
	}
	
	public void assignCategory(String category)
	{
		testLog.get().assignCategory(category);
	}

}
