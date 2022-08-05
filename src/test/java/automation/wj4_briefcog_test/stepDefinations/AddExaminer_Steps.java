package automation.wj4_briefcog_test.stepDefinations;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.en.When;

public class AddExaminer_Steps extends DriverFactory {
	
	@When("lets get the text fields")
	public void lets_get_the_text_fields() {
		AddExaminerPage.get().textFinder();
	  
	}

}
