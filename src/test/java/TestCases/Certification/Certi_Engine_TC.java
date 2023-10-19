package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.Certi_Engine_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Certi_Engine_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Engine(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Engine";
		
		testLog.get().assignAuthor("Siva");
		testLog.get().assignCategory("End to End API Testing");
		testLog.get().info("Get All Certification Engine Details");
		
		Certi_Engine_API.EngineAPI1(data, context, sheetname);
					
	}
	
}
