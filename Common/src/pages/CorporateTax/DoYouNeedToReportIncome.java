package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class DoYouNeedToReportIncome extends BasePage{
	
	public final WebDriver driver;
	public By Yes1  = By.xpath("//*[@id='investmentAssets']/label[1]");
	public static By No1 = By.xpath("//*[@id='investmentAssets']/label[2]");
	public static By ContinueButton  = By.id("submit");
	public DoYouNeedToReportIncome(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Do you need to report income or expenditure from investment assets?";
		this.expectedHeading = "Do you need to report income or expenditure from investment assets?";
		super.assertTitle().assertHeading();
	}

	public DoYouNeedToReportIncome clickNoQ1(){
		writeLog("Do you need to report income or expenditure from shares? Select No");
		screenShot(driver);
		driver.findElement(No1).click();
		return this;
	}

	public DoYouNeedToContingent clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new DoYouNeedToContingent(driver);
	}
}