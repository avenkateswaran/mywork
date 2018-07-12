package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class UserRegistrationAEOIConfirmationPage extends BasePage{
	
	public static By changeContactDetails = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/ul[1]/li/a");
	public static By changeAddressDetails = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/ul[2]/li/a");

	public UserRegistrationAEOIConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public RegistrationSummaryPage clickNextGoToRegistrationSummaryPage(){
	clickNext();
	return new RegistrationSummaryPage(driver);
	}
}
