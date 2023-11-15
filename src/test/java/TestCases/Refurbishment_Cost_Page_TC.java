package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Refurbishment_Cost_Page_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Refurbishment_Cost_Page_TC extends RestAssuredSetup {
	

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void Refurbishment_Cost(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "Refurbishment_Cost";
			
			testLog.get().assignAuthor("Reddy");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Get Refurbishment_Cost Details");
			Refurbishment_Cost_Page_API.Refurbishment_Cost_API(data, context,sheetname);			
		}

}
