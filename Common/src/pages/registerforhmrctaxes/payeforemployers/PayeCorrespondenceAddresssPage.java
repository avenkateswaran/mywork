package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class PayeCorrespondenceAddresssPage extends BasePage{
	
	public static By addressLineCheck1 = By.xpath("//dl[@class='read-only-form']/dd[1]");
	public static By addressLineCheck2 = By.xpath("//dl[@class='read-only-form']/dd[2]");
	public static By addressLineCheck3 = By.xpath("//dl[@class='read-only-form']/dd[3]");
	public static By addressLineCheck4 = By.xpath("//dl[@class='read-only-form']/dd[4]");
	public static By postCodeCheck = By.xpath("//dl[@class='read-only-form']/dd[5]");
	public static By FieldcorrAddressDiffBus = By.id("FieldcorrAddressDiffBus");
	

	public PayeCorrespondenceAddresssPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Correspondence details - Business address";
		this.expectedHeading = "Employing people";
		this.expectedSubHeading = "PAYE correspondence details - Correspondence address";
		super.assertTitle().assertHeading().assertSubHeading();
	}


	public PayeCorrespondenceDetailsConfirmationPage clickNextGoToPayeCorrespondenceDetailsConfirmationPage() {
		driver.findElement(locators.Common.Next_Button).click();
		return new PayeCorrespondenceDetailsConfirmationPage(driver);
	}


	public EmployingPeopleConfirmationPage clickNextGoToEmployingPeopleConfirmationPage() {
		driver.findElement(locators.Common.Next_Button).click();
		return new EmployingPeopleConfirmationPage(driver);
	}

}
