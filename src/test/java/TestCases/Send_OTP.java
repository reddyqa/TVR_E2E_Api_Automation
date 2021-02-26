package TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;
import com.MSIL.API_LISTS.send_OTP;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Send_OTP extends RestAssuredSetup
{
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public void s_otp(Hashtable<String, String>data)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying A002 Response");
		send_OTP.sendotp(data);
	}

}
