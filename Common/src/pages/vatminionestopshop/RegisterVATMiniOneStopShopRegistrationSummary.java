package pages.vatminionestopshop;

import org.openqa.selenium.WebDriver;

import pages.AboutTheBusinessPage;
import pages.BasePage;

public class RegisterVATMiniOneStopShopRegistrationSummary extends BasePage {

	public RegisterVATMiniOneStopShopRegistrationSummary(WebDriver driver) {
		super(driver);
		this.expectedHeading = this.expectedTitle = "Registration summary";
	}
	
	public AboutTheBusinessPage clickNext(){
		super.clickNext();
		return new AboutTheBusinessPage(driver);
	}
	
	public RegisterVATMiniOneStopShopDeleteRegistration clickDelete(){
		super.clickDelete();
		return new RegisterVATMiniOneStopShopDeleteRegistration(driver);
	}

}
