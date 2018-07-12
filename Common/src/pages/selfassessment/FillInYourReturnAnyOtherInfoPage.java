package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAnyOtherInfoPage extends BasePage{
	
//	public static By wf32_11_FieldAdditionalInformationForBus = By.id("wf32_11_FieldAdditionalInformationForBus");
//	public static By wf32_11_LinkDeleteBusiness = By.id("wf32_11_LinkDeleteBusiness");
	public static By wf36_09_FieldOtherInformation = By.id("wf36_09_FieldOtherInformation");

	public FillInYourReturnAnyOtherInfoPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Any other information";
//		this.expectedHeading = "4. Fill in your return";
//		super.assertTitle().assertHeading();

	}
	
	public void setOtherInfoCGT(String option){
		driver.findElement(wf36_09_FieldOtherInformation).sendKeys(option);
		writeLog("Set Please give any other information about capital gains below. : " + option);
	}

	public FillInYourReturnSummaryPage clickNextGoToFillInYourReturnSummaryPage() {
		super.clickNext();
		return new FillInYourReturnSummaryPage(driver);
	}
	
	public FillInYourReturnUKInterestPage clickNextUKInterest(){
		super.clickNext();
		return new FillInYourReturnUKInterestPage(driver);
	}
}