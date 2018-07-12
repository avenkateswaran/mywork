package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class RegAeoiPage extends BasePage {
	


	public RegAeoiPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Automatic Exchange of Information registration";
	
		this.expectedHeading = "Automatic Exchange of Information (AEOI) registration";
	}
	public static By LinkRegisterForHMRCTaxes = By.id("linkRegisterHMRCTaxes");
		public By Que1 = By.id("LabelinitialQuestion1");
		public By Que2 = By.id("LabelinitialQuestion2");
		public  By chkBox = By.id("FieldinitialQuestion2");
		
		public RegAeoiPage clickNextGoToWhatYouWillNeed() {
			super.clickNext();
			this.expectedTitle = "HMRC: What you will need";
			this.expectedHeading = "What you will need";
			super.assertHeading();
			return this;
		}
		public RegAeoiPage clickNextGoToRegistrationSummary() {
			super.clickNext();
			this.expectedTitle = "HMRC: Registration summary";
			this.expectedHeading = "Registration summary";
			super.assertHeading();
			super.assertTitle();
			return this;
		}
		public RegAeoiPage clickNextGoToReportingFinancialInstitutionContactDetails() {
			super.clickNext();
			this.expectedTitle = "HMRC: Registration summary";
			this.expectedHeading = "Registration summary";
			//this.expectedSubHeading = "Reporting financial institution - Contact details";
			super.assertHeading();
			super.assertTitle();
			//super.actualSubHeading();
			return this;
		}
		



}	
