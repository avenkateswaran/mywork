package pages.vatminionestopshop;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegisterVATMiniOneStopShopQuestionsAboutTheBusiness extends BasePage {

	public RegisterVATMiniOneStopShopQuestionsAboutTheBusiness(WebDriver driver) {
		super(driver);
		this.expectedTitle = this.expectedHeading = "Register for VAT Mini One Stop Shop";
		this.expectedSubHeading ="Questions about the business";
	}
	
	public RegisterVATMiniOneStopShopWhatYouWillNeed clickNext(){
		super.clickNext();
		return new RegisterVATMiniOneStopShopWhatYouWillNeed(driver);
	}

	public RegisterVATMiniOneStopShopQuestionsAboutTheBusiness supplyingTelecommunicationBroadcastingOrEservices(Boolean answer){
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FieldselectAreYouMakingSupplies).sendKeys(answer ? "Y" : "N");
		return this;
	}
	public RegisterVATMiniOneStopShopQuestionsAboutTheBusiness previouslyUsedMoss(Boolean answer){
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FieldselectHasBusinessPreviouslyUsedSchemes).sendKeys(answer ? "Y" : "N");
		return this;
	}
	public RegisterVATMiniOneStopShopQuestionsAboutTheBusiness currentlyEstablishedForVAT(Boolean answer){
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FieldselectAreYouEstablishedForVat).sendKeys(answer ? "Y" : "N");
		return this;
	}
	

	
}
