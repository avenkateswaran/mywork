package pages;

import org.openqa.selenium.WebDriver;

import pages.registerforhmrctaxes.AddressSearchPage;

public class AboutYouPage extends BasePage {

	public AboutYouPage(WebDriver driver) {
		super(driver);
		this.expectedHeading = "About you";
	}

	public AddressSearchPage ClickNextGoToAddressPage() {
		super.clickNext();
		return new AddressSearchPage(driver);
	}

	public AboutTheBusinessPage ClickNextGoToAboutTheBusinessPage() {
		super.clickNext();
		return new AboutTheBusinessPage(driver);

	}

}
