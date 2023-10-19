package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.ExteriorImageUpload;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class ExteriorImgUpload extends RestAssuredSetup 
{
	//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
			public static void ExtImgUpload(Hashtable<String, String>data, ITestContext context)
			{
				String sheetname= "ExtImgUpload";
				
				testLog.get().assignAuthor("Chetan");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Upload Exterior Images");
				ExteriorImageUpload.uploadEximg(data, context,sheetname);			
			}



}