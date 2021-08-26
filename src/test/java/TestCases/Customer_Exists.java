package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Cust_Regsiration_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Customer_Exists extends RestAssuredSetup
{
	
		//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression"})
		public static void customer_exists(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying Customer exists Response");
			Cust_Regsiration_API.customer_exists_API(data, context);
			
		}
		
		//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
		public static void invalid_customer_exists(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying Customer exists Response");
			Cust_Regsiration_API.customer_exists_API(data, context);
					
		}

}
