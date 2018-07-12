package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.selfassessment.SelfAssessmentHomePage;

public class ExtraSecurityPage extends BasePage	{
	
	public static By continue_Button = By.id("continue");
	public static By not_now = By.id("not-now");
	public static String redirectURL = "https://www-qa.tax.service.gov.uk/self-assessment/";
	
	public ExtraSecurityPage(WebDriver driver) {
		super(driver);
		//this.expectedTitle = "Start setup - 2-step verification";
		//this.expectedHeading = "Set up 2-step verification";
		//super.assertTitle().assertHeading();
	}
		
	public BusinessTaxAccountPage clickNotNow() {
		driver.findElement(not_now).click();
		writeLog("Click Next");
		screenShot(driver);
		return new BusinessTaxAccountPage(driver);
	}
	
	public SelfAssessmentHomePage redirectSA(){
		driver.get(redirectURL);
		writeLog("Redirect to " + BusinessTaxAccountPage.redirectURL);
		screenShot(driver);
		return new SelfAssessmentHomePage(driver);
	}

}
