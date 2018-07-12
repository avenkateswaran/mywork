package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class FileWithThisService extends BasePage{
	
	public final WebDriver driver;
	public static By PrivateLimitedCompanyButton  = By.xpath("//*[@id='companyType']/div[2]/label");
	public static By ContinueButton  = By.id("submit");
	public String  CompanyLimitedByGuarantee = "Company limited by guarantee";
	public String  UnincorporatedAssociation ="Unincorporated association eg members' club";
	public String  AnyOtherTypeOfOrganisation = "Any other type of organisation";
	public FileWithThisService(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Check if you can file with this service";
		this.expectedHeading = "Check if you can file with this service";
		super.assertTitle().assertHeading();
	}
	
	public FileWithThisService clickPrivateLimited(){
		writeLog("Selected Private limited Company");
		screenShot(driver);
		driver.findElement(PrivateLimitedCompanyButton).click();
		return this;
	}
	public WhatYourCompanyDoes clickNext(){
		writeLog("Click Next");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new WhatYourCompanyDoes(driver);
	}
}
//continue  