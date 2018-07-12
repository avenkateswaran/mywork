package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class WelcomePage extends BasePage{
	
	public static By ButtonCancel = By.id("ButtonCancel");
	public static By ButtonStart = By.id("ButtonStart");
	public static By wf20_01_DataThirdPartySoftwareUsage = By.linkText("Find out more about using alternative software");
	public static By wf20_01_DataMoreOnUsingFileReturnService = By.linkText("Find out more about using the File a return service");

	public WelcomePage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Welcome";
//		this.expectedHeading = "1. Welcome";
//		super.assertTitle().assertHeading();
	}

	public TellUsAboutYouPage clickStart() {
		driver.findElement(ButtonStart).click();
		writeLog("Click start");
		screenShot(driver);
		return new pages.selfassessment.TellUsAboutYouPage(driver);
	}

}
