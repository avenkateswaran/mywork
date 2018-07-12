package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class EnrolforAEOIEnterDetails extends BasePage {

	public EnrolforAEOIEnterDetails(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By aEoiId = By.id("FieldfatcaId");
	public By pFCode = By.id("FieldpostCode");
	
}
