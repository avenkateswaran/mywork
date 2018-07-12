package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ExpensesAndBenefitsPage extends BasePage{
	
	public static By p11DbExpensesAndBenefits = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]/a");
	
	public static By p9dExpensesAndBenefits = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[2]/td[2]/a");
	public static By companyCarDetails = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr[3]/td[2]/a");
	//*[@id="top"]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]/a

	public ExpensesAndBenefitsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Expenses & benefits";
		this.expectedHeading = "Expenses & benefits";
		super.assertTitle().assertHeading();
	}

	public P9dBatchIntroductionPage clickP9dExpensesAndBenefitsGoToP9dBatchIntroductionPage() {
		super.clickElement(pages.paye.ExpensesAndBenefitsPage.p9dExpensesAndBenefits);
		return new P9dBatchIntroductionPage(driver);
	}

	public P46BatchEmployeesPage clickCompanyCarDetailsGoToP46BatchEmployeesPage() {
		super.clickElement(pages.paye.ExpensesAndBenefitsPage.companyCarDetails);
		return new P46BatchEmployeesPage(driver);
	}

}
