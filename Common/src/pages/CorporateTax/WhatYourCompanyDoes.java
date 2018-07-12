package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;


public class WhatYourCompanyDoes extends BasePage{
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");
	public By Yes1  = By.xpath("//*[@id='sellsInsurance']/label[1]");
	public static By No1 = By.xpath("//*[@id='sellsInsurance']/label[2]");

	public String Q2 = "Is your company an investment company?";
	public By Yes2  = By.xpath("//*[@id='isAInvestmentCompany']/label[1]");
	public static By No2 = By.xpath("//*[@id='isAInvestmentCompany']/label[2]");
	public String Q3 = "Is your company a credit union?";
	public By Yes3  = By.xpath("//*[@id='isACreditUnion']/label[1]");
	public static By No3 = By.xpath("//*[@id='isACreditUnion']/label[2]");
	public String Q4 = "Is your company part of a group?";
	public By Yes4  = By.xpath("//*[@id='partOfAGroup']/label[1]");
	public static By No4 = By.xpath("//*[@id='partOfAGroup']/label[2]");
	public String Q5 = "Is your company registered in the UK (or does it have permanent premises in the UK)?";
	public By Yes5  = By.xpath("//*[@id='permanentUKBranch']/label[1]");
	public static By No5 = By.xpath("//*[@id='permanentUKBranch']/label[2]");
	public String Q6 = "Is your company in liquidation or receivership?";
	public By Yes6  = By.xpath("//*[@id='isInLiquidation']/label[1]");
	public static By No6 = By.xpath("//*[@id='isInLiquidation']/label[2]");
	public String Q7 = "Is your company a commercial property management company?";
	public By Yes7  = By.xpath("//*[@id='isAPropertyManagementCompany']/label[1]");
	public static By No7 = By.xpath("//*[@id='isAPropertyManagementCompany']/label[2]");
	public String Q8 = "Is your company in liquidation or receivership?";
	public By Yes8  = By.xpath("//*[@id='isInLiquidation']/label[1]");
	public static By No8 = By.xpath("//*[@id='isInLiquidation']/label[2]");
	public String Q9 = "Is your company a commercial property management company?";
	public By Yes9  = By.xpath("//*[@id='isAPropertyManagementCompany']/label[1]");
	public static By No9 = By.xpath("//*[@id='isAPropertyManagementCompany']/label[2]");
	
	public WhatYourCompanyDoes(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "What your company does and how it's run";
		this.expectedHeading = "What your company does and how it's run";
		super.assertTitle().assertHeading();
	}
	
	public WhatYourCompanyDoes clickNoQ1(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No1).click();
		return this;
	}
	public WhatYourCompanyDoes clickNoQ2(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No2).click();
		return this;
	}
	public WhatYourCompanyDoes clickNoQ3(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No3).click();
		return this;
	}
	public WhatYourCompanyDoes clickNoQ4(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No4).click();
		return this;
	}
	public WhatYourCompanyDoes clickYesQ5(){
		writeLog("Select Yes");
		screenShot(driver);
		driver.findElement(Yes5).click();
		return this;
	}
	public WhatYourCompanyDoes clickNoQ6(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No6).click();
		return this;
	}
	public WhatYourCompanyDoes clickNoQ7(){
		writeLog("Select No");
		screenShot(driver);
		driver.findElement(No7).click();
		return this;
	}

	public ThingYouCantReportUsingThisService clickNext(){
		writeLog("Click Continue");
		screenShot(driver);
		driver.findElement(ContinueButton).click();
		return new ThingYouCantReportUsingThisService(driver);
	}
	//*[@id="isInLiquidation"]/label[1]
}//*[@id="isAPropertyManagementCompany"]/label[1]
