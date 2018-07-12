package pages.registerforhmrctaxes.payeforemployers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class PayeCorresondenceDetailsPage extends BasePage{
	
	public static By FieldcorrName = By.id("FieldcorrName");
	public static By FieldcorrPhone = By.id("FieldcorrPhone");
	public static By FieldcorrMobile = By.id("FieldcorrName");
	public static By FieldcorrEmail = By.id("FieldcorrEmail");
	public static By FieldconfCorrEmail = By.id("FieldconfCorrEmail");
	
	public PayeCorresondenceDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Correspondence details";
		this.expectedHeading = "Employing people";
		this.expectedSubHeading = "PAYE correspondence details";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public PayeCorrespondenceAddresssPage clickNextGoToPayeCorrespondenceAddresssPage() {
		driver.findElement(locators.Common.Next_Button).click();
		return new PayeCorrespondenceAddresssPage(driver);
	}

}
