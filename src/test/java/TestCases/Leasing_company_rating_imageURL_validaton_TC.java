package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Leasing_Partner_Ranking_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Leasing_company_rating_imageURL_validaton_TC extends RestAssuredSetup {
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void car_basison_ranking(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Neha Jha");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying new image URL format in Response");
		Leasing_Partner_Ranking_API.leasing_company_imageURL(data, context);				
	}

}

