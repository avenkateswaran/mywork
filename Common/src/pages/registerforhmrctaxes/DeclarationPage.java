package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityCheckPage;

public class DeclarationPage extends BasePage{
	
	public static By FieldcapacityCompletingReg = By.id("FieldcapacityCompletingReg");
	public static By FielddeclareRegAccurate = By.id("FielddeclareRegAccurate");

	public DeclarationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Declaration";
		this.expectedHeading = "Declaration";
		super.assertTitle().assertHeading();
	}

	public SecurityCheckPage clickNext() {
		super.clickNext();
		return new SecurityCheckPage(driver);
	}

}
