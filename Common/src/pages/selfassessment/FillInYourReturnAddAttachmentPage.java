package pages.selfassessment;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAddAttachmentPage extends BasePage {

	public FillInYourReturnAddAttachmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public FillInYourReturnAnyOtherInfoPage clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnAnyOtherInfoPage(driver);
		
	}
	
}
