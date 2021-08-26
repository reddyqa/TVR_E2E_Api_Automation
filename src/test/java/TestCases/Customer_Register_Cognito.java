package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Common_Customer_Register_Cognito;
import com.MSIL.API_LISTS.Cust_Regsiration_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Customer_Register_Cognito extends RestAssuredSetup
{
		//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void customer_register_cognito(Hashtable<String, String>data, ITestContext context) throws InterruptedException
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying Customer Registartion Response");
			Common_Customer_Register_Cognito.common_customer_registercognito_API(data, context);
			
		}

}
