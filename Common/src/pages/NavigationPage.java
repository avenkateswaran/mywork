package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.registerforhmrctaxes.LogoutPage;

public class NavigationPage {

	public final WebDriver driver;

	public By homePageLinkLocator = By.linkText("Home");

	public NavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	public pages.YourHMRCServicesPage HomePage() {
		driver.findElement(homePageLinkLocator).click();
		return new pages.YourHMRCServicesPage(driver);
	}

	public String getLoggedInUserName() {
		return driver.findElement(locators.Common.logginedInUser).getText();
	}

	public pages.registerforhmrctaxes.LogoutPage LogOut() {
		driver.findElement(locators.Common.LogOut).click();
		return new LogoutPage(driver);
	}

}