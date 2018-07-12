package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityCheckPage;

public class SubmitYourReturnDeclarationPage extends BasePage{
	
	public static By wf80_01_FieldDeclaration = By.id("wf80_01_FieldDeclaration");
	
	public SubmitYourReturnDeclarationPage(WebDriver driver) {
		super(driver);
//		this.expectedTitle = "HMRC: Submit your return - Declaration";
//		this.expectedHeading = "8. Submit your return";
//		this.expectedSubHeading = "Declaration";
//		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public void setDeclaration(){
		driver.findElement(wf80_01_FieldDeclaration).click();
		writeLog("Agree Tax Return Declaration: True");
	}

	public SecurityCheckPage clickNextGoToSecurityCheckPage() {
		super.clickNext();
		return new SecurityCheckPage(driver);
	}

}
