package pages.CorporateTax;
import org.openqa.selenium.WebDriver;

import locators.Common;
import pages.BasePage;

public class DownloadCtForm extends BasePage{

	public DownloadCtForm(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public DownloadCtForm clickDownload(){
		writeLog("click Download");
		driver.findElement(Common.Downlaod).click();
		return this;
	}
	

	public DownloadCtForm clickFileAReturnAndAccounts(){
		super.clickNext();
		this.expectedHeading = "File a return and accounts";
		super.assertHeading();
		return this;
		}

}
