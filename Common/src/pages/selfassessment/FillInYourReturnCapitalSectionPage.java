package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnCapitalSectionPage extends BasePage{
	
	public static By wf36_04_FieldShowResidentialProperty = By.id("wf36_04_FieldShowResidentialProperty");
	public static By wf36_04_FieldShowOtherProperty = By.id("wf36_04_FieldShowOtherProperty");
	public static By wf36_04_FieldShowListedSharesAndSecurities = By.id("wf36_04_FieldShowListedSharesAndSecurities");
	public static By wf36_04_FieldShowUnlistedSharesAndSecurities = By.id("wf36_04_FieldShowUnlistedSharesAndSecurities");
	public static By wf36_04_LinkDeleteCapitalGains = By.id("wf36_04_LinkDeleteCapitalGains");
	
	public FillInYourReturnCapitalSectionPage(WebDriver driver){
		super(driver);
	}
	
	public void setShowResidentialProperty(){
		driver.findElement(wf36_04_FieldShowResidentialProperty).click();
		writeLog("Set Residential property and carried interest");
	}
	
	public void setShowOtherProperty(){
		driver.findElement(wf36_04_FieldShowOtherProperty).click();
		writeLog("Set Other property, assets and gains");
	}
	
	public void setShowListedSharesAndSecurities(){
		driver.findElement(wf36_04_FieldShowListedSharesAndSecurities).click();
		writeLog("Set Listed Shares");
	}
	
	public void setShowUnlistedSharesAndSecurities(){
		driver.findElement(wf36_04_FieldShowUnlistedSharesAndSecurities).click();
		writeLog("Set Unlisted Shares");
	}
	
	public FillInYourReturnListedSharesAndSecuritiesPage clickNextListedShares() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnListedSharesAndSecuritiesPage(driver);
		
	}
	
	public FillInYourReturnOtherPropertyPage clickNextOtherProperty() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnOtherPropertyPage(driver);
		
	}
	
}
