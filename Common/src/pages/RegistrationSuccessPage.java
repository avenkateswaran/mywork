package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSuccessPage extends BasePage {

	public static By RegistrationContinue = By.id("registration-completed-link");

	public RegistrationSuccessPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Registration Successful - Government Gateway";
		this.expectedHeading = "Make a note of your User ID";
	}
	
	public GatewayRegistrationPage clickContinue() {
		screenShot(driver);
		driver.findElement(RegistrationContinue).click();
		return new GatewayRegistrationPage(driver);
	}

}
