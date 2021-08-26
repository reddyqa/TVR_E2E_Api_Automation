package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Get_Whitelist_API;
import com.MSIL.API_LISTS.Subscription_Tenure_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Subscription_Tenure_TC extends RestAssuredSetup
{
	//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
			public static void Subscription_tenure(Hashtable<String, String>data, ITestContext context)
			{
				testLog.get().assignAuthor("Akhilesh Sharma");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Get all posssible tenures");
				Subscription_Tenure_API.generic_master_API(data, context);			
			}}
