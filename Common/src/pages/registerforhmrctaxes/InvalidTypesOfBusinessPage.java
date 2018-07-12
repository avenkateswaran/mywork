package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class InvalidTypesOfBusinessPage extends BasePage{
	
	public static By RegisteringAsAPartnerForSelfAssessmentAndClass2 = By.partialLinkText("Registering as a partner for Self Assessment and Class 2");
	public static By APartnerForSelfAssessmentIfTheyreNotAnIndividual = By.partialLinkText("a partner for Self Assessment if they're not an individual");
	public static By ReturnToTheHMRCHome = By.partialLinkText("Return to the HMRC home");

	public InvalidTypesOfBusinessPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Register for HMRC taxes";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "Types of business that cannot use this service";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public WhatToDoNextPage clickNext(){
		super.clickNext();
		return new WhatToDoNextPage(driver);
	}
	
}
