package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganisationServicesPage extends BasePage {

	private By corpTax = By.linkText("Corporation Tax (CT)");
	
	public OrganisationServicesPage(WebDriver driver) {
		super(driver);
	}
	
	public RegisterForCorporationTax registerForCorporationTax(){
		driver.findElement(corpTax).click();
		return new RegisterForCorporationTax(driver);
	}
	

}
