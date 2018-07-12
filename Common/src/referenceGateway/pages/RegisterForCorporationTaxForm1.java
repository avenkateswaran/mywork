package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterForCorporationTaxForm1 extends BasePage{

	private By companyTaxReferenceBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl00_inputTextBox");
	private By registeredOfficePostcodeBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl01_inputTextBox");
	private By companyRegistrationNumberBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl02_inputTextBox");
	private By referenceNameBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_friendlyName");
	private By nextButtonLocator = By.id("ctl00_placeholderMainContent_continueButton");
	
	public RegisterForCorporationTaxForm1(WebDriver driver) {
		super(driver);
	}

	public void setYourCompanyTaxReference(String uTR){
		WebElement companyTaxReferenceBox = driver.findElement(companyTaxReferenceBoxLocator);
		companyTaxReferenceBox.clear();
		companyTaxReferenceBox.sendKeys(uTR);
	}
	public void setYourRegisteredOfficePostcode(String postCode){
		WebElement registeredOfficePostcodeBox = driver.findElement(registeredOfficePostcodeBoxLocator);
		registeredOfficePostcodeBox.clear();
		registeredOfficePostcodeBox.sendKeys(postCode);
	}
	public void setCompanyRegistrationNumber(String CompanyNumber){
		WebElement companyRegistrationNumberBox = driver.findElement(companyRegistrationNumberBoxLocator);
		companyRegistrationNumberBox.clear();
		companyRegistrationNumberBox.sendKeys(CompanyNumber);
	}
	public void setReferenceName(String referenceName){
		WebElement referenceNameBox = driver.findElement(referenceNameBoxLocator);
		referenceNameBox.clear();
		referenceNameBox.sendKeys(referenceName);
	}
	
	public EnrollmentConfirmationPage clickNext(){
		WebElement nextButton = driver.findElement(nextButtonLocator);
		nextButton.click();
		return new EnrollmentConfirmationPage(driver);
	}
}
