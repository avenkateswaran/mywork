package test.java.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.pages.decisionMakingPage;
import pages.BasePage;
import resources.utilities;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class DecisonMaking extends BasePage {
	
	utilities util=new utilities();
	decisionMakingPage decision=PageFactory.initElements(driver, decisionMakingPage.class);	
	
	public DecisonMaking() {
		super(driver);
		
	}
	
	@When("^the user records the decision using the following data$")
	public void the_user_records_the_decision_using_the_following_data(DataTable decisonmaking){
	  
		List<Map<String,String>> data=decisonmaking.asMaps(String.class,String.class); 	 		
		
		//get the data into a variable
		String CaseType=data.get(0).get("CaseType");
		String DecisonType=data.get(0).get("DecisonType");
		String CustomerNote=data.get(0).get("CustomerNotes");
		String SchemeType=data.get(0).get("CustomerNotes");
		String ActionReason=data.get(0).get("ActionReason");
		String Approvalflg=data.get(0).get("Approvalflg");
		String DecisionNotes=data.get(0).get("DecisionNotes");
		String Authflg=data.get(0).get("Authflg");
		String YieldAdj=data.get(0).get("YieldAdj");
		String YieldQuantity=data.get(0).get("YieldQuantity");
		
		
		util.switchToFrame(driver, By.partialLinkText("Record Decision"));
    	
		
    	//click on Record Decision link
    	decision.clickdecisonMaking();
    	
    	//Record the decision
    	decision.RecordDecisionMaking(CaseType, DecisonType, CustomerNote, SchemeType, ActionReason, Approvalflg, DecisionNotes, Authflg,YieldAdj,YieldQuantity);
	}
	

	@Then("^the appropriate confirmation message should be displayed\\.$")
	public void the_appropriate_confirmation_message_should_be_displayed() {
		if(driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).isDisplayed()){
			//if (driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).getText().contains("Thank")){
			assertThat(driver.findElement(By.cssSelector("div[node_name='pyConfirmMessage']")).getText(), containsString("Thank"));
			Hooks.setTestresultflg(true);
			//}
		}	
		
		if (driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).isDisplayed()){
			//if (driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).getText().contains("Close case")){
			assertThat(driver.findElement(By.cssSelector("div[node_name='pyCaseActionArea']")).getText(), containsString("Close"));
			Hooks.setTestresultflg(true);
			//}
		}
	 
	}
	
}
