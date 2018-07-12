package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Final extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By UserId = By.id("ggUserId");
	public static By Password = By.id("ggPassword");
	public Final(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Company Tax Submit - Approve and submit Company Tax Return";
		this.expectedHeading = "Approve and submit Company Tax Return";
		super.assertTitle().assertHeading();
	}


		public Final23 Continue(){
		writeLog("Click Continue to submission");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new Final23 (driver);
}
		public TrackYourSubmissions clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new TrackYourSubmissions (driver);
	}
}


