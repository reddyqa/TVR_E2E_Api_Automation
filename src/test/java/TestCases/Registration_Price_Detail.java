package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Registration_Price_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Registration_Price_Detail extends RestAssuredSetup {
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void registration_price(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Customer exists Response");
		Registration_Price_API.registration_price_api(data, context);
		
	}

}
