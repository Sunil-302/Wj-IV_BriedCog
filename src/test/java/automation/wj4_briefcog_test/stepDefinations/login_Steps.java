package automation.wj4_briefcog_test.stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps extends DriverFactory {

	@Given("Iam at the login page")
	public void iam_at_the_login_page() {
		getDriver().get(getEnvironment());
		assertEquals(appUtil.get().getTitleofThePage(), "Riverside Insights Clinical Products");

	}

	@When("^i give the \"([^\"]*)\" and \"([^\"]*)\" and click on Signin button$")
	public void i_give_the_something_and_something_and_click_on_signin_button(String strArg1, String strArg2) {

		LoginPage.get().giveUsername(strArg1);
		LoginPage.get().givePassword(strArg2);
		LoginPage.get().clickOnSignInButton();

	}

	@And("^I will click on the wj4BriefCog tyle$")
	public void i_will_click_on_the_wj4briefcog_tyle() {
		appUtil.get().letsWait(2000);
		LoginPage.get().clickOnWj4BriedCogTile();
		appUtil.get().letsWait(2000);

	}

	@Then("I will be seeing the Wj4 Dashboard page")
	public void i_will_be_seeing_the_wj4_dashboard_page() {
		appUtil.get().explWait().until(ExpectedConditions.visibilityOf(DashBoardPage.get().dashBoardWelcomeText()));
		appUtil.get().letsWait(500);
		assertEquals(appUtil.get().getTitleofThePage(), "Dashboard");

	}

}
