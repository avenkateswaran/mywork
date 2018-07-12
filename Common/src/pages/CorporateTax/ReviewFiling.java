package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ReviewFiling extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public ReviewFiling(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Review your filing";
		this.expectedHeading = "Review your filing";
		super.assertTitle().assertHeading();
	}
	
		public TradingAccountDetails clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new TradingAccountDetails (driver);
	}
}


