package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.Common;
import pages.BasePage;
import pages.registerforhmrctaxes.BusinessContactDetailsPage;

public class BusinessAddressConfirmationPage extends BasePage{
	
	public static By addressLineCheck1 = By.xpath("//dl[@class='read-only-form']/dd[1]");
	public static By addressLineCheck2 = By.xpath("//dl[@class='read-only-form']/dd[2]");
	public static By addressLineCheck3 = By.xpath("//dl[@class='read-only-form']/dd[3]");
	public static By addressLineCheck4 = By.xpath("//dl[@class='read-only-form']/dd[4]");
	public static By postCodeCheck = By.xpath("//dl[@class='read-only-form']/dd[5]");

	public BusinessAddressConfirmationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Business address - Confirmation";
		this.expectedHeading = "About the business";
		this.expectedSubHeading = "Business address - Confirmation";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public BusinessContactDetailsPage clickNextGoToBusinessContactDetailsPage() {
		driver.findElement(Common.Next_Button).click();
		return new BusinessContactDetailsPage(driver);
	}

}
