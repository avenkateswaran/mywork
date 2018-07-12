package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P9dNextStepsPage extends BasePage{
	
	public static By FieldselectOneOption1 = By.id("FieldselectOneOption1");
	public static By FieldselectOneOption2 = By.id("FieldselectOneOption2");
	public static By FieldselectOneOption3 = By.id("FieldselectOneOption3");

	public P9dNextStepsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D - Next steps";
		this.expectedHeading = "P9D - Next steps";
		super.assertTitle().assertHeading();
	}

	public EmployeeActionsPage clickNextGoToEmployeeActionsPage() {
		super.clickNext();
		return new EmployeeActionsPage(driver);
	}

}
