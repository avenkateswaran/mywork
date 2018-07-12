package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.UserInformation;
import pages.BasePage;

public class AcknowledgmentPage extends BasePage{
	
	public static By ViewAndPrint = By.linkText("View and print");
	public static By LogOutandGoToHomepage = By.linkText("Log out and go to the HMRC homepage");
	public static By GoToHMRCServices = By.linkText("Go to Your HMRC services");

	public AcknowledgmentPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Acknowledgment";
		this.expectedHeading = "Acknowledgment";
		super.assertTitle().assertHeading();
	}

	public LogoutPage clickLogout() {
		this.clickElement(pages.registerforhmrctaxes.AcknowledgmentPage.LogOutandGoToHomepage);
		return new LogoutPage(driver);
	}

	public LogoutPage clickHMRCservice() {
		this.clickElement(pages.registerforhmrctaxes.AcknowledgmentPage.GoToHMRCServices);
		return new LogoutPage(driver);
	}
	
	// Store 
	public void ID () {
		String aEoiID = driver.findElement(By.xpath("//*[@id='top']/div[3]/div/div[2]/dl/dd[2]/p")).getText();
	UserInformation.AEOIid = aEoiID ;
	}
	
	// Store 
	public void Reference () {
	String rEfe = driver.findElement(By.xpath("//*[@id='top']/div[3]/div/div[2]/dl/dd[1]/p")).getText();
	UserInformation.ALKREF = rEfe ;
	}
}
