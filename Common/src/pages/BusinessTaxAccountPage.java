package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.AutomaticExchangeOfInformation.AtAGlancePage;
import pages.selfassessment.SelfAssessmentHomePage;

public class BusinessTaxAccountPage extends BasePage {
	
	public static By manageAccount = By.id("manage-account-link");
	public static By completeReturn = By.id("sa-complete-return-2014");
	public static String redirectURL = "https://www-qa.tax.service.gov.uk/self-assessment/";
	public static By hmrcAeoiOrg = By.id("hmrc-aeoi-org");

	public BusinessTaxAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//	public clickReturn() {
//		screenShot(driver);
//		driver.findElement(completeReturn).click();
//		return new NotSetUp2StepVerificationPage(driver);
//	}
	
	public ManageAccountPage clickManageAccount(){
		driver.findElement(manageAccount).click();
		writeLog("Click Manage account link");
		screenShot(driver);
		return new ManageAccountPage(driver);
	}
	
	public SelfAssessmentHomePage redirectSA(){
		driver.get(redirectURL);
		writeLog("Redirect to " + BusinessTaxAccountPage.redirectURL);
		screenShot(driver);
		return new SelfAssessmentHomePage(driver);
	}

	public AtAGlancePage clickViewAccount() {
		driver.findElement(hmrcAeoiOrg).click();
		writeLog("Click View account");
		return new AtAGlancePage(driver);
	}
	
}
