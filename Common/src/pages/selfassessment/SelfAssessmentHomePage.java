package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SelfAssessmentHomePage extends BasePage{
	
	public static By LinkXIsDueForPayment = By.id("LinkXIsDueForPayment");
	public static By LinkHowToPay = By.id("LinkHowToPay");
	public static By LinkTaxReturnOptionsFileReturn = By.id("LinkTaxReturnOptionsFileReturn");
	public static By LinkTaxReturnOptions = By.id("LinkTaxReturnOptions");
	public static By LinkViewOutstandingTaxReturns = By.id("LinkViewOutstandingTaxReturns");
	public static By portletViewAnnualTaxReturn = By.xpath("//*[@id='portletViewAnnualTaxReturn']/div[2]/p[4]/a");

	public SelfAssessmentHomePage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: At a glance";
//		this.expectedHeading = "At a glance";
//		super.assertTitle().assertHeading();
	}
	
	public String getTaxPayerName(){
		return driver.findElement(locators.Common.taxPayerName).getText();
	}
	
	public String getUTR(){
		return driver.findElement(locators.Common.utr).getText();
	}
	
	public TaxReturnOptionsPage clickTaxReturnOptions(){
		driver.findElement(LinkTaxReturnOptions).click();
		writeLog("click Tax return options");
		screenShot(driver);
		return new TaxReturnOptionsPage(driver);
		
	}
}
