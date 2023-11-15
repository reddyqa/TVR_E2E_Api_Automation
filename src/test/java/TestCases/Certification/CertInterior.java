package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.CertInteriorAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class CertInterior extends RestAssuredSetup
{
	

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void CertInterior(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "CertInterior";
		
		testLog.get().assignAuthor("Chet");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Call Interior Details API");
		CertInteriorAPI.InteriorAPI(data, context,sheetname);
	}

}
