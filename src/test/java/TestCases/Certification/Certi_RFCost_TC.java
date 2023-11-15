package TestCases.Certification;

import java.util.Hashtable;

import com.MSIL.API_LISTS.Certification.CertRFCostAPI;
import org.testng.ITestContext;
import org.testng.annotations.Test;

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
			CertRFCostAPI.Refurbishment_Cost_API(data, context, sheetname);
		}
}