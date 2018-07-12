package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class EmployeeActionsPage extends BasePage{
	
	public static By usernameSubHeading = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/h2");
	public static By expensesAndBenefits = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/a");
	public static By companyCarDetails = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[3]/td[2]/a");
	public static By maintainEmployeeDetails = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[1]/a");
	public static By deleteEmployeeFromList = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[2]/a");
	public static By viewOrPrintSubmittedForms = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[3]/a");
	public static By goToEmployeeList = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[4]/a");
	public static By LinkNavbarEmployerActionsExBen = By.id("LinkNavbarEmployerActionsExBen");
	public static By LinkNavbarEmployerViewPrintStoreSubmittedForms = By.id("LinkNavbarEmployerViewPrintStoreSubmittedForms");
	public static By firstEmployeeStatusP9d = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[2]/td[3]/text()");
	public static By firstEmployeeStatusP46 = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[3]/td[3]/text()");
	
	public EmployeeActionsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Employee actions";
		this.expectedHeading = "Employee actions";
		super.assertTitle().assertHeading();
	}

	public P9dSelectExpensesAndBenefitsPage clickNextGoToP9dSelectExpensesAndBenefits() {
		super.clickNext();
		return new P9dSelectExpensesAndBenefitsPage(driver) ;
	}

	public P46CarIntroductionPage clickCompanyCarDetailsGoToEmployeeActionsPage() {
		super.clickElement(pages.paye.EmployeeActionsPage.companyCarDetails);
		return new P46CarIntroductionPage(driver);
	}

	public ExpensesAndBenefitsPage clickExpensesAndBenefitsGoToExpensesAndBenefits() {
		super.clickElement(pages.paye.EmployeeActionsPage.LinkNavbarEmployerActionsExBen);
		return new ExpensesAndBenefitsPage(driver);
	}

	public ViewPrintStoreSubmittedFormPage viewPrintStoreSubmittedFormsPage() {
		super.clickElement(pages.paye.EmployeeActionsPage.LinkNavbarEmployerViewPrintStoreSubmittedForms);
		return new ViewPrintStoreSubmittedFormPage(driver);
	}

	public P11dOrP9dExpensesAndBenefitsPage clickExpensesAndBenefitsGoToP11dOrP9dExpensesAndBenefitsPage() {
		super.clickElement(pages.paye.EmployeeActionsPage.expensesAndBenefits);
		return new P11dOrP9dExpensesAndBenefitsPage(driver);
	}

}
