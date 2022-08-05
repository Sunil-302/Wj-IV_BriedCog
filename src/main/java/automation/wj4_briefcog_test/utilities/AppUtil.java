package automation.wj4_briefcog_test.utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppUtil extends DriverFactory {

	// manage selection

	public void selctHeaderOption(String parent, String child) {

		letsWait(2000);

		getDriver().findElement(By.xpath("//button[@aria-label='" + parent + "']")).click();// Organization Management
		letsWait(1000);
		getDriver().findElement(By.xpath("//button[text()='" + child + "']")).click();// Locations
		letsWait(2000);

	}

	public String getTitleofThePage() {
		return getDriver().getTitle();
	}

	public WebDriverWait explWait() {
		WebDriverWait expWait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));

		return expWait;

	}

	public void letsWait(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
