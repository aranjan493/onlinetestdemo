package mobiletest;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class AppiumMobile extends Base {
	@Test
	public void testOne() throws InterruptedException{
		ExtentTest test1 = extent.createTest("test one", "sample test for demo");
		
			test1.log(Status.INFO, "Test one started");
		       test1.log(Status.PASS, "Navigate to http://www.amazon.in");
	       driver.get("https://www.amazon.in");
	       test1.log(Status.PASS, "Enter Apple iPhone 11 Pro Max (256GB) - Midnight Green in amazon search box");
	       driver.findElement(By.id("nav-search-keywords")).sendKeys("Apple iPhone 11 Pro Max (256GB) - Midnight Green");
	       test1.log(Status.PASS, "click on Enter Button");
	       driver.findElement(By.id("nav-search-keywords")).sendKeys(Keys.ENTER);
	       test1.log(Status.PASS, "click on Apple iPhone 11 Pro Max (256GB) - Midnight Green");
	     //  driver.findElement(By.className("//div[@class='a-section a-spacing-medium']/div/div/div/a[contains(@href, '/Apple-iPhone-Pro-Max-256GB/dp/B07XVMDRZW/ref=mp_s_a_1_1?keywords=Apple+iPhone+11+Pro+Max+%28256GB%29+-+Midnight+Green&qid=1579278614&sr=8-1')]/div/h2/span[@class='a-size-base a-color-base a-text-normal']")).click();
	       driver.findElement(By.className("s-image")).click();
	       Thread.sleep(2000);

	       test1.log(Status.PASS, "click on add to cart button");
	      // driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256GB/dp/B07XVMDRZW/ref=sr_1_1?keywords=Apple+iPhone+11+Pro+Max+%28256GB%29+-+Midnight+Green&qid=1579264941&sr=8-1");
	       driver.findElement(By.id("add-to-cart-button")).sendKeys(Keys.ENTER);
	       test1.log(Status.PASS, "click on proceed to buy");
	       driver.findElement(By.id("a-autoid-0-announce")).sendKeys(Keys.ENTER);
	     //  driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_in&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D0%26oldCustomerId%3D%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_in&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.0");
	       Thread.sleep(2000);
	       test1.log(Status.PASS, "complete and exit");

       
		
		
		
		
	}
	@AfterTest
    public void teardown() {
    	
    	driver.close();
    	driver.quit();
	} 	 
}
