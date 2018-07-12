package pages;

import org.openqa.selenium.WebDriver;

public class RegistrationSelectionPage extends BasePage {

	public RegistrationSelectionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Registration -What would you like to do?";
		this.expectedHeading = "What would you like to do?";

	}

	public RegistrationSelectionPage clickRegister() {
		driver.findElement(LoginPage.Register_Button_ID).click();
		return new RegistrationSelectionPage(driver);
	}

	public GatewayRegistrationPage clickNext() {
		super.clickNext();
		return new GatewayRegistrationPage(driver);
	}

}
