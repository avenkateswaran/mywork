package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class IntroductionPage extends BasePage{
	
	//Register for HMRC taxes Radio options
	public static By RADIOHMRCDEFAULTTAXES = By.id("FieldregistrationOptions0");
	public static By RADIOHMRCNEWREGISTERTAXES = By.id("FieldregistrationOptions1");
	public static By RADIOHMRCALREADYREGISTERTAXES = By.id("FieldregistrationOptions2");
	public static By INTRODUCTIONFIELDVALIDATION = By.id("pageError.registration_Introduction");
	public static By REGISTRATIONOPTIONFIELDVALIDATION = By.id("fieldError.fields.registrationOptions");

	//option selected determines which page you get when you press next
	//private int option = 0;
	
	public IntroductionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Register for HMRC taxes";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "Introduction";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public ValidTypesOfBusinessPage clickNext(){
		super.clickNext();
		return new ValidTypesOfBusinessPage(driver);
	}
	
//	public IntroductionPage RadioButtonSelectRegisterForNewTax(){
//		driver.findElement(RADIOHMRCNEWREGISTERTAXES).click();
//		option = 1;
//		return this;
//	}
//	public IntroductionPage RadioButtonSignUpForExistingTax(){
//		driver.findElement(RADIOHMRCALREADYREGISTERTAXES).click();
//		option = 2;
//		return this;
//	}
//	
//	public <E> BasePage ClickNext(){
//		super.clickNext();
//		
//		switch(option){
//		
//			case 1: option = 1;
//				return new ValidTypesOfBusinessPage(driver);
//
//			case 2: option = 2;
//				return new ServicesYouCanAdd(driver);
//		}
//		return this;
//			
//	}


}
