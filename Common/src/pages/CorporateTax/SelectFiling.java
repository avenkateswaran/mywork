package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SelectFiling extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String Option1 = "full account";
	public static By Micro = By.xpath("//*[@id='filingType']/label[2]");
	public SelectFiling(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Select Filing";
		this.expectedHeading = "You're nearly ready to start filling in your accounts";
		super.assertTitle().assertHeading();
	}
	
	public SelectFiling clickMicro(){
		writeLog("Click Micro -Entity");
		screenShot(driver);
		driver.findElement(Micro).click();
		return this;
	}
	public OfficersOfTheCompany clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new OfficersOfTheCompany(driver);

}
}


