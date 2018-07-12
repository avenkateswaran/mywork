package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TellUsAboutYouPage extends BasePage{
	
	public static By wf21_01_FieldFirstName = By.id("wf21_01_FieldFirstName");
	public static By wf21_01_FieldMiddleName = By.id("wf21_01_FieldMiddleName");
	public static By wf21_01_FieldSurnameName = By.id("wf21_01_FieldSurnameName");
	public static By wf21_01_FieldUTR = By.id("wf21_01_FieldUTR");
	public static By wf21_01_FieldNationalInsuranceNumber = By.id("wf21_01_FieldNationalInsuranceNumber");
	public static By wf21_01_FieldPhoneNumber = By.id("wf21_01_FieldPhoneNumber");
	public static By wf21_01_FieldEmailAddress = By.id("wf21_01_FieldEmailAddress");
	public static By addressLine1 = By.id("addressLine1");
	public static By addressLine2 = By.id("addressLine2");
	public static By addressLine3 = By.id("addressLine3");
	public static By addressLine4 = By.id("addressLine4");
	public static By postcode = By.id("postcode");
	public static By wf21_01_FieldAmendAddressDetails = By.id("wf21_01_FieldAmendAddressDetails");
	public static By wf21_01_FieldDateOfBirth = By.id("wf21_01_FieldDateOfBirth");
	public static By wf21_01_FieldMaritalStatus = By.id("wf21_01_FieldMaritalStatus");
	public static By wf21_01_FieldIsRegisteredBlind = By.id("wf21_01_FieldIsRegisteredBlind");
	public static By wf21_01_FieldStudentLoanNotificationReceived = By.id("wf21_01_FieldStudentLoanNotificationReceived");
	public static By wf21_01_FieldDateAddressEffectiveFrom = By.id("wf21_01_FieldDateAddressEffectiveFrom");
	public static By wf21_01_FieldNewAddress1 = By.id("wf21_01_FieldNewAddress1");
	public static By wf21_01_FieldNewAddress2 = By.id("wf21_01_FieldNewAddress2");
	public static By wf21_01_FieldCountry = By.id("wf21_01_FieldCountry");
	public static By wf21_01_FieldNewPostcode = By.id("wf21_01_FieldNewPostcode");
	public static By next_button = By.id("ButtonNext");
	
	public TellUsAboutYouPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Tell us about you";
//		this.expectedHeading = "2. Tell us about you";
//		super.assertTitle().assertHeading();
	}


	public TailorYourReturnPage clickNextGoToTailorYourReturnPage() {
		super.clickNext();
		writeLog("Click next");
		screenShot(driver);
		return new pages.selfassessment.TailorYourReturnPage(driver);
	}
	
	public void setFirstName(String option){
		driver.findElement(wf21_01_FieldFirstName).sendKeys(option);
		writeLog("Set First Name: " + option);
	}
	
	public void setLastName(String option){
		driver.findElement(wf21_01_FieldSurnameName).sendKeys(option);
		writeLog("Set Last Name: " + option);
	}
	
	public void setNINO(String option){
		driver.findElement(wf21_01_FieldNationalInsuranceNumber).sendKeys(option);
		writeLog("Set NINO: " + option);
	}
	
	public void setDOB(String option){
		driver.findElement(wf21_01_FieldDateOfBirth).sendKeys(option);
		writeLog("Set DOB: " + option);
	}
	
	public void setRegistrationBlind(String option){
		driver.findElement(wf21_01_FieldIsRegisteredBlind).sendKeys(option);
		writeLog("Set Registration Blind: " + option);
	}

	public void setStudentLoan(String option){
		driver.findElement(wf21_01_FieldStudentLoanNotificationReceived).sendKeys(option);
		writeLog("Set Student Loan: " + option);
	}
	
	public TailorYourReturnPage clickNext(){
		super.clickNext();
		return new TailorYourReturnPage(driver);
	}
	
}
