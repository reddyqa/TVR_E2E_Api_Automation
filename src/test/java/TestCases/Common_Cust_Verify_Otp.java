package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Common_cutomer_send_otp;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Common_Cust_Verify_Otp extends RestAssuredSetup
{
	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
		public static void customer_verify_otp(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying customer send otp  Response");
			Common_cutomer_send_otp.common_customer_verifyotp_API(data, context);		
		}

}
