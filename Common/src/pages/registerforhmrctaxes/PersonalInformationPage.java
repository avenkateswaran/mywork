package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class PersonalInformationPage extends BasePage{
	
	//Personal information
	public static By Fieldtitle = By.id("Fieldtitle");
	public static By FieldfirstName = By.id("FieldfirstName");
	public static By FieldmiddleNames = By.id("FieldmiddleNames");
	public static By FieldlastName = By.id("FieldlastName");
	public static By FieldhaveEverChangedName = By.id("FieldhaveEverChangedName");
	public static By FielddateOfBirth = By.id("FielddateOfBirth");
	public static By FieldnationalInsuranceNumber = By.id("FieldnationalInsuranceNumber");
	public static By FieldareYouUKResident = By.id("FieldareYouUKResident");
	public static By FieldhaveComeFromNonEU = By.id("FieldhaveComeFromNonEU");
	public static By Fieldsharefisherman = By.id("Fieldsharefisherman");
	public static By FieldbusinessIsLandAndProperty = By.id("FieldbusinessIsLandAndProperty");
	public static By FieldlioydsUnderwriter = By.id("FieldlioydsUnderwriter");
	public static By Fielddirector = By.id("Fielddirector");
	public static By FieldministerReligionNoSalaryOrStipend = By.id("FieldministerReligionNoSalaryOrStipend");
	public static By FieldexamModInvigOrSetsQuestions = By.id("FieldexamModInvigOrSetsQuestions");
	public static By Fieldinvestments = By.id("Fieldinvestments");
	public static By FieldintendWorkConstruction = By.id("FieldintendWorkConstruction");
	public static By FieldpreviousUTR = By.id("FieldpreviousUTR");
	public static By LinkEmploymentStatusIndicator = By.id("LinkEmploymentStatusIndicator");
	public static By FieldworkingOneFirmOnly = By.id("FieldworkingOneFirmOnly");

	public PersonalInformationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Personal Information";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Personal information";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public AddressSearchPage clickNext(){
		super.clickNext();
		return new AddressSearchPage(driver);
	}	
	
	public AboutYouConfirmationPage clickNextGoToAboutYouConfirmation(){
		super.clickNext();
		return new AboutYouConfirmationPage(driver);
	}

}
