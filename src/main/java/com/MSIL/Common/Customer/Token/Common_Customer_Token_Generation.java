package com.MSIL.Common.Customer.Token;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;

import com.MSIL.ENUMS.Context;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

import Query.Queries;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_Customer_Token_Generation
{
              static WebDriver driver;
              static NgWebDriver ngDriver;
              static ITestContext context;
              static Queries q;
              @SuppressWarnings("static-access")
              public static String token_generation(Object object) throws InterruptedException
              {                           
                             
                             
                            ChromeOptions options = new ChromeOptions();
                            options.addArguments("--headless", "--window-size=1920,1200");                         
                             WebDriverManager.chromedriver().setup();
                             //driver = new ChromeDriver();
                             driver = new ChromeDriver(options);
                             driver.get("http://common-customer-login-client.s3-website.ap-south-1.amazonaws.com/otp/login");
                             driver.manage().window().maximize();
                             driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
                             ngDriver = new NgWebDriver((JavascriptExecutor) driver);
                             ngDriver.waitForAngularRequestsToFinish();
                             object ="8130009677";
                             Select se =  new Select(driver.findElement(By.xpath("/html/body/app-root/msmp-bo-otp-login/div/div/div[1]/select")));
                             //se.selectByValue("QA");
                             se.selectByValue("PREPROD");
                             WebElement mobile_box= driver.findElement(By.xpath( "/html/body/app-root/msmp-bo-otp-login/div/div/div[2]/input"));

                             mobile_box.sendKeys("8130009677");
                             Thread.sleep(5000);
                            driver.findElement(By.xpath("/html/body/app-root/msmp-bo-otp-login/div/div/div[3]/button")).click();
                            
                            //html/body/app-root/msmp-bo-otp-login/div/div/div[3]/button
                          //button[contains(text(),'Send OTP')]
                             //Thread.sleep(10000);
                             
                             driver.findElement(By.xpath("/html/body/app-root/app-verify-otp/div/div/div[1]/input")).sendKeys(q.getOTPCustomer(object));
                             Thread.sleep(5000);
                             driver.findElement(By.xpath("/html/body/app-root/app-verify-otp/div/div/div[2]/button")).click();
                             
                            // Thread.sleep(5000);
                             
                             String access_token = driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/div[9]/textarea")).getAttribute("value");
                             driver.quit();
                             return access_token;
                             
              }
              
			
	/*
	 * public static void main(String[] args) { Object object = null; try {
	 * token_generation(object); } catch (InterruptedException e) { //Auto-generated
	 * //catch block e.printStackTrace(); } }
	 */
				 
}
