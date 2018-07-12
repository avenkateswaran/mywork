package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.payeforemployers.AboutTheBusinessConfirmationPAYEPage;
import pages.registerforhmrctaxes.selfassessment.AboutTheBusinessConfirmationSAPage;

public class BusinessContactDetailsPage extends BasePage{
	
	public static By FieldbusTelephone = By.id("FieldbusTelephone");
	public static By FieldbusMobileTelephone = By.id("FieldbusMobileTelephone");
	public static By FieldbusFaxTelephone = By.id("FieldbusFaxTelephone");
	public static By FieldbusEmailAddress = By.id("FieldbusEmailAddress");
	public static By FieldconfirmBusEmailAddress = By.id("FieldconfirmBusEmailAddress");

	public BusinessContactDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Business contact details";
		this.expectedHeading = "About the business";
		this.expectedSubHeading = "Business contact details";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public AboutTheBusinessConfirmationSAPage clickNext(){
		super.clickNext();
		return new AboutTheBusinessConfirmationSAPage(driver);
	}
	
	public AboutTheBusinessConfirmationPAYEPage clickNextGoToAboutTheBusinessConfirmationPAYEPage(){
		super.clickNext();
		return new AboutTheBusinessConfirmationPAYEPage(driver);
	}

}
