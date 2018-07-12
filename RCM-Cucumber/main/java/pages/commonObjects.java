package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pages.BasePage;

public class commonObjects extends BasePage{
	public commonObjects(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//Declaration

	//Submit Button
	@FindBy(css="button[data-click*=doFormSubmit]")
	private WebElement btnSubmit;
			
	//Case information tab
	@FindBy(css="a[title=Case Information]")
	private WebElement tabCaseInfo;
	
	//Risk
	@FindBy(css="a[title=Risk]")
	private WebElement tabRiskInfo;
	
	//Application Update
	@FindBy(css="a[title=Application Update]")
	private WebElement tabApplicationUpdateInfo;
	
	//Reports and Notes
	@FindBy(css="a[title=Reports & Notes]")
	private WebElement tabReportsandNotesInfo;
	
	//Interactions
	@FindBy(css="a[title=Interactions]")
	private WebElement tabInteractionsInfo;
	
	//Tasks
	@FindBy(css="a[title=Tasks]")
	private WebElement tabTasksInfo;
	
	//Decision
	@FindBy(css="a[title=View Decisions]")
	private WebElement tabDecisionInfo;
	
	
	
	//click submit button method
	public void clickSubmitbutton() {
				
		btnSubmit.click();
	}
	
	

}
