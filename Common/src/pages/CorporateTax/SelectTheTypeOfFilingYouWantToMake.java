package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class SelectTheTypeOfFilingYouWantToMake extends BasePage{
	
	public final WebDriver driver;
	public String Q1 = "Who do you want your filing to go to?";
	public By HMRCAndCompaniesHouse  = By.xpath("//*[@id='filing']/label[1]");
	public static By HMRConly = By.xpath("//*[@id='filing']/label[2]");
	public static By CompaniesHouseOnly = By.xpath("//*[@id='filing']/label[3]");
	public static By ContinueButton  = By.id("submit");
	
	public SelectTheTypeOfFilingYouWantToMake(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Filing Options";
		this.expectedHeading = "Select the type of filing you want to make";
		super.assertTitle().assertHeading();
	}

	public SelectTheTypeOfFilingYouWantToMake clickHMRC(){
		writeLog("Who do you want your filing to go to? Select HMRC");
		screenShot(driver);
		driver.findElement(HMRConly).click();
		return this;
	}


	public PeriodOfAccounts clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		super.waitForMilliSeconds(4000);
		return new PeriodOfAccounts(driver);
	}
}