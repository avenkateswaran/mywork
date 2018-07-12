package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class UserRegistrationAEOIPage2 extends BasePage{
	
	public static By fieldBuildingName = By.id("FieldbuildingName");
	public static By fieldStreet = By.id("Fieldstreet");
	public static By fieldDistrict = By.id("Fielddistrict");
	public static By fieldCityTown = By.id("FieldcityTown");
	public static By fieldPostcode = By.id("Fieldpostcode");
	public static By fieldCountry = By.id("Fieldcountry");
	
	public UserRegistrationAEOIPage2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public UserRegistrationAEOIPage2 setFieldBuildingName(String option){
		driver.findElement(UserRegistrationAEOIPage2.fieldBuildingName).sendKeys(option);
		writeLog("Set Building name or number");
		return this;
	}
	
	public UserRegistrationAEOIPage2 setFieldStreet(String option){
		driver.findElement(UserRegistrationAEOIPage2.fieldStreet).sendKeys(option);
		writeLog("Set Street");
		return this;
	}
	
	public UserRegistrationAEOIPage2 setFieldCityTown(String option){
		driver.findElement(UserRegistrationAEOIPage2.fieldCityTown).sendKeys(option);
		writeLog("Set City/town");
		return this;
	}
	
	public UserRegistrationAEOIPage2 setFieldPostcode(String option){
		driver.findElement(UserRegistrationAEOIPage2.fieldPostcode).sendKeys(option);
		writeLog("Set Postcode");
		return this;
	}
	
	public UserRegistrationAEOIPage2 setFieldCountry(String option){
		driver.findElement(UserRegistrationAEOIPage2.fieldCountry).sendKeys(option);
		writeLog("Set Country");
		return this;
	}
	
	public UserRegistrationAEOIConfirmationPage completeAddressDetails(String fieldBuildingName, String fieldStreet, String fieldCityTown, String fieldPostcode, String fieldCountry){
		setFieldBuildingName(fieldBuildingName)
		.setFieldStreet(fieldStreet)
		.setFieldCityTown(fieldCityTown)
		.setFieldPostcode(fieldPostcode)
		.setFieldCountry(fieldCountry);
		clickNext();
		return new UserRegistrationAEOIConfirmationPage(driver);
	}

}
