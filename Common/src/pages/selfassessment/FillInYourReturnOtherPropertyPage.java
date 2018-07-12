package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnOtherPropertyPage extends BasePage{
	
	public static By wf36_06_FieldOtherPropertiesNumberOfDisposals = By.id("wf36_06_FieldOtherPropertiesNumberOfDisposals");
	public static By wf36_06_FieldOtherGainsDisposalProceeds = By.id("wf36_06_FieldOtherGainsDisposalProceeds");
	public static By wf36_06_FieldOtherGainsAllowableCosts = By.id("wf36_06_FieldOtherGainsAllowableCosts");
	public static By wf36_06_FieldOtherGainsInYear = By.id("wf36_06_FieldOtherGainsInYear");
	public static By wf36_06_FieldListedSharesLossesInTheYear = By.id("wf36_06_FieldListedSharesLossesInTheYear");
	public static By wf36_06_FieldListedSharesGainFromRTT = By.id("wf36_06_FieldListedSharesGainFromRTT");
	public static By wf36_06_FieldListedSharesRTTAlreadyCharged = By.id("wf36_06_FieldListedSharesRTTAlreadyCharged");
	public static By wf36_06_FieldAreYouMakingAnyClaims = By.id("wf36_06_FieldAreYouMakingAnyClaims");
	public static By wf36_06_FieldIsMakingClaim = By.id("wf36_06_FieldIsMakingClaim");
	public static By wf36_06_FieldAttributedGains = By.id("wf36_06_FieldAttributedGains");

	public FillInYourReturnOtherPropertyPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void setNumberOfDisposals(String option){
		driver.findElement(wf36_06_FieldOtherPropertiesNumberOfDisposals).sendKeys(option);
		writeLog("Set Number of disposals: " + option);
	}
	
	public void setDisposalProceeds(String option){
		driver.findElement(wf36_06_FieldOtherGainsDisposalProceeds).sendKeys(option);
		writeLog("Set Disposal proceeds: " + option);
	}
	
	public void setAllowableCosts(String option){
		driver.findElement(wf36_06_FieldOtherGainsAllowableCosts).sendKeys(option);
		writeLog("Set Allowable costs: " + option);
	}
	
	public void setGainsInTheYearBeforeLosses(String option){
		driver.findElement(wf36_06_FieldOtherGainsInYear).sendKeys(option);
		writeLog("Set Gains in the year, before losses: " + option);
	}
	
	public void setLossesInTheYear(String option){
		driver.findElement(wf36_06_FieldListedSharesLossesInTheYear).sendKeys(option);
		writeLog("Set Losses in the year: " + option);
	}
	
	public void setOverallLoss(String option){
		driver.findElement(wf36_06_FieldListedSharesGainFromRTT).sendKeys(option);
		writeLog("Set Overall Loss: " + option);
	}
	
	public void setTaxOnGainsAlreadyCharged(String option){
		driver.findElement(wf36_06_FieldListedSharesRTTAlreadyCharged).sendKeys(option);
		writeLog("Set Tax on gains already charged: " + option);
	}
	
	public void setClaimOrElections(String option){
		driver.findElement(wf36_06_FieldAreYouMakingAnyClaims).sendKeys(option);
		writeLog("Set Are you making any claims or elections: " + option);
	}
	
	public void setMakeClaimsOrElections(String option){
		driver.findElement(wf36_06_FieldIsMakingClaim).sendKeys(option);
		writeLog("Set If you are making any claims or elections, select the relevant code: " + option);
	}
	
	public void setAttributedGains(String option){
		driver.findElement(wf36_06_FieldAttributedGains).sendKeys(option);
		writeLog("Set Attributed gains where personal losses cannot be set off: " + option);
	}
	
	public FillInYourReturnListedSharesAndSecuritiesPage clickNextListedShares() {
		super.clickNext();
		return new FillInYourReturnListedSharesAndSecuritiesPage(driver) ;
	}

}
