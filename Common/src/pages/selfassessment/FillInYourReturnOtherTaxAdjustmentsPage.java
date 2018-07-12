package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnOtherTaxAdjustmentsPage extends BasePage{
	
	public static By wf32_07_FieldGoodsForOwnUse = By.id("wf32_07_FieldGoodsForOwnUse");
	public static By totalNetBusinessProft = By.id("totalNetBusinessProft");
	public static By wf32_07_FieldEarlierYearsLoss = By.id("wf32_07_FieldEarlierYearsLoss");
	public static By wf32_07_FieldOtherBusinessIncome = By.id("wf32_07_FieldOtherBusinessIncome");
	public static By taxableProfit = By.id("taxableProfit");
	public static By wf31_08_FieldBusinessLoss = By.id("wf31_08_FieldBusinessLoss");
	public static By wf32_07_LinkDeleteBusiness = By.id("wf32_07_LinkDeleteBusiness");
	
	public FillInYourReturnOtherTaxAdjustmentsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Other tax adjustments";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnLossesPage clickNextGoToFillInYourReturnLossesPage() {
		super.clickNext();
		return new FillInYourReturnLossesPage(driver);
	}

}
