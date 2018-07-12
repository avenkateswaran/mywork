package pages.vatminionestopshop;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegisterVATMiniOneStopShopWhatYouWillNeed extends BasePage {

	public RegisterVATMiniOneStopShopWhatYouWillNeed(WebDriver driver) {
		super(driver);
		this.expectedHeading = this.expectedTitle = "What you will need";
	}

	public RegisterVATMiniOneStopShopRegistrationSummary clickNext(){
		super.clickNext();
		return new RegisterVATMiniOneStopShopRegistrationSummary(driver);
	}
	
}
