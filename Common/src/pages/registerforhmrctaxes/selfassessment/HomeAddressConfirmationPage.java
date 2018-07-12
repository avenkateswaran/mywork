package pages.registerforhmrctaxes.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class HomeAddressConfirmationPage extends BasePage{
	
	public static By FieldlivedAddressLess3Years = By.id("FieldlivedAddressLess3Years");
	public static By FieldaddressEffectiveFromDate = By.id("FieldaddressEffectiveFromDate");
	public static By changeAddress = By.name("changeAddress");
	public static By addressLineCheck1 = By.xpath("//dl[@class='read-only-form']/dd[1]");
	public static By addressLineCheck2 = By.xpath("//dl[@class='read-only-form']/dd[2]");
	public static By addressLineCheck3 = By.xpath("//dl[@class='read-only-form']/dd[3]");
	public static By addressLineCheck4 = By.xpath("//dl[@class='read-only-form']/dd[4]");
	public static By postCodeCheck = By.xpath("//dl[@class='read-only-form']/dd[5]");

	public HomeAddressConfirmationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Home address";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Your home address - Confirmation";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public YourContactDetails clickNext(){
		super.clickNext();
		return new YourContactDetails(driver);
	}	
	
}
