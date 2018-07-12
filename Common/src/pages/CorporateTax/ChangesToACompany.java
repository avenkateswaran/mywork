package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ChangesToACompany extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By yes  = By.xpath("//*[@id='amendment']/label[1]]");
	public static By no  = By.id("amendment-false");
	public String Q1 = "Qualifying questions";
	public ChangesToACompany(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Do you want to make changes to a Company Tax Return you've already filed?";
		this.expectedHeading = "Do you want to make changes to a Company Tax Return you've already filed?";
		super.assertTitle().assertHeading();
	}
	
	public ChangesToACompany MainRadio( String Answer){

		if (Answer.toLowerCase().contains("no")){
			writeLog("Click no button");
		screenShot(driver);
		driver.findElement(no).click();}
		
		if (Answer.toLowerCase().contains ("yes")){
			writeLog("Click yes Button");
			screenShot(driver);
			driver.findElement(yes).click();}
		return  this;
	}
		public TypeOfCompany clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new TypeOfCompany (driver);
	}
}
//*[@id="amendment"]/label[2]

