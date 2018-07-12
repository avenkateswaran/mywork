package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnNotPaidEnoughTaxPage extends BasePage{
	
	public static By wf40_18_FieldCollectTaxUsingTaxCode = By.id("wf40_18_FieldCollectTaxUsingTaxCode");
	public static By wf40_18_FieldCollectNonPAYETaxUsingTaxCode = By.id("wf40_18_FieldCollectNonPAYETaxUsingTaxCode");

	public FillInYourReturnNotPaidEnoughTaxPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Fill in your return - If you have not paid enough tax";
//		this.expectedHeading = "4. Fill in your return";
//		this.expectedSubHeading = "If you have not paid enough tax";
//		super.assertTitle().assertHeading().assertSubHeading();
	}

	public FillInYourReturnAdjustmentsTaxDuePage clickNext() {
		super.clickNext();
		return new FillInYourReturnAdjustmentsTaxDuePage(driver);
	}

}
