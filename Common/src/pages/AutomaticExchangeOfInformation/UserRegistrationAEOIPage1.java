package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class UserRegistrationAEOIPage1 extends BasePage{
		
	public static By orgName = By.id("FieldcompanyName");
	public static By firstName = By.id("FieldfirstName");
	public static By lastName = By.id("FieldlastName");
	public static By phoneNo = By.id("FieldcontactTelephoneNumber");
	public static By email = By.id("FieldemailAddress");
	public static By confirmEmail = By.id("FieldconfirmEmailAddress");
	
	public UserRegistrationAEOIPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public UserRegistrationAEOIPage1 setFirstName(String option){
		driver.findElement(UserRegistrationAEOIPage1.firstName).sendKeys(option);
		writeLog("Set First name");
		return this;
	}
	
	public UserRegistrationAEOIPage1 setLastName(String option){
		driver.findElement(UserRegistrationAEOIPage1.lastName).sendKeys(option);
		writeLog("Set Last name");
		return this;
	}
	
	public UserRegistrationAEOIPage1 setEmailAddress(String option){
		driver.findElement(UserRegistrationAEOIPage1.email).sendKeys(option);
		writeLog("Set Email address");
		return this;
	}
	
	public UserRegistrationAEOIPage1 setConfirmEmailAddress(String option){
		driver.findElement(UserRegistrationAEOIPage1.confirmEmail).sendKeys(option);
		writeLog("Set Confirm email address");
		return this;
	}
	
	public UserRegistrationAEOIPage2 completeContactDetails(String firstName, String lastName, String email, String confirmEmail){
		setFirstName(firstName)
		.setLastName(lastName)
		.setEmailAddress(email)
		.setConfirmEmailAddress(confirmEmail);
		clickNext();
		return new UserRegistrationAEOIPage2(driver);
	}

}
