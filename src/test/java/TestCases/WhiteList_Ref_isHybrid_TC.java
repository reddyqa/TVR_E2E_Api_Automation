package TestCases;

import java.util.Hashtable;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import com.MSIL.API_LISTS.WhiteList_Ref_API;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class WhiteList_Ref_isHybrid_TC  extends RestAssuredSetup

{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void Whitelist_Ref_ishybrid(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Neha Jha");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying isHybrid parameter is available in whitelist Ref API");
		WhiteList_Ref_API.Whitelist_Ref_API(data, context);		
	}

}