package pages.machinegamesduty;

import org.openqa.selenium.WebDriver;

import locators.Common;
import pages.BasePage;

public class AgentDetailsPage extends BasePage {

	public AgentDetailsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AgentDetailsPage clickFindAddress()
	{
		driver.findElement(Common.findAddButton).click();
		return this;
	}
	
	public AgentDetailsPage clickNonUKAddress()
	{
		driver.findElement(Common.fieldNonUKAddbutton).click();
		return this;
	}
}
