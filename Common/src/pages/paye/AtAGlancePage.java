package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AtAGlancePage extends BasePage{
	
	public static By LinkOnlineServicesHelpdesk  = By.id("LinkOnlineServicesHelpdesk");
	public static By LinkPayeFileReturnsForms  = By.id("LinkPayeFileReturnsForms");
	public static By LinkPayeFilingMoreDetails  = By.id("LinkPayeFilingMoreDetails");
	public static By LinkPayeListThirdPartyVendors  = By.id("LinkPayeListThirdPartyVendors");
	public static By LinkPayeEmployerNotices  = By.id("LinkPayeEmployerNotices");
	public static By LinkPayeGenericNotices  = By.id("LinkPayeGenericNotices");
	public static By LinkRealTimeInformationNotices  = By.id("LinkRealTimeInformationNotices");
	public static By LinkPayeStudentLoanNotices  = By.id("LinkPayeStudentLoanNotices");
	public static By LinkPayeTaxcodeNotices  = By.id("LinkPayeTaxcodeNotices");
	public static By LinkPayeChangeNoticeOptions  = By.id("LinkPayeChangeNoticeOptions");
	public static By LinkPayeGNSChangeNoticeOptions  = By.id("LinkPayeGNSChangeNoticeOptions");
	public static By LinkPayeAddEmailAddress  = By.id("LinkPayeAddEmailAddress");
	public static By LinkPayeAgentAuthorisation  = By.id("LinkPayeAgentAuthorisation");
	public static By LinkSchemeType  = By.id("LinkSchemeType");
	
	public AtAGlancePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: At a glance";
		this.expectedHeading = "At a glance";
		super.assertTitle().assertHeading();
	}
	
	public String getOrgLoggedInName(){
		return driver.findElement(locators.Common.DataOrgName).getText();
	}

	public String getPayeEmployerRefNo() {
		return driver.findElement(locators.Common.DataOrgIdentifier).getText();
	}

	public RejectedFormsPage clickFilePAYEReturnGoToRejectedFormsPage() {
		super.clickElement(pages.paye.AtAGlancePage.LinkPayeFileReturnsForms);
		return new RejectedFormsPage(driver);
	}

	public EmployeeListPage clickFilePAYEReturnGoToEmployeeListPage() {
		driver.findElement(pages.paye.AtAGlancePage.LinkPayeFileReturnsForms).click();
		return new EmployeeListPage(driver);
	}

}
