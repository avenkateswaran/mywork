package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegisterForAEOI extends BasePage{
	
	public static By registerForAeoi = By.id("registerForAeoi");

	public RegisterForAEOI(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AutomaticExchangeOfInformationRegistrationPage clickContinueGoToRegistrationPage(){
		clickContinue();
		return new AutomaticExchangeOfInformationRegistrationPage(driver);
	}
}
