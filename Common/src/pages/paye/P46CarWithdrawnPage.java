package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P46CarWithdrawnPage extends BasePage{
	
	public static By FieldDateWithDrawn = By.id("FieldDateWithDrawn");
	public static By FieldWithDrawnCarMakeModel = By.id("FieldWithDrawnCarMakeModel");
	public static By FieldWithDrawEngineSize = By.id("FieldWithDrawEngineSize");

	public P46CarWithdrawnPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P46(Car) - Car withdrawn";
		this.expectedHeading = "P46(Car) - Car withdrawn";
		super.assertTitle().assertHeading();
	}

	public P46CarDeclarationPage clickNextGoToP46DeclarationPage() {
		super.clickNext();
		return new P46CarDeclarationPage(driver);
	}

}
