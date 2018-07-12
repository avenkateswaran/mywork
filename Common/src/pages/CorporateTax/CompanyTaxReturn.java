package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class CompanyTaxReturn extends BasePage {
	
	public final WebDriver driver;
	public String S1 = "About your return";
	public String S2 = "Tax already paid";
	public String S3 = "Calculations";
	public String S4 = "Repayments";
	public String S5 = "About your return";
	public String AQuestion1 = "Are you owed a repayment for this period?";
	public String AQuestion2 = "Are you owed a repayment for an earlier period?";
	public String AQuestion3 = "Are any of your figures estimated?";
	public String AQuestion4 = "Did you receive any franked investment income?";
	public String tQuestion1 = "Income tax deducted from gross income included in profits";
	public String tQuestion2 = "Tax already paid (not including anything you've overpaid and been paid back)";
	public String rQuestion = "If you're owed a repayment because you've paid too much tax for this period, what do you want HM Revenue and Customs to do?";
	public String nQuestion = "Who do you want the repayment to go to?";
	public String nQuestion1 = "Details of the person to be paid";
	public String nQuestion2 = "Bank details of the person to be paid";
	public String nQuestion3 = "Your company bank details";
	public static By ContinueButton  = By.id("submit");
	public static By yes1  = By.xpath("//*[@id='B40']/label[1]");
	public static By no1  = By.xpath("//*[@id='B40']/label[2]");
	public static By yes2  = By.xpath("//*[@id='B45Input']/label[1]");
	public static By no2 = By.xpath("//*[@id='B45Input']/label[2]");
	public static By yes3  = By.xpath("//*[@id='B55']/label[1]");
	public static By no3  = By.xpath("//*[@id='B55']/label[2]");
	public static By yes4  = By.xpath("//*[@id='BFQ1']/label[1]");
	public static By no4  = By.xpath("//*[@id='BFQ1']/label[2]");
	public static By t1 = By.id("B515");
	public static By t2 = By.id("B595");	
	public static By r1 = By.xpath("//*[@id='REPAYMENTSQ1']/label[1]");
	public static By r2 = By.xpath("//*[@id='REPAYMENTSQ1']/label[2]");
	public static By payee1 = By.xpath("//*[@id='PAYEEQ1']/label[1]");
	public static By payee2 = By.xpath("//*[@id='PAYEEQ1']/label[2]");
	public static By PayeeName = By.id("B955");
	public static By PayeeBuilding = By.id("B960_1");
	public static By PayeeTown = By.id("B960_2");
	public static By PayeeCounty = By.id("B960_3");
	public static By PayeePostcode = By.id("B960_5");
	public static By PayeePaymentRef = By.id("B965");
	public static By PayeeBank = By.id("B920");
	public static By PayeeSortCode = By.id("B925");
	public static By PayeeAccNum = By.id("B930");
	public static By PayeeAccNam = By.id("B935");
	public static By PayeeReferencenum = By.id("B940");
	
	public CompanyTaxReturn(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "File your Company Accounts and Tax Online";
		this.expectedHeading = "Company Tax Return (CT600)";
		super.assertTitle().assertHeading();
	}
	public CompanyTaxReturn Q1( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes1).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no1).click();}
		return  this;
	}
	public CompanyTaxReturn Q2( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes2).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no2).click();}
		return  this;
	}
	public CompanyTaxReturn Q3( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes3).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no3).click();}
		return  this;
	}
	public CompanyTaxReturn Q4( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes4).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no4).click();}
		return  this;
	}	
	public CompanyTaxReturn repayments( String Answer){
		if (Answer.toLowerCase().contains("yes")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(yes4).click();}
		
		if (Answer.toLowerCase() .contains("no")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(no4).click();}
		return  this;
	}
	public CompanyTaxReturn clickContinue(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  this;
	}
	public CompanyTaxReturn RepaymentRadio( String Answer){
		if (Answer.toLowerCase().contains("send")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(r1).click();}
		
		if (Answer.toLowerCase() .contains("keep")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(r2).click();}
		return  this;
	}
	public CompanyTaxReturn Nominee( String Answer){
		if (Answer.toLowerCase().contains("company")){
		writeLog("Click yes button");
		screenShot(driver);
		driver.findElement(payee1).click();}
		
		if (Answer.toLowerCase() .contains("someone")){
			writeLog("Click No button ");
			screenShot(driver);
			driver.findElement(payee2).click();}
		return  this;
	}
	public CompayTaxReturnSummary clickNextPage(){
	writeLog("Click Continue");
	screenShot(driver);
	driver.findElement(ContinueButton).click();
	return  new CompayTaxReturnSummary (driver);
}
}


