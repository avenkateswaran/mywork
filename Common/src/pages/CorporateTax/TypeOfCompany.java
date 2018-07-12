package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TypeOfCompany extends BasePage {
	
	public final WebDriver driver;
	public static By Private  = By.xpath("//*[@id='companyType']/div[2]/label");
	public static By CompanyLimited  = By.xpath("//*[@id='companyType']/div[3]/label");
	public static By ContinueButton  = By.id("submit");
	public TypeOfCompany(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Check if you can file with this service";
		this.expectedHeading = "What type of company are you?";
		super.assertTitle().assertHeading();
	}
	public TypeOfCompany clickMainRadio( String Answer){
		if (Answer.toLowerCase().contains("private")){
		writeLog("Click Button");
		screenShot(driver);
		driver.findElement(Private).click();}
		
		if (Answer.toLowerCase() .contains("companylimited")){
			writeLog("Click Button");
			screenShot(driver);
			driver.findElement(CompanyLimited).click();}
		return  this;
	}
		public WhatYourCompanyDoes clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new WhatYourCompanyDoes (driver);
	}
}


