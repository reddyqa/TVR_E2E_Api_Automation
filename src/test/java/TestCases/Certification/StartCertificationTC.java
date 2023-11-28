package TestCases.Certification;

import java.util.Hashtable;

import com.MSIL.API_LISTS.Certification.StartCertificationAPI;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.MSIL.Setup.RestAssuredSetup;
import com.MSIL.TestUtils.DataProviderClass;

public class StartCertificationTC extends RestAssuredSetup{


    //@Parameters({ "value" })
    @Test(dataProviderClass= DataProviderClass.class, dataProvider="dp", groups= {"Regression", "Smoke", "Sanity"})
    public static void Start_Certification(Hashtable<String, String>data, ITestContext context)
    {
        String sheetname= "Start_Certification";

        testLog.get().assignAuthor("Reddy");
        testLog.get().assignCategory("End to End API Automation Test");
        testLog.get().info("Get All Start_Certification");
        StartCertificationAPI.Start_CertificationAPI(data, context,sheetname);
    }
}


