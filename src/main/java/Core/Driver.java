package Core;

import org.openqa.selenium.WebDriver;

import bankbazaar.Enums.BrowserName;

public class Driver {
	 protected static InheritableThreadLocal<WebDriver> driver = new InheritableThreadLocal<WebDriver>();
		public static WebDriver getDriver() {
	        try {
	            if (driver.get() == null) {
	                setDriver();
	            }
	            return driver.get();
	        } catch (Exception e) {
	           // Log4jLogger.logError("Exception in getDriver " + Util.getStackTraceFromException(e));
	            return null;
	        }
	    }
		public static void setDriver() {
			 BrowserName browserName = BrowserName.CHROME;
			 driver.set(DriverFactory.initializeLocalWebBrowser(browserName,"C:\\driver\\chromedriver.exe"));
			 System.out.println("setDriver done");
		}


}
