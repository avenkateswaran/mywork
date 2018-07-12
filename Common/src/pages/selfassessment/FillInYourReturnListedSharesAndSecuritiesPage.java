package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnListedSharesAndSecuritiesPage extends BasePage{
	
	public static By wf36_07_FieldListedSharesNumberOfDisposals = By.id("wf36_07_FieldListedSharesNumberOfDisposals");
	public static By wf36_07_FieldListedSharesDisposalProceeds = By.id("wf36_07_FieldListedSharesDisposalProceeds");
	public static By wf36_07_FieldListedSharesAllowableCosts = By.id("wf36_07_FieldListedSharesAllowableCosts");
	public static By wf36_07_FieldListedSharesGainsInTheYear = By.id("wf36_07_FieldListedSharesGainsInTheYear");
	public static By wf36_07_FieldListedSharesLossesInTheYear = By.id("wf36_07_FieldListedSharesLossesInTheYear");
	public static By wf36_07_FieldListedSharesGainFromRTT = By.id("wf36_07_FieldListedSharesGainFromRTT");
	public static By wf36_07_FieldListedSharesRTTAlreadyCharged = By.id("wf36_07_FieldListedSharesRTTAlreadyCharged");
	public static By wf36_07_LabelAreYouMakingAnyClaims = By.id("wf36_07_LabelAreYouMakingAnyClaims");
	public static By wf36_04_LinkDeleteCapitalGains = By.id("wf36_04_LinkDeleteCapitalGains");
	
	public FillInYourReturnListedSharesAndSecuritiesPage(WebDriver driver) {
		super(driver);
	}
	
	public void setNumberOfDisposals(String option){
		driver.findElement(wf36_07_FieldListedSharesNumberOfDisposals).sendKeys(option);
		writeLog("Set Number of disposals: " + option);
	}
	
	public void setDisposalProceeds(String option){
		driver.findElement(wf36_07_FieldListedSharesDisposalProceeds).sendKeys(option);
		writeLog("Set Disposal proceeds: " + option);
	}
	
	public void setAllowableCosts(String option){
		driver.findElement(wf36_07_FieldListedSharesAllowableCosts).sendKeys(option);
		writeLog("Set Allowable costs: " + option);
	}
	
	public void setGainsInTheYearBeforeLosses(String option){
		driver.findElement(wf36_07_FieldListedSharesGainsInTheYear).sendKeys(option);
		writeLog("Set Gains in the year, before losses: " + option);
	}
	
	public void setLossesInTheYear(String option){
		driver.findElement(wf36_07_FieldListedSharesLossesInTheYear).sendKeys(option);
		writeLog("Set Losses in the year: " + option);
	}
	
	public void setOverallLoss(String option){
		driver.findElement(wf36_07_FieldListedSharesGainFromRTT).sendKeys(option);
		writeLog("Set Overall Loss: " + option);
	}
	
	public void setTaxOnGainsAlreadyCharged(String option){
		driver.findElement(wf36_07_FieldListedSharesRTTAlreadyCharged).sendKeys(option);
		writeLog("Set Tax on gains already charged: " + option);
	}
	
	public void setClaimOrElections(String option){
		driver.findElement(wf36_07_LabelAreYouMakingAnyClaims).sendKeys(option);
		writeLog("Set Are you making any claims or elections: " + option);
	}
	
	public FillInYourReturnUnlistedSharesAndSecuritiesPage clickNextUnlistedShares() {
		super.clickNext();
		return new FillInYourReturnUnlistedSharesAndSecuritiesPage(driver);
		
	}

}
