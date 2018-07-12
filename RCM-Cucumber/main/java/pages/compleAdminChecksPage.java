package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;
import resources.utilities;

public class compleAdminChecksPage extends BasePage {

	public compleAdminChecksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//create an instance for utilities
	
	utilities util=new utilities();
	
	
	//Declarations
	
	// complete admin checks
	@FindBy(partialLinkText="Complete Admin Checks")
	private WebElement lnkCompleteadminChecks;
	
	//Admin notes
	@FindBy(id="AdminNote")
	private WebElement txtAdminNotes;
	
	//Channel
	@FindBy(id="Channel")
	private WebElement dropdownChannel;
	
	//Type of Action
	@FindBy(id="TypeOfAction")
	private WebElement dropdownTypeOfAction;
	
	//Action Notes
	@FindBy(id="ActionNote")
	private WebElement txtActionNote;
	
		
	
	
	
	//methods
	
	public void completeAdminChecks(String adminNotes,String channelNotes,String type,String actionNotes) {
		
		//click on the complete admin checks link
		lnkCompleteadminChecks.click();
		
		//Enter admin notes
		txtAdminNotes.sendKeys(adminNotes);
		
		
		//select channel
		util.selectfromdropdown(dropdownChannel, channelNotes);
		
		
		//Select Type
		util.selectfromdropdown(dropdownTypeOfAction, type);
		
		//Enter action notes
		txtActionNote.sendKeys(actionNotes);
		
		
		
		
		
	}

}
