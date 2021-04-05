package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.All_Generic_MasterAPI;
import com.MSIL.API_LISTS.City_Master_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class City_Master_API_TC extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void city_master(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Neha Jha");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Customer exists Response");
		City_Master_API.city_master_API(data, context);				
	}

}
