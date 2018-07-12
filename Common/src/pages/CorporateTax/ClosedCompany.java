package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ClosedCompany extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By yes  = By.xpath("//*[@id='LPQ04']/label[1]");
	public static By no  = By.xpath("//*[@id='LPQ04']/label[2]");
	
	
	public ClosedCompany(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Are you a close company?";
		super.assertTitle().assertHeading();
	}
	public ClosedCompany clickMainRadio( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no).click();}
		return  this;
	}
		public LoansMadeBeforeTaxPeriod clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new LoansMadeBeforeTaxPeriod (driver);
	}
}


