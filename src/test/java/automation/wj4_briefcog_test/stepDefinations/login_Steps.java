package automation.wj4_briefcog_test.stepDefinations;

import static org.testng.Assert.assertEquals;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Steps extends DriverFactory {
	
	@Given("Iam at the login page")
	public void iam_at_the_login_page() {
		getDriver().get(globalProp.get("URL"));
		assertEquals(LoginDashboardPage.getTitleofThePage(), "Riverside Insights Clinical Products");		
	    
	}

	@When("i give the username and password and click on Signin button")
	public void i_give_the_username_and_password_and_click_on_signin_button() {
		letsWait(2000);
		
		LoginDashboardPage.giveUsername();
		LoginDashboardPage.givePassword();
		LoginDashboardPage.clickOnSignInButton();
		
		letsWait(2000);
	   
	}

	@Then("I will be seeing the Wj4 Dashboard page")
	public void i_will_be_seeing_the_wj4_dashboard_page() {
		LoginDashboardPage.clickOnWj4BriedCogTile();
		letsWait(2000);
	    
	}

}
