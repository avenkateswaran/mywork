package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnOverpaidTaxRepaymentPage extends BasePage{
	
	public static By wf40_09_02_FieldHasBankAccount = By.id("wf40_09_02_FieldHasBankAccount");

	public FillInYourReturnOverpaidTaxRepaymentPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Overpaid tax";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Overpaid tax";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setNoBankAcc(){
		driver.findElement(wf40_09_02_FieldHasBankAccount).click();
		writeLog("Click No Bank Acc");
		
	}
	
	public FillInYourReturnNotPaidEnoughTaxPage clickNext() {
		super.clickNext();
		return new FillInYourReturnNotPaidEnoughTaxPage(driver);
	}
	
}
