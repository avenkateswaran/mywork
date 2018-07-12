package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ReportingFinancialInstitutionDetailsPage extends BasePage{
	
	public static By fieldreportingPeriod = By.id("FieldreportingPeriod");
	public static By fieldinsuranceElection = By.id("FieldinsuranceElection");
	public static By fielddormantAccountInd = By.id("FielddormantAccountInd");
	public static By fieldprocedures = By.id("Fieldprocedures");
	public static By fieldthresholds = By.id("Fieldthresholds");
	public static By fieldnilReturn = By.id("FieldnilReturn");

	public ReportingFinancialInstitutionDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ReportingFinancialInstitutionDetailsPage setReportingPeriod(String option){
		driver.findElement(fieldreportingPeriod).sendKeys(option);
		writeLog("Set Reporting period 31st December: " + option);
		return this;
	}
	public ReportingFinancialInstitutionDetailsPage setElectingNoCashValue(String option){
		driver.findElement(fieldinsuranceElection).sendKeys(option);
		writeLog("Set Are you electing not to report cash value insurance contracts or annuity contracts described in section III A of the CRS to non-EU jurisdictions?: " + option);
		return this;
	}
	public ReportingFinancialInstitutionDetailsPage setElectionTreatDormant(String option){
		driver.findElement(fielddormantAccountInd).sendKeys(option);
		writeLog("Set Are you making an election to treat dormant accounts as not being reportable accounts?: " + option);
		return this;
	}
	public ReportingFinancialInstitutionDetailsPage setReportingUSSpecificPersons(String option){
		driver.findElement(fieldprocedures).sendKeys(option);
		writeLog("Set If you are reporting US specific persons, are you making an election to use alternative due-diligence procedures taken from U.S. Treasury Regulations? For non-US persons elect 'No': " + option);
		return this;
	}
	public ReportingFinancialInstitutionDetailsPage setElectionThresholds(String option){
		driver.findElement(fieldthresholds).sendKeys(option);
		writeLog("Set Are you making an election to use thresholds in your due diligence process?: " + option);
		return this;
	}
	public ReportingFinancialInstitutionDetailsPage setSubmittingNILReturns(String option){
		driver.findElement(fieldnilReturn).sendKeys(option);
		writeLog("Set Are you submitting any NIL returns?: " + option);
		return this;
	}
	
	public FinancialInstitutionDetailsConfirmationPage completeDetails(String reportingPeriod, String noCash, String treatDormant, String usSpecificPerson, String thresholds, String nilReturns){
		setReportingPeriod(reportingPeriod)
		.setElectingNoCashValue(noCash)
		.setElectionTreatDormant(treatDormant)
		.setReportingUSSpecificPersons(usSpecificPerson)
		.setElectionThresholds(thresholds)
		.setSubmittingNILReturns(nilReturns);
		clickNext();
	return new FinancialInstitutionDetailsConfirmationPage(driver); 
	}
}
