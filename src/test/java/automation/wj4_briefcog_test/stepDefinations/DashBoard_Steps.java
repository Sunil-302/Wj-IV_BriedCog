package automation.wj4_briefcog_test.stepDefinations;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.en.When;

public class DashBoard_Steps extends DriverFactory {
	
	@When("i will click on the {string} and then {string} then i will be at locations page")
	public void i_will_click_on_the_and_then_then_i_will_be_at_locations_page(String string, String string2) {
		
		appUtil.selctHeaderOption(string, string2);
	    
	}

}
