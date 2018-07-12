package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P9dExpensesPage extends BasePage{
	
		public static By FieldexpensesPayments = By.id("FieldexpensesPayments");

	public P9dExpensesPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D - Expenses";
		this.expectedHeading = "P9D - Expenses";
		super.assertTitle().assertHeading();
	}

	public P9dNextStepsPage clickNextGoToP9dNextStepsPage() {
		super.clickNext();
		return new P9dNextStepsPage(driver);
	}

}
