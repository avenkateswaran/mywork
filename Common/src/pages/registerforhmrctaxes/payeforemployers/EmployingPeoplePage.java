package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class EmployingPeoplePage extends BasePage{
	
	public static By FieldfirstPayDateOrBenefitsDate = By.id("FieldfirstPayDateOrBenefitsDate");
	public static By FieldnoEmployeesThisYear = By.id("FieldnoEmployeesThisYear");
	public static By FieldengagingSubcontractors = By.id("FieldengagingSubcontractors");
	public static By FieldpayeScheme0 = By.id("FieldpayeScheme0");
	public static By FieldpayeScheme1 = By.id("FieldpayeScheme1");
	public static By FieldpayeScheme2 = By.id("FieldpayeScheme2");
	public static By FieldpayeScheme3 = By.id("FieldpayeScheme3");
	public static By FieldpayeScheme4 = By.id("FieldpayeScheme4");
	public static By FieldpayeScheme5 = By.id("FieldpayeScheme5");

	public EmployingPeoplePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Employing staff and engaging subcontractors";
		this.expectedHeading = "Employing people";
		this.expectedSubHeading = "Employing staff and engaging subcontractors";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public PayeCorresondenceDetailsPage clickNextGoToPayeCorrespondenceDetailsPage() {
		driver.findElement(locators.Common.Next_Button).click();
		return new PayeCorresondenceDetailsPage(driver);
	}

}
