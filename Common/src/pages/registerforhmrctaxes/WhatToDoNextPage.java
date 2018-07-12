package pages.registerforhmrctaxes;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class WhatToDoNextPage extends BasePage{

	public WhatToDoNextPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Register for HMRC taxes";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "What to do next";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public SelectTaxesPage clickNext(){
		super.clickNext();
		return new SelectTaxesPage(driver);
	}

}
