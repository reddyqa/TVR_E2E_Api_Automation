package TestCases;

import java.util.Hashtable;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.MSIL.API_LISTS.Car_Price_On_Ranking;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Car_Model_Ranking extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp",groups= {"Regression"})
	public static void car_basison_ranking(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Neha Jha");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying Car price basis on ranking Response");
		Car_Price_On_Ranking.car_price_on_ranking_API(data, context);				
	}

}
