package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class WhatIsYourOrganisation extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public static By A1  = By.xpath("//*[@id='organisationType']/label[1]");
	public static By A2  = By.xpath("//*[@id='organisationType']/label[2]");
	public static By A3  = By.xpath("//*[@id='organisationType']/label[3]");
	public static By A4  = By.xpath("//*[@id='organisationType']/label[4]");
	public static By A5  = By.xpath("//*[@id='organisationType']/label[5]");
	public WhatIsYourOrganisation(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "What is your organisation?";
		this.expectedHeading = "What is your organisation?";
		super.assertTitle().assertHeading();
	}
	
		public WhatIsYourOrganisation clickCompany(){
			writeLog("Click Company");
			screenShot(driver);
			driver.findElement(A1).click();
			return  new WhatIsYourOrganisation (driver);
	}
		public ChangesToACompany clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new ChangesToACompany (driver);
	}
}


