package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnDividendsPage extends BasePage{
	
	public static By wf40_02_01_FieldUKDividends = By.id("wf40_02_01_FieldUKDividends");
	public static By wf40_02_01_FieldUnitTrustDividends = By.id("wf40_02_01_FieldUnitTrustDividends");
	public static By wf40_02_01_FieldForeignDividends = By.id("wf40_02_01_FieldForeignDividends");
	public static By wf40_02_01_FieldForeignDividendsTaxPaid = By.id("wf40_02_01_FieldForeignDividendsTaxPaid");

	public FillInYourReturnDividendsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setDividendsFromUKCompanies(String option){
		driver.findElement(wf40_02_01_FieldUKDividends).sendKeys(option);
		writeLog("Set Dividends from UK companies. The amount received: " + option);
	}
	
	public void setOtherDividends(String option){
		driver.findElement(wf40_02_01_FieldUnitTrustDividends).sendKeys(option);
		writeLog("Set Other dividends. The amount received: " + option);
	}
	
	public void setForeignDividends(String option){
		driver.findElement(wf40_02_01_FieldForeignDividends).sendKeys(option);
		writeLog("Set Foreign dividends (up to £300) (do not include this amount on your foreign pages). Enter the amount in sterling after foreign tax was taken off: " + option);
	}
	
	public void setTaxTakenOffForeignDividends(String option){
		driver.findElement(wf40_02_01_FieldForeignDividendsTaxPaid).sendKeys(option);
		writeLog("Set Tax taken off foreign dividends. Enter the sterling equivalent: " + option);
	}

	
	public FillInYourReturnUnderpaidTaxPage clickNextUnderpaidTax(){
		super.clickNext();
		return new FillInYourReturnUnderpaidTaxPage(driver);
	}
	
}
