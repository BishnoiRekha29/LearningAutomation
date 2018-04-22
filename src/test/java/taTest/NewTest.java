package taTest;
		

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;		
import org.testng.annotations.Test;

import Core.DriverFactory;

import org.testng.annotations.Factory;

import Pages.Pages;
import bankbazaar.Enums.BrowserName;

import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {	 	
		@Test(groups={"Regression"})
		public void testEasy() {	
			
			System.out.println(" test easy");
			Pages.HomePage().loadHomePage();
		}	
		@BeforeTest
		public void beforeTest() {	
		}		
		@AfterTest
		public void afterTest() {
//			driver.quit();			
		}		
}	