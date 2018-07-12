package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ReportingFinancialInstitutionAEOIPage1 extends BasePage{
	
	public static By fieldCompanyName = By.id("FieldcompanyName");
	public static By fieldFirstName = By.id("FieldfirstName");
	public static By fieldLastName = By.id("FieldlastName");
	public static By fieldContactTelephoneNumber = By.id("FieldcontactTelephoneNumber");
	public static By fieldEmailAddress = By.id("FieldemailAddress");
	public static By fieldConfirmEmailAddress = By.id("FieldconfirmEmailAddress");
	public static By fieldGiin = By.id("Fieldgiin");
	public static By fieldUniqueTaxpayerReference = By.id("FielduniqueTaxpayerReference");
	public static By fieldNationalInsuranceNumber = By.id("FieldnationalInsuranceNumber");
	public static By fieldNoUKTaxIdentifier = By.id("FieldnoUKTaxIdentifier");
	public static By fieldFilerCategory = By.id("FieldfilerCategory");
	
	public ReportingFinancialInstitutionAEOIPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public ReportingFinancialInstitutionAEOIPage1 setFieldCompanyName(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage1.fieldCompanyName).sendKeys(option);
		writeLog("Set Organisation name");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage1 setFieldEmailAddress(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage1.fieldEmailAddress).sendKeys(option);
		writeLog("Set Email address");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage1 setFieldConfirmEmailAddress(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage1.fieldConfirmEmailAddress).sendKeys(option);
		writeLog("Set Confirm email address");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage1 setFieldGiin(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage1.fieldGiin).sendKeys(option);
		writeLog("Set Global Intermediary Identification Number");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage1 setFieldNoUKTaxIdentifer(){
		driver.findElement(fieldNoUKTaxIdentifier).click();
		writeLog("Select Financial institution doesn't have a UK Tax identifier checkbox");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage2 completeContactDetails(String fieldCompanyName, String fieldEmailAddress, String fieldConfirmEmailAddress, String fieldGiin){
		setFieldCompanyName(fieldCompanyName)
		.setFieldEmailAddress(fieldEmailAddress)
		.setFieldConfirmEmailAddress(fieldConfirmEmailAddress)
		.setFieldGiin(fieldGiin)
		.setFieldNoUKTaxIdentifer();
		clickNext();
		return new ReportingFinancialInstitutionAEOIPage2(driver);
	}
	
}
