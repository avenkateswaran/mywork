package pages.AutomaticExchangeOfInformation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.SecurityCheckPage;

public class DeclarationPage extends BasePage {
	
	public  By chkBox0 = By.id("FielddeclareSignUpInformation");

	public DeclarationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public DeclarationPage clickUK(){
		driver.findElement(By.id("FielddeclareSignUpInformation")).click();
		return this;
	}
	
	public SecurityCheckPage clickNextGoToSecurityCheck() {
		clickUK();
		super.clickNext();
		return new SecurityCheckPage(driver);
	}
}
