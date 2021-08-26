package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Fetch_Nearest_Dealer_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Fectch_Nearest_Dealer extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void fetch_nearest_dealer (Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Akhilesh Sharma");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Nearest Dealer Response");
		Fetch_Nearest_Dealer_API.nearest_dealer_API(data, context);			
	}
	
	/*
	 * //@Parameters({ "value" })
	 * 
	 * @Test(dataProviderClass= DataProviderClass.class, dataProvider="dp") public
	 * static void nearest_dealer_not_found (Hashtable<String, String>data,
	 * ITestContext context) { testLog.get().assignAuthor("Akhilesh Sharma");
	 * testLog.get().assignCategory("Functional Test");
	 * testLog.get().info("Verifying Nearest Dealer Response");
	 * Fetch_Nearest_Dealer_API.nearest_dealer_API(data, context); }
	 */

}
