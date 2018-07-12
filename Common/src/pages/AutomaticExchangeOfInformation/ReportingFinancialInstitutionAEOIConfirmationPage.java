package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ReportingFinancialInstitutionAEOIConfirmationPage extends BasePage {
	public ReportingFinancialInstitutionAEOIConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public ReportingFinancialInstitutionAEOIConfirmationPage clickNextGoToAutomaticExchangeOfinformationRegistration() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Registration summary";
		super.assertHeading();
		super.actualTitle();
		return this;
	}
	public ReportingFinancialInstitutionAEOIConfirmationPage clickNextGoToAutomaticExchangeOfinformationRegistrationDetails() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Registration details";
		this.expectedSubHeading = "Overview";
		super.assertHeading();
		super.assertSubHeading();
		super.actualTitle();
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIConfirmationPage clickNextGoToAutomaticExchangeOfinformationDeclartion() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Declaration";
		super.assertHeading();
		super.actualTitle();
		return this;
	}
	
	public RegistrationSummaryPage clickNextGoToRegistrationSummaryPage(){
		clickNext();
		return new RegistrationSummaryPage(driver);
	}
}
