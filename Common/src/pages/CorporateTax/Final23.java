package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Final23 extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By CID = By.xpath("//*[@id='blockForm']/div[1]/p[3]");
	public static By SignOut = By.id("logOutNavHref");								
	
	
	public Final23(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Company Tax Submit - Approve and submit Company Tax Return - Submission successful";
		this.expectedHeading = "Approve and submit Company Tax Return";
		super.assertTitle().assertHeading();
	}


		public Final23 Continue(){
		writeLog("Click Continue to submission");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new Final23 (driver);
}
		
		public String Correleation(){
		return driver.findElement(CID).getText();
		
}
		public BeforeYouSignOut clickSignout(){
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new BeforeYouSignOut (driver);
	}
}


