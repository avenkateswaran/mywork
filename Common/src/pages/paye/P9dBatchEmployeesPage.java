package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P9dBatchEmployeesPage extends BasePage{
	
	public static By addEmployee = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/form/p[2]/a");
	public static By totalBenefits = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/form/table/tbody/tr[2]/td");

	public P9dBatchEmployeesPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D Batch - Employees";
		this.expectedHeading = "P9D Batch - Employees";
		super.assertTitle().assertHeading();
	}

	public P9dBatchSubmissionPage clickNextGoToP9dBatchSubmissionPage() {
		super.clickNext();
		return new P9dBatchSubmissionPage(driver);
	}
}

