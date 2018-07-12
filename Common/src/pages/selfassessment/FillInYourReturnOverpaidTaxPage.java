package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnOverpaidTaxPage extends BasePage{
	
	public static By wf40_09_01_FieldRepaymentIsToNominee = By.id("wf40_09_01_FieldRepaymentIsToNominee");

	public FillInYourReturnOverpaidTaxPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Overpaid tax";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Overpaid tax";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setRepayment(String option){
		driver.findElement(wf40_09_01_FieldRepaymentIsToNominee).sendKeys(option);
		writeLog("Set Repayment: " + option);
		
	}

	public FillInYourReturnNotPaidEnoughTaxPage clickNextNotPaidEnoughTaxPage() {
		super.clickNext();
		return new FillInYourReturnNotPaidEnoughTaxPage(driver);
	}
	
	public FillInYourReturnOverpaidTaxRepaymentPage clickNextRepaymentPage() {
		super.clickNext();
		return new FillInYourReturnOverpaidTaxRepaymentPage(driver);
	}
	
}
