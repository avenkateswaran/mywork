package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P46BatchSubmissionPage extends BasePage{
	
	public static By printBeforeSubmission = By.linkText("print before submission");

	public P46BatchSubmissionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P46(Car) batch - Submission";
		this.expectedHeading = "P46(Car) batch - Submission";
		super.assertTitle().assertHeading();
	}

}
