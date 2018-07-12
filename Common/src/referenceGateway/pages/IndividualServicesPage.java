package referenceGateway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndividualServicesPage extends BasePage{
	
	private By sa = By.linkText("Self Assessment (SA)");
	
	public IndividualServicesPage(WebDriver driver) {
		super(driver);
	}
	
	public RegisterForIndividualTax registerForIndividualTax(){
		driver.findElement(sa).click();
		return new RegisterForIndividualTax(driver);
	}

}
