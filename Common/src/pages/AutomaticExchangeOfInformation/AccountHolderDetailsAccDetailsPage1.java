package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderDetailsAccDetailsPage1 extends BasePage{
	
	public static By fielddoYouHaveAccountNumber = By.id("FielddoYouHaveAccountNumber");
	public static By fieldaccountNumber = By.id("FieldaccountNumber");
	public static By fieldaccountIdentifier = By.id("FieldaccountIdentifier");
	public static By fieldaccountUndocumentedInd = By.id("FieldaccountUndocumentedInd");
	public static By fieldaccountDormantInd = By.id("FieldaccountDormantInd");
	public static By fieldaccountClosedInd = By.id("FieldaccountClosedInd");
	public static By fieldcurrencyCodeForThisAccount= By.id("FieldcurrencyCodeForThisAccount");
	public static By fieldaccountBalance = By.id("FieldaccountBalance");
	public static By fieldaccountType= By.id("FieldaccountType");
	
	public AccountHolderDetailsAccDetailsPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolderDetailsAccDetailsPage1 setDoYouHaveAccountNumber(String option){
		driver.findElement(fielddoYouHaveAccountNumber).sendKeys();
		writeLog("Set Do you have an account number?: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setAccountNumber(String option){
		driver.findElement(fieldaccountNumber).sendKeys();
		writeLog("Set Account number: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setAccountIdentifier(String option){
		driver.findElement(fieldaccountIdentifier).sendKeys();
		writeLog("Set Account identifier: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setUndocumentedInd(String option){
		driver.findElement(fieldaccountUndocumentedInd).sendKeys();
		writeLog("Set Is this account undocumented?: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setDormantAcc(String option){
		driver.findElement(fieldaccountDormantInd).sendKeys();
		writeLog("Set Is this account dormant?: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setAccountClose(String option){
		driver.findElement(fieldaccountClosedInd).sendKeys();
		writeLog("Set Did this account close during the reporting year?: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setCurrencyCode(String option){
		driver.findElement(fieldcurrencyCodeForThisAccount).sendKeys();
		writeLog("Set Currency code for this account: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setAccountBalance(String option){
		driver.findElement(fieldaccountBalance).sendKeys();
		writeLog("Set Account balance: " + option);
		return this;
	}
	
	public AccountHolderDetailsAccDetailsPage1 setAccountType(String option){
		driver.findElement(fieldaccountType).sendKeys();
		writeLog("Set Account type: " + option);
		return this;
	}
	
	public AccountHolderPaymentDetailsPage clickNextGoToAccountHolderSummaryPage(String accountHolder, String accountIdentifier, String currencyCode, String accountBalance, String accountType){
		setDoYouHaveAccountNumber(accountHolder)
		.setAccountIdentifier(accountIdentifier)
		.setCurrencyCode(currencyCode)
		.setAccountBalance(accountBalance)
		.setAccountType(accountType);
		super.clickNext();
		return new AccountHolderPaymentDetailsPage(driver);
	}

}
