package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.EvaluationDetailsByIDAPI;
import com.MSIL.API_LISTS.FramesAPI;

import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class EvaluationDetailsByID_TC extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void EvaluationDetailsByID(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "EvaluationDetailsByID";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Vehicle Details");
		EvaluationDetailsByIDAPI.EvaluationDetails(data, context, sheetname);
				
	}
	
}
