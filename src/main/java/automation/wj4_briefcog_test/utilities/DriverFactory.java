package automation.wj4_briefcog_test.utilities;

import java.time.Duration;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;

import automation.wj4_briefcog_test.listeners.Listeners;
import automation.wj4_briefcog_test.pageObjects.AddExaminee_page;
import automation.wj4_briefcog_test.pageObjects.AddExaminer_page;
import automation.wj4_briefcog_test.pageObjects.DashBoard_page;
import automation.wj4_briefcog_test.pageObjects.Login_page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	static Listeners listeners = new Listeners();

	static String url;

	public static HashMap<String, String> globalProp;

	// Object calling

	public static ThreadLocal<Login_page> LoginPage = new ThreadLocal<>();
	public static ThreadLocal<AppUtil> appUtil = new ThreadLocal<>();
	public static ThreadLocal<DashBoard_page> DashBoardPage = new ThreadLocal<>();
	public static ThreadLocal<AddExaminer_page> AddExaminerPage = new ThreadLocal<>();
	public static ThreadLocal<AddExaminee_page> AddExamineepage = new ThreadLocal<>();

	// Constructer
	public DriverFactory() {

		globalProp = PropertyFileUtils.getAllProperties(System.getProperty("user.dir") + "\\GlobalConfig.properties");

	}

	// for the sake of command prompt
	public static String getBrowser() {
		String browser_globalProperties = globalProp.get("browser");
		String browser_cmd = System.getProperty("browser");
		String browser = browser_cmd != null ? browser_cmd : browser_globalProperties;
		return browser;
	}

	public static WebDriver getDriver() {

		if (driver.get() == null) {
			driver.set(initiliseDriver(getBrowser(), globalProp.get("implicitWaitTime")));
		}
		return driver.get();
	}

	public static void closeDriverSession() {
		driver.get().quit();
		driver.set(null);
	}

	static WebDriver initiliseDriver(String browserName, String implicitWait) {

		if (browserName.equalsIgnoreCase("chrome")) {
			driver.set(WebDriverManager.chromedriver().create());

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver.set(WebDriverManager.firefoxdriver().create());

		} else if (browserName.equalsIgnoreCase("ie")) {
			driver.set(WebDriverManager.iedriver().create());

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver.set(WebDriverManager.safaridriver().create());

		}

		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Page factory initialization for pages
		LoginPage.set(PageFactory.initElements(driver.get(), Login_page.class));
		appUtil.set(PageFactory.initElements(driver.get(), AppUtil.class));
		DashBoardPage.set(PageFactory.initElements(driver.get(), DashBoard_page.class));
		AddExaminerPage.set(PageFactory.initElements(driver.get(), AddExaminer_page.class));
		AddExamineepage.set(PageFactory.initElements(driver.get(), AddExaminee_page.class));

		return driver.get();
	}

	// Setting environment from CMD and globalConfig prop file
	public static String getEnvironment() {
		String environment_cmd = System.getProperty("environment");
		String environment_globalConfProp = globalProp.get("environment");

		String env = environment_cmd != null ? environment_cmd : environment_globalConfProp;

		if (env.equalsIgnoreCase("QA")) {
			url = "https://clinical-briefcog-qa.rsiapps.com/";
		} else if (env.equalsIgnoreCase("Stage")) {
			url = "https://stage.riversidescore.com/";
		} else if (env.equalsIgnoreCase("Prod")) {
			url = "https://riversidescore.com/";
		}
		return url;

	}
	
	//Console logger
	public void consoleLogger() {
		LogEntries logEntries = getDriver().manage().logs().get(LogType.BROWSER);
		for (LogEntry entry : logEntries) {
			System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
			System.out.println(" ");
			
		}
	}

}
