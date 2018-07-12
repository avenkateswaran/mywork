package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ProfitsCharges extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public ProfitsCharges(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Profits chargeable to Corporation Tax";
		this.expectedHeading = "Profits chargeable to Corporation Tax";
		super.assertTitle().assertHeading();
	}
	
		public Summary clickNextPage(){
			writeLog("Click Continue to the summary page");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new Summary (driver);
	}
}


