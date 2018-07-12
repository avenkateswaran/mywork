package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnOtherDebtsPage extends BasePage{
	
	public static By wf40_08_03_FieldOutstandingDebt = By.id("wf40_08_03_FieldOutstandingDebt");

	public FillInYourReturnOtherDebtsPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Other debts";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Other debts";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setOutstandingDebt(String option){
		driver.findElement(wf40_08_03_FieldOutstandingDebt).sendKeys(option);
		writeLog("Set Outstanding Debt" + option);
	}

	public FillInYourReturnOverpaidTaxPage clickNext() {
		super.clickNext();
		return new FillInYourReturnOverpaidTaxPage(driver);
	}

}