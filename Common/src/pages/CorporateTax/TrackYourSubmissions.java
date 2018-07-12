package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TrackYourSubmissions extends BasePage {
	
	public final WebDriver driver;
	public static By CreateNewSubmission = By.id("startFilingHref");
	public TrackYourSubmissions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Dashboard";
		this.expectedHeading = "Track your submissions";
		super.assertTitle().assertHeading();
	}
	
	public WhatIsYourOrganisation clickNext(){
		writeLog("Click continue");
		screenShot(driver);
		driver.findElement(CreateNewSubmission).click();
		return new WhatIsYourOrganisation (driver);
	}
	

}


