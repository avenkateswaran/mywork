package test.java.stepdefinitions;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.pages.advancedSearchPage;
import main.java.pages.loginPage;
import main.resources.getItemsToVerify;
import pages.BasePage;
import resources.Configurations;
import resources.xmlRead;

@RunWith(Parameterized.class)
public class VerifyAdvancedSearch extends BasePage {
	
	String externalRefNum=null;
	
	public VerifyAdvancedSearch() {
		super(driver);	
	}
	
	
	
	@When("^User logs in using the following credentials$")
	public void user_logs_in_using_the_following_credentials(DataTable usercredentials){
	 List<Map<String,String>> data=usercredentials.asMaps(String.class,String.class);
	   
	 //Initialise page objects using the intiElements() method from page factory class
	 loginPage login=PageFactory.initElements(driver, loginPage.class);		
	 		
	 	    
	 //login into the system
	 		
	 login.pegalogin(data.get(0).get("UserName"), data.get(0).get("Password"));
	}

	@When("^the user makes an advanced search from the xml file$")
	public void the_user_makes_an_advanced_search_from_the_xml_file(DataTable xmlfilename) {
		
		
		List<Map<String,String>> data=xmlfilename.asMaps(String.class,String.class);
		Hooks.setXmlfile(data.get(0).get("XMLFile"));
		//get the data from xml
		String fullxmlpath=Configurations.getDataRootFolder()+data.get(0).get("XMLFile");
		System.out.println(fullxmlpath);
		
		externalRefNum=xmlRead.readXmlFile(fullxmlpath,"n0:Payload", "n0:RefValue");
		
		advancedSearchPage advSearch=PageFactory.initElements(driver, advancedSearchPage.class);
		
		advSearch.advancedSearch(driver,externalRefNum);
	 
	}

	@Then("^the user is able to fetch the required case$")
	public void the_user_is_able_to_fetch_the_required_case() throws Throwable {
	
		String searchresults=getItemsToVerify.getSearchResults(driver,By.cssSelector("table[class='gridTable '][pl_prop='SearchResults.pxResults']"),"//table[@pl_prop='SearchResults.pxResults']/tbody/tr[@id='$PSearchResults$ppxResults$l", "");
    	System.out.println(searchresults);
    	
    	if(!(searchresults==null)){
	    	screenShot(driver);	    	
    	}else{ 
    		screenShot(driver);
    		fail("the external refererence number: "+externalRefNum+" cannot be found in the RCM system");
    		Hooks.setTestresultflg(false);
	    	
			
    	}
	}

}
