package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderDetailsPage2 extends BasePage{
	
	public static By fieldfirstName = By.id("FieldfirstName");
	public static By fieldmiddleName = By.id("FieldmiddleName");
	public static By fieldlastName = By.id("FieldlastName");
	public static By fieldbirthCountryCode = By.id("FieldbirthCountryCode");
	public static By fieldcityType = By.id("FieldcityType");
	public static By fieldcitySubEntity = By.id("FieldcitySubEntity");
	public static By fielddateOfBirth = By.id("FielddateOfBirth");
	public static By fieldtaxIdentificationNumbersLst = By.id("FieldtaxIdentificationNumbersLst");
	public static By fieldjurisdictionsLst = By.id("FieldjurisdictionsLst");
	public static By fieldjurisdictions1 = By.id("Fieldjurisdictions1");
	public static By fieldbuildingName = By.id("FieldbuildingName");
	public static By fieldstreet = By.id("Fieldstreet");
	public static By fielddistrict = By.id("Fielddistrict");
	public static By fieldcityTown = By.id("FieldcityTown");
	public static By fieldpostcode = By.id("Fieldpostcode");
	public static By fieldcountry = By.id("Fieldcountry");

	public AccountHolderDetailsPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolderDetailsPage2 setFirstName(String option){
		driver.findElement(fieldfirstName).sendKeys(option);
		writeLog("Set First name: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setMiddleName(String option){
		driver.findElement(fieldmiddleName).sendKeys(option);
		writeLog("Set middle name: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setLastName(String option){
		driver.findElement(fieldlastName).sendKeys(option);
		writeLog("Set Last name: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setBirthCountryCode(String option){
		driver.findElement(fieldbirthCountryCode).sendKeys(option);
		writeLog("Set Country of birth: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setCityType(String option){
		driver.findElement(fieldcityType).sendKeys(option);
		writeLog("Set City of birth: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setCitySubEntity(String option){
		driver.findElement(fieldcitySubEntity).sendKeys(option);
		writeLog("Set City sub entity: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setDateOfBirth(String option){
		driver.findElement(fielddateOfBirth).sendKeys(option);
		writeLog("Set Date of birth: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setTaxIdentificationNumbers(String option){
		driver.findElement(fieldtaxIdentificationNumbersLst).sendKeys(option);
		writeLog("Set Tax Identification Numbers: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setTaxResidence(String option){
		driver.findElement(fieldjurisdictionsLst).sendKeys(option);
		writeLog("Set Tax Residence: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setTaxResidence1(String option){
		driver.findElement(fieldjurisdictions1).sendKeys(option);
		writeLog("Set Tax Residence1: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setBuildingName(String option){
		driver.findElement(fieldbuildingName).sendKeys(option);
		writeLog("Set Building name: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setStreet(String option){
		driver.findElement(fieldstreet).sendKeys(option);
		writeLog("Set Street: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setDistrict(String option){
		driver.findElement(fielddistrict).sendKeys(option);
		writeLog("Set District: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setCityTown(String option){
		driver.findElement(fieldcityTown).sendKeys(option);
		writeLog("Set City Town: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setPostcode(String option){
		driver.findElement(fieldpostcode).sendKeys(option);
		writeLog("Set Postcode: " + option);
		return this;
	}
	
	public AccountHolderDetailsPage2 setCountry(String option){
		driver.findElement(fieldcountry).sendKeys(option);
		writeLog("Set Country: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 clickNextGoToAccountHolderDetailsAccDetailsPage1(String firstName, String lastName, String birthCountryCode, String taxIdentificationNumber, String taxResidence, String taxResidence1, String cityTown, String postcode, String country){
		setFirstName(firstName)
		.setLastName(lastName)
		.setBirthCountryCode(birthCountryCode)
		.setTaxIdentificationNumbers(taxIdentificationNumber)
		.setTaxResidence(taxResidence)
		.setTaxResidence1(taxResidence1)
		.setCityTown(cityTown)
		.setPostcode(postcode)
		.setCountry(country);
		super.clickNext();
		return new AccountHolderDetailsAccDetailsPage1(driver);
	}

}
