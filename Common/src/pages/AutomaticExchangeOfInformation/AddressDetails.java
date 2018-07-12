package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AddressDetails extends BasePage{

	public AddressDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
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
	
	public String drp1 = "Fieldcountry1_opt";
	
	public AddressDetails clickNextGoToUserRegistrationDetailsConfirmation() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Automatic Exchange of Information registration";
		this.expectedSubHeading = "User registration details - Confirmation";
		super.assertHeading();
		super.assertTitle();
		super.subHeading();
		return this;
	}
	
	public AddressDetails clickUK (String text){
		driver.findElement(By.id(text)).click();
			
		return this;
	}
	
}
