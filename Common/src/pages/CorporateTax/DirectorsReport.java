package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class DirectorsReport extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public DirectorsReport(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Directors' report";
		this.expectedHeading = "Directors' report";
		super.assertTitle().assertHeading();
	}
	
		public ProfitAndLoss clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ProfitAndLoss (driver);
	}
}


