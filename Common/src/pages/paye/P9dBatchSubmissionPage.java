package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityCheckPage;

public class P9dBatchSubmissionPage extends BasePage{
	
	public static By printBeforeSubmission = By.linkText("print before submission");

	public P9dBatchSubmissionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D Batch - Submission";
		this.expectedHeading = "P9D Batch - Submission";
		super.assertTitle().assertHeading();
	}

	public SecurityCheckPage clickNextGoToSecurityCheckPage() {
		super.clickNext();
		return new SecurityCheckPage(driver);
	}

}
