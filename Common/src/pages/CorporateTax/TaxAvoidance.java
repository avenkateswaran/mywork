package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TaxAvoidance extends BasePage {
	
	public final WebDriver driver;
	public String S1 = "Reporting Tax Avoidance Schemes";
	public String Question1 = "Are you required to declare a tax avoidance scheme?";
	public static By ContinueButton  = By.id("submit");
	public static By yes  = By.xpath("//*[@id='B65']/label[1]");
	public static By no  = By.xpath("//*[@id='B65']/label[2]");
		
	public TaxAvoidance(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Tax avoidance (CT600J)";
		super.assertTitle().assertHeading();
	}
	public TaxAvoidance clickMainRadio( String Answer){
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
		public CompanyTaxReturn clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new CompanyTaxReturn (driver);
	}
}


