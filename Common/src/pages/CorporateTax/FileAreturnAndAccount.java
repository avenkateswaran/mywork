package pages.CorporateTax;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class FileAreturnAndAccount extends BasePage {

	public FileAreturnAndAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public FileAreturnAndAccount clickFileAReturnAndAccountsNext(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		this.expectedSubHeading = "Who can use the service?";
		super.assertSubHeading();
		super.assertHeading();
		return this;
		}
	
	public SelectAnAccountingPeriod clickSelectAnAccountingNext(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		this.expectedSubHeading = "Select an Accounting Period ";
		super.assertSubHeading();
		super.assertHeading();
		return new SelectAnAccountingPeriod (driver);
		}
	
	public DownloadCtForm clickDownloadReturn(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		//this.expectedSubHeading = "Select an Accounting Period ";
		//super.assertSubHeading();
		super.assertHeading();
		return new DownloadCtForm (driver);
		}
}


