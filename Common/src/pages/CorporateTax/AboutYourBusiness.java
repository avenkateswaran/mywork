package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class AboutYourBusiness extends BasePage{
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public String Q1 = "Was your turnover £632,000 or less?";
	public By Yes1  = By.xpath("//*[@id='revenue']/label[1]");
	public static By No1 = By.xpath("//*[@id='revenue']/label[2]");
			
	public String Q2 = "Was your turnover £6.5 million or less?";
	public By Yes2  = By.xpath("//*[@id='revenueUpper']/label[1]");
	public static By No2 = By.xpath("//*[@id='revenueUpper']/label[2]");
	
	public String Q3 = "Was your balance sheet total £316,000 or less?";
	public By Yes3  = By.xpath("//*[@id='balanceSheet']/label[1]");
	public static By No3 = By.xpath("//*[@id='balanceSheet']/label[2]");
	
	public String Q4 = "Was your balance sheet total £3.26 million or less?";
	public By Yes4  = By.xpath("//*[@id='balanceSheetUpper']/label[1]");
	public static By No4= By.xpath("//*[@id='balanceSheetUpper']/label[2]");
	
	public String Q5 = "Did you have an average of 10 employees or fewer during the period?";
	public By Yes5  = By.xpath("//*[@id='employees']/label[1]");
	public static By No5 = By.xpath("//*[@id='employees']/label[2]");
	
	public String Q6 = "Did you have an average of 50 employees or fewer during the period?";
	public By Yes6  = By.xpath("//*[@id='employeesUpper']/label[1]");
	public static By No6 = By.xpath("//*[@id='employeesUpper']/label[2]");
	
	public AboutYourBusiness(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Financial Questions";
		this.expectedHeading = "About your business";
		super.assertTitle().assertHeading();
	}
	
	public AboutYourBusiness clickYesQ1(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(Yes1).click();
		return this;
	}
	public AboutYourBusiness clickNoQ2(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No2).click();
		return this;
	}
	public AboutYourBusiness clickNoQ3(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No3).click();
		return this;
	}
	public AboutYourBusiness clickNoQ4(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No4).click();
		return this;
	}

	public AboutYourBusiness clickYesQ5(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(Yes5).click();
		return this;
	}
	public AboutYourBusiness clickNoQ6(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No6).click();
		return this;
	}

	public SelectFiling clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new SelectFiling(driver);
	}
	//*[@id="isInLiquidation"]/label[1]
}//*[@id="isAPropertyManagementCompany"]/label[1]
