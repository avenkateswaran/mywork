package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ServiceYouCanUse extends BasePage {

	public static By CorporationTax = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[2]/h3/a");
	public static By AccessServiceCorporationTax = By.xpath("//*[@id='top']/div[3]/div[2]/div/div/ul/li[2]/ul/li/a");

	public ServiceYouCanUse(WebDriver driver) {
		super(driver);
	}

	public ServiceYouCanUse clickServicesYouCanUse() {
		driver.findElement(CorporationTax).click();
		this.expectedHeading = "At a glance";
		super.assertHeading();
		return this;
	}

}
