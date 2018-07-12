package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.RegistrationSummaryPage;

public class EmployingPeopleConfirmationPage extends BasePage{
	
	public static By employingStaffAndEngaging = By.xpath("//dl[@class='read-only-form'][1]/dd[1]");
	public static By numberOfEmployees = By.xpath("//dl[@class='read-only-form'][1]/dd[2]");
	public static By subcontractors = By.xpath("//dl[@class='read-only-form'][1]/dd[3]");
	public static By payeCorrespondenceDetailsCheck1 = By.xpath("//dl[@class='read-only-form'][2]/dd[1]");
	public static By payeCorrespondenceDetailsCheck2 = By.xpath("//dl[@class='read-only-form'][2]/dd[2]");
	public static By payeCorrespondenceDetailsCheck3 = By.xpath("//dl[@class='read-only-form'][2]/dd[3]");
	public static By payeCorrespondenceDetailsCheck4 = By.xpath("//dl[@class='read-only-form'][2]/dd[4]");
	public static By payeCorrespondenceDetailsCheck5 = By.xpath("//dl[@class='read-only-form'][2]/dd[5]");
	public static By payeCorrespondenceDetailsCheck6 = By.xpath("//dl[@class='read-only-form'][2]/dd[6]");
	public static By payeCorrespondenceDetailsCheck7 = By.xpath("//dl[@class='read-only-form'][2]/dd[7]");
	public static By payeCorrespondenceDetailsCheck8 = By.xpath("//dl[@class='read-only-form'][2]/dd[8]");
	public static By payeCorrespondenceDetailsCheck9 = By.xpath("//dl[@class='read-only-form'][2]/dd[9]");
	public static By LinkChangeEmployingStaff = By.id("LinkChangeEmployingStaff");
	public static By LinkChangeCorrespondenceDetails = By.id("LinkChangeCorrespondenceDetails");
	
	

	public EmployingPeopleConfirmationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Confirmation";
		this.expectedHeading = "Employing people";
		this.expectedSubHeading = "Confirmation";
		super.assertTitle().assertHeading().assertSubHeading();
	}



	public RegistrationSummaryPage clickNextGoToRegistrationSummaryPage() {
		super.clickNext();
		return new RegistrationSummaryPage(driver);
	}

}
