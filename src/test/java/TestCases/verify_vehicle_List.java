package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Vehicle_List_v2;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;



public class verify_vehicle_List extends RestAssuredSetup 
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verify_list(Hashtable<String, String>data, ITestContext context)
	{
		
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A002 Response");
		Vehicle_List_v2.verify_price_listing(data, context.getAttribute("Authorization"));
		
	}
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void verify_list_city_invalid(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A002 Response");
		Vehicle_List_v2.verify_price_listing_invalidcity(data, context.getAttribute("Authorization"));
	}

}
