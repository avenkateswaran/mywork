package pages.selfassessmentnewui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class YourTaxAccountPage extends BasePage{
	
	public static By sa_account_details_link = By.id("sa-account-details-link");
	
	
	public YourTaxAccountPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Your tax account";
		super.assertTitle();
	}


	public YourTaxAccountSelfAssessmentDetailsPage clickSelfAssessmentDetailsLinkGoToyourTaxAccountSelfAssessmentDetailsPage() {
		writeLog("click Self Assessment details and options");
		screenShot(driver);
		driver.findElement(sa_account_details_link).click();
		return new YourTaxAccountSelfAssessmentDetailsPage(driver);
	}
}
