package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Cust_Regsiration_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Get_Customer_Detail_BY_UUID extends RestAssuredSetup 
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void get_customer_detail_uuid(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Get Customer details Response");
		Cust_Regsiration_API.get_customer_details_uuid_API(data, context);
		
	}

}
