package Pages;

import org.openqa.selenium.WebDriver;

import model.IHomePage;
public class WebHomePage extends BasePage implements IHomePage {

	public WebHomePage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	public void loadHomePage() {
		System.out.println("in webHOMEPAGE");
		wrapper.loadPage("https://www.bankbazaar.com/");

	}

}
