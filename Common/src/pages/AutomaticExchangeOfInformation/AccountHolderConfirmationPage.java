package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderConfirmationPage extends BasePage {

	public AccountHolderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolderSummaryPage clickNextGoToAccountHolderSummaryPage(){
		super.clickNext();
		return new AccountHolderSummaryPage(driver);
	}
	
}
