package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegSum extends BasePage {

	public RegSum(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By toDo = By.xpath("//*[@id='portletFatcaNotificationSummary']/div/table/tbody/tr/td[2]/ul[1]/li/img");
	public By toDo1 = By.xpath("//*[@id='portletFatcaNotificationSummary']/div/table/tbody/tr/td[2]/ul[2]/li/img");
	public By menU = By.id("main-menu");
	
	public RegSum clickNextGoToAutomaticExchangeOfinformationRegistration() {
		super.clickNext();
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
		this.expectedHeading = "Automatic Exchange of Information registration";
		//this.expectedSubHeading = "Contact details";
		super.assertHeading();
		//super.assertSubHeading();
		super.actualTitle();
		return this;
	}
	
}
