package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class PeriodOfAccounts extends BasePage{
	
	public final WebDriver driver;
	public String Q1  = "Enter the start date of your company's period of accounts";
	public String Q2  = "Enter the end date of your company's period of accounts";
	public By StartD = By.id("userStartDate.day");
	public By StartM = By.id("userStartDate.month");
	public By StartY = By.id("userStartDate.year");
	public By EndD = By.id("userEndDate.day");
	public By EndM = By.id("userEndDate.month");
	public By EndY = By.id("userEndDate.year");
	public static By ContinueButton  = By.id("submit");
	
	public PeriodOfAccounts(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Period of accounts";
		this.expectedHeading = "Period of accounts";
		super.assertTitle().assertHeading();
	}


	public FileYourCompanyAccountsandTaxOnline clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new FileYourCompanyAccountsandTaxOnline(driver);
	}
}