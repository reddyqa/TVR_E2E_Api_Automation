package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.GetOccupationById;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class GetCustomerByUUIDAndOccupationId extends RestAssuredSetup
{
	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp",groups= {"Regression"})
		public static void get_customer_occupation_UUID_ID(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying get Customer occupation by uuid and id Response");
			GetOccupationById.occupation_get_uuid_id(data, context);
		}

}
