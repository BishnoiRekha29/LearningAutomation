package testTools;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

public class CommonTools implements ITools {
	 public WebDriver baseDriver = null;
	 public CommonTools(WebDriver driver)
	    {     baseDriver = driver;
	    }
	public boolean loadPage(String url) {
		 {System.out.println("in common tool load page");
		        throw new NotImplementedException(url);
	}

}
}
