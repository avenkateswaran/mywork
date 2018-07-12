package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;
import resources.utilities;

public class recordInitialReviewPage extends BasePage {
	
	
	public recordInitialReviewPage(WebDriver driver) {
		super(driver);		
	}
	
	//create an instance for utilities class
	utilities util=new utilities();
	
	
	//Declaration
	
	//Record initial review link
	
	@FindBy(partialLinkText="Record Initial Review")
	private WebElement lnkRecordInitialReview;
	
	//target grade
	@FindBy(id="TargetGrade")
	private WebElement dropdownTargetGrade;
	
	//initial review notes
	
	@FindBy(id="InitialReviewNotes")
	private WebElement txtInitialReviewNotes;
	
	//Next stage
	@FindBy(id="NextStage")
	private WebElement dropdownNextStage;
	
	
	//Methods
	
	public void recordInitialReview(String targetGrade,String reviewNotes,String nextStage) {
		
		//Click on the record initial review link
		lnkRecordInitialReview.click();
		
		//select the target grade
		util.selectfromdropdown(dropdownTargetGrade, targetGrade);
		
		
		//enter the review notes
		txtInitialReviewNotes.sendKeys(reviewNotes);
		
		//proceed to next stage
		util.selectfromdropdown(dropdownNextStage, nextStage);
		
	}
	
	

}
