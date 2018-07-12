package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SetUp2StepVerificationPage extends BasePage	{
	
	public static By continue_Button = By.id("continue");
	public static By cancel = By.id("cancel");
	public static By help_action = By.id("get-help-action");
	
	
	public SetUp2StepVerificationPage(WebDriver driver) {
		super(driver);
		//this.expectedTitle = "Start setup - 2-step verification";
		//this.expectedHeading = "Set up 2-step verification";
		//super.assertTitle().assertHeading();
		
		
	}
	
//	public NotSetUp2StepVerificationPage clickCancelGoToNotSetUp2StepVerificationPage() {
//		writeLog("click I don't have access to a mobile phone link");
//		screenShot(driver);
//		driver.findElement(cancel).click();
//		return new NotSetUp2StepVerificationPage(driver);
//	}
}
