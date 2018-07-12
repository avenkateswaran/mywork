package pages.registerforhmrctaxes;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class WhatYouWillNeedPage extends BasePage{

	public WhatYouWillNeedPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: What you will need";
		this.expectedHeading = "What you will need";
		super.assertTitle().assertHeading();
	}

	public RegistrationSummaryPage clickNext(){
		super.clickNext();
		return new RegistrationSummaryPage(driver);
	}	
	
}
