package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;

public class completeFandPPage extends BasePage {

	public completeFandPPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Declaration
	
	//F and P link
	@FindBy(partialLinkText="Complete Admin Checks")
	private WebElement lnkCompleteAdminChecks;
	
	//FD Data gathering 
	@FindBy(id="FPDataGatheringCheckComplete")
	private WebElement dataGatheringCheck;
	
	//Documents uploaded
	@FindBy(id="FPDataGatheringDocsUpload")
	private WebElement documentsUpload;
	
	
	//Methods
	public void completeFandP() {
		
		//click on the link
		lnkCompleteAdminChecks.click();
		
		// click on the data gathering check box
		dataGatheringCheck.click();
		
		//click on the document loading check box.
		documentsUpload.click();
	}
}
