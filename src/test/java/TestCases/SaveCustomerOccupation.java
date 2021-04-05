package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.MSIL.API_LISTS.SaveOccupation;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class SaveCustomerOccupation extends RestAssuredSetup 
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void save_customer_occupation(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying save Customer occupation Response");
		SaveOccupation.occupation_save(data, context);
		
	}

}
