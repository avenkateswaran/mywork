package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class EmployeeListPage extends BasePage{
	
	public static By addEmployee = By.linkText("Add Employee");
	public static By firstEmployee = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/table/tbody/tr/td[1]/a");
	
	
	public EmployeeListPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Employee list";
		this.expectedHeading = "Employee list";
		super.assertTitle().assertHeading();
	}

	public AddEmployeePage clickAddEmployeeGoToAddEmployeePage() {
		super.clickElement(pages.paye.EmployeeListPage.addEmployee);
		return new AddEmployeePage(driver);
	}

	public EmployeeActionsPage clickFirstEmployeeGoToEmployeeActionsPage() {
		super.clickElement(pages.paye.EmployeeListPage.firstEmployee);
		return new EmployeeActionsPage(driver);
	}

}
