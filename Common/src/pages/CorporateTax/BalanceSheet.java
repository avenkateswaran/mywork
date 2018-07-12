package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BalanceSheet extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By Assests = By.id("currentAssets_current");
	public static By Capital = By.id("capitalReserves_current");
	public static By q1 = By.xpath("//*[@id='balanceSheetStatements']/div/label[1]");
	public static By q2 = By.xpath("//*[@id='balanceSheetStatements']/div/label[2]");
	public static By q3 = By.xpath("//*[@id='balanceSheetStatements']/div/label[3]");
	public static By q4 = By.xpath("//*[@id='balanceSheetStatements']/div/label[4]");
	
	public BalanceSheet(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Balance sheet";
		this.expectedHeading = "Balance sheet";
		super.assertTitle().assertHeading();
	}
	
		public BalanceSheet clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return this;

}
		public Footnotes clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return new Footnotes (driver);

	}
		public BalanceSheet clickQ1(){
		writeLog("First statement selected");
		screenShot(driver);
		driver.findElement(q1).click();
		return this;

}	
		public BalanceSheet clickQ2(){
			writeLog("Second statement selected");
			screenShot(driver);
			driver.findElement(q2).click();
			return this;
	}	
		public BalanceSheet clickQ3(){
			writeLog("Third statement selected");
			screenShot(driver);
			driver.findElement(q3).click();
			return this;
	}
		public BalanceSheet clickQ4(){
			writeLog("Fourth statement selected");
			screenShot(driver);
			driver.findElement(q4).click();
			return this;
	}
}


