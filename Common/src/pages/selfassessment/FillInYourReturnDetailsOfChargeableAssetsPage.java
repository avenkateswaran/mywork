package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnDetailsOfChargeableAssetsPage extends BasePage{
	
	public static By wf36_01_FieldHasDisposedAssets = By.id("wf36_01_FieldHasDisposedAssets");
	public static By wf36_01_LinkDeleteCapitalGains = By.id("wf36_01_LinkDeleteCapitalGains");
	
	public FillInYourReturnDetailsOfChargeableAssetsPage(WebDriver driver){
		super(driver);
	}
	
	public void setDisposeOfChargeableAssets(String option){
		driver.findElement(wf36_01_FieldHasDisposedAssets).sendKeys(option);
		writeLog("Set Did you dispose of chargeable assets worth more than £44,400? : " + option);
	}
	
	public FillInYourReturnHelpInCompletingCapitalGainsPage clickNext() {
		super.clickNext();
		return new pages.selfassessment.FillInYourReturnHelpInCompletingCapitalGainsPage(driver);
		
	}

}
