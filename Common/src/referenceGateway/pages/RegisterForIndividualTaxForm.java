package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterForIndividualTaxForm extends BasePage{
	
	private By taxReferenceBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl00_inputTextBox");
	private By postcodeBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl01_inputTextBox");
	private By nino = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_ctl02_inputTextBox");
	private By referenceNameBoxLocator = By.id("ctl00_placeholderMainContent_svcEnrolPage_ctl00_friendlyName");
	private By nextButtonLocator = By.id("ctl00_placeholderMainContent_continueButton");
	
	
	public RegisterForIndividualTaxForm(WebDriver driver) {
		super(driver);
	}
	
	public void setYourUTR(String uTR){
		WebElement companyTaxReferenceBox = driver.findElement(taxReferenceBoxLocator);
		companyTaxReferenceBox.clear();
		companyTaxReferenceBox.sendKeys(uTR);
	}
	public void setYourPostcode(String postCode){
		WebElement registeredOfficePostcodeBox = driver.findElement(postcodeBoxLocator);
		registeredOfficePostcodeBox.clear();
		registeredOfficePostcodeBox.sendKeys(postCode);
	}
	public void setNINO(String NINO){
		WebElement companyRegistrationNumberBox = driver.findElement(nino);
		companyRegistrationNumberBox.clear();
		companyRegistrationNumberBox.sendKeys(NINO);
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
