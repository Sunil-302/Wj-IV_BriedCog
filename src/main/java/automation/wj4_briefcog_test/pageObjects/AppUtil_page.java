package automation.wj4_briefcog_test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.wj4_briefcog_test.utilities.DriverFactory;

public class AppUtil_page extends DriverFactory{
	
	@FindBy(xpath = "//button[@aria-label='Organization Management']")
	WebElement organisationManagement;
	
	@FindBy(xpath = "//button[text()='Locations']")
	WebElement locations;


}
