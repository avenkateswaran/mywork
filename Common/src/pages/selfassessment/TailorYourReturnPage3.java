package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TailorYourReturnPage3 extends BasePage{
	
	public static By wf22_03_FieldHasPensionContributions = By.id("wf22_03_FieldHasPensionContributions");
	public static By wf22_03_FieldHasCharitableGiving = By.id("wf22_03_FieldHasCharitableGiving");
	public static By wf22_03_FieldHasMarriedCoupleAllowance = By.id("wf22_03_FieldHasMarriedCoupleAllowance");
	public static By wf22_03_FieldWantsMarrigeAllowance = By.id("wf22_03_FieldWantsMarrigeAllowance");
	public static By wf22_03_FieldHasOtherReliefsDeductions = By.id("wf22_03_FieldHasOtherReliefsDeductions");
	public static By wf22_03_FieldHasIncomeTaxRefunded = By.id("wf22_03_FieldHasIncomeTaxRefunded");
	public static By wf22_03_FieldHasTaxAdviser = By.id("wf22_03_FieldHasTaxAdviser");
	public static By wf22_03_FieldHasTaxAvoidanceSchemes = By.id("wf22_03_FieldHasTaxAvoidanceSchemes");
	public static By wf22_03_FieldActingInCapacity = By.id("wf22_03_FieldActingInCapacity");
	
	

	public TailorYourReturnPage3(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Tailor your return - Page 3 of 3";
//		this.expectedHeading = "3. Tailor your return";
//		this.expectedSubHeading = "Page 3 of 3";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setPensionContributions(String option){
		driver.findElement(wf22_03_FieldHasPensionContributions).sendKeys(option);
		writeLog("Set Pension Contributionst: " + option);
	}
	
	public void setCharity(String option){
		driver.findElement(wf22_03_FieldHasCharitableGiving).sendKeys(option);
		writeLog("Set Charity: " + option);
	}
	
	public void setMarriageAllowance(String option){
		driver.findElement(wf22_03_FieldHasMarriedCoupleAllowance).sendKeys(option);
		writeLog("Set Marriage Allowance: " + option);
	}
	
	public void setPersonalAllowance(String option){
		driver.findElement(wf22_03_FieldWantsMarrigeAllowance).sendKeys(option);
		writeLog("Set Personal Allowance: " + option);
	}
	
	public void setClaimOtherTaxRelief(String option){
		driver.findElement(wf22_03_FieldHasOtherReliefsDeductions).sendKeys(option);
		writeLog("Set Claim Other Tax Relief: " + option);
	}
	
	public void setJobCentrePlus(String option){
		driver.findElement(wf22_03_FieldHasIncomeTaxRefunded).sendKeys(option);
		writeLog("Set Job Centre Plus: " + option);
	}
	
	public void setTaxAdvisor(String option){
		driver.findElement(wf22_03_FieldHasTaxAdviser).sendKeys(option);
		writeLog("Set Tax Advisor: " + option);
	}
	
	public void setTaxAvoidance(String option){
		driver.findElement(wf22_03_FieldHasTaxAvoidanceSchemes).sendKeys(option);
		writeLog("Set Tax Avoidance: " + option);
	}
	
	public void setCapcity(String option){
		driver.findElement(wf22_03_FieldActingInCapacity).sendKeys(option);
		writeLog("Set Capcity: " + option);
	}

	public FillInYourReturnPage clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnPage(driver);
	}

}
