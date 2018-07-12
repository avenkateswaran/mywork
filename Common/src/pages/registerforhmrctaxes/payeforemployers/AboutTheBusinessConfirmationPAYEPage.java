package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AboutTheBusinessConfirmationPAYEPage extends BasePage{
	
	public static By businessDetailsCheck1 = By.xpath("//dl[@class='read-only-form'][1]/dd[1]");
	public static By businessDetailsCheck2 = By.xpath("//dl[@class='read-only-form'][1]/dd[2]");
	public static By businessDetailsCheck3 = By.xpath("//dl[@class='read-only-form'][1]/dd[3]");
	public static By addressLineCheck1 = By.xpath("//dl[@class='read-only-form'][2]/dd[1]");
	public static By addressLineCheck2 = By.xpath("//dl[@class='read-only-form'][2]/dd[2]");
	public static By addressLineCheck3 = By.xpath("//dl[@class='read-only-form'][2]/dd[3]");
	public static By addressLineCheck4 = By.xpath("//dl[@class='read-only-form'][2]/dd[4]");
	public static By postCodeCheck = By.xpath("//dl[@class='read-only-form'][2]/dd[5]");
	public static By businessContactDetails1 = By.xpath("//dl[@class='read-only-form'][3]/dd[1]");
	public static By businessContactDetails2 = By.xpath("//dl[@class='read-only-form'][3]/dd[2]");
	public static By businessContactDetails3 = By.xpath("//dl[@class='read-only-form'][3]/dd[3]");
	public static By businessContactDetails4 = By.xpath("//dl[@class='read-only-form'][3]/dd[4]");
	public static By LinkChangeBusDetails = By.id("LinkChangeBusDetails");
	public static By LinkChangeBusAddress = By.id("LinkChangeBusAddress");
	public static By LinkBusContactDetails = By.id("LinkBusContactDetails");

	public AboutTheBusinessConfirmationPAYEPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Confirmation";
		this.expectedHeading = "About the business";
		this.expectedSubHeading = "Confirmation";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public EmployingPeoplePage clickNextGoToEmployingPeoplePage() {
		super.clickNext();
		return new EmployingPeoplePage(driver);
	}
	
}
