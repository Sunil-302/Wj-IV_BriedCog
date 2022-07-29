package automation.wj4_briefcog_test.stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import automation.wj4_briefcog_test.utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends DriverFactory {

	@After
	public void tearDown(Scenario scenario) {

		if (driver != null) {
			if (scenario.isFailed()) {
				byte[] fileContent=null;
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

		driver.quit();
		driver = null;

	}

//	@Before
//	public void tearup() {
//
//		getDriver();
//	}

}
