package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.All_Generic_MasterAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class All_Master_Generic_API extends RestAssuredSetup
{
	//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
			public static void all_master_generic_api(Hashtable<String, String>data, ITestContext context)
			{
				testLog.get().assignAuthor("Gurender Kumar");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Verifying Customer exists Response");
				All_Generic_MasterAPI.generic_master_API(data, context);				
			}

}
