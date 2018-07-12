package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ViewYourCalculationPaymentsOnAccPage extends BasePage{

	public static By wf60_22_FieldClaimingToReducePaymentOnAccount = By.id("wf60_22_FieldClaimingToReducePaymentOnAccount");

	public ViewYourCalculationPaymentsOnAccPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: View Your Calculation - Payments on account";
//		this.expectedHeading = "6. View your calculation";
//		this.expectedSubHeading = "Payments on account";
//		super.assertTitle().assertHeading().assertSubHeading();
	}

	public SaveYourReturnPage clickNextGoToSaveYourReturnPage() {
		super.clickNext();
		return new SaveYourReturnPage(driver);
	}

}
