package TestCases.Certification;
import java.util.Hashtable;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.API_LISTS.Certification.PendingCertificationsListAPI;
import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;
    public class PendingCertificationsListTC extends RestAssuredSetup{


        //@Parameters({ "value" })
        @Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
        public static void Pending_Certi_List(Hashtable<String, String>data, ITestContext context)
        {
            String sheetname= "Pending_Certi_List";

            testLog.get().assignAuthor("Reddy");
            testLog.get().assignCategory("End to End API Automation Test");
            testLog.get().info("Get All Pending_Certifications_List");
            PendingCertificationsListAPI.Pending_Certi_List_API(data, context,sheetname);
        }
    }

    
