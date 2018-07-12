package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Footnotes extends BasePage {
	
	public final WebDriver driver;
	public String Q1 = "Do you want to provide additional notes in your accounts?";
	public static By ContinueButton  = By.id("submit");
	public Footnotes(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Footnotes";
		this.expectedHeading = "Footnotes";
		super.assertTitle().assertHeading();
	}
	
		public Approveaccounts clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new Approveaccounts (driver);
	}
}


