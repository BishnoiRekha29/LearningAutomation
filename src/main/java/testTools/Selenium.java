package testTools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Selenium extends CommonTools implements ITools {
	public int defaultWaitTime=5;
	public WebDriver driver = null;

	public Selenium(WebDriver driver) {
		  super(driver);
		this.driver = driver;
	}

	public boolean loadPage(String url) {
		boolean success = false;

		this.driver.get(url);
		success = true;

		this.waitForPageLoadToComplete();
		return success;

	}

	public void waitForPageLoadToComplete() {
		boolean multipleWindow = false;
		try {
			boolean found = false;
			int timeInSecCounter = 0;
			while (timeInSecCounter++ < defaultWaitTime * 2 && !found) {
				try {
					found = ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete")
							&& ((JavascriptExecutor) driver).executeScript("return (jQuery.active == 0)").equals(true);
				} catch (Exception ex) {
				}
				if (!found)
					Thread.sleep(500);
			}
		} catch (Exception ex) {
			if (driver.getWindowHandles().size() == 1 & multipleWindow)
				switchToWindow();
			else {
				// Log.("Exception in WaitForPageLoadToComplete2. Exception: ", ex);
				// acceptAlertInternal();
			}
		}

	}

	public void switchToWindow() {
		try {
			for (String windowHandle : driver.getWindowHandles()) {
				if (!windowHandle.toString().equalsIgnoreCase(driver.getWindowHandle().toString()))
					driver.switchTo().window(windowHandle);
			}
		} catch (Exception e) {
			// LogManager.logInfo("Exception in switchToWindow", e);
		}
	}
}
