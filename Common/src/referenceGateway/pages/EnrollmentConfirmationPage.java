package referenceGateway.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EnrollmentConfirmationPage extends BasePage {

	public EnrollmentConfirmationPage(WebDriver driver) {
		super(driver);
		this.screenShot();
		Assert.assertTrue(driver.getPageSource().contains("You have enrolled"));
	}

}
