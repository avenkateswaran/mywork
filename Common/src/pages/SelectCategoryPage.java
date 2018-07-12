package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.AutomaticExchangeOfInformation.AlreadyRegisteredForAEOI;

public class SelectCategoryPage extends BasePage{
	
	public static By addAlcohol = By.id("add-alcohol");
	public static By addAeoi = By.id("add-aeoi");
	public static By addCharities = By.id("add-charities");
	public static By addGambling = By.id("add-gambling");
	public static By moreTaxesDetail = By.id("more-taxes-detail");
	public static By addLand = By.id("add-land");
	public static By addImport = By.id("add-import");
	public static By addOil = By.id("add-oil");
	

	public SelectCategoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AlreadyRegisteredForAEOI selectAEOI(){
		driver.findElement(addAeoi).click();
		writeLog("Click AEOI");
		clickContinue();
		return new AlreadyRegisteredForAEOI(driver);
	}

}
