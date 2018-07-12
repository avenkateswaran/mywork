package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TaxReturnOptionsPage extends BasePage{
	
	public static By FieldSelectTaxYear = By.id("FieldSelectTaxYear");
	public static By ButtonGo = By.id("ButtonGo");
	public static By ButtonFileReturn = By.id("ButtonFileReturn");
	public static By checkSAToBeCompleted = By.partialLinkText("Check if you need to complete a Self Assessment tax return");
	public static By LinkListOfAvailableCommercialSoftware = By.id("LinkListOfAvailableCommercialSoftware");
	public static By LinkHelpCompleteYourTaxReturn = By.id("LinkHelpCompleteYourTaxReturn");
	public static By LinkViewOutstandingTaxReturns = By.id("LinkViewOutstandingTaxReturns");

	public TaxReturnOptionsPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Tax return options";
//		this.expectedHeading = "Tax return options";
//		this.expectedSubHeading = "Tax year summary";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public WelcomePage clickFileReturn(){
		driver.findElement(ButtonFileReturn).click();
		writeLog("Click file return");
		screenShot(driver);
		return new WelcomePage(driver);
		
	}
		
}
