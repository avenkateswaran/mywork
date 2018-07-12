package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class DetailedProfitAndLossSummary extends BasePage {
public final WebDriver driver;
public static By CP46  = By.id("CP46");
public static By CP47  = By.id("CP47");
public static By CP48  = By.id("CP48");
public static By CP49  = By.id("CP49");
public static By CP51  = By.id("CP51");
public static By CP52  = By.id("CP52");
public static By CP53  = By.id("CP53");
public static By CP54  = By.id("CP54");
public static By CP55  = By.id("CP55");
public static By CP57  = By.id("CP57");
public static By ContinueButton  = By.id("submit");
public DetailedProfitAndLossSummary(WebDriver driver) {
	super(driver);
	this.driver = driver;
	this.expectedTitle = "File your Company Accounts and Tax Online";
	this.expectedHeading = "Detailed profit and loss summary";
	super.assertTitle().assertHeading();
}

	public DetailedProfitAndLossSummary clickNext(){
		writeLog("Click continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new DetailedProfitAndLossSummary (driver);
}	
	public CaptialAllowance clickNextPage(){
		writeLog("Click to advance to next page");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new CaptialAllowance (driver);
}

}



