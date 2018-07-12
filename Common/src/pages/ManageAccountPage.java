package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageAccountPage extends BasePage {
	
	public static By taxesAndDuties = By.id("taxes-and-duties");
	public static By accountUsers = By.xpath("//*[@id='your-account']/details[2]/summary/span");
	public static By accountants = By.id("accountants-title");
	public static By viewAddress = By.id("sa-view-address");
	public static By name = By.id("tab-name");
	public static By phone = By.id("tab-phone");
	public static By email = By.id("tab-email");
	public static By addATax = By.id("add-a-tax");

	public ManageAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public ManageAccountPage clickTaxesAndDuties(){
		driver.findElement(taxesAndDuties).click();
		return this;
	}
		
	public TypeOfTaxPage clickAddATax(){
		clickTaxesAndDuties();
		driver.findElement(addATax).click();
		writeLog("Click Add a tax");
		screenShot(driver);
		return new TypeOfTaxPage(driver);
	}
}
