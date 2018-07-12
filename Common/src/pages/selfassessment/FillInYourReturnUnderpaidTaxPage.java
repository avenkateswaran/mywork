package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnUnderpaidTaxPage extends BasePage{
	
	public static By wf40_08_01_FieldUnderpaidTaxForEarlierYears = By.id("wf40_08_01_FieldUnderpaidTaxForEarlierYears");

	public FillInYourReturnUnderpaidTaxPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Underpaid tax included in PAYE coding (Page 1 of 2)";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Underpaid tax included in PAYE coding (Page 1 of 2)";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setUnderpaidTax(String option){
		driver.findElement(wf40_08_01_FieldUnderpaidTaxForEarlierYears).sendKeys(option);
		writeLog("Set Underpaid tax for earlier years included in your tax code for 2016-17: " + option);
		
	}

	public FillInYourReturnUnderpaidTaxPage2 clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnUnderpaidTaxPage2(driver);
	}

}
