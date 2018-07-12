package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CharitableDonations extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By Yes  = By.xpath("//*[@id='madeCharitableDonations']/label[2]");
	public static By No  = By.xpath("//*[@id='madeCharitableDonations']/label[2]");
	public String Q1 = "Qualifying questions";
	public CharitableDonations(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Charitable donations";
		this.expectedHeading = "Charitable donations";
		super.assertTitle().assertHeading();
	}
	
	public CharitableDonations clickMainRadio( String Answer){
		if (Answer.toLowerCase() == "no"){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(No).click();}
		
		if (Answer.toLowerCase() == "yes"){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(Yes).click();}
		return  this;
}
		public ProfitsCharges clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ProfitsCharges (driver);
	}
}


