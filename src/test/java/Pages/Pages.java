package Pages;
import org.openqa.selenium.support.PageFactory;

import Core.Driver;
import Core.DriverFactory;
import model.IHomePage;

public class Pages {
	 
  public static IHomePage HomePage() {
  return PageFactory.initElements(Driver.getDriver(), WebHomePage.class);
            	     }
}
