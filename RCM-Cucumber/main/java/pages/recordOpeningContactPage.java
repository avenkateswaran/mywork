package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;

public class recordOpeningContactPage extends BasePage {

	public recordOpeningContactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Declaration
	@FindBy(partialLinkText="Record Opening Contact")
	private WebElement lnkRecordOpeningContact;
	
	@FindBy(id="IsTaxPayer")
	private WebElement chkCustomerContact;
	
	@FindBy(id="InteractionDate")
	private WebElement txtContactDate;
	
	@FindBy(id="Notes")
	private WebElement txtNotes;
	
	@FindBy(id="IsReplyExpected")
	private WebElement chkIsReplyExpected;
	
	
	//Methods
	public void recordOpeningContact(String IsCustomerContact,String contactDate,String Notes,String IsReplyExpected) {
		
		//click on the Record opening contact
		
		lnkRecordOpeningContact.click();
		
		//Customer contact
		if(IsCustomerContact.contentEquals("Yes")) {
			chkCustomerContact.click();
		}
		
		//Interaction date
		txtContactDate.sendKeys(contactDate);
		
		//Notes
		txtContactDate.sendKeys(Notes);
		
		//Is Reply expected
		if(IsReplyExpected.contentEquals("Yes"))
		chkIsReplyExpected.click();
		
		
	}
}
