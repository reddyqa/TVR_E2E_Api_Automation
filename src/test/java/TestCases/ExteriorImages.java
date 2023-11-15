package TestCases;
import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.ExteriorImagesAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;


public class ExteriorImages extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void Exterior(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "Exterior";
		
		testLog.get().assignAuthor("Chetan");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get Exterior image Details");
		ExteriorImagesAPI.extApi(data, context,sheetname);			
	}

}
