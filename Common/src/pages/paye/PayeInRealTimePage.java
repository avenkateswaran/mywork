package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class PayeInRealTimePage extends BasePage{
	
	public static By LinkNavbarEmployeeList = By.id("LinkNavbarEmployeeList");

	public PayeInRealTimePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Real Time Information";
		this.expectedHeading = "PAYE in real time";
		//super.assertTitle().assertHeading();
	}

	public EmployeeListPage clickEmployeeListGoToEmployeeListPage() {
		super.clickElement(pages.paye.PayeInRealTimePage.LinkNavbarEmployeeList);
		return new EmployeeListPage(driver);
	}

}
