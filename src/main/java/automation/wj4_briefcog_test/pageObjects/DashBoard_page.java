package automation.wj4_briefcog_test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.wj4_briefcog_test.utilities.DriverFactory;

public class DashBoard_page extends DriverFactory {
	
	@FindBy(xpath = "//h1[contains(text(),\"Welcome to \")]")
	WebElement dashBoardWelcomeText;
	
	public WebElement dashBoardWelcomeText() {
		return dashBoardWelcomeText;
	}
	

}
