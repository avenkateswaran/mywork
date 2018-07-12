package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.paye.AtAGlancePage;
import pages.selfassessment.SelfAssessmentHomePage;

public class ServicesYouCanUsePage extends BasePage {

	public static By selfAssessmentSA = By.linkText("Self Assessment (SA)");
	public static By payeForEmployers = By.linkText("PAYE for Employers");
	public static By CorporationTax = By.linkText("Corporation Tax (CT)");

	public ServicesYouCanUsePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Services you can use";
		this.expectedHeading = "Services you can use";
		super.assertTitle().assertHeading();
	}

	public SelfAssessmentHomePage clickSelfAssessment() {
		writeLog("click Self Assessment (SA) - Access service");
		screenShot(driver);
		driver.findElement(selfAssessmentSA).click();
		return new pages.selfassessment.SelfAssessmentHomePage(driver);
	}

	public AtAGlancePage clickPAYE() {
		writeLog("click PAYE for employers - Access service");
		screenShot(driver);
		driver.findElement(payeForEmployers).click();
		return new pages.paye.AtAGlancePage(driver);
	}

	public ServicesYouCanUsePage clickCT() {
		driver.findElement(CorporationTax).click();
		this.expectedHeading = "At a glance";
		super.assertHeading();
		return this;
	}
}
