package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	private By login = By.id("ctl00_mainZone_loginButton");
	
	public HomePage(WebDriver driver) {
		super(driver);
		driver.get("http://www.ref.gateway.gov.uk");
	}

	public LoginPage clickLogin(){
		driver.findElement(login).click();
		return new LoginPage(driver);
	}
}
