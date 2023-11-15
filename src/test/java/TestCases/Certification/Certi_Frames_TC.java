package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.CertFramesAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Certi_Frames_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Frames(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Frames";
		
		testLog.get().assignAuthor("Siva");
		testLog.get().assignCategory("Integration Test");
		testLog.get().info("Get All Certification Frames Details");
		CertFramesAPI.FramesAPI1(data, context, sheetname);
				
	}
	
}