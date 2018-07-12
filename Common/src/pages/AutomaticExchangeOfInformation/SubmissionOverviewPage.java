package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityCheckPage;

public class SubmissionOverviewPage extends BasePage{
	
	public static By fielddeclareSignUpInformation = By.id("FielddeclareSignUpInformation");

	public SubmissionOverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SecurityCheckPage confirmDeclaration(){
		driver.findElement(fielddeclareSignUpInformation).click();
		writeLog("Set Declaration checkbox");
		super.clickNext();
		return new SecurityCheckPage(driver);
	}

}
