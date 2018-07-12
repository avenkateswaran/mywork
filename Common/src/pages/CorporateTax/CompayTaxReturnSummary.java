package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CompayTaxReturnSummary extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String S1 = "Tax calculations";
	public String S2 = "Allowances and expenditure";
	public String S3 = "Losses";
	public String S4 = "Nominee";
	public String M1 = "Included in your tax return";
	public String M = "CT600 summary";
	public CompayTaxReturnSummary(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Company Tax Return summary";
		super.assertTitle().assertHeading();
	}

		public ApproveAndSubmit clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ApproveAndSubmit (driver);
	}
}


