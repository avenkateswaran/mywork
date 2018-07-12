package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class FileYourCompanyAccountsandTaxOnline extends BasePage{
	
	public final WebDriver driver;
	public By StartD = By.id("userStartDate.day");
	public By StartM = By.id("userStartDate.month");
	public By StartY = By.id("userStartDate.year");
	public By EndD = By.id("userEndDate.day");
	public By EndM = By.id("userEndDate.month");
	public By EndY = By.id("userEndDate.year");
	public static By firstOption  = By.xpath("//*[@id='selectedPeriod']/label[1]");
	public static By ContinueButton  = By.id("submit");
	
	public FileYourCompanyAccountsandTaxOnline(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "File your Company Accounts and Tax Online";
		super.assertTitle().assertHeading();
	}

// method which selects the first option 
	public AboutYourBusiness clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new AboutYourBusiness(driver);
	}
	
	// method which clicks the continue button 
	public FileYourCompanyAccountsandTaxOnline click1stoption(){
		writeLog("Selected Private limited Company");
		screenShot(driver);
		driver.findElement(firstOption).click();
		return this;
	}
}