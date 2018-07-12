package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AccountHolderDetailsPage1 extends BasePage {
	
	public static By fieldAccountHolderType = By.id("FieldaccountHolderType");

	public AccountHolderDetailsPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AccountHolderDetailsPage2 clickNextGoToAccountHolderDetailsPage2(String fieldAccountHolderType){
		driver.findElement(AccountHolderDetailsPage1.fieldAccountHolderType).sendKeys(fieldAccountHolderType);
		writeLog("Set Field Account holder type: " + fieldAccountHolderType);
		super.clickNext();
		return new AccountHolderDetailsPage2(driver);
	}

}
