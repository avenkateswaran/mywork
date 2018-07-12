package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReauthenticationPage extends BasePage {
	public final WebDriver driver;
	
	public static By UserId = By.id("userId");
	public static By Password = By.id("password");
	public static By Continue = By.cssSelector("#content > article > form > fieldset > div.form-field.form-field--submit > button");

	
	public ReauthenticationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
//		this.expectedTitle = "Sign in - Government Gateway"; //HMRC: Login
//		this.expectedHeading = "Sign in"; //Welcome to HMRC Online services
		//super.assertTitle();
	}

	
	public SetUp2StepVerificationPage loginReauth(String username, String password) {
		screenShot(driver);
		driver.findElement(UserId).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Continue).click();
		return new SetUp2StepVerificationPage(driver);
	}
	
}
