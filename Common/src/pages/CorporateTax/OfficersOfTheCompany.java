package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class OfficersOfTheCompany extends BasePage {
	
	public final WebDriver driver;
	public String Question1 = "Have any directors served throughout the whole period?";
	public String Question2 = "Enter details of the director that served throughout the whole period:"; 
	public String Question3 = "Were any directors appointed during the period?";
	public String Question4 = "Did any directors resign during the period?";
	public static By Yes1 = By.xpath("//*[@id='servedThroughout']/label[1]");
	public static By NoDirectorappt =  By.xpath("//*[@id='appointedDuring']/label[2]");
	public static By NoDirectorResign =  By.xpath("//*[@id='resignedDuring']/label[2]");
	public static By ContinueButton  = By.id("submit");
	public static By ContinueButton2 = By.id("continueButton");
	public static By Dname  = By.id("directorName");

	public OfficersOfTheCompany(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Accounts - Officers of the company - Director question";
		this.expectedHeading = "Officers of the company";
		super.assertTitle().assertHeading();
	}
	
	public OfficersOfTheCompany clickYesQ1(){
		writeLog("Click Yes");
		screenShot(driver);
		driver.findElement(Yes1).click();
		return this;
	}
	public OfficersOfTheCompany clickNoDirector(){
		writeLog(" No - no directors were appointed ");
		screenShot(driver);
		driver.findElement(NoDirectorappt).click();
		return this;
	}
	
	public OfficersOfTheCompany clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return this;
	}
	public OfficersOfTheCompany clickContinue(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton2).click();
		return this;
	}
	public OfficersOfTheCompany clickNoDirectorResign(){
		writeLog(" No - no directors were appointed ");
		screenShot(driver);
		driver.findElement(NoDirectorResign).click();
		return this;
	}
	public DirectorsReport clickNextPage(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return  new DirectorsReport (driver);
}
}

