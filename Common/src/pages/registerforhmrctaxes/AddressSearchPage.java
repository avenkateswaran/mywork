package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AboutYouPage;
import pages.BasePage;
import pages.registerforhmrctaxes.selfassessment.HomeAddressConfirmationPage;
import pages.registerforhmrctaxes.selfassessment.WorkingForOnePersonOrFirmConfirmation;
import pages.registerforhmrctaxes.payeforemployers.BusinessAddressConfirmationPage;

public class AddressSearchPage extends BasePage{
	
	public static By FieldhouseId = By.id("FieldhouseId");
	public static By FieldstreetName = By.id("FieldstreetName");
	public static By FieldtownOrCity = By.id("FieldtownOrCity");
	public static By FieldpostCode = By.id("FieldpostCode");
	public static By Fieldline1 = By.id("Fieldline1");
	public static By Fieldline2 = By.id("Fieldline2");
	public static By Fieldline3 = By.id("Fieldline3");
	public static By Fieldline4 = By.id("Fieldline4");
	public static By Fieldcountry = By.id("Fieldcountry");
	public static By _cmdButtonMenuPostCodeSearch = By.name("_cmdButtonMenuPostCodeSearch");
	public static By _cmdButtonMenuStreetSearch = By.name("_cmdButtonMenuStreetSearch");
	public static By _cmdButtonMenuHaveNonUKAddress = By.name("_cmdButtonMenuHaveNonUKAddress");
	public static By _commandButtonFindAddress = By.name("_commandButtonFindAddress");
	public static By _cmdButtonMenuEnterAddressManually = By.name("_cmdButtonMenuEnterAddressManually");


	public AddressSearchPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Address search";
		this.expectedHeading = "Address search";
		super.assertTitle().assertHeading();
	}

	public AboutYouPage ClickNextGoToAboutYouPage(){
		super.clickNext();
		return new AboutYouPage(driver);
		
	}
	
	public AboutYouPage ClickNextGoBackToAboutYouPage(){
		super.clickNext();
		return new AboutYouPage(driver);
	}
	
	public HomeAddressConfirmationPage clickNext(){
		super.clickNext();
		return new HomeAddressConfirmationPage(driver);
	}	
	
	public WorkingForOnePersonOrFirmConfirmation clickNextGoToWorkingConfirmation(){
		super.clickNext();
		return new WorkingForOnePersonOrFirmConfirmation(driver);
	}
	
	public BusinessAddressConfirmationPage clickNextGoToBusinessAddressConfirmationPage() {
		super.clickNext();;
		return new BusinessAddressConfirmationPage(driver);
	}

}
