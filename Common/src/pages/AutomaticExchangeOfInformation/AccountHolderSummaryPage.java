package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderSummaryPage extends BasePage{

	public AccountHolderSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public FinancialInstitutionSummaryPage clickGoToFinancialSummary(){
		super.clickNext();
		return new FinancialInstitutionSummaryPage(driver);
	}

}
