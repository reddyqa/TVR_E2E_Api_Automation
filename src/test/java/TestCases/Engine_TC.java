package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.EngineAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Engine_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Engine(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Engine";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		
		EngineAPI.EngineAPI1(data, context, sheetname);
					
	}
	
}