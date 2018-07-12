package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TradingAccountDetails extends BasePage {

	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");// Id for save and continue button
	public static By CostOfSales  = By.id("costOfSales"); // Id for Cost of sale text field
	public TradingAccountDetails(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Trading account details";
		this.expectedHeading = "Trading account details";
		super.assertTitle().assertHeading();
	}
	
		public Expenses clickNextPage(){
			writeLog("Click Continue to Expenses Page");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new Expenses (driver);
	}
}


