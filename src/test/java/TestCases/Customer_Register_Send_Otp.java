package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Common_cutomer_send_otp;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class Customer_Register_Send_Otp extends RestAssuredSetup
{
	//@Parameters({ "value" })
	@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
	public static void customer_regsiter_send_otp(Hashtable<String, String>data, ITestContext context)
	{
		testLog.get().assignAuthor("Gurender Kumar");
		testLog.get().assignCategory("Functional Test");
		testLog.get().info("Verifying customer send otp  Response");
		Common_cutomer_send_otp.common_customer_sendotp_API(data, context);		
	}
	
	//@Parameters({ "value" })
		@Test(dataProviderClass= DataProviderClass.class, dataProvider="dp")
		public static void invalid_mobile_send_otp(Hashtable<String, String>data, ITestContext context)
		{
			testLog.get().assignAuthor("Gurender Kumar");
			testLog.get().assignCategory("Functional Test");
			testLog.get().info("Verifying customer send otp  Response");
			Common_cutomer_send_otp.common_customer_sendotp_API(data, context);		
		}

}
