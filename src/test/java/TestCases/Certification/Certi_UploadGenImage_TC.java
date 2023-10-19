package TestCases.Certification;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.Certi_UploadGenImage_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Certi_UploadGenImage_TC extends RestAssuredSetup {
	

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void genericImage(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "genericImage";
			
			testLog.get().assignAuthor("Siva");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Upload Generic Image Details");
			Certi_UploadGenImage_API.Upload_Generic_Image(data, context,sheetname);			
		}

}
