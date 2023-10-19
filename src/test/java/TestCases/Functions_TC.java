package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.FunctionsAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Functions_TC  extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Functions(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Functions";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		FunctionsAPI.FunctionsAPI1(data, context, sheetname);

				
	}
	
}
