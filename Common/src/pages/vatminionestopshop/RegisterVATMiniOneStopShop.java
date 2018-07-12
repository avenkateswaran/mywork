package pages.vatminionestopshop;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegisterVATMiniOneStopShop extends BasePage {

	public RegisterVATMiniOneStopShop(WebDriver driver) {
		super(driver);
		this.expectedTitle = this.expectedHeading = "Register for VAT Mini One Stop Shop";
	}
	
	public RegisterVATMiniOneStopShopQuestionsAboutTheBusiness clickNext(){
		super.clickNext();
		return new RegisterVATMiniOneStopShopQuestionsAboutTheBusiness(driver);
	}

	public RegisterVATMiniOneStopShop AgreeToTermsAndConditions() {
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.termsAndConditions).click();
		return this;
	}

}
