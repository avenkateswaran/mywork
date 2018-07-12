package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnHelpInCompletingCapitalGainsPage extends BasePage{
	
	public static By wf36_03_FieldUseCapitalGainsComputationWorksheet = By.id("wf36_03_FieldUseCapitalGainsComputationWorksheet");
	public static By wf36_03_LinkDeleteCapitalGains = By.id("wf36_03_LinkDeleteCapitalGains");
	
	public FillInYourReturnHelpInCompletingCapitalGainsPage(WebDriver driver){
		super(driver);
	}
	
	public void setCapitalGainsComputationWorksheet(String option){
		driver.findElement(wf36_03_FieldUseCapitalGainsComputationWorksheet).sendKeys(option);
		writeLog("Set Do you want to use the capital gains computation worksheet for any of your disposals?: " + option);
	}
	
	public FillInYourReturnCapitalSectionPage clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnCapitalSectionPage(driver);
		
	}

}
