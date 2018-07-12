package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ReportingFinancialInstitutionAEOIPage2 extends BasePage{
	
	public static By fieldBuildingName = By.id("FieldbuildingName");
	public static By fieldStreet = By.id("Fieldstreet");
	public static By fieldDistrict = By.id("Fielddistrict");
	public static By fieldCityTown = By.id("FieldcityTown");
	public static By fieldPostcode = By.id("Fieldpostcode");
	public static By fieldCountry = By.id("Fieldcountry");
	

	public ReportingFinancialInstitutionAEOIPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ReportingFinancialInstitutionAEOIPage2 setFieldBuildingName(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage2.fieldBuildingName).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage2 setFieldStreet(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage2.fieldBuildingName).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage2 setFieldCityTown(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage2.fieldBuildingName).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage2 setFieldPostcode(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage2.fieldBuildingName).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}
	
	public ReportingFinancialInstitutionAEOIPage2 setFieldCountry(String option){
		driver.findElement(ReportingFinancialInstitutionAEOIPage2.fieldCountry).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}

	public ReportingFinancialInstitutionAEOIConfirmationPage completeAddressDetails(String fieldBuildingName, String fieldStreet, String fieldCityTown, String fieldPostcode, String fieldCountry){
		setFieldBuildingName(fieldBuildingName)
		.setFieldStreet(fieldStreet)
		.setFieldCityTown(fieldCityTown)
		.setFieldPostcode(fieldPostcode)
		.setFieldCountry(fieldCountry);
		clickNext();
		return new ReportingFinancialInstitutionAEOIConfirmationPage(driver);
	}
	
}
