package TestCases;

import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.WorkShopEnquiryAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class workshopEnq extends RestAssuredSetup
{
	
    //@Parameters({ "value" })
    @Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
    public static void WorkShop(Hashtable<String, String> data, ITestContext context)
    {
        String sheetname= "WorkShop";

        testLog.get().assignAuthor("chetan");
        testLog.get().assignCategory("Functional Test");
        testLog.get().info("Get Workshop Enquiry list");
        WorkShopEnquiryAPI.workshopEnqAPI(data, context,sheetname);
    }

}
