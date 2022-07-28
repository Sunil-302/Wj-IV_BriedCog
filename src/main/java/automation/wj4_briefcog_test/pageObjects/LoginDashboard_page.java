package automation.wj4_briefcog_test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.wj4_briefcog_test.utilities.DriverFactory;

public class LoginDashboard_page extends DriverFactory {



	@FindBy(xpath = "//title")
	WebElement getTitle;

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement skUsername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement skPassword;
	
	@FindBy(xpath = "//button[@class='login-button']")
	WebElement ckSignInButton;

	@FindBy(xpath = "//button[contains(@aria-label,'WJ IV Brief Cog - Digital')]")
	WebElement ckWj4Tile;

	/* =====================METHODS=================== */

	public String getTitleofThePage() {
		return getDriver().getTitle();
	}

	public void giveUsername() {
		skUsername.sendKeys(globalProp.get("username"));

		return;
	}

	public void givePassword() {
		skPassword.sendKeys(globalProp.get("password"));

		return;
	}
	
	public void clickOnSignInButton() {
		ckSignInButton.click();
		return;
	}

	public void clickOnWj4BriedCogTile() {
		ckWj4Tile.click();

		return;
	}

}
