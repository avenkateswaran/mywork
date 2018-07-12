package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class SecondaryExclusions extends BasePage{
	
	public final WebDriver driver;
	
	public By Yes1  = By.xpath("//*[@id='report']/label[1]");
	public static By No1 = By.xpath("//*[@id='report']/label[2]");
	public static By ContinueButton  = By.id("submit");
	
	public SecondaryExclusions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Secondary Exclusions";
		this.expectedHeading = "Secondary Exclusions";
		super.assertTitle().assertHeading();
	}

	public SecondaryExclusions clickNoQ1(){
		writeLog("Do you need to report any of the following? Select No");
		screenShot(driver);
		driver.findElement(No1).click();
		return this;
	}

	public SelectTheTypeOfFilingYouWantToMake clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new SelectTheTypeOfFilingYouWantToMake(driver);
	}
}