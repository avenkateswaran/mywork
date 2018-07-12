package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FinancialInstitutionDetailsConfirmationPage extends BasePage{

	public FinancialInstitutionDetailsConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public FinancialInstituionSummaryPage clickNextGoToSummaryPage(){
	super.clickNext();
	return new FinancialInstituionSummaryPage(driver);
	}
}
