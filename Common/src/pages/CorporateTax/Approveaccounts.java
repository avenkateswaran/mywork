package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Approveaccounts extends BasePage {
	
	public final WebDriver driver;
	public String Q = "Approve your full micro-entity accounts ready for submission.";
	public String Q1 = "1. Select approver(s)";
	public String Q2 = "2. Agree to approval statement";
	public String Q3 = "3. Enter the date of approval";
	public static By Approval =  By.xpath("//*[@id='approvers']/div/ul/li/label");
	public static By AppState =  By.xpath("//*[@id='confirmation']/label");
	public static By Day  = By.id("dateOfApproval.day");
	public static By Month  = By.id("dateOfApproval.month");
	public static By Year  = By.id("dateOfApproval.year");
	public static By ContinueButton  = By.id("submit");
	public Approveaccounts(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Approve accounts";
		this.expectedHeading = "Approve accounts";
		super.assertTitle().assertHeading();
	}
	
		public Approveaccounts clickApp(){
			writeLog("Click Approver Name");
			screenShot(driver);
			driver.findElement(Approval).click();
			return this;
	}
		public Approveaccounts clickAppState(){
			writeLog("Click Approver Statement");
			screenShot(driver);
			driver.findElement(AppState).click();
			return this;
	}
		public ReviewFiling clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ReviewFiling (driver);
	}
}


