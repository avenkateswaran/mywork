package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterForIndividualTax extends BasePage{
	
	private By continueButton = By.id("ctl00_placeholderMainContent_buttonsPair_rightButton");
	
	public RegisterForIndividualTax(WebDriver driver) {
		super(driver);
	}
	
	public RegisterForIndividualTaxForm clickContinue(){
		WebElement next = driver.findElement(continueButton);
		next.click();
		return new RegisterForIndividualTaxForm(driver);
	}

}
