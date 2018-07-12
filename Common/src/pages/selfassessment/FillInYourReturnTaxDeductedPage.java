package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnTaxDeductedPage extends BasePage{
	
	public static By wf32_09_FieldDeductionsOnPayment = By.id("wf32_09_FieldDeductionsOnPayment");
	public static By wf32_09_LinkDeleteBusiness = By.id("wf32_09_LinkDeleteBusiness");


	public FillInYourReturnTaxDeductedPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Tax deducted";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}


	public FillInYourReturnClass4NICsPage clickNextGoToFillInYourReturnTaxDeductedPage() {
		super.clickNext();
		return new FillInYourReturnClass4NICsPage(driver);
	}

}
