package main.java.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;


import pages.BasePage;
import resources.utilities;

public class decisionMakingPage extends BasePage {
	
	public decisionMakingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	utilities util=new utilities();
	
	//private static WebDriver driver;
	
	//Declaration
	
		//Record Decision link 
		@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Record Decision")
		private WebElement lnkRecordDecision;
		
		//Decision
		
		@FindBy(id="Decision")
		private WebElement dropdownDecision;
		
		//Customer Notes
		@FindBy(id="CustomerDecisionNotes")
		private WebElement txtCustomerNotes;
		
		//Scheme Type approval
		@FindBy(id="SchemeTypeDecisonApprove_ri")
		private WebElement optionDecisionApprove1;
		
		//Scheme Type 1 Rejection
		@FindBy(id="SchemeTypeDecisonReject_ri_1")
		private WebElement optionDecisionReject1;
		
		
		//Scheme Type 1 approval
		@FindBy(id="SchemeTypeDecisonApprove_ri_2")
		private WebElement optionDecisionApprove2;
		
		//Scheme Type 1 Rejection
		@FindBy(id="SchemeTypeDecisonReject_ri_2")
		private WebElement optionDecisionReject2;
		
		//Scheme1 notes
		@FindBy(id="pyNote1")
		private WebElement txtSchemeNotes1;
		
		//Scheme1 notes
		@FindBy(id="pyNote2")
		private WebElement txtSchemeNotes2;
		
		//Reject Reason
		@FindBy(id="Description1")
		private WebElement dropdownRejectReason1;
		
		//Decision Notes
		@FindBy(id="DecisionNotes")
		private WebElement txtDecisionNotes;
		
		//Authorization required
		@FindBy(id="AuthorisationRequired")
		private WebElement chkAuthRequired;
		
		//notes
		@FindBy(id="RequestAuthorisationNotes")
		private WebElement txtauthNotes;
		
		//Add Amendment reasons Button
		@FindBy(css="button[data-click*=doGridAction]")
		private WebElement btnAddAmendmentReason;
		
		//Scheme type 1
		
		@FindBy(id="SchemeType1")
		private WebElement dropdownSchemeType1;
		
		//Scheme type 2
		
		@FindBy(id="SchemeType2")
		private WebElement dropdownSchemeType2;
		
		//Yield tab
		@FindBy(how = How.LINK_TEXT, using = "Yield")
		private WebElement lnkYield;
		
		
		//Yield button
		@FindBy(css="button[data-click*=RecordYield]")
		private WebElement btnAddYield;
		
		
		//Adjustment 1
		@FindBy(id="Adjustment1")
		private WebElement txtAddYieldAdj;
		
		//Add Yield
		@FindBy(id="YieldQuantity1")
		private WebElement txtYieldQuantity;
		
		
		
		//Methods
		
		public void clickdecisonMaking() {
			lnkRecordDecision.click();
		}
		
		
		public Boolean decisionMaking(String CaseType,String DecisionType,String customerNotes,String SchemeType,String ActionReason, String Approvalflg, String DecisionNotes,String Authflg,String YieldAdj,String YieldQuantity) {
			
			Boolean flg=false;
			try {
			
			commonObjects comObj=PageFactory.initElements(driver, commonObjects.class);
				
				
										
				//Select the decision type
				util.selectfromdropdown(dropdownDecision, DecisionType);
				
				
				switch (CaseType) {
				
					case "TAVC":
										
						
						if(DecisionType.contains("ApproveWithAmendment")) {
							
							String[] schemetypes=SchemeType.split(",");
							
							for(int i=0;i<schemetypes.length;i++) {
							

								if(Approvalflg.contentEquals("Y")){
									driver.findElement(By.id("SchemeTypeDecisonApprove_ri"+"_"+String.valueOf(i+1))).click();
									
								}else {
									driver.findElement(By.id("SchemeTypeDecisonReject_ri"+"_"+String.valueOf(i+1))).click();
								}
								
								Thread.sleep(1000);
								driver.findElement(By.id("pyNote"+String.valueOf(i+1))).sendKeys("notes");
									
							}
							
							//Click on add amendment reason button
							JavascriptExecutor jse = (JavascriptExecutor)driver;
							jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
							btnAddAmendmentReason.click();							
										
						
						    //Select scheme type 1
							util.selectfromdropdown(dropdownSchemeType1, schemetypes[0]);
							
							//Select the amendment reason 1
							util.selectfromdropdown(dropdownRejectReason1,ActionReason );
							

							
						}else if(DecisionType.contains("Reject") ) {
							
							util.selectfromdropdown(dropdownRejectReason1, ActionReason);
							
							txtDecisionNotes.sendKeys(DecisionNotes);
							
							
							
							
							
						}	
						//Enter the customer notes
						txtCustomerNotes.sendKeys(customerNotes);
									
						break;
					case "AMLS":		
											
							
							if(DecisionType.contains("ApproveWithConditions")) {
								
								txtDecisionNotes.sendKeys(DecisionNotes);			
							
								
							}
							
							if(DecisionType.contains("Reject") || DecisionType.contains("Revoke") ) {
								
								util.selectfromdropdown(dropdownRejectReason1, ActionReason);
								
								txtDecisionNotes.sendKeys(DecisionNotes);									
								
								
							}					
							
							break;
							
					case "AWRS":		
						
						
						
						if(DecisionType.contains("ApproveWithConditions")) {
							
							txtDecisionNotes.sendKeys(DecisionNotes);								
							
												
						}
						
						if(DecisionType.contains("Reject") || DecisionType.contains("Revoke") ) {
							
							util.selectfromdropdown(dropdownRejectReason1, ActionReason);
							
							txtDecisionNotes.sendKeys(DecisionNotes);				
							
							
													
						}						
							
						//Enter the customer notes
						txtCustomerNotes.sendKeys(customerNotes);
						
						break;
						
						
				}
				
								
				
				if(Authflg.contentEquals("Y")) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					chkAuthRequired.click();
					
					//Click on the yield link
					
					lnkYield.click();
					
					//click on add yield button
					btnAddYield.click();
					
					//Enter yield adjustment
					txtAddYieldAdj.sendKeys(YieldAdj);
					
					//Enter yield 
					txtYieldQuantity.sendKeys(YieldQuantity);
					
					

					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");	 
					
				
					comObj.clickSubmitbutton();
					
					txtauthNotes.sendKeys("notes");
				}
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
					
				
				comObj.clickSubmitbutton();
				
				if(driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).isDisplayed()){
					//if (driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).getText().contains("Thank")){
					assertThat(driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).getText(), containsString("Thank"));
					flg=true;
					//}
				}	
				
				if (driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).isDisplayed()){
					//if (driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).getText().contains("Close case")){
					assertThat(driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).getText(), containsString("Close"));
						flg=true;
					//}
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return flg;
				
			
		
	
}


		public void RecordDecisionMaking(String CaseType,String DecisionType,String customerNotes,String SchemeType,String ActionReason, String Approvalflg, String DecisionNotes,String Authflg,String YieldAdj,String YieldQuantity) {
			
			
			try {
			
			commonObjects comObj=PageFactory.initElements(driver, commonObjects.class);
				
				
										
				//Select the decision type
				util.selectfromdropdown(dropdownDecision, DecisionType);
				
				
				switch (CaseType) {
				
					case "TAVC":
										
						
						if(DecisionType.contains("ApproveWithAmendment")) {
							
							String[] schemetypes=SchemeType.split(",");
							
							for(int i=0;i<schemetypes.length;i++) {
							

								if(Approvalflg.contentEquals("Y")){
									driver.findElement(By.id("SchemeTypeDecisonApprove_ri"+"_"+String.valueOf(i+1))).click();
									
								}else {
									driver.findElement(By.id("SchemeTypeDecisonReject_ri"+"_"+String.valueOf(i+1))).click();
								}
								
								Thread.sleep(1000);
								driver.findElement(By.id("pyNote"+String.valueOf(i+1))).sendKeys("notes");
									
							}
							
							//Click on add amendment reason button
							JavascriptExecutor jse = (JavascriptExecutor)driver;
							jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
							btnAddAmendmentReason.click();							
										
						
						    //Select scheme type 1
							util.selectfromdropdown(dropdownSchemeType1, schemetypes[0]);
							
							//Select the amendment reason 1
							util.selectfromdropdown(dropdownRejectReason1,ActionReason );
							

							
						}else if(DecisionType.contains("Reject") ) {
							
							util.selectfromdropdown(dropdownRejectReason1, ActionReason);
							
							txtDecisionNotes.sendKeys(DecisionNotes);
							
							
							
							
							
						}	
						//Enter the customer notes
						txtCustomerNotes.sendKeys(customerNotes);
									
						break;
					case "AMLS":		
											
							
							if(DecisionType.contains("ApproveWithConditions")) {
								
								txtDecisionNotes.sendKeys(DecisionNotes);			
							
								
							}
							
							if(DecisionType.contains("Reject") || DecisionType.contains("Revoke") ) {
								
								util.selectfromdropdown(dropdownRejectReason1, ActionReason);
								
								txtDecisionNotes.sendKeys(DecisionNotes);									
								
								
							}					
							
							break;
							
					case "AWRS":		
						
						
						
						if(DecisionType.contains("ApproveWithConditions")) {
							
							txtDecisionNotes.sendKeys(DecisionNotes);								
							
												
						}
						
						if(DecisionType.contains("Reject") || DecisionType.contains("Revoke") ) {
							
							util.selectfromdropdown(dropdownRejectReason1, ActionReason);
							
							txtDecisionNotes.sendKeys(DecisionNotes);				
							
							
													
						}						
							
						//Enter the customer notes
						txtCustomerNotes.sendKeys(customerNotes);
						
						break;
						
						
				}
				
								
				
				if(Authflg.contentEquals("Y")) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					chkAuthRequired.click();
					
					//Click on the yield link
					
					lnkYield.click();
					
					//click on add yield button
					btnAddYield.click();
					
					//Enter yield adjustment
					txtAddYieldAdj.sendKeys(YieldAdj);
					
					//Enter yield 
					txtYieldQuantity.sendKeys(YieldQuantity);
					
					

					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");	 
					
				
					comObj.clickSubmitbutton();
					
					txtauthNotes.sendKeys("notes");
				}
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
					
				
				comObj.clickSubmitbutton();
				
				
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			//return flg;
			
		
	

	}
		
	
		
		
		
		
		
		
		

}
