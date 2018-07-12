package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnUnderpaidTaxPage2 extends BasePage{
	
	public static By wf40_08_02_FieldEstimatedUnderpaidTax = By.id("wf40_08_02_FieldEstimatedUnderpaidTax");

	public FillInYourReturnUnderpaidTaxPage2(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Underpaid tax included in PAYE coding (Page 2 of 2)";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Underpaid tax included in PAYE coding (Page 2 of 2)";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setEstimatedUnderpaidTax(String option){
		driver.findElement(wf40_08_02_FieldEstimatedUnderpaidTax).sendKeys(option);
		writeLog("Set Estimated underpaid tax for 2016-17 to be included in your PAYE tax code for 2016-17: " + option);
	}

	public FillInYourReturnOtherDebtsPage clickNext() {
		super.clickNext();
		return new FillInYourReturnOtherDebtsPage(driver);
	}

}