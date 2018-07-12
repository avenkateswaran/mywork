package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegistrationSummaryPage extends BasePage{

	public RegistrationSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public UserRegistrationAEOIPage1 clickNextGoToUserRegAEOIPage1(){
		clickNext();
		return new UserRegistrationAEOIPage1(driver);
	}
	
	public ReportingFinancialInstitutionAEOIPage1 clickNextGoToReportingFinancialInstitutionAEOIPage1(){
		clickNext();
		return new ReportingFinancialInstitutionAEOIPage1(driver);
	}
	
	public RegistrationDetailsPage clickNexGoToRegistrationDetailsPage(){
		clickNext();
		return new RegistrationDetailsPage(driver);
	}

}
