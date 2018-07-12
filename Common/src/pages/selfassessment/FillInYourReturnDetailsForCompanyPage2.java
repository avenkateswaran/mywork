package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnDetailsForCompanyPage2 extends BasePage{

	public static By wf32_02_FieldBusinessName = By.id("wf32_02_FieldBusinessName");
	public static By wf32_02_FieldBusinessDescription = By.id("wf32_02_FieldBusinessDescription");
	public static By wf32_02_FieldBusinessPostCode = By.id("wf32_02_FieldBusinessPostCode");
	public static By wf32_02_FieldBusinessAddressChanged = By.id("wf32_02_FieldBusinessAddressChanged");
	public static By wf32_02_FieldBusinessStartDate = By.id("wf32_02_FieldBusinessStartDate");
	public static By wf32_02_FieldCeasedTradingDate = By.id("wf32_02_FieldCeasedTradingDate");
	public static By wf32_02_LinkDeleteBusiness = By.id("wf32_02_LinkDeleteBusiness");

	public FillInYourReturnDetailsForCompanyPage2(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Details (Page 2 of 2)";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnAccountingDetailsPage clickNextGoToFillInYourReturnAccountingDetailsPage() {
		super.clickNext();
		return new FillInYourReturnAccountingDetailsPage(driver);
	}

}
