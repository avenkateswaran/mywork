package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class DoYouNeedToContingent extends BasePage{
	
	public final WebDriver driver;
	public By Yes1  = By.xpath("//*[@id='contingentAssets']/label[1]");
	public static By No1 = By.xpath("//*[@id='contingentAssets']/label[2]");
	public static By ContinueButton  = By.id("submit");
	
	public DoYouNeedToContingent(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Do you need to report contingent assets?";
		this.expectedHeading = "Do you need to report contingent assets?";
		super.assertTitle().assertHeading();
	}

	public DoYouNeedToContingent clickNoQ1(){
		writeLog("Do you need to report contingent assets? Select No");
		screenShot(driver);
		driver.findElement(No1).click();
		return this;
	}

	public SecondaryExclusions clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new SecondaryExclusions(driver);
	}
}