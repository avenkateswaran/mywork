package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnLossesAndAdjustmentsPage extends BasePage{
	
	public static By wf36_12_FieldSummaryLossesBroughtForwardUsed = By.id("wf36_12_FieldSummaryLossesBroughtForwardUsed");
	public static By wf36_08_FieldSummaryOfLossesSetAgainstGains = By.id("wf36_08_FieldSummaryOfLossesSetAgainstGains");
	public static By wf36_12_FieldSummaryOfLossesToCarryForward = By.id("wf36_12_FieldSummaryOfLossesToCarryForward");
	public static By wf36_08_FieldSummaryOfLossesUsedEarlierYears = By.id("wf36_08_FieldSummaryOfLossesUsedEarlierYears");
	public static By wf36_12_FieldEntrepreneursRelief = By.id("wf36_12_FieldEntrepreneursRelief");
	public static By wf36_07_FieldGainsEntrepreneursRelief = By.id("wf36_07_FieldGainsEntrepreneursRelief");
	public static By wf36_12_FieldAdjustmentCapitalGainsTax = By.id("wf36_12_FieldAdjustmentCapitalGainsTax");	
	public static By wf36_12_FieldSummaryOfAdditionalLiability = By.id("wf36_12_FieldSummaryOfAdditionalLiability");
	public static By wf36_05_FieldComputationsIncludeEstimates = By.id("wf36_05_FieldComputationsIncludeEstimates");

	public FillInYourReturnLossesAndAdjustmentsPage(WebDriver driver) {
		super(driver);
	}

	public void setLossesBroughtForward(String option){
		driver.findElement(wf36_12_FieldSummaryLossesBroughtForwardUsed).sendKeys(option);
		writeLog("Set Losses brought forward and used in-year: " + option);
	}
	
	public void setIncomeLosses(String option){
		driver.findElement(wf36_08_FieldSummaryOfLossesSetAgainstGains).sendKeys(option);
		writeLog("Set Income losses of 2016-17 set against gains: " + option);
	}
	
	public void setLossesAvailable(String option){
		driver.findElement(wf36_12_FieldSummaryOfLossesToCarryForward).sendKeys(option);
		writeLog("Set Losses available to be carried forward: " + option);
	}
	
	public void setLossesUsedAgainst(String option){
		driver.findElement(wf36_08_FieldSummaryOfLossesUsedEarlierYears).sendKeys(option);
		writeLog("Set Losses used against an earlier year's gain: " + option);
	}
	
	public void setGainsEntrepreneursReliefBefore(String option){
		driver.findElement(wf36_12_FieldEntrepreneursRelief).sendKeys(option);
		writeLog("Set Gains qualifying for Entrepreneurs’ Relief - Gains before 23 June 2010: " + option);
	}
	
	
	public void setGainsEntrepreneursReliefOnOrAfter(String option){
		driver.findElement(wf36_07_FieldGainsEntrepreneursRelief).sendKeys(option);
		writeLog("Set Gains qualifying for Entrepreneurs’ Relief - Gains on or after 23 June 2010: " + option);
	}
	
	public void setAdjustmentsToCGT(String option){
		driver.findElement(wf36_12_FieldAdjustmentCapitalGainsTax).sendKeys(option);
		writeLog("Set Adjustment to Capital Gains Tax: " + option);
	}
	
	public void setAdditionalLiability(String option){
		driver.findElement(wf36_12_FieldSummaryOfAdditionalLiability).sendKeys(option);
		writeLog("Set Additional liability for non-resident or duel resident trusts: " + option);
	}
	
	public void setComputationsIncludes(String option){
		driver.findElement(wf36_05_FieldComputationsIncludeEstimates).sendKeys(option);
		writeLog("Set Do your computations include any estimates or valuations?: " + option);
	}
	
	public FillInYourReturnAddAttachmentPage clickNext() {
		super.clickNext();
		return new FillInYourReturnAddAttachmentPage(driver);
		
	}
	
}
