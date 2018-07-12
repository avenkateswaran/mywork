package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ReportingFinancialContactDetails extends BasePage {


	public ReportingFinancialContactDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By orgName = By.id("LabelcompanyName");
	public By fristLab = By.id("LabelfirstName");
	public By lastLab = By.id("LabellastName");
	public By phonLab = By.id("LabelcontactTelephoneNumber");
	public By eMail = By.id("LabelemailAddress");
	public By ceMail = By.id("LabelconfirmEmailAddress");
	public By gIin = By.id("Labelgiin");
	public By nIin = By.id("LabelnationalInsuranceNumber");
	public By buildName = By.id("LabelbuildingName");
	public By street = By.id("Labelstreet");
	public By ciTy = By.id("LabelcityTown");
	public By pCode = By.id("Labelpostcode");
	public By counTry = By.id("Labelcountry");
	
	public By buildFName = By.id("FieldbuildingName");
	public By streetF = By.id("Fieldstreet");
	public By ciTyF = By.id("FieldcityTown");
	public By pFCode = By.id("Fieldpostcode");
	public By FcounTry  = By.id("Fieldcountry1_opt");
	public By orgFName = By.id("FieldcompanyName");
	public By fristFLab = By.id("FieldfirstName");
	public By lastFLab = By.id("FieldlastName");
	public By phonFLab = By.id("FieldcontactTelephoneNumber");
	public By efMail = By.id("FieldemailAddress");
	public By cefMail = By.id("FieldconfirmEmailAddress");
	public By fGiin = By.id("Fieldgiin");
	public By fNiin = By.id("FieldnationalInsuranceNumber");
	public String drp1 = "Fieldcountry1_opt";
	public ReportingFinancialContactDetails clickUK (String text){
		driver.findElement(By.id(text)).click();
		return this;
	}
	public ReportingFinancialContactDetails clickNextGoToAutomaticExchangeOfinformationRegistration() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Automatic Exchange of Information registration";
		this.expectedSubHeading = "Contact details";
		super.assertHeading();
		super.assertSubHeading();
		super.actualTitle();
		return this;
	}
	
	public ReportingFinancialContactDetails clickNextGoToAddressDetails() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Automatic Exchange of Information registration";
		this.expectedSubHeading = "Reporting financial institution - Address details";
		super.assertHeading();
		super.assertTitle();
		super.subHeading();
		return this;
	
	}
	

public ReportingFinancialContactDetails clickNextGoToUserRegistrationDetailsConfirmation() {
	super.clickNext();
	this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
	this.expectedHeading = "Automatic Exchange of Information registration";
	this.expectedSubHeading = "Reporting financial institution - Confirmation";
	super.assertHeading();
	super.assertTitle();
	super.subHeading();
	return this;
}
}
