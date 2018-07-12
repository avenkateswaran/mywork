package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypeOfTaxPage extends BasePage{
	
	public static By addTaxCt = By.id("add-tax-ct");
	public static By addTaxSa = By.id("add-tax-sa");
	public static By addTaxEmployer = By.id("add-tax-employer");
	public static By addTaxVat = By.id("add-tax-vat");
	public static By addTaxOther = By.id("add-tax-other");

	public TypeOfTaxPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public SelectCategoryPage selectOtherTaxOrSchemes(){
		driver.findElement(addTaxOther).click();
		writeLog("Click Other taxes or schemes radio button");
		clickContinue();
		return new SelectCategoryPage(driver);
	}
}
