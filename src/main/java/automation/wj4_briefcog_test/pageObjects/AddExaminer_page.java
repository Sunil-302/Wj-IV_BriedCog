package automation.wj4_briefcog_test.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import automation.wj4_briefcog_test.utilities.DriverFactory;

public class AddExaminer_page extends DriverFactory {

	@FindAll(@FindBy(xpath = "//span[@class='required-input']//parent::label"))
	List<WebElement> text;

	public void textFinder() {
		for (WebElement li : text) {
			System.out.println(li.getText());
		}
	}

}
