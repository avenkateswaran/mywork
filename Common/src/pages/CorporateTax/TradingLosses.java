package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TradingLosses extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By Yes  = By.xpath("//*[@id='hasTradingLossesFromPreviousPeriod']/label[1]");
	public static By No  = By.xpath("//*[@id='hasTradingLossesFromPreviousPeriod']/label[2]");
	public static By Yes2  = By.xpath("//*[@id='cpq18']/label[1]");
	public static By No2  = By.xpath("//*[@id='cpq18']/label[2]");
	public String Q2 = "Do you want to bring back a loss to offset against profits you’re reporting now?";
	public String Q1 = "Qualifying questions";
	public TradingLosses(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Trading losses";
		this.expectedHeading = "Trading losses";
		super.assertTitle().assertHeading();
	}
	
	public TradingLosses clickMainRadio( String Answer){
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
	public TradingLosses clickQ2Radio( String Answer){
		if (Answer.toLowerCase() == "no"){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(No2).click();}
		
		if (Answer.toLowerCase() == "yes"){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(Yes2).click();}
		return  this;
}
		public CharitableDonations clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new CharitableDonations (driver);
	}
		public TradingLosses clickNext(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return this;
	}
}


