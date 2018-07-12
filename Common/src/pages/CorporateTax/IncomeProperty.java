package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class IncomeProperty extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By Unallowable  = By.id("unAllowableExpenses");
	public String Q1 = "Qualifying questions";
	public IncomeProperty(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Income from property";
		this.expectedHeading = "Income from property";
		super.assertTitle().assertHeading();
	}

		public TradingLosses clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new TradingLosses (driver);
	}
		public IncomeProperty clickNext(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  this;
	}
}


