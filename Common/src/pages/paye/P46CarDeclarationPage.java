package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P46CarDeclarationPage extends BasePage{
	
	public static By Fielddeclaration1 = By.id("Fielddeclaration1");
	public static By FieldselectOneOption1 = By.id("FieldselectOneOption1");
	public static By FieldselectOneOption2 = By.id("FieldselectOneOption2");
	public static By FieldselectOneOption3 = By.id("FieldselectOneOption3");

	public P46CarDeclarationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P46(Car) - Declaration";
		this.expectedHeading = "P46(Car) - Declaration";
		super.assertTitle().assertHeading();
	}

	public EmployeeActionsPage clickNextGoToEmployeeActionsPage() {
		super.clickNext();
		return new EmployeeActionsPage(driver);
	}

}
