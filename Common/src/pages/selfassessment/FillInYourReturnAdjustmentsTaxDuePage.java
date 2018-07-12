package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnAdjustmentsTaxDuePage extends BasePage{
	
	public static By wf40_23_FieldIncreaseInTaxDue = By.id("wf40_23_FieldIncreaseInTaxDue");
	public static By wf40_23_FieldDecreaseInTaxDue = By.id("wf40_23_FieldDecreaseInTaxDue");
	public static By wf40_23_FieldRepaymentToBeClaimedNow = By.id("wf40_23_FieldRepaymentToBeClaimedNow");

	public FillInYourReturnAdjustmentsTaxDuePage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - Adjustments to tax due";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "Adjustments to tax due";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setFieldIncrease(String option){
		driver.findElement(wf40_23_FieldIncreaseInTaxDue).sendKeys(option);
		writeLog("Set Field Increase: " + option);
	}
	
	public void setFieldDecrease(String option){
		driver.findElement(wf40_23_FieldDecreaseInTaxDue).sendKeys(option);
		writeLog("Set Field Decrease: " + option);
	}
	public void setRepayment(String option){
		driver.findElement(wf40_23_FieldRepaymentToBeClaimedNow).sendKeys(option);
		writeLog("Set Repayment: " + option);
	}

	public FillInYourReturnAnyOtherInfoPage1 clickNext() {
		super.clickNext();
		return new FillInYourReturnAnyOtherInfoPage1(driver);
	}

}
