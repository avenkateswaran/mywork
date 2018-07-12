package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SubmissionConfirmationPage extends BasePage{
	
	public static By viewPrintStoreSubmittedForms = By.linkText("View, print & store submitted forms");
	public static By customerFeedback = By.linkText("Customer Feedback");
	

	public SubmissionConfirmationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Submission confirmation";
		this.expectedHeading = "Submission confirmation";
		//super.assertTitle().assertHeading();
	}


	public EmployeeListPage clickNextGoToEmployeeListPage() {
		super.clickNext();
		return null;
	}

}
