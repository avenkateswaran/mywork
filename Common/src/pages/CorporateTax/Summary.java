package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Summary extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String S1  = "Capital Allowances Balancing Charge Summary";
	public String S2 = "Trading losses Summary";
	public String S3 = "Other figures";
	public Summary(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Summary";
		this.expectedHeading = "Summary";
		super.assertTitle().assertHeading();
	}
	
		public ReviewFilingEnd clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ReviewFilingEnd (driver);
	}
}


