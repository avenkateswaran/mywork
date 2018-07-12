package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAccountingDetailsPage extends BasePage{
	
	public static By wf32_03_FieldBusinessAccountsDate = By.id("wf32_03_FieldBusinessAccountsDate");
	public static By wf32_03_FieldHasCashBasisAccountingShort = By.id("wf32_03_FieldHasCashBasisAccountingShort");
	public static By wf32_03_LinkDeleteBusiness = By.id("wf32_03_LinkDeleteBusiness");

	public FillInYourReturnAccountingDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Accounting details";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnIncomePage clickNextGoToFillInYourReturnIncomePage() {
		super.clickNext();
		return new FillInYourReturnIncomePage(driver);
	}

}
