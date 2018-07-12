package pages.selfassessmentnewui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class YourTaxAccountSelfAssessmentDetailsPage extends BasePage{
	
	public static By more_options_link = By.id("more-options-link");

	public YourTaxAccountSelfAssessmentDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Your tax account";
		this.expectedHeading = "Self Assessment details";
		super.assertTitle().assertHeading();
	}

	public CurrentPositionPage clickMoreOptionsLinkGoToCurrentPositionPage() {
		writeLog("click More Options link");
		screenShot(driver);
		driver.findElement(more_options_link).click();
		return new CurrentPositionPage(driver);
	}
}
