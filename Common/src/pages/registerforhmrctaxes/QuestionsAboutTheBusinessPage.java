package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class QuestionsAboutTheBusinessPage extends BasePage{
	
	//Self-Assessment
	public static By FieldwhenStartWorkingYourself = By.id("FieldwhenStartWorkingYourself");
	//PAYE
	public static By FieldfirstPayDateOrBenefitsDate = By.id("FieldfirstPayDateOrBenefitsDate");

	public QuestionsAboutTheBusinessPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Questions about the business - Self employed";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "Questions about the business";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public WhatYouWillNeedPage clickNext(){
		super.clickNext();
		return new WhatYouWillNeedPage(driver);
	}
	
	


}
