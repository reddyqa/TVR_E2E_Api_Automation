package TestCases.Certification;

import java.util.Hashtable;

import com.MSIL.API_LISTS.Certification.CertFunctionsAPI;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Certi_Functions_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Functions(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Functions";
		
		testLog.get().assignAuthor("Siva");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Certification Details");
		CertFunctionsAPI.FunctionsAPI1(data, context, sheetname);

				
	}
	
}
