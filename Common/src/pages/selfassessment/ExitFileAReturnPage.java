package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.LoginPage;

public class ExitFileAReturnPage extends BasePage{
	
	public static By wf03_01_LinkFeedbackOnFileReturn = By.id("wf03_01_LinkFeedbackOnFileReturn");
	public static By wf03_01_LinkContinueFileReturn = By.id("wf03_01_LinkContinueFileReturn");
	public static By wf03_01_LinkReturnToSelfAssessment = By.id("wf03_01_LinkReturnToSelfAssessment");
	public static By wf03_01_LinkReturnToHMRCOnlineServices = By.id("wf03_01_LinkReturnToHMRCOnlineServices");

	public ExitFileAReturnPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Exit File a return";
		this.expectedHeading = "Exit File a return";
		super.assertTitle().assertHeading();
	}

	public LoginPage clickLinkGoToLoginPage() {
		driver.findElement(pages.selfassessment.ExitFileAReturnPage.wf03_01_LinkReturnToHMRCOnlineServices).click();
		return new LoginPage(driver);
	}

}
