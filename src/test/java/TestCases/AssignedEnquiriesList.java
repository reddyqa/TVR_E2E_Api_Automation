package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.AssignedEnquiriesListAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class AssignedEnquiriesList extends RestAssuredSetup {

	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
	public static void assignedEnquiries(Hashtable<String, String>data, ITestContext context)
	{
		String sheetname= "assignedEnquiries";
		
		testLog.get().assignAuthor("Reddy");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Get All Assigned Enquiries List Details");
		
		AssignedEnquiriesListAPI.assignedEnquiries(data, context, sheetname);
					
	}
	
}