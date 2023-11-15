package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Rating_And_Pricing_Page_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Rating_And_Pricing_Page_TC extends RestAssuredSetup {
	

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void Rating_And_Pricing(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "Rating_And_Pricing";
			testLog.get().assignAuthor("Reddy");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Get Rating_And_Pricing_Page_API Details");
			Rating_And_Pricing_Page_API.Rating_And_Pricing_API(data, context,sheetname);			
		}

}
