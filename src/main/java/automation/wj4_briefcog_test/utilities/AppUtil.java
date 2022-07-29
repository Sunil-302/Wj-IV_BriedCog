package automation.wj4_briefcog_test.utilities;

import org.openqa.selenium.By;

public class AppUtil extends DriverFactory {
	
	

	
		//manage selection
		
		public void selctHeaderOption(String parent,String child){
			
			letsWait(2000);
			
			getDriver().findElement(By.xpath("//button[@aria-label='"+parent+"']")).click();//Organization Management
			letsWait(1000);
			getDriver().findElement(By.xpath("//button[text()='"+child+"']")).click();//Locations
			letsWait(2000);		
		
		
		
		
		
	}

}
