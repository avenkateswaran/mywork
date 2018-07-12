package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;

public class completeInitialChecksPage extends BasePage {

	public completeInitialChecksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Declarations
	
	//Complete initial Checks link
	@FindBy(partialLinkText="Complete Initial Checks")
	private WebElement lnkCompleteInitialChecks;
	
	//PNC check pass
	@FindBy(id="PNCCheckPass")
	private WebElement chkPNCCheckPass;
	
	//PNC check fail
	@FindBy(id="PNCCheckFail")
	private WebElement chkPNCCheckFail;
	
	//Centaur check pass
	@FindBy(id="CENTAURCheckPass")
	private WebElement chkCentaurCheckPass;
	
	//Centaur check Fail
	@FindBy(id="CENTAURCheckFail")
	private WebElement chkCentaurCheckFail;
	
	//Change Risk Rating Yes
	@FindBy(id="ChangeRiskRatingYes")
	private WebElement optChangeRiskRatingYes;
	
	//Change Risk Rating No
	@FindBy(id="ChangeRiskRatingNo")
	private WebElement optChangeRiskRatingNo;
	
	
	
	//methods
	public void completeInitialChecks(String PNCCheck,String CentaurCheck,String RiskRating) {
		
		//Click on the complete initial check link
		lnkCompleteInitialChecks.click();
		
		//PNC check
		if(PNCCheck.contentEquals("Pass")){
			
			chkPNCCheckPass.click();
		}else {
			chkPNCCheckFail.click();
		}
		
		
		//Centaur check
		if(CentaurCheck.contentEquals("Pass")){
				
			chkCentaurCheckPass.click();
		}else {
			chkCentaurCheckFail.click();
		}
		
		//Risk rating check
		if(CentaurCheck.contentEquals("Yes")){
					
			optChangeRiskRatingYes.click();
		}else {
			optChangeRiskRatingNo.click();
		}
		
		
		
	}
}
