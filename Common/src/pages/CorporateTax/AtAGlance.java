package pages.CorporateTax;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AtAGlance extends BasePage{

	public AtAGlance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static By FileAReturnAndAccounts  = By.id ("LinkCT600FileAReturn");
	public static By ImportantChanges  = By.id ("BudgetInfo");
	public List<String> AtAGlaceOptions =  Arrays.asList("View account", "File a return and accounts", "How to pay");
	
	public AtAGlance clickFileAReturnAndAccounts(){
		driver.findElement(FileAReturnAndAccounts).click();
		super.assertElementIsDisplayed(ImportantChanges);
		return this;
		}
	
	public AtAGlance clickImportantChangesNext(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		this.expectedSubHeading = "Joint filing service";
		super.assertSubHeading();
		super.assertHeading();
		return this;
		}
	
	
}
