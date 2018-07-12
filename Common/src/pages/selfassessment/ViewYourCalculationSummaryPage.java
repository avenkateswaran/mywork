package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ViewYourCalculationSummaryPage extends BasePage{
	
	public static By wf60_01_LabelTotalTaxInfo = By.id("wf60_01_LabelTotalTaxInfo");
	public static By wf60_01_TotalTaxInfo = By.id("wf60_01_TotalTaxInfo");
	public static By wf60_01_LabelFirstPayment = By.id("wf60_01_LabelFirstPayment");
	public static By wf60_01_firstPayment = By.id("wf60_01_firstPayment");
	public static By wf60_01_LabelPaymentDue = By.id("wf60_01_LabelPaymentDue");
	public static By wf60_01_paymentDue = By.id("wf60_01_paymentDue");
	public static By wf60_01_LabelSecondPayment = By.id("wf60_01_LabelSecondPayment");
	public static By wf60_01_secondPayment = By.id("wf60_01_secondPayment");
	public static By wf60_01_LinkTailorYourReturn = By.id("wf60_01_LinkTailorYourReturn");
	public static By wf60_01_LinkViewAndPrintFullcalculation = By.id("wf60_01_LinkViewAndPrintFullcalculation");

	public ViewYourCalculationSummaryPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: View your calculation - Summary";
//		this.expectedHeading = "6. View your calculation";
//		this.expectedSubHeading = "Summary";
//		super.assertTitle().assertHeading().assertSubHeading();
	}

	public ViewYourCalculationPaymentsOnAccPage clickNextGoToViewYourCalculationPaymentsOnAccPage() {
		super.clickNext();
		return new ViewYourCalculationPaymentsOnAccPage(driver);
	}
	
	public SaveYourReturnPage clickNextGoToSaveYourReturnPage() {
		super.clickNext();
		return new SaveYourReturnPage(driver);
	}
}
