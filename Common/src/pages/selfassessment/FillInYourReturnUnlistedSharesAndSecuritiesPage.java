package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnUnlistedSharesAndSecuritiesPage extends BasePage	{
	
	public static By wf36_08_FieldUnlistedSharesNumberOfDisposals = By.id("wf36_08_FieldUnlistedSharesNumberOfDisposals");
	public static By wf36_08_FieldListedSharesDisposalProceeds = By.id("wf36_08_FieldListedSharesDisposalProceeds");
	public static By wf36_08_FieldUnlistedSharesAllowableCosts = By.id("wf36_08_FieldUnlistedSharesAllowableCosts");
	public static By wf36_08_FieldUnlistedSharesTotalGains = By.id("wf36_08_FieldUnlistedSharesTotalGains");
	public static By wf36_08_FieldLUnlstedSharesLossesInTheYear = By.id("wf36_08_FieldLUnlstedSharesLossesInTheYear");
	public static By wf36_08_FieldUnlistedSharesGainFromRTT = By.id("wf36_08_FieldUnlistedSharesGainFromRTT");
	public static By wf36_08_FieldUnlistedSharesRTTAlreadyCharged = By.id("wf36_08_FieldUnlistedSharesRTTAlreadyCharged");
	public static By wf36_08_FieldAreYouMakingAnyClaims = By.id("wf36_08_FieldAreYouMakingAnyClaims");
	
	public FillInYourReturnUnlistedSharesAndSecuritiesPage(WebDriver driver) {
		super(driver);
	}
	
	public void setNumberOfDisposals(String option){
		driver.findElement(wf36_08_FieldUnlistedSharesNumberOfDisposals).sendKeys(option);
		writeLog("Set Number of disposals: " + option);
	}
	
	public void setDisposalProceeds(String option){
		driver.findElement(wf36_08_FieldListedSharesDisposalProceeds).sendKeys(option);
		writeLog("Set Disposal proceeds: " + option);
	}
	
	public void setAllowableCosts(String option){
		driver.findElement(wf36_08_FieldUnlistedSharesAllowableCosts).sendKeys(option);
		writeLog("Set Allowable costs: " + option);
	}
	
	public void setGainsInTheYearBeforeLosses(String option){
		driver.findElement(wf36_08_FieldUnlistedSharesTotalGains).sendKeys(option);
		writeLog("Set Gains in the year, before losses: " + option);
	}
	
	public void setLossesInTheYear(String option){
		driver.findElement(wf36_08_FieldLUnlstedSharesLossesInTheYear).sendKeys(option);
		writeLog("Set Losses in the year: " + option);
	}
	
	public void setOverallLoss(String option){
		driver.findElement(wf36_08_FieldUnlistedSharesGainFromRTT).sendKeys(option);
		writeLog("Set Overall Loss: " + option);
	}
	
	public void setTaxOnGainsAlreadyCharged(String option){
		driver.findElement(wf36_08_FieldUnlistedSharesRTTAlreadyCharged).sendKeys(option);
		writeLog("Set Tax on gains already charged: " + option);
	}
	
	public void setClaimOrElections(String option){
		driver.findElement(wf36_08_FieldAreYouMakingAnyClaims).sendKeys(option);
		writeLog("Set Are you making any claims or elections: " + option);
	}
	
	public FillInYourReturnLossesAndAdjustmentsPage clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnLossesAndAdjustmentsPage(driver);
		
	}

}
