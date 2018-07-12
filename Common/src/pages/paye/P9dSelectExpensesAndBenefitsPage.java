package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P9dSelectExpensesAndBenefitsPage extends BasePage{
	
	public static By FieldSelectExpenseBenefitExpenses = By.id("FieldSelectExpenseBenefitExpenses");
	public static By FieldSelectExpenseBenefitVouchersCreditCard = By.id("FieldSelectExpenseBenefitVouchersCreditCard");
	public static By FieldSelectExpenseBenefitAccomodation = By.id("FieldSelectExpenseBenefitAccomodation");
	public static By FieldSelectExpenseBenefitAnyOtherPaymentOrBenefit = By.id("FieldSelectExpenseBenefitAnyOtherPaymentOrBenefit");

	public P9dSelectExpensesAndBenefitsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P9D - Select expenses & benefits";
		this.expectedHeading = "P9D - Select expenses & benefits";
		super.assertTitle().assertHeading();
	}

	public P9dExpensesPage clickNextGoToP9dExpensesPage() {
		super.clickNext();
		return new P9dExpensesPage(driver);
	}
}
