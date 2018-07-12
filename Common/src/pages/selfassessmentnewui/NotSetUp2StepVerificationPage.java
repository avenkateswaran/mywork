package pages.selfassessmentnewui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class NotSetUp2StepVerificationPage extends BasePage{
	
	public static By continue_Button = By.id("continue");
	public static By cancel = By.id("cancel");
	public static By help_action = By.id("get-help-action");

	
	public NotSetUp2StepVerificationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Not set up - 2-step verification";
		this.expectedHeading = "You have not set up 2-step verification";
		super.assertTitle().assertHeading();

	}


	public YourTaxAccountPage clickContinueGoToYourTaxAccountPage() {
		super.clickContinue();
		return new YourTaxAccountPage(driver);
	}
}