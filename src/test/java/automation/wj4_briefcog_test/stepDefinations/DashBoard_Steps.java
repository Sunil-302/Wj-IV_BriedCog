package automation.wj4_briefcog_test.stepDefinations;

import static org.testng.Assert.assertEquals;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DashBoard_Steps extends DriverFactory {
	Scenario scenarioSE;

	@Before
	public void beforeTest(Scenario scenario) {
		this.scenarioSE = scenario;
	}

	@When("^i will click on the \"([^\"]*)\" and then \"([^\"]*)\" then i will be at \"([^\"]*)\" page$")
	public void i_will_click_on_the_something_and_then_something_then_i_will_be_at_something_page(String strArg1,
			String strArg2, String strArg3) {

		appUtil.get().selctHeaderOption(strArg1, strArg2);
		appUtil.get().letsWait(1000);
		assertEquals(appUtil.get().getTitleofThePage(), strArg3);
		

		scenarioSE.log("<style='color:red'> You can print some imp info </style>");

	}
	
	

}
