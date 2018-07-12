package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P46BatchEmployeesPage extends BasePage{
	
	public static By addEmployee = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/p[2]/a");
	public static By formType = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/form/table/tbody/tr/td[4]");

	public P46BatchEmployeesPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P46(Car) batch - Employees";
		this.expectedHeading = "P46(Car) batch - Employees";
		super.assertTitle().assertHeading();
	}

	public P46BatchSubmissionPage clickNextGoToP46BatchSubmissionPage() {
		super.clickNext();
		return new P46BatchSubmissionPage(driver);
	}
	
	

}
