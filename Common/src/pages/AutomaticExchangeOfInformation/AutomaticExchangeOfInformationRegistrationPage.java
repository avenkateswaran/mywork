package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AutomaticExchangeOfInformationRegistrationPage  extends BasePage{
	
	public static By prevRegister = By.id("FieldinitialQuestion1");
	public static By noPrevRegister = By.id("FieldinitialQuestion2");

	public AutomaticExchangeOfInformationRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public WhatYouWillNeedPage NotPreviouslyRegistered(){
		driver.findElement(noPrevRegister).click();
		writeLog("Click I have not previously registered for AEOI or FATCA");
		clickNext();
		return new WhatYouWillNeedPage(driver);
	}
	
}
