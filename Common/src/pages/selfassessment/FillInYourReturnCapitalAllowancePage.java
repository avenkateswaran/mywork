package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnCapitalAllowancePage extends BasePage{
	
	public static By wf32_06_FieldAnnualInvestmentAmount = By.id("wf32_06_FieldAnnualInvestmentAmount");
	public static By wf32_06_FieldAllowanceForSmallBalanceUnrelievedExpenditure = By.id("wf32_06_FieldAllowanceForSmallBalanceUnrelievedExpenditure");
	public static By wf32_06_FieldTotalCapitalAllowances = By.id("wf32_06_FieldTotalCapitalAllowances");
	public static By wf32_06_FieldBalancingCharges = By.id("wf32_06_FieldBalancingCharges");
	public static By wf32_06_LinkDeleteBusiness = By.id("wf32_06_LinkDeleteBusiness");

	public FillInYourReturnCapitalAllowancePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Capital allowance and balancing charges";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnOtherTaxAdjustmentsPage clickNextGoToFillYourReturnOtherTaxAdjustmentsPage() {
		super.clickNext();
		return new FillInYourReturnOtherTaxAdjustmentsPage(driver);
	}

}
