package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProfitAndLoss extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");

	public static By TurnO = By.id("turnover_current");
	public ProfitAndLoss(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Profit and loss";
		this.expectedHeading = "Profit and loss";
		super.assertTitle().assertHeading();
	}
	
		public BalanceSheet clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new BalanceSheet(driver);

}
}


