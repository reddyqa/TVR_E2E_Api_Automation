package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.generate_Token;
import com.MSIL.ENUMS.TestContext;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class generateToken extends RestAssuredSetup
{
	TestContext context = new TestContext();
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void gen_auth_token(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A002 Response");
		context.setAttribute("Authorization", generate_Token.generatetoken(data));
		//context.setContext("Authorization", generate_Token.generatetoken(data));
	}
}
