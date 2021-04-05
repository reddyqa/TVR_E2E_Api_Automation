package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Get_Customer_Address;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class CustomerAddressGet extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void get_customer_address(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Add Customer Address Response");
		Get_Customer_Address.get_customer_address_API(data, context);				
	}

}
