package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.City_Master_API_Number_Plate_Keyword;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class City_Master_Number_Plate_TC extends RestAssuredSetup

{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void city_master(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Neha Jha");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Number plate in city master API response");
		City_Master_API_Number_Plate_Keyword.city_master_API(data, context);			
	}

}
