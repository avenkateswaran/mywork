package referenceGateway.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterForCorporationTax extends BasePage {
	
	private By continueButton = By.id("ctl00_placeholderMainContent_buttonsPair_rightButton");
	private String expectedMessage = "Corporation Tax (CT) allows the filing of company tax returns";
	
	public RegisterForCorporationTax(WebDriver driver) {
		super(driver);
	}
	
	public RegisterForCorporationTaxForm1 clickContinue(){
		WebElement next = driver.findElement(continueButton);
		Assert.assertTrue(driver.getPageSource().contains(expectedMessage));
		next.click();
		return new RegisterForCorporationTaxForm1(driver);
	}
}
