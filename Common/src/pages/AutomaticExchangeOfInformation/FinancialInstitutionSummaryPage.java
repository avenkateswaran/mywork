package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FinancialInstitutionSummaryPage extends BasePage{
	
	public static By changeReportingFinancialInstitutionDetails = By.id("//*[@id='portletFinancialInstitutionsSummary']/div[2]/ul[3]/li/a");
	public static By addNewAccountHolder = By.id("//*[@id='portletFinancialInstitutionsSummary']/div[2]/ul[4]/li/a");
	public static By deleteDraftReturn = By.id("//*[@id='portletFinancialInstitutionsSummary']/div[2]/ul[5]/li/a");
	
	public FinancialInstitutionSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	public AccountHolderDetailsPage1 clickNewAccountHolderGoToAccountHolderDetailsPage1(){
		driver.findElement(addNewAccountHolder).click();
		writeLog("Click Add new account holder");
		return new AccountHolderDetailsPage1(driver);
	}
	
	public SubmissionOverviewPage clickNextGoToSubmissionOverviewPage(){
		super.clickNext();
		return new SubmissionOverviewPage(driver);
	}

}
