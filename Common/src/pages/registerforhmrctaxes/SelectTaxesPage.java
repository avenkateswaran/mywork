package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SelectTaxesPage extends BasePage {
	
	//Select taxes
	public static By FieldregisterForServices1 = By.id("FieldregisterForServices1");
	public static By FieldregisterForServices2 = By.id("FieldregisterForServices2");
	public static By FieldregisterForServices3 = By.id("FieldregisterForServices3");
	public static By FieldregisterForServices4 = By.id("FieldregisterForServices4");
	public static By LabelregisterForServices1 = By.id("LabelregisterForServices1");
	public static By LabelregisterForServices2 = By.id("LabelregisterForServices2");
	public static By LabelregisterForServices3 = By.id("LabelregisterForServices3");
	public static By LabelregisterForServices4 = By.id("LabelregisterForServices4");
	public static By FieldconfirmTermsConditions = By.id("FieldconfirmTermsConditions");

	public SelectTaxesPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Select taxes";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "Select taxes";
		super.assertTitle().assertHeading().assertSubHeading();
	}

	public TypeOfBusinessPage clickNext(){
		super.clickNext();
		return new TypeOfBusinessPage(driver);
	}

}
