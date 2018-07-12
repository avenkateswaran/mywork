package pages.paye;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P9dBatchIntroductionPage extends BasePage{

	public P9dBatchIntroductionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D Batch - Introduction";
		this.expectedHeading = "P9D Batch - Introduction";
		super.assertTitle().assertHeading();
	}

	public P9dBatchEmployeesPage clickNextGoToP9dBatchEmployeesPage() {
		super.clickNext();
		return new P9dBatchEmployeesPage(driver);
	}

}
