package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.vatminionestopshop.RegisterVATMiniOneStopShop;

public class HomePage extends BasePage{

	public static By LinkRegisterForHMRCTaxes = By.id("LinkRegisterForHMRCTaxes");
	public static By linkRegisterForMachineGamesDuty = By.id("linkRegisterForMachineGamesDuty");
	public static By linkRegisterForMoss = By.id("linkRegisterForMoss");
	public static By LinkDelegateAccessToRegistration = By.id("LinkDelegateAccessToRegistration");
	public static By LinkRegisterForGTR = By.id("LinkRegisterForGTR");
	public static By linkRegisterFatca = By.id("LinkRegisterFatca");
	public static By linkRegisterForFatca = By.id("linkRegisterForFatca");
	public static By LinkRegisterForQROPS = By.id("LinkRegisterForQROPS");
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "Register for HMRC taxes";
		this.expectedHeading = "Register for HMRC taxes";
		super.assertTitle().assertHeading();
	}
	
	public IntroductionPage registerForHmrcTaxes(){
		driver.findElement(LinkRegisterForHMRCTaxes).click();
		return new IntroductionPage(driver);
	}
	
	public RegisterVATMiniOneStopShop RegisterVATMiniOneStopShop(){
		
		try{
			driver.findElement(linkRegisterForMoss).click();
		}
		catch (NoSuchElementException e) {
			driver.findElement(By.linkText("Continue registration")).click();
			driver.findElement(locators.Common.Delete).click();
			driver.findElement(locators.Common.Delete).click();
		}

		return new RegisterVATMiniOneStopShop(driver);
	}

}
