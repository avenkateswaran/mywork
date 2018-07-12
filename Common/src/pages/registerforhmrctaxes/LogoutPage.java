package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class LogoutPage extends BasePage{
	
	public static By CloseWindow = By.linkText("Close this window");

	public LogoutPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Logout";
		this.expectedHeading = "Logout";
		super.assertTitle().assertHeading();
	}

}
