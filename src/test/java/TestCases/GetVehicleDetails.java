package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.GetVehicleDetailsAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;


public class GetVehicleDetails extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void GetVehicleDetailsReg(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "GetVehicleDetailsReg";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		GetVehicleDetailsAPI.Vehicle_Details_API1(data, context, sheetname);
				
	}
	
}
