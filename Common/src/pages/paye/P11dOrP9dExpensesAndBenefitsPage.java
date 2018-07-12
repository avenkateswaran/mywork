package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P11dOrP9dExpensesAndBenefitsPage extends BasePage {
	
	public static By FieldSelect = By.id("FieldSelect");

	public P11dOrP9dExpensesAndBenefitsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P11D or P9D - Expenses & benefits";
		this.expectedHeading = "P11D or P9D - Expenses & benefits";
		super.assertTitle().assertHeading();
	}

}
