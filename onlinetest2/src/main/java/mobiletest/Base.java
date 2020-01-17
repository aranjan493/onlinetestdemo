package mobiletest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class Base extends ExtentReportsDemo {
	AppiumDriver<MobileElement> driver;
	  


	@BeforeTest
	public void setup() {
		
		try {
			
			
			DesiredCapabilities caps = new DesiredCapabilities();
			
			//caps.setCapability("platformName", "ANDROID");

					//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			       caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
					 caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
					 caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8+ (2018)");
					 caps.setCapability(MobileCapabilityType.UDID, "5200b0d0527135db");
					 caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
					// caps.setCapability(MobileCapabilityType.APP, "flipkart");
					 //caps.setCapability("appPackage", "com.flipkart.android");
					 //caps.setCapability("appActivity", "com.flipkart.android.splashActivity");
					 caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
					 
					 URL url = new URL("http://127.0.0.1:4723/wd/hub");
					 driver = new AppiumDriver<MobileElement>(url, caps); 
					 //driver = new AndroidDriver<MobileElement>(url, caps);
					 //driver = new IOSDriver<MobileElement>(url,caps);
		 
	}catch(Exception exp) {
		System.out.println("cause is : "+exp.getCause());
		System.out.println("Message is : "+exp.getMessage());
		exp.printStackTrace();
		
	}
		
	}
	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}
	
    @AfterTest
    public void teardown() {
    	
    	driver.close();
    	driver.quit();
    	 
    	
    	
    	
    }





}
