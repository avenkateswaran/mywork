package pages.submitVATreturns;

import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityMessagePage;

public class AcceptTCPage extends BasePage{

	public AcceptTCPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Accept Terms and Conditions";
		this.expectedHeading = "Accept Terms and Conditions";
		super.assertTitle().assertHeading();
	}
	
	public AcceptTCPage clickNext() {
		super.clickNext();
		return new AcceptTCPage(driver);
	}
	

	public SecurityMessagePage clickAcceptTCheckbox() {
		super.clickNext();
		return new SecurityMessagePage(driver);
	}
	
	public SecurityMessagePage clickSubmit() {
		super.clickSubmit();
		return new SecurityMessagePage(driver);
	}
	

}
