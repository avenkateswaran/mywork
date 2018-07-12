package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegistrationDetailsPage extends BasePage{

	public RegistrationDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public DeclarationPage clickNextGoToDeclarationPage(){
		clickNext();
		return new DeclarationPage(driver);
	}
	
}
