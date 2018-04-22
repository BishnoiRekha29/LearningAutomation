package testTools;
import org.openqa.selenium.WebDriver;

import testTools.ITools;

public class Wrapper implements ITools {
protected static InheritableThreadLocal<WebDriver> driver = new InheritableThreadLocal<WebDriver>();
private final ITools tool;
public Wrapper(WebDriver bdriver) {
	  tool = new Selenium(bdriver);
	 
}

	public boolean loadPage(String url) {
		System.out.println("in wrapper");
		boolean result=false;
		   result = tool.loadPage(url);
		return result;
	}

}
