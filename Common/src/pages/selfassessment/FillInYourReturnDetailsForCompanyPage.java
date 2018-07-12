package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnDetailsForCompanyPage extends BasePage{
	
	public static By wf31_01_FieldAnnualTurnOverGreaterThan = By.id("wf31_01_FieldAnnualTurnOverGreaterThan");
	public static By wf31_01_FieldFosterOrPlacementCarer = By.id("wf31_01_FieldFosterOrPlacementCarer");
	public static By wf31_01_FieldMakeAdjustmentsToProfitsChargeableToClass4NICs = By.id("wf31_01_FieldMakeAdjustmentsToProfitsChargeableToClass4NICs");
	public static By wf31_01_FieldToClaimAveraging = By.id("wf31_01_FieldToClaimAveraging");
	public static By wf31_01_FieldPracticingBarrister = By.id("wf31_01_FieldPracticingBarrister");
	public static By wf31_01_FieldChangeAccountDate = By.id("wf31_01_FieldChangeAccountDate");
	public static By wf31_01_FieldResultsOfAccount = By.id("wf31_01_FieldResultsOfAccount");
	public static By wf31_01_FieldBasisPeriod = By.id("wf31_01_FieldBasisPeriod");
	public static By wf31_01_FieldServices = By.id("wf31_01_FieldServices");
	public static By wf31_01_FieldBusinessOnBoard = By.id("wf31_01_FieldBusinessOnBoard");
	public static By wf31_01_FieldBusinessAllowance = By.id("wf31_01_FieldBusinessAllowance");
	public static By wf31_01_FieldOverLapRelief = By.id("wf31_01_FieldOverLapRelief");
	public static By wf31_01_FieldNone = By.id("wf31_01_FieldNone");
	public static By wf31_01_LinkDeleteEmployer = By.id("wf31_01_LinkDeleteEmployer");
			
	public FillInYourReturnDetailsForCompanyPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Details (Page 1 of 2)";
//		this.expectedHeading = "4. Fill in your return";
//		super.assertTitle().assertHeading();
	}

	public FillInYourReturnDetailsForCompanyPage2 clickNextGoToFillInYourReturnDetailsForCompanyPage2() {
		super.clickNext();
		return new FillInYourReturnDetailsForCompanyPage2(driver);
	}

}
