package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SerivceYouCanAdd extends BasePage {
	public static By AutomaticExchange = By.linkText("Automatic Exchange of Information (AEOI)");

	public SerivceYouCanAdd(WebDriver driver) {
		super(driver);
	}

	public SerivceYouCanAdd clickAutomaticExchange() {
		this.clickElement(AutomaticExchange);
		this.expectedTitle = "HMRC: Enrol for Automatic Exchange of Information";
		this.expectedHeading = "Enrol for Automatic Exchange of Information";
		this.expectedSubHeading = "Enter details";
		super.assertHeading();
		super.assertTitle();
		super.assertSubHeading();
		return this;
	}
}
