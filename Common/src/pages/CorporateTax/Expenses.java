package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class Expenses extends BasePage {
	
	public final WebDriver driver;
	public static By ContinueButton  = By.id("submit");// Id for save and continue button
	public static By DirectorsPension  = By.id("directorsPension"); // Id for Directors pension text field
	public static By DirectorsRremuneration  = By.id("directorsRenumeration"); // Id for Directors pension text field
	public String PC  = ("Property costs"); 
	public String GA  = ("General administrative expenses");
	public static By Salary  = By.id("salariesAndWages"); // Id for salary pension text field
	public static By SubCon  = By.id("subcontractorsPayments"); // Id for Sub contractors text field
	public static By Audit  = By.id("accountancyAndAuditCharges"); // Id for audit  text field
	public static By conCharg  = By.id("consultancyCharges"); // Id for consultancy charge text field
	public static By Legal  = By.id("legalAndProfessionalCharges"); // Id forLegal text field
	public static By lHp  = By.id("lightHeatAndPower"); // Id for Light heat and power text field
	public static By RentandRate  = By.id("lightHeatAndPower");
	public static By RepairsRenewals  = By.id("lightHeatAndPower");
	public static By Promo  = By.id("advertisingAndPromotions"); // If for Adver and promo text box
	public static By BadDebts  = By.id("badDebts");
	public static By financeCharge  = By.id("bankCreditCardAndOtherCharges");
	public static By Depreciation  = By.id("depreciation");
	public static By Donations  = By.id("donations");
	public static By Entertaining  = By.id("entertaining");
	public static By Insurance  = By.id("insurance");
	public static By interestPaid  = By.id("interestPaid");
	public static By Diposal  = By.id("profitsLossesOnDisposalOfAssets");
	public static By Travel  = By.id("travelAndSubsistence");
	public static By vehicleExpenses  = By.id("vehicleExpenses");
	public static By Admin  = By.id("administrationAndOfficeExpenses");
	public static By Expenses  = By.id("sundryExpenses");
	
	public Expenses(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Computations - Expenses - Directors, employees and subcontractor costs";
		this.expectedHeading = "Expenses";
		super.assertTitle().assertHeading();
	}
	
	public Expenses clickNext(){
	writeLog("Click Continue");
	screenShot(driver);
	driver.findElement(ContinueButton).click();
	return this;
}
		public DetailedProfitAndLoss clickNextPage(){
			writeLog("Click Continue");
			screenShot(driver);
			driver.findElement(ContinueButton).click();
			return  new DetailedProfitAndLoss (driver);
	}
}


