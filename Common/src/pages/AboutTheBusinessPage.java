package pages;

import org.openqa.selenium.WebDriver;

import pages.vatminionestopshop.RegisterVATMiniOneStopShopRegistrationSummary;

public class AboutTheBusinessPage extends BasePage {

	public AboutTheBusinessPage(WebDriver driver) {
		super(driver);
		this.expectedHeading = this.expectedTitle = "About the business";
		this.expectedSubHeading = "Business details";
	}

	public AboutTheBusinessPage clickNextGoToContactDetails() {
		super.clickNext();
		this.expectedSubHeading = "Business contact details";
		super.assertSubHeading();
		return this;
	}

	public AboutTheBusinessPage clickNextGoToAlternativeContactDetails() {
		super.clickNext();
		this.expectedSubHeading = "Alternative contact details";
		super.assertSubHeading();
		return this;
	}

	public AboutTheBusinessPage clickNextGoToWebsiteDetails() {
		super.clickNext();
		this.expectedSubHeading = "Additional website address(es)";
		super.assertSubHeading();
		return this;
	}

	public AboutTheBusinessPage clickNextGoToConfirmation() {
		super.clickNext();
		this.expectedSubHeading = "Confirmation";
		super.assertSubHeading();
		return this;
	}

	public RegisterVATMiniOneStopShopRegistrationSummary clickNextGoToRegistrationSummary() {
		super.clickNext();
		return new RegisterVATMiniOneStopShopRegistrationSummary(driver);
	}

	public void isTradingNameDifferent(boolean b) {
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FieldisTradingNameDifferent)
				.sendKeys(b ? "Y" : "N");
	}

	public void doYouHaveNationalTaxNumber(boolean b) {
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FielddoYouHaveTaxReference)
				.sendKeys(b ? "Y" : "N");
	}

	public void areYouOrWillYouMakeSuppliersInCurrentQuater(boolean b) {
		driver.findElement(locators.RegisterVATMiniOneStopShopLocators.FieldselectMakingSuppliesCurrentQuarter)
				.sendKeys(b ? "Y" : "N");
	}

	public RegistrationPage ClickNextGoToRegistrationSummary() {
		super.clickNext();
		return new RegistrationPage(driver);
	}

}
