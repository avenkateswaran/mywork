package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourHMRCServicesPage extends BasePage {

	public final WebDriver driver;

	public static By viewAllCommunications = By.id("viewAllCommunications");
	public static By linkRegisterHMRCTaxes = By.id("linkRegisterHMRCTaxes");
	public static By LinkDelegateAccessToRegistration = By.id("LinkDelegateAccessToRegistration");
	public static By linkservicesYouCanEnrol = By.id("linkservicesYouCanEnrol");
	public static By linkServicesYouCanUse = By.id("linkServicesYouCanUse");
	public static By linkOtherServices = By.id("linkOtherServices");

	public YourHMRCServicesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "HMRC: Your HMRC services";
		this.expectedHeading = "Your HMRC services";
		super.assertTitle().assertHeading();
	}

	public pages.registerforhmrctaxes.HomePage clickRegister() {
		driver.findElement(linkRegisterHMRCTaxes).click();
		return new pages.registerforhmrctaxes.HomePage(driver);
	}

	public ServicesYouCanUsePage activateAccessOnlineServices() {
		writeLog("click activate or access online services");
		screenShot(driver);
		driver.findElement(linkServicesYouCanUse).click();
		return new pages.ServicesYouCanUsePage(driver);
	}

	public pages.registerforhmrctaxes.HomePage clickEnrol() {
		driver.findElement(linkservicesYouCanEnrol).click();
		return new pages.registerforhmrctaxes.HomePage(driver);
	}

	public YourHMRCServicesPage clickServicesYouCanUse() {
		driver.findElement(linkServicesYouCanUse).click();
		this.expectedHeading = "Services you can use";
		super.assertHeading();
		return this;
	}
}
