package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAnyOtherInfoPage2 extends BasePage{
	
	public static By wf40_20_FieldOtherInformation = By.id("wf40_20_FieldOtherInformation");
	public static By wf40_20_FieldAddAttachment = By.id("wf40_20_FieldAddAttachment");
	
	public FillInYourReturnAnyOtherInfoPage2(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Any other information (Page 2 of 2)";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Any other information (Page 2 of 2)";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setOtherInfo(String option){
		driver.findElement(wf40_20_FieldOtherInformation).sendKeys(option);
		writeLog("Set Other Info: " + option);
	}
	
	public void setAddAttachment(String option){
		driver.findElement(wf40_20_FieldAddAttachment).sendKeys(option);
		writeLog("Set Add Attachment: " + option);
	}

	public CheckYourReturnPage clickNext() {
		super.clickNext();
		return new CheckYourReturnPage(driver);
	}

}
