package base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class BaseClass {
	public static WebDriver drivers=null;
	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
	

	public BaseClass() {
		
		try {
			String FilePath="C:\\Users\\ABHISHEK\\eclipse-workspace\\onlinetest\\src\\main\\java\\data\\config.properties";
					 prop=new Properties();
					 FileInputStream file=new FileInputStream(FilePath);

			prop.load(file);
			String url=prop.getProperty(FilePath);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

public static  void intialization() {
	try {
String Browser=prop.getProperty("Browse");
		if (Browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
	drivers =new ChromeDriver();
	
	drivers.manage().window().maximize();
	drivers.manage().deleteAllCookies();
	String Url=prop.getProperty("Url");
	drivers.get(Url);
	drivers.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//DesiredCapabilities caps = new DesiredCapabilities();
	//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	// caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A8+ (2018)");
	 //caps.setCapability(MobileCapabilityType.UDID, "5200b0d0527135db");
	 //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");


	 //URL url = new URL("http://127.0.0.1:4723/wd/hub");
	 //driver = new AppiumDriver<MobileElement>(url, caps);
		}
	}
		
		
		catch(Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
		}
	}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)drivers).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:\\Users\\ABHISHEK\\eclipse-workspace\\onlinetest\\screenshot"+result+"screenshot.png"));
	
}
}
