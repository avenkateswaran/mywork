package pages.registerforhmrctaxes.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.AboutYouConfirmationPage;

public class WorkingForOnePersonOrFirmConfirmation extends BasePage{
	
	public static By changeAddress = By.name("changeAddress");
	public static By addressLineCheck1 = By.xpath("//dl[@class='read-only-form']/dd[1]");
	public static By addressLineCheck2 = By.xpath("//dl[@class='read-only-form']/dd[2]");
	public static By addressLineCheck3 = By.xpath("//dl[@class='read-only-form']/dd[3]");
	public static By addressLineCheck4 = By.xpath("//dl[@class='read-only-form']/dd[4]");
	public static By postCodeCheck = By.xpath("//dl[@class='read-only-form']/dd[5]");

	public WorkingForOnePersonOrFirmConfirmation(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Firm address";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Working for one person or firm - Confirm address of person or firm";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public AboutYouConfirmationPage clickNext(){
		super.clickNext();
		return new AboutYouConfirmationPage(driver);
	}

}
