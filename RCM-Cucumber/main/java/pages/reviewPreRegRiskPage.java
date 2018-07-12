package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;

public class reviewPreRegRiskPage extends BasePage {

	public reviewPreRegRiskPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Declarations
	
	//PreReg Risk
	@FindBy(partialLinkText="Review Pre-Reg")
	private WebElement lnkPreRegRisk;
	
	
	//Review Completed
	@FindBy(id="PreRegRiskReviewComplete")
	private WebElement chkReviewCompleted;
	
	//methods
	
	public void reviewPreRegRisk() {
		
		//click on the Review Pre Reg link
		lnkPreRegRisk.click();
		
		//Select the review completed check box
		chkReviewCompleted.click();
		
		
	}
	
	

}
