package automation.wj4_briefcog_test.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/automation/wj4_briefcog_test/features", glue = "automation/wj4_briefcog_test/stepDefinations", monochrome = true,
//		dryRun=true,
		dryRun=false,
		tags = "@main", plugin = {
				"pretty",
				"html:terget/cucumber.html", "timeline:test-output-thread/",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedScenarios/failed_scenarios.txt" })

public class testNG_TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
