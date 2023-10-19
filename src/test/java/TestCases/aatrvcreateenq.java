package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.aaTRVCreateEnqAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class aatrvcreateenq extends RestAssuredSetup{
		

		//@Parameters({ "value" })
			@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
			public static void CreateNewEnq(Hashtable<String, String>data, ITestContext context)
			{
				String sheetname= "CreateNewEnq";
				
				testLog.get().assignAuthor("Reddy");
				testLog.get().assignCategory("Functional Test");
				testLog.get().info("Get All Vehicle Details");
				aaTRVCreateEnqAPI.CreateEnqAPI(data, context,sheetname);			
			}
	}



