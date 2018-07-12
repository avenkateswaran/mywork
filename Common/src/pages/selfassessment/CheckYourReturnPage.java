package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class CheckYourReturnPage extends BasePage{
	
	public static By tailorYourReturn = By.partialLinkText("3. Tailor your return");
	public static By changeDetailsAboutYou = By.partialLinkText("Change details about you");
	public static By changeYourTailoredReturnPage1 = By.partialLinkText("Change your tailored return (page 1)");
	public static By changeYourTailoredReturnPage2 = By.partialLinkText("Change your tailored return (page 2)");
	public static By changeYourTailoredReturnPage3= By.partialLinkText("Change your tailored return (page 3)");
	public static By changeSelfEmploymentDetailsPage1 = By.partialLinkText("Change self-employment details (page 1)");
	public static By changeSelfEmploymentDetailsPage2 = By.partialLinkText("Change self-employment details (page 2)");
	public static By changeAccountingDetails = By.partialLinkText("Change accounting details");
	public static By changeIncome = By.partialLinkText("Change income");
	public static By changeCapitalAllowances = By.partialLinkText("Change capital allowances");
	public static By changeAdjustments = By.partialLinkText("Change adjustments");
	public static By changeLosses = By.partialLinkText("Change losses");
	public static By changeTaxDeducted = By.partialLinkText("Change tax deducted");
	public static By changeClass4NIC = By.partialLinkText("Change class 4 NIC");
	public static By changeAdditionalInformation = By.partialLinkText("Change additional information");
	public static By viewSumary = By.partialLinkText("View summary");
	public static By changeClass2NICs = By.partialLinkText("Change Class 2 NICs");
	public static By changeUnderpaidTaxPage1 = By.partialLinkText("Change underpaid tax (page 1)");
	public static By changeUnderpaidTaxPage2 = By.partialLinkText("Change underpaid tax (page 2)");
	public static By changeOtherDebts = By.partialLinkText("Change other debts");
	public static By changeOverpaidTax = By.partialLinkText("Change overpaid tax");
	public static By changeRepaymentToYourself = By.partialLinkText("Change repayment to yourself");
	public static By changeNotPaidEnoughTax = By.partialLinkText("Change not paid enough tax");
	public static By changeAdjustmentsToTaxDue = By.partialLinkText("Change adjustments to tax due");
	public static By changeAnyOtherInformationPage1 = By.partialLinkText("Change any other information (page 1)");
	public static By changeAnyOtherInformationPage2 = By.partialLinkText("Change any other information (page 2)");

	public CheckYourReturnPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Check Your Return";
//		this.expectedHeading = "5. Check your return";
//		this.expectedSubHeading = "Your return contains no errors";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public ViewYourCalculationSummaryPage clickNext() {
		super.clickNext();
		return new ViewYourCalculationSummaryPage(driver);
	}

}
