package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnSummaryPage extends BasePage{
	
	public static By businessIncome = By.id("businessIncome");
	public static By sa103sSummaryTotalExpenses = By.id("sa103sSummaryTotalExpenses");
	public static By sa103sSummaryNetProfitOrLoss = By.id("sa103sSummaryNetProfitOrLoss");
	public static By sa103sSummaryCapitalAllowances = By.id("sa103sSummaryCapitalAllowances");
	public static By sa103sSummaryBalancingCharges = By.id("sa103sSummaryBalancingCharges");
	public static By sa103sSummaryAdjustments = By.id("sa103sSummaryAdjustments");
	public static By sa103sSummaryAdjustedProfitOrLoss = By.id("sa103sSummaryAdjustedProfitOrLoss");
	public static By wf32_12_LinkPrintSummary = By.id("wf32_12_LinkPrintSummary");
	public static By wf32_12_LinkDeleteBusiness = By.id("wf32_12_LinkDeleteBusiness");

	
	public FillInYourReturnSummaryPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Summary";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}


	public FillInYourReturnClass2NICsPage clickNextGoToFillInYourReturnClass2NIPage() {
		super.clickNext();
		return new FillInYourReturnClass2NICsPage(driver);
	}

}
