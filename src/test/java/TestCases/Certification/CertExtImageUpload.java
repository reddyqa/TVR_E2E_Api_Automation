package TestCases.Certification;
import java.util.Hashtable;

import com.MSIL.API_LISTS.Certification.CertExteriorImageUploadAPI;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class CertExtImageUpload extends RestAssuredSetup
{

		//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
			public static void CertExtImgUpload(Hashtable<String, String>data, ITestContext context)
			{
				String sheetname= "CertExtImgUpload";
				
				testLog.get().assignAuthor("Chetan");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Upload all certification exterior Images");
				CertExteriorImageUploadAPI.uploadCertEximg(data, context,sheetname);
			}
	

}
