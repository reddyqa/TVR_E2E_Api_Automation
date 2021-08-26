package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Vehicle_Configure_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Vehicle_Configure_TC extends RestAssuredSetup{

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Vehicle_configure(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Akhilesh Sharma");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All the possible values");
		Vehicle_Configure_API.generic_master_API(data, context);;			
	}
}
