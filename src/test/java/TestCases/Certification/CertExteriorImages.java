package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.CertExteriorImagesAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class CertExteriorImages extends RestAssuredSetup
{
	
	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void CertExterior(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "CertExterior";
			
			testLog.get().assignAuthor("Chetan");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Get Exterior image Details");
			CertExteriorImagesAPI.extApi(data, context,sheetname);			
		}


}
