package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;


public class SelectAnAccountingPeriod extends BasePage {

	public SelectAnAccountingPeriod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public  By Date1 = By.id("FieldCTReturn1");
	
		
	public SelectAnAccountingPeriod clickAccountingPeriodDatesNext(){
			super.clickNext();
			super.expectedHeading = "File a return and accounts";
			super.expectedSubHeading = "Accounting Period dates";
			super.assertSubHeading();
			super.assertHeading();
			return this;
			}

}
