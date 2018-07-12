package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class ThingYouCantReportUsingThisService extends BasePage{
	
	public final WebDriver driver;
	public By Yes1  = By.xpath("//*[@id='reportMisc']/label[1]");
	public static By No1 = By.xpath("//*[@id='reportMisc']/label[2]");
	public String Q2 = "Do you need to report income or expenditure from shares?";
	public By Yes2  = By.xpath("//*[@id='reportShares']/label[1]");
	public static By No2 = By.xpath("//*[@id='reportShares']/label[2]");
	public static By ContinueButton  = By.id("submit");
	public ThingYouCantReportUsingThisService(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Things you can't report using this service";
		this.expectedHeading = "Things you can't report using this service";
		super.assertTitle().assertHeading();
	}
	
	public ThingYouCantReportUsingThisService clickNoQ1(){
		writeLog("Do you need to report any of these? Select No");
		screenShot(driver);
		driver.findElement(No1).click();
		return this;
	}
	public ThingYouCantReportUsingThisService clickNoQ2(){
		writeLog("Do you need to report income or expenditure from shares? Select No");
		screenShot(driver);
		driver.findElement(No2).click();
		return this;
	}

	public DoYouNeedToReportIncome clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new DoYouNeedToReportIncome(driver);
	}
	//*[@id="isInLiquidation"]/label[1]
}//*[@id="isAPropertyManagementCompany"]/label[1]
//*[@id="permanentUKBranch"]/label[1]cRu