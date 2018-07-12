package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnClass4NICsPage extends BasePage{
	
	public static By wf32_10_FieldIsExemptClass4Nic = By.id("wf32_10_FieldIsExemptClass4Nic");
	public static By wf32_10_LinkDeleteBusiness = By.id("wf32_10_LinkDeleteBusiness");

	public FillInYourReturnClass4NICsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Class 4 NICs";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnAnyOtherInfoPage clickNextGoToFillInYourReturnAnyOtherInfoPage() {
		super.clickNext();
		return new FillInYourReturnAnyOtherInfoPage(driver);
	}

}
