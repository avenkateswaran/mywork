package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class WhatYouWillNeedPage extends BasePage{

	public WhatYouWillNeedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationSummaryPage clickNextGoToRegistrationSummaryPage(){
		clickNext();
		return new RegistrationSummaryPage(driver);
	}

}
