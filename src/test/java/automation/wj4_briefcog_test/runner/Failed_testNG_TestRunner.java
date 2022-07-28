package automation.wj4_briefcog_test.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/failedScenarios/failed_scenarios.txt",
		glue="stepDefinations",
		monochrome=true,
		plugin= {"html:terget/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/DoublefailedScenarios/failed_scenarios.txt"}
)

public class Failed_testNG_TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
