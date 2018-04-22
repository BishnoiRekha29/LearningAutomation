package Pages;

import org.openqa.selenium.WebDriver;

import testTools.Wrapper;

public class BasePage {
	protected final Wrapper wrapper;

    protected BasePage(WebDriver driver) {
    	System.out.println("in basepage");
        wrapper = new Wrapper(driver);
        System.out.println("out basepage");
}
}
