package automation.wj4_briefcog_test.stepDefinations;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.en.And;

public class AddExaminee_Steps extends DriverFactory {

	@And("i will select GENDER IDENTITY option as {string}")
	public void i_will_select_gender_identity_option_as(String string) {

		AddExamineepage.get().selectExamineeGender();

	}

	@And("Demographics\\/Programs PAge")
	public void demographics_programs_p_age() {

		AddExamineepage.get().selectRace();

	}

}
