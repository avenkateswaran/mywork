package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AtAGlancePage extends BasePage{
	
	public static By linkCreateFatcaOnlineReturnsURL = By.id("LinkCreateFatcaOnlineReturnsURL");

	public AtAGlancePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public SearchReportingFinanicalInstitutions clickCreateAnAEOIReturnOnline() {
		driver.findElement(linkCreateFatcaOnlineReturnsURL).click();
		return new SearchReportingFinanicalInstitutions(driver);
	}

}
