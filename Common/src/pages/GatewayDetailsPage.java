package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GatewayDetailsPage extends BasePage {
	
	public static By FullName = By.id("fullName");
	public static By EmailAddress = By.id("email");
	public static By Password = By.id("password");
	public static By PasswordConfirm = By.id("passwordConfirm");
	public static By Submit = By.id("submit");
	public static By Continue = By.id("submitBtn");
	
	//Business account - Agents
	public By CharitiesForAgents = By.id("FieldToBeDetermined");
	public By CorpTaxForAgents = By.id("FieldCorporationTaxForAgents");
	public By MachineGamesDutyForAgents = By.id("FieldmachineGamesDuty");
	public By NotificationOfVehicleArrivals = By.id("FieldNovaForAgents");
	public By VATMiniOneStopShopForAgents = By.id("FieldMossForAgents");
	public By PayeCisErsForAgents = By.id("FieldPayeCISForAgents");
	public By SAForAgents = By.id("FieldSelfAssessmentForAgents");
	public By StampTaxesForAgents = By.id("FieldStampTaxesForAgents");
	public By VATForAgents = By.id("FieldVatForAgents");
	public By VATEURefundsForAgents = By.id("FieldEuVatForAgents");
	

	public GatewayDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Enter your details - Government Gateway";
		this.expectedHeading = "Enter your details";
	}

	public RegistrationSuccessPage clickContinue() {
		screenShot(driver);
		driver.findElement(Continue).click();
		return new RegistrationSuccessPage(driver);
	}
	
	public GatewayDetailsPage registrationDetails(BasePage page, String fullname, String emailadd, String password) {
		page.setText(FullName, fullname);
		page.setText(EmailAddress, emailadd);
		page.setText(Password, password);
		page.setText(PasswordConfirm, password);
		return this;
	}
	


}
