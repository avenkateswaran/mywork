package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RejectedFormsPage extends BasePage{
	
	public static By employeeList = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/p[5]/a");

	public RejectedFormsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Rejected forms";
		this.expectedHeading = "Rejected forms";
		super.assertTitle().assertHeading();
	}

	public EmployeeListPage clickEmployeeListGoToEmployeeListPage() {
		super.clickElement(pages.paye.RejectedFormsPage.employeeList);
		return new EmployeeListPage(driver);
	}
	
}