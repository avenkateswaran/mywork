package pages.vatminionestopshop;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegisterVATMiniOneStopShopDeleteRegistration extends BasePage {

	public RegisterVATMiniOneStopShopDeleteRegistration(WebDriver driver) {
		super(driver);
		this.expectedHeading = this.expectedTitle = "Delete registration";
	}

	public RegisterVATMiniOneStopShopDeleteRegistration clickDelete(){
		super.clickDelete();
		return this;
	}
}
