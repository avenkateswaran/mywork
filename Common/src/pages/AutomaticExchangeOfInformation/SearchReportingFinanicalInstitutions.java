package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SearchReportingFinanicalInstitutions extends BasePage {
	
	public static By linkFinancialInstitutionsSearch = By.id("LinkFinancialInstitutionsSearch");
	public static By createAnEOIReturn = By.xpath("//*[@id='financialInstitutionSearchResults']/div[2]/form/table/tbody/tr/td[3]/a");

	public SearchReportingFinanicalInstitutions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickViewFinancialInstitutions() {
		driver.findElement(linkFinancialInstitutionsSearch).click();
	}

	public ReportingFinancialInstitutionDetailsPage clickCreateAnAEOIReturn() {
		driver.findElement(createAnEOIReturn).click();
		return new ReportingFinancialInstitutionDetailsPage(driver);
	}

}
