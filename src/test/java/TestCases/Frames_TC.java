package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.FramesAPI;

import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Frames_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Frames(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Frames";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		FramesAPI.FramesAPI1(data, context, sheetname);
				
	}
	
}
