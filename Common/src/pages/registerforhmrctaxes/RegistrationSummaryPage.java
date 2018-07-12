package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegistrationSummaryPage extends BasePage{
	
	//Registration summary
	public static By LinkSetUpADelegate = By.id("LinkSetUpADelegate");
	public static By LinkPersonalInformation = By.id("LinkPersonalInformation");
	public static By LinkYourHomeAddress = By.id("LinkYourHomeAddress");
	public static By LinkYourContactDetails = By.id("LinkYourContactDetails");
	public static By LinkBusinessDetails = By.id("LinkBusinessDetails");
	public static By LinkBusinessAddress = By.id("LinkBusinessAddress");
	public static By LinkBusinessContactDetails = By.id("LinkBusinessContactDetails");
	public static By LinkEmployingStaff = By.id("LinkEmployingStaff");
	public static By LinkPayeCorrespondenceDetails = By.id("LinkPayeCorrespondenceDetails");

	public RegistrationSummaryPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Registration summary";
		this.expectedHeading = "Registration summary";
		super.assertTitle().assertHeading();
	}
	
	public PersonalInformationPage clickNext(){
		super.clickNext();
		return new PersonalInformationPage(driver);
	}	
	
	public DeclarationPage clickNextGoToDeclarationPage(){
		super.clickNext();
		return new DeclarationPage(driver);
	}	

}
