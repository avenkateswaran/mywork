package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TailorYourReturnPage2 extends BasePage{
	
	public static By wf22_02_FieldHasUkInterest = By.id("wf22_02_FieldHasUkInterest");
	public static By wf22_02_FieldHasUkDividends = By.id("wf22_02_FieldHasUkDividends");
	public static By wf22_02_FieldHasUkPensionsBenefits = By.id("wf22_02_FieldHasUkPensionsBenefits");
	public static By wf22_01_FieldHasChildBenefit = By.id("wf22_01_FieldHasChildBenefit");
	public static By wf22_02_FieldHasLumpSumsEtc = By.id("wf22_02_FieldHasLumpSumsEtc");
	public static By wf22_02_FieldHaveYouMadeAnyIncomeTaxLosses = By.id("wf22_02_FieldHaveYouMadeAnyIncomeTaxLosses");
	public static By wf22_02_FieldAreYouLiableForPensionSaving = By.id("wf22_02_FieldAreYouLiableForPensionSaving");

	public TailorYourReturnPage2(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Tailor your return - Page 2 of 3";
//		this.expectedHeading = "3. Tailor your return";
//		this.expectedSubHeading = "Page 2 of 3";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setUKInterest(String option){
	driver.findElement(wf22_02_FieldHasUkInterest).sendKeys(option);
	writeLog("Set UK Interest: " + option);
	}
	
	public void setUKDividends(String option){
	driver.findElement(wf22_02_FieldHasUkDividends).sendKeys(option);
	writeLog("Set UK Dividends: " + option);
	}
	
	public void setUKPensions(String option){
	driver.findElement(wf22_02_FieldHasUkPensionsBenefits).sendKeys(option);
	writeLog("Set UK Pensions: " + option);
	}
	
	public void setChildBenefit(String option){
	driver.findElement(wf22_01_FieldHasChildBenefit).sendKeys(option);
	writeLog("Set Child Benefitt: " + option);
	}
	
	public void setLumpSum(String option){
	driver.findElement(wf22_02_FieldHasLumpSumsEtc).sendKeys(option);
	writeLog("Set Lump Sum: " + option);
	}
	
	public void setIncomeTaxLosses(String option){
	driver.findElement(wf22_02_FieldHaveYouMadeAnyIncomeTaxLosses).sendKeys(option);
	writeLog("Set Income tax losses: " + option);
	}
	
	public void setLiablePensionSaving(String option){
	driver.findElement(wf22_02_FieldAreYouLiableForPensionSaving).sendKeys(option);
	writeLog("Set Liable Pension Saving: " + option);
	}

	public TailorYourReturnPage3 clickNext(){
		super.clickNext();
		return new pages.selfassessment.TailorYourReturnPage3(driver);
	}

}
