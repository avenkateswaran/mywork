package pages.registerforhmrctaxes.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.AddressSearchPage;

public class WorkingForOnePersonOrFirmPage extends BasePage{
	
	//Working for one person or firm
	public static By FieldclientsName = By.id("FieldclientsName");

	public WorkingForOnePersonOrFirmPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Working for one person or firm";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Working for one person or firm - Name of person or firm";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public AddressSearchPage clickNext(){
		super.clickNext();
		return new AddressSearchPage(driver);
	}	
	
	
}
