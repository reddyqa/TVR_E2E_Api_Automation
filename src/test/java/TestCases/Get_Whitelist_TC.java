package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.All_Generic_MasterAPI;
import com.MSIL.API_LISTS.Get_Whitelist_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

@SuppressWarnings("unused")
public class Get_Whitelist_TC extends RestAssuredSetup
{
	//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp",groups= {"Regression", "Smoke"})
			public static void Get_Whitelist(Hashtable<String, String>data, ITestContext context)
			{
				testLog.get().assignAuthor("Akhilesh Sharma");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Get Whitelist leasing companies details");
				Get_Whitelist_API.generic_master_API(data, context);			
			}
			
}


