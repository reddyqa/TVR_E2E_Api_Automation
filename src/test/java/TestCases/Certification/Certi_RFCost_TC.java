package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.Certi_RatingAndPricing_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Certi_RFCost_TC extends RestAssuredSetup {
	

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void Refurbishment_Cost(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "Refurbishment_Cost";
			
			testLog.get().assignAuthor("Siva");
			testLog.get().assignCategory("Integration Testing");
			testLog.get().info("Get Certification Refurbishment_Cost Details");
			Certi_RatingAndPricing_API.Rating_And_Pricing_API(data, context, sheetname);			
		}
}