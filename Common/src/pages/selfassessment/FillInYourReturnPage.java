package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnPage extends BasePage{
	
	public static By changeDetailsAboutYou = By.partialLinkText("Change details about you");
	public static By changeYourTailoredReturnPage1 = By.partialLinkText("Change your tailored return (page 1)");
	public static By changeYourTailoredReturnPage2 = By.partialLinkText("Change your tailored return (page 2)");
	public static By changeYourTailoredReturnPage3= By.partialLinkText("Change your tailored return (page 3)");
	public static By enterSelfEmploymentDetailsPage1 = By.partialLinkText("Enter self-employment details (page 1)");
	public static By enterClass2NICs = By.partialLinkText("Enter Class 2 NICs");
	public static By enterUnderpaidTaxPage1 = By.partialLinkText("Enter underpaid tax (page 1)");
	public static By enterUnderpaidTaxPage2 = By.partialLinkText("Enter underpaid tax (page 2)");
	public static By enterOtherDebts = By.partialLinkText("Enter other debts");
	public static By enterOverpaidTax = By.partialLinkText("Enter overpaid tax");
	public static By enterNotPaidEnoughTax = By.partialLinkText("Enter not paid enough tax");
	public static By enterAdjustmentsToTaxDue = By.partialLinkText("Enter adjustments to tax due");
	public static By enterAnyOtherInformationPage1 = By.partialLinkText("Enter any other information (page 1)");
	public static By enterAnyOtherInformationPage2 = By.partialLinkText("Enter any other information (page 2)");
	public static By deleteYourEntireTaxReturn = By.partialLinkText("Delete your entire tax return");
	

	public FillInYourReturnPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Check Your Progress";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Check your progress";
//		super.assertTitle().assertHeading().assertSubHeading();
	}

public FillInYourReturnDetailsForCompanyPage clickNextDetailsForCompany() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnDetailsForCompanyPage(driver);
		
	}

public FillInYourReturnUnderpaidTaxPage clickNextUnderpaidTax() {
	super.clickNext();
	return new pages.selfassessment.FillInYourReturnUnderpaidTaxPage(driver);
	
}

public FillInYourReturnDetailsOfChargeableAssetsPage clickNextCapitalGains() {
	super.clickNext();
	return new pages.selfassessment.FillInYourReturnDetailsOfChargeableAssetsPage(driver);
	
}

}
