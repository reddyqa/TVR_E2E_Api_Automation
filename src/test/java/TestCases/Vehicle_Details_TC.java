package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Vehicle_Details_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Vehicle_Details_TC extends RestAssuredSetup{

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void Vehicle_details(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Akhilesh Sharma");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Get All Vehicle Details");
			Vehicle_Details_API.generic_master_API(data, context);;			
		}
}
