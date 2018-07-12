package pages.registerforhmrctaxes.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class YourContactDetails extends BasePage{
	
	//Your contact details
	public static By FieldemailAddress = By.id("FieldemailAddress");
	public static By FieldconfirmEmailAddress = By.id("FieldconfirmEmailAddress");
	public static By FielddaytimeTelephone = By.id("FielddaytimeTelephone");
	public static By FieldmobileTelephone = By.id("FieldmobileTelephone");

	public YourContactDetails(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Your contact details";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Your contact details";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public WorkingForOnePersonOrFirmPage clickNext(){
		super.clickNext();
		return new WorkingForOnePersonOrFirmPage(driver);
	}	

}
