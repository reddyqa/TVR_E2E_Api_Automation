package TestCases.Certification;

import java.util.Hashtable;

import com.MSIL.API_LISTS.Certification.CertEngineAPI;
import org.testng.ITestContext;
import org.testng.annotations.Test;

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
		
		CertEngineAPI.EngineAPI1(data, context, sheetname);
					
	}
	
}
