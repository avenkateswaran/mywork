package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class BeforeYouStart extends BasePage{
	
	public final WebDriver driver;
	public static By Continue = By.id("startHref");
	public String  pdfFilingSoftware ="Looking for HMRC's old PDF filing software?";
	public String  contactHMRC = "Contact HM Revenue and Customs or Companies House";
	
	public BeforeYouStart(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Company Accounts and Tax Online - Home";
		this.expectedHeading = "Before you start";
		super.assertTitle().assertHeading();
	}
	
	public TrackYourSubmissions clickNext(){
		writeLog("Click continue to Dashboard");
		screenShot(driver);
		driver.findElement(Continue).click();
		return new TrackYourSubmissions (driver);
	}
}
