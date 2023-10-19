package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.InteriorAPI;
import com.MSIL.API_LISTS.aaTRVCreateEnqAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Interior1 extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Interior(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Interior";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Call Interior Details API");
		InteriorAPI.InteriorAPI1(data, context,sheetname);			
	}
	
}
