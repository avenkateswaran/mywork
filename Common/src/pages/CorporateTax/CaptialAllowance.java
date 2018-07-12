package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CaptialAllowance extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By Yes  = By.xpath("//*[@id='wantToClaim']/label[1]");
	public static By No  = By.xpath("//*[@id='wantToClaim']/label[2]");
	public String Q1 = "Qualifying questions";
	public CaptialAllowance(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Capital allowances / balancing charges - Qualifying questions";
		this.expectedHeading = "Capital allowances / balancing charges";
		super.assertTitle().assertHeading();
	}
	
		public CaptialAllowance clickNo(){
			writeLog("Click No");
			screenShot(driver);
			driver.findElement(No).click();
			return  new CaptialAllowance (driver);
	}
		public IncomeProperty clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new IncomeProperty (driver);
	}
}


