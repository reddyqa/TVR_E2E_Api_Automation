package TestCases;

import java.util.Hashtable;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.MSIL.API_LISTS.Customer_Address_Add;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Add_Customer_Address  extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void add_customer_address(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Add Customer Address Response");
		Customer_Address_Add.add_customer_API(data, context);				
	}

}
