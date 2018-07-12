package pages;

import org.openqa.selenium.WebDriver;

import pages.submitVATreturns.SetUpSharedSecretsPage;
import pages.submitVATreturns.SubmitAVATReturnPage;
import pages.CorporateTax.YourTaxAccountPage;
import pages.selfassessmentnewui.SetUp2StepVerificationPage;

public class SecurityMessagePage extends BasePage {
	@SuppressWarnings("unused")
	private SetUpSharedSecretsPage setUpSharedSecretsPage;

	public SecurityMessagePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Security message";
		this.expectedHeading = "Security message";

		if (this.actualTitle().equals("HMRC: Setup Shared Secrets")) {
			System.out.println("Securith method");
			setUpSharedSecretsPage = this.refresh();
			// setUpSharedSecretsPage.setupDetailsForm(gatewayRegistrationPage,
			// sharedSecretQuestion1, sharedSecretQuestion2,
			// sharedSecretQuestion3, sharedSecretQuestion4,
			// sharedSecretQuestion5);
			this.expectedTitle = "HMRC: Setup Shared Secrets";
			this.expectedHeading = "Set up Shared Secrets";
		}

		else if (this.actualTitle().equals("HMRC: Accept Terms and Conditions")) {
			this.expectedTitle = "HMRC: Accept Terms and Conditions";
			this.expectedHeading = "Accept Terms and Conditions";
		}

		super.assertTitle().assertHeading();
	}

	public YourHMRCServicesPage clickNext() {
		super.clickNext();
		return new YourHMRCServicesPage(driver);
	}

	public SubmitAVATReturnPage clickNextSubmission() {
		super.clickNext();
		return new SubmitAVATReturnPage(driver);
	}

	public YourTaxAccountPage clickNextUI() {
		super.screenShot(driver);
		super.clickNext();
		return new YourTaxAccountPage(driver);
	}

	// *** Method used specifically for SA NEW UI ***

	public SetUp2StepVerificationPage clickNextGoToSetUp2StepVerificationPage() {
		super.clickNext();
		return new SetUp2StepVerificationPage(driver);
	}

	public SetUpSharedSecretsPage refresh() {
		driver.navigate().refresh();
		return new SetUpSharedSecretsPage(driver);
	}

	public SecurityMessagePage clickAcceptTCheckbox() {
		this.expectedTitle = "HMRC: Accept Terms and Conditions";
		this.expectedHeading = "Accept Terms and Conditions";
		super.clickElement(locators.Common.clickCheckboxAcceptTC);
		super.clickSubmit();
		return new SecurityMessagePage(driver);
	}

}
