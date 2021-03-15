package com.MSIL.Common.Customer.Token;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
		driver = new ChromeDriver(options);
		driver.get("http://common-customer-login-client-qa.s3-website.ap-south-1.amazonaws.com/otp/login");
		ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		ngDriver.waitForAngularRequestsToFinish();
		object ="8130009677";
		WebElement mobile_box= driver.findElement(By.xpath( "//body/app-root[1]/msmp-bo-otp-login[1]/div[1]/div[1]/div[1]/input[1]"));
		mobile_box.sendKeys("8130009677");
		driver.findElement(By.xpath("//button[contains(text(),'Send OTP')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/app-root[1]/app-verify-otp[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(q.getOTPCustomer(object));
		driver.findElement(By.xpath("//button[contains(text(),'Verify OTP')]")).click();
		Thread.sleep(5000);
		String access_token = driver.findElement(By.xpath("//body/app-root[1]/app-home[1]/div[1]/div[1]/div[9]/textarea[1]")).getAttribute("value");
		return access_token;
		
	}
}