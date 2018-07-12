package pages.selfassessmentnewui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.selfassessment.TaxReturnOptionsPage;

public class CurrentPositionPage extends BasePage{
	
	public static By LinkNavbarTaxReturnOptions = By.id("LinkNavbarTaxReturnOptions");

	public CurrentPositionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Current position";
		this.expectedHeading = "Current position";
		super.assertTitle().assertHeading();
	}
	
	public TaxReturnOptionsPage clickTaxReturnOptions(){
		writeLog("click Tax return options");
		screenShot(driver);
		driver.findElement(LinkNavbarTaxReturnOptions).click();
		return new TaxReturnOptionsPage(driver);
	}
}