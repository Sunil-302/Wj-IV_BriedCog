package automation.wj4_briefcog_test.stepDefinations;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverFactory {

	@After
	public void tearDown() {
		driver.quit();
		driver = null;

	}

//	@Before
//	public void tearup() {
//
//		getDriver();
//	}

}
