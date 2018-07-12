package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AlreadyRegisteredForAEOI extends BasePage{
	
	public static By yesButton = By.id("yes-button");
	public static By noButton = By.id("no-button");

	public AlreadyRegisteredForAEOI(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public RegisterForAEOI ClickContinue(){
		driver.findElement(noButton).click();
		writeLog("Click No button");
		clickContinue();
		return new RegisterForAEOI(driver);
	}
	
}
