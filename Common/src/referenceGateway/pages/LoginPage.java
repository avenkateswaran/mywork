package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	
	private static By UserID_TextField_ID = By.id("ctl00_fixedContent_Username_uid_UIDSingleField");
	private static By Password_TextField_ID = By.id("ctl00_fixedContent_Username_pw");
	private static By Login_Button = By.id("ctl00_fixedContent_Username_loginButton");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public OrganisationServicesPage loginOrganisation(String username, String password) {
		// user id is government gateway ID
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button).click();
		return new OrganisationServicesPage(driver);
	}
	
	
	public IndividualServicesPage loginIndividual(String username, String password) {
		// user id is government gateway ID
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button).click();
		return new IndividualServicesPage(driver);
	}

}