package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class LoansMadeBeforeTaxPeriod extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String S1 = "Did the company make any loans that weren't fully repaid by 14 May 2015?";
	public String S2 = "Did you make any loans on or after 14 May 2015 that were fully repaid, written off or released by 15 March 2016?";
	public String S3 = "Did you make any loans on or after 14 May 2015 that were fully repaid, written off or released by 15 March 2016?";
	public static By yes1  = By.xpath("//*[@id='LPQ10']/label[1]");
	public static By no1  = By.xpath("//*[@id='LPQ10']/label[2]");
	public static By yes2  = By.xpath("//*[@id='A5']/label[1]");
	public static By no2  = By.xpath("//*[@id='A5']/label[2]");
	public static By yes3  = By.xpath("//*[@id='LPQ03']/label[1]");
	public static By no3  = By.xpath("//*[@id='LPQ03']/label[2]");
	
	public LoansMadeBeforeTaxPeriod(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Loans made before this accounting period";
		super.assertTitle().assertHeading();
	}
	public LoansMadeBeforeTaxPeriod Q1( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(yes1).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(no1).click();}
		return  this;
	}
	public LoansMadeBeforeTaxPeriod Q2( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(yes2).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(no2).click();}
		return  this;
	}
	public LoansMadeBeforeTaxPeriod Q3( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(yes3).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(no3).click();}
		return  this;
	}
	
		public LoansMadeBeforeTaxPeriod clickContinue(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return this;
	}
		public TaxAvoidance clickNextPage(){
			writeLog("Click Continue to Tax Avoidance page");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new TaxAvoidance (driver);
	}
}


