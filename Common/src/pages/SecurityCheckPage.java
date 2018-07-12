package pages;

//import java.io.Writer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.paye.SubmissionConfirmationPage;
import pages.registerforhmrctaxes.AcknowledgmentPage;
import pages.selfassessment.SubmitYourReturnPage;

public class SecurityCheckPage extends BasePage {

	public static By userId = By.id("userId");
	public static By password = By.id("password");
	public static By submit =  By.xpath(("//*[@id='content']/article/form/fieldset/div[3]/button"));
	
	/* Old variables from old HMRC site - DO NOT DELETE, MIGHT BE BEING USED IN OLDER SCRIPTS*/
	public static By FieldUserID = By.id("userId");
	public static By FieldPassword = By.id("FieldPassword");

	public SecurityCheckPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "Security check";
//		this.expectedHeading = "Security check";
//		super.assertTitle().assertHeading();
	}
	
	public void typeUserName(String text){
		driver.findElement(SecurityCheckPage.userId).sendKeys(text);
		writeLog("Set user Id: " + userId);
	}
	
	public void typePassword(String text){
		driver.findElement(SecurityCheckPage.password).sendKeys(text);
		writeLog("Set user Password: " + password);
	}
	
//	public void setPassword(String option){
//	driver.findElement(password).sendKeys(option);
//	writeLog("Set User ID: " + option);
//}
	
	public SubmitYourReturnPage reauthenticateUser(String userId, String password){
		typeUserName(userId);
		typePassword(password);
		super.clickSubmit();
		return new SubmitYourReturnPage(driver);
	}
	
	/*Old method for old HMRC site - DO NOT DELETE, MIGHT BE BEING USED IN OLDER SCRIPTS*/
	public AcknowledgmentPage clickSubmitToGoToAcknowledgmentPage(String userId, String password) {
		reauthenticateUser(userId, password);
		typeUserName(userId);
		typePassword(password);
		super.clickSubmit();
		return new AcknowledgmentPage(driver);
	}
	/*Old method for old HMRC site - DO NOT DELETE, MIGHT BE BEING USED IN OLDER SCRIPTS*/
	public SubmissionConfirmationPage clickSubmitGoToSubmissionConfirmation() {
		super.clickSubmit();
		return new SubmissionConfirmationPage(driver);
	}
	/*Old method for old HMRC site - DO NOT DELETE, MIGHT BE BEING USED IN OLDER SCRIPTS*/
	public SubmitYourReturnPage clickSubmitGoToSubmitYourReturnPage() {
		super.clickSubmit();
		return new SubmitYourReturnPage(driver);
	}
		
}
