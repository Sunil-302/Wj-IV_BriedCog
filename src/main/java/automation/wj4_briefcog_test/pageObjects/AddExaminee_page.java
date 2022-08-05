package automation.wj4_briefcog_test.pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automation.wj4_briefcog_test.utilities.DriverFactory;

public class AddExaminee_page extends DriverFactory {
	
	@FindBy(xpath ="//label[text()='GENDER IDENTITY']/..//li" )
	List<WebElement> selectExamineeGenderList;
	
	@FindBy(xpath ="//label[text()='GENDER IDENTITY']/.." )
	WebElement genderIdentityBtn;
	
	@FindBy(xpath ="//div[text()='Demographics/Programs']" )
	WebElement dempgraphicsProgramsTabBtn;
	
	@FindBy(xpath ="//label[text()='Race']/.." )
	WebElement raceBtn;
	
	@FindBy(xpath ="//label[text()='Race']/..//li" )
	List<WebElement> selectExamineeRaceList;
	
	
	
	
	
	
	public void selectExamineeGender(){
		
		appUtil.get().explWait().until(ExpectedConditions.visibilityOf(genderIdentityBtn));		
		genderIdentityBtn.click();		
		appUtil.get().letsWait(2000);
		selectExamineeGenderList.get(1).click();
		appUtil.get().letsWait(3000);
		
	}
	
	public void selectRace() {
		
		dempgraphicsProgramsTabBtn.click();		
		appUtil.get().explWait().until(ExpectedConditions.visibilityOf(raceBtn));
		appUtil.get().letsWait(1000);
		raceBtn.click();
		appUtil.get().letsWait(2000);
		selectExamineeRaceList.get(1).click();;
		appUtil.get().letsWait(3000);
		
		
		
	}

}
