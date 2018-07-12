package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAnyOtherInfoPage1 extends BasePage{
	
	public static By wf40_19_FieldReturnHasProvisionalFigures = By.id("wf40_19_FieldReturnHasProvisionalFigures");

	public FillInYourReturnAnyOtherInfoPage1(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Any other information (Page 1 of 2)";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Any other information (Page 1 of 2)";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setProvisionalEstimatedFigures(String option){
		driver.findElement(wf40_19_FieldReturnHasProvisionalFigures).sendKeys(option);
		writeLog("Set Provision Estimated Figures: " + option);
	}

	public FillInYourReturnAnyOtherInfoPage2 clickNext() {
		super.clickNext();
		return new FillInYourReturnAnyOtherInfoPage2(driver);
	}

}