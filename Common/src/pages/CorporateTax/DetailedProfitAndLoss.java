package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class DetailedProfitAndLoss extends BasePage {
	
	public final WebDriver driver;
	public static By CP43  = By.id("CP43");
	public static By CP501  = By.id("CP501");
	public static By CP503  = By.id("CP503");
	public static By CP502  = By.id("CP502");
	public static By ContinueButton  = By.id("submit");
	public DetailedProfitAndLoss(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Detailed profit and loss";
		super.assertTitle().assertHeading();
	}
	
		public DetailedProfitAndLossSummary clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new DetailedProfitAndLossSummary (driver);
	}
}


