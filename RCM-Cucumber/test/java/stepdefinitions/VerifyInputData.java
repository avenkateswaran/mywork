package test.java.stepdefinitions;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import main.resources.getItemsToVerify;
import pages.BasePage;
import resources.Configurations;
import resources.xmlRead;

@RunWith(Parameterized.class)
public class VerifyInputData extends BasePage {
	
	
	public VerifyInputData() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Then("^the user must be able to verify the case information$")
	public void the_user_must_be_able_to_verify_the_case_information() {		
		
		String fullxmlpath=Configurations.getDataRootFolder()+Hooks.getXmlfile();		
		
		//verify the reference number
    	
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver, xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:RefValue"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the reference value cannot be found ");
    	}
    	
    	//Verify Registration ID
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver, xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:RegistrationID"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the registration id cannot be found ");
    	}
    	
    	//Verify business partner 
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver,  xmlRead.readXmlFile(fullxmlpath,"n0:ExtSystemRef", "n0:RefValue"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the text ETMP business partner cannot be found ");
    	}
    	
    	//Verify Submission date
    	String[] getsubmissiondt= xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:SubmissionDate").split("-");
    	if(getsubmissiondt[1].startsWith("0")) {
    		getsubmissiondt[1]=getsubmissiondt[1].replace("0","");
    		
    	}
    	String submissiondt=getsubmissiondt[1].trim()+"/"+getsubmissiondt[2].trim()+"/"+getsubmissiondt[0].trim();
    	
    	
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver,  submissiondt)) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the text submission date cannot be found ");
    	}
    	
    	//verify Business Name
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver,  xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:BusinessName"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the text business name cannot be found ");
    	}
    	
    	//Verify Trading Address line 1
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver,  xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:TradingAddrLine1"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the textaddress line 1 cannot be found ");
    	}
    	
    	//Verify Trading Address post code
    	
    	if(!getItemsToVerify.compareXMLwithScreenValuespageSource(driver,  xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:TradingPostcode"))) {
    		screenShot(driver);
    		Hooks.setTestresultflg(false);
    		fail("the text post code cannot be found ");
    	}
	}
}
