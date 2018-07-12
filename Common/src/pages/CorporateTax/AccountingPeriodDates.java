package pages.CorporateTax;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AccountingPeriodDates extends BasePage{

	public AccountingPeriodDates(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AccountingPeriodDates clickAccountingPeriodDatesNext(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		super.assertHeading();
		return this;
		}

}
