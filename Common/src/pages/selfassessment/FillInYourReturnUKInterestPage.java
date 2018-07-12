package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnUKInterestPage extends BasePage{
	
	public static By wf40_01_01_FieldUKBankEtcInterestAmountWhichHasBeenTaxed = By.id("wf40_01_01_FieldUKBankEtcInterestAmountWhichHasBeenTaxed");
	public static By wf40_01_01_FieldUntaxedUKInterestEtc = By.id("wf40_01_01_FieldUntaxedUKInterestEtc");
	public static By wf40_01_01_FieldUntaxedForeignInterest = By.id("wf40_01_01_FieldUntaxedForeignInterest");
	
	public FillInYourReturnUKInterestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setTaxedUKInterest(String option){
		driver.findElement(wf40_01_01_FieldUKBankEtcInterestAmountWhichHasBeenTaxed).sendKeys(option);
		writeLog("Set Taxed UK interest etc. Enter net amount after tax has been taken off: " + option);
	}
	
	public void setUntaxedUKInterest(String option){
		driver.findElement(wf40_01_01_FieldUntaxedUKInterestEtc).sendKeys(option);
		writeLog("Set Untaxed UK interest etc (amounts which have not been taxed). Enter total amount: " + option);
	}
	
	
	public void setUntaxedForeignInterest(String option){
		driver.findElement(wf40_01_01_FieldUntaxedForeignInterest).sendKeys(option);
		writeLog("Set Untaxed foreign interest (up to £2,000) - amounts which have not had tax taken off. Enter total amount: " + option);
	}
	
	public FillInYourReturnDividendsPage clickNextDividends(){
		super.clickNext();
		return new FillInYourReturnDividendsPage(driver);
	}
}
