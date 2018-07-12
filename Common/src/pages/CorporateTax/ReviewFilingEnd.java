package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ReviewFilingEnd extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String S1  = "Trading account details";
	public String S2 = "Expenses";
	public String S3 = "Capital allowances / balancing charges";
	public String S4  = "Income from property";
	public String S5 = "Trading losses";
	public String S6 = "Charitable donations";
	public ReviewFilingEnd(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Review your filing";
		this.expectedHeading = "Review your filing";
		super.assertTitle().assertHeading();
	}
	
		public ClosedCompany clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ClosedCompany (driver);
	}
}


