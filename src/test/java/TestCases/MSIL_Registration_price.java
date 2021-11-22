package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.MSIL_Registration_API;
import com.MSIL.API_LISTS.Registration_Price_API;
import com.MSIL.Setup.MSILRestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

import io.restassured.RestAssured;

public class MSIL_Registration_price {
	
	//static MSILRestAssuredSetup msil_setup = new MSILRestAssuredSetup();
	
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void msil(Hashtable<String, String>data, ITestContext context)
	{
		/*
		 * String URI = RestAssured.baseURI; System.out.println(URI);
		 */
		MSIL_Registration_API.msil_registration_price_api(data, context);
		
	}

}
