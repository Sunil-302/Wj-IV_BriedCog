package automation.wj4_briefcog_test.utilities;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import automation.wj4_briefcog_test.pageObjects.Login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public static HashMap<String, String> globalProp;
	public static PropertyFileUtils pUtil = new PropertyFileUtils();

	// Object calling
	public static Login_page LoginDashboardPage;
	public static AppUtil appUtil;

	// Constructer
	public DriverFactory() {
		globalProp = pUtil.getAllProperties(System.getProperty("user.dir") + "\\GlobalConfig.properties");

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out .println(pUtil.getTheValueForTheKey(System.getProperty("user.dir")
	 * + "\\GlobalConfig.properties", "browser"));
	 * 
	 * }
	 */

	// Read browser name(like chrome , firefox) from global properties file,
	// then invoke th browser maximize it and set implicit wait time from the prop
	// file and set here at driver.

	/* on constructor call method get properties */

	public static WebDriver getDriver() {

		// for the sake of command prompt
		String browser_globalProperties = globalProp.get("browser");
		String browser_cmd = System.getProperty("browser");
		String browser = browser_cmd != null ? browser_cmd : browser_globalProperties;

		if (driver == null) {
			driver = initiliseDriver(browser, globalProp.get("implicitWaitTime"));
		}
		return driver;
	}

	public static WebDriver initiliseDriver(String browserName, String implicitWait) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = WebDriverManager.chromedriver().create();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = WebDriverManager.firefoxdriver().create();

		} else if (browserName.equalsIgnoreCase("ie")) {
			driver = WebDriverManager.iedriver().create();

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = WebDriverManager.safaridriver().create();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(implicitWait)));

		// Page factory initialization for pages
		LoginDashboardPage = PageFactory.initElements(getDriver(), Login_page.class);
		appUtil = PageFactory.initElements(getDriver(), AppUtil.class);

		return driver;
	}

	public static void letsWait(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
