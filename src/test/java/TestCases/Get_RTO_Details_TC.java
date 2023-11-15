package TestCases;


import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Get_RTO_Details;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Get_RTO_Details_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void RTO(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "RTO";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		Get_RTO_Details.Get_RTO_Details_API(data, context, sheetname);
				
	}
	
}
