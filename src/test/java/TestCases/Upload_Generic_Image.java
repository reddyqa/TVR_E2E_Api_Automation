package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.CarDeatilsAPI;
import com.MSIL.API_LISTS.Upload_Generic_Image_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Upload_Generic_Image extends RestAssuredSetup {
	

	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
		public static void genericImage(Hashtable<String, String>data, ITestContext context)
		{
			String sheetname= "genericImage";
			
			testLog.get().assignAuthor("Reddy");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Get All Vehicle Details");
			Upload_Generic_Image_API.Upload_Generic_Image(data, context,sheetname);			
		}

}
