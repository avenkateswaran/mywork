package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TailorYourReturnPage extends BasePage{
	
	public static By wf22_01_FieldHasEmployment = By.id("wf22_01_FieldHasEmployment");
	public static By wf22_01_FieldNumberOfEmployments = By.id("wf22_01_FieldNumberOfEmployments");
	public static By wf22_01_FieldEmployerName1 = By.id("wf22_01_FieldEmployerName1");
	public static By wf22_01_FieldEmployerName2 = By.id("wf22_01_FieldEmployerName2");
	public static By wf22_01_FieldEmployerName3 = By.id("wf22_01_FieldEmployerName3");
	public static By wf22_01_FieldEmployerName4 = By.id("wf22_01_FieldEmployerName4");
	public static By wf22_01_FieldEmployerName5 = By.id("wf22_01_FieldEmployerName5");
	public static By wf22_01_FieldEmployerName6 = By.id("wf22_01_FieldEmployerName6");
	public static By wf22_01_FieldEmployerName7 = By.id("wf22_01_FieldEmployerName7");
	public static By wf22_01_FieldEmployerName8 = By.id("wf22_01_FieldEmployerName8");
	public static By wf22_01_FieldEmployerName9 = By.id("wf22_01_FieldEmployerName9");
	public static By wf22_01_FieldEmployerName10 = By.id("wf22_01_FieldEmployerName10");
	public static By wf22_01_FieldEmployerName11 = By.id("wf22_01_FieldEmployerName11");
	public static By wf22_01_FieldEmployerName12 = By.id("wf22_01_FieldEmployerName12");
	public static By wf22_01_FieldEmployerName13 = By.id("wf22_01_FieldEmployerName13");
	public static By wf22_01_FieldEmployerName14 = By.id("wf22_01_FieldEmployerName14");
	public static By wf22_01_FieldEmployerName15 = By.id("wf22_01_FieldEmployerName15");
	
	public static By wf22_01_FieldHasSelfEmployments = By.id("wf22_01_FieldHasSelfEmployments");
	public static By wf22_01_FieldNumberOfSelfEmployments = By.id("wf22_01_FieldNumberOfSelfEmployments");
	public static By wf22_01_FieldBusinessName1 = By.id("wf22_01_FieldBusinessName1");
	public static By wf22_01_FieldBusinessName2 = By.id("wf22_01_FieldBusinessName2");
	public static By wf22_01_FieldBusinessName3 = By.id("wf22_01_FieldBusinessName3");
	public static By wf22_01_FieldBusinessName4 = By.id("wf22_01_FieldBusinessName4");
	public static By wf22_01_FieldBusinessName5 = By.id("wf22_01_FieldBusinessName5");
	
	public static By wf22_01_FieldHasPartnership = By.id("wf22_01_FieldHasPartnership");
	public static By wf22_01_FieldNumberOfPartnerships = By.id("wf22_01_FieldNumberOfPartnerships");
	public static By wf22_01_FieldPartnershipName1 = By.id("wf22_01_FieldPartnershipName1");
	public static By wf22_01_FieldPartnershipName2 = By.id("wf22_01_FieldPartnershipName2");
	public static By wf22_01_FieldPartnershipName3 = By.id("wf22_01_FieldPartnershipName3");
	public static By wf22_01_FieldPartnershipName4 = By.id("wf22_01_FieldPartnershipName4");
	public static By wf22_01_FieldPartnershipName5 = By.id("wf22_01_FieldPartnershipName5");
	
	
	public static By wf22_01_FieldHasProperty = By.id("wf22_01_FieldHasProperty");
	public static By wf22_01_FieldHasForeignIncome = By.id("wf22_01_FieldHasForeignIncome");
	public static By wf22_01_FieldHasCapitalGains = By.id("wf22_01_FieldHasCapitalGains");
	public static By ButtonNext = By.id("ButtonNext");

	public TailorYourReturnPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Tailor your return - Page 1 of 3";
//		this.expectedHeading = "3. Tailor your return";
//		this.expectedSubHeading = "Page 1 of 3";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setTypeOfWorker(String option){
		driver.findElement(wf22_01_FieldHasEmployment).sendKeys(option);
		writeLog("Set type of worker: " + option);
	}

	public void setSelfEmployed(String option){
		driver.findElement(wf22_01_FieldHasSelfEmployments).sendKeys(option);
		writeLog("Set self-employed: " + option);
	}
	
	public void setSelfEmployedBusiness(String option, String string){
		driver.findElement(wf22_01_FieldNumberOfSelfEmployments).sendKeys(option);
		driver.findElement(wf22_01_FieldBusinessName1).sendKeys(string);
		writeLog("Set No. of self-employed employements: " + option);
		writeLog("Set buinsess name: " + string);
	}
	
	public void setPartnership(String option){
		driver.findElement(wf22_01_FieldHasPartnership).sendKeys(option);
		writeLog("Set partnership: " + option);
	}

	public void setPropertyIncome(String option){
		driver.findElement(wf22_01_FieldHasProperty).sendKeys(option);
		writeLog("Set property income: " + option);
	}
	
	public void setForeignIncome(String option){
		driver.findElement(wf22_01_FieldHasForeignIncome).sendKeys(option);
		writeLog("Set foreign income: " + option);
	}

	public void setCapitalGains(String option){
		driver.findElement(wf22_01_FieldHasCapitalGains).sendKeys(option);
		writeLog("Set Capital Gains: " + option);
	}
	
	public TailorYourReturnPage2 clickNext() {
		super.clickNext();
		return new TailorYourReturnPage2(driver);
	}

}
