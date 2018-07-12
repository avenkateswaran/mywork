package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderPaymentDetailsPage extends BasePage{
	
	public static By fieldpaymentsMade = By.id("FieldpaymentsMade");
	public static By fieldgrossProceedsRedemptionsPaymentAmount = By.id("FieldgrossProceedsRedemptionsPaymentAmount");
	public static By fieldgrossProceedsRedemptionsCurrencyCode = By.id("FieldgrossProceedsRedemptionsCurrencyCode");
	public static By fieldgrossPaymentDescription = By.id("FieldgrossPaymentDescription");

	public AccountHolderPaymentDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolderPaymentDetailsPage setAnyPaymentsToReport(String option){
		driver.findElement(fieldpaymentsMade).sendKeys();
		writeLog("Set Are there any payments to report?: " + option);
		return this;
	}
	
	public AccountHolderPaymentDetailsPage setPaymentAmount(String option){
		driver.findElement(fieldgrossProceedsRedemptionsPaymentAmount).sendKeys();
		writeLog("Set Payment amount: " + option);
		return this;
	}
	
	public AccountHolderPaymentDetailsPage setCurrencyCode(String option){
		driver.findElement(fieldgrossProceedsRedemptionsCurrencyCode).sendKeys();
		writeLog("Set Currency code: " + option);
		return this;
	}
	
	public AccountHolderPaymentDetailsPage setPaymentDescription(String option){
		driver.findElement(fieldgrossPaymentDescription).sendKeys();
		writeLog("Set Payment description: " + option);
		return this;
	}
	
	public AccountHolderConfirmationPage clickNextGoToAccountHolderSunmmary(String paymentReport, String paymentAmount, String currencyCode, String paymentDescription){
		setAnyPaymentsToReport(paymentReport)
		.setPaymentAmount(paymentAmount)
		.setCurrencyCode(currencyCode)
		.setPaymentDescription(paymentDescription);
		super.clickNext();
		return new AccountHolderConfirmationPage(driver);
	}
}
