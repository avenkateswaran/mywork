package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FinancialInstituionSummaryPage extends BasePage {
	
	public static By accountHolder = By.id("//*[@id='portletFinancialInstitutionsSummary']/div[2]/ul[3]/li/a");

	public FinancialInstituionSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AccountHolderDetailsPage1 clickNextAccountHolder(){
		driver.findElement(accountHolder).click();
		return new AccountHolderDetailsPage1(driver);
	}
	
}
