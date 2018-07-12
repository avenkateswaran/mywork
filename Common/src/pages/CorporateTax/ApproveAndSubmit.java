package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ApproveAndSubmit extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String S1 = "Declaration";
	public String S2 = "Submit your return";
	public String S3 = "Full name of person completing tax return";
	public String M1 = "Status of authorising person (company secretary, treasurer, etc)";
	public static By Declaration = By.xpath("//*[@id='confirmation']/label");
	public static By Fullname = By.id("B975");
	public static By Status = By.id("B985");
	public static By UserId = By.id("ggUserId");
	public static By Password = By.id("ggPassword");
	public ApproveAndSubmit(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Approve and submit Company Tax Return";
		super.assertTitle().assertHeading();
	}

		public ApproveAndSubmit Declaration(){
		writeLog("Click Declaration");
		screenShot(driver);
		driver.findElement(Declaration).click();
		return  new ApproveAndSubmit (driver);
}
		public ApproveAndSubmit Continue(){
		writeLog("Click Continue to submission");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new ApproveAndSubmit (driver);
}
		public Final clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new Final (driver);
	}
}


