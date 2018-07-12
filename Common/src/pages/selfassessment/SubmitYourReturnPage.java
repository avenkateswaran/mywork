package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SubmitYourReturnPage extends BasePage{
	
	public static By wf80_13_DataSubReceiptRefNumberInfo = By.id("wf80_13_DataSubReceiptRefNumberInfo");
	public static By wf80_13_DataSubReceiptRefNumberInfoXpath = By.xpath("//*[@id='wf80_13_DataSubReceiptRefNumberInfo']/p/strong");
	public static By wf80_13_LinkViewPrivacyGuidance = By.id("wf80_13_LinkViewPrivacyGuidance");
	public static By wf80_13_LinkSaveIR = By.id("wf80_13_LinkSaveIR");
	public static By wf80_13_LinkPrintIR = By.id("wf80_13_LinkPrintIR");
	public static By wf80_13_LinkHowToPayTaxBill = By.id("wf80_13_LinkHowToPayTaxBill");
	public static By wf80_01_FieldDeclaration = By.id(("wf80_01_FieldDeclaration"));
	
	public SubmitYourReturnPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Submit your return - Submission receipt";
		this.expectedHeading = "8. Submit your return";
		super.assertTitle().assertHeading();
	}
	
	public void setDeclaration(){
		driver.findElement(wf80_01_FieldDeclaration).click();
		writeLog("Set The information I have given on this Tax Return is correct and complete to the best of my knowledge and belief");
	}

	public ExitFileAReturnPage clickExitGoToExitFileAReturnPage() {
		super.clickExit();
		return new ExitFileAReturnPage(driver);
	}

}
