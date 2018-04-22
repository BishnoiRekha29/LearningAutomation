package Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import bankbazaar.Enums.BrowserName;

public class DriverFactory {
	
	public static WebDriver initializeLocalWebBrowser(BrowserName browserName,String driverPath) {
	WebDriver driver=null;
	DesiredCapabilities capabilities=new DesiredCapabilities();
	switch(browserName){
	case CHROME:
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  final ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.addArguments("enable-automation");
      chromeOptions.addArguments("--disable-infobars");
      chromeOptions.addArguments("--disable-extensions");
      chromeOptions.addArguments("--start-maximized");
      capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
      capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
      driver = new ChromeDriver(capabilities);
      System.out.println("after drivr");
      break;
	 default:
         System.out.println("Driver Factory not implemented for " + browserName + " browser");
         System.exit(1);
	}
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
	}
}
