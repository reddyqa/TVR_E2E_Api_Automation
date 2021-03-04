package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Leasing_Partner_Ranking_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Leasing_Partner_Ranking extends RestAssuredSetup
{
	
		//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
		public static void leasing_ranking(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Neha Jha");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying Car price basis on ranking Response");
			Leasing_Partner_Ranking_API.leasing_partner_ranking(data, context);			
		}


}
