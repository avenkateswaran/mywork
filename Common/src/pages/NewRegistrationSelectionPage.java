package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewRegistrationSelectionPage extends BasePage {
	
	public static By AcountTypeIndividual = By.id("account-type-individual");
	public static By AccountTypeOrganisation = By.id("account-type-organisation");
	public static By AccountTypeAgent = By.id("account-type-agent");
	public static By AccountTypePensions = By.id("account-type-pensions");
	public static By SubmitContinue = By.id("submit-continue");

	public NewRegistrationSelectionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Choose your account - Government Gateway";
		this.expectedHeading = "Choose your account";
	}
	
	public NewRegistrationSelectionPage clickAccountTypeIndividual() {
		screenShot(driver);
		driver.findElement(AcountTypeIndividual).click();
		return this;
	}
	
	public NewRegistrationSelectionPage clickAccountTypeOrganisation() {
		screenShot(driver);
		driver.findElement(AccountTypeOrganisation).click();
		return this;
	}

	public NewRegistrationSelectionPage clickAccountTypeAgent() {
		screenShot(driver);
		driver.findElement(AccountTypeAgent).click();
		return this;
	}

	public NewRegistrationSelectionPage clickAccountTypePensions() {
		screenShot(driver);
		driver.findElement(AccountTypePensions).click();
		return this;
	}

	public GatewayDetailsPage clickContinue() {
		driver.findElement(SubmitContinue).click();
		return new GatewayDetailsPage(driver);
	}
	
	public GatewayRegistrationPage clickNext() {
		super.clickNext();
		return new GatewayRegistrationPage(driver);
	}

}
