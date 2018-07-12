package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnClass2NICsPage extends BasePage{
	
	public static By class2NicAmount = By.id("class2NicAmount");
	public static By wf38_01_LinkChangeDates = By.id("wf38_01_LinkChangeDates");
	public static By ButtonRefreshClass2Nic = By.id("ButtonRefreshClass2Nic");
	public static By wf38_01_FieldChooseToPayClass2Voluntarily = By.id("wf38_01_FieldChooseToPayClass2Voluntarily");

	public FillInYourReturnClass2NICsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Class 2 National Insurance Contributions";
		this.expectedHeading = "4. Fill in your return";
		this.expectedSubHeading = "Class 2 National Insurance Contributions";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	
public FillInYourReturnUnderpaidTaxPage clickNextGoToFillInYourReturnPage() {
		super.clickNext();
		return new FillInYourReturnUnderpaidTaxPage(driver);
	}

}
