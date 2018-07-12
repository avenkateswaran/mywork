package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnLossesPage extends BasePage{
	
	public static By wf32_08_FieldLossOffsetAgainstOtherIncome = By.id("wf32_08_FieldLossOffsetAgainstOtherIncome");
	public static By wf32_08_FieldLossToCarryBack = By.id("wf32_08_FieldLossToCarryBack");
	public static By wf32_08_FieldLossToCarryForward = By.id("wf32_08_FieldLossToCarryForward");
	public static By wf32_08_LinkDeleteBusiness = By.id("wf32_08_LinkDeleteBusiness");
	
		public FillInYourReturnLossesPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Losses";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

		public FillInYourReturnTaxDeductedPage clickNextGoToFillInYourReturnTaxDeductedPage() {
			super.clickNext();
			return new FillInYourReturnTaxDeductedPage(driver);
		}

}
