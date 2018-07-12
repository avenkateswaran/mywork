package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.LogoutPage;

public class ViewPrintStoreSubmittedFormPage extends BasePage{
	
	public static By taxYearChange = By.linkText("Change Tax Year");
	public static By companyCarDetails = By.linkText("Company car details");
	public static By expensesBenefitsBatch = By.linkText("Expenses & benefits batch");

	public ViewPrintStoreSubmittedFormPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - View, print & store submitted forms";
		this.expectedHeading = "View, print & store submitted forms";
		super.assertTitle().assertHeading();
	}

	public LogoutPage clickSignoutGoToLogoutPage() {
		super.clickElement(locators.Common.signOut);
		return new LogoutPage(driver);
	}

}
