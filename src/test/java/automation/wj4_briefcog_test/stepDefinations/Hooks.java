package automation.wj4_briefcog_test.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverFactory {

	@After
	public void tearDown(Scenario scenario) {

//		consoleLogger();

		if (getDriver() != null) {
			if (scenario.isFailed()) {
				byte[] fileContent = null;
				File sourcePath = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

				try {
					fileContent = FileUtils.readFileToByteArray(sourcePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				scenario.attach(fileContent, "image/png", "image");

			}

		}

		try {
			closeDriverSession();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Before
	public void setUp() {

	}

	@AfterStep
	public void doSomethingAfterStep(Scenario scenario) {
		consoleLogger();

	}



}
