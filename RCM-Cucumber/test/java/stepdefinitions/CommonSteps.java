package test.java.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import main.java.pages.loginPage;
import main.java.pages.quickSearchPage;
import pages.BasePage;
import resources.utilities;

@RunWith(Parameterized.class)
public class CommonSteps extends BasePage {
	
	utilities util=new utilities();
	
	 //Initialise page objects using the intiElements() method from page factory class
	loginPage login=PageFactory.initElements(driver, loginPage.class);		
	quickSearchPage quick=PageFactory.initElements(driver, quickSearchPage.class);
	quickSearchPage quick1=PageFactory.initElements(driver, quickSearchPage.class);
	public CommonSteps() {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Given("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page(){
		util.waitForElementToAppear(driver,By.name("UserIdentifier"),10,"The user is not in the login page");
	
	}
	
	@When("^the user clicks on the case$")
	public void the_user_clicks_on_the_case() {
		driver.switchTo().defaultContent();
    	driver.switchTo().frame("PegaGadget0Ifr");
    	
    	driver.findElement(By.xpath("//*[@id=\"$PSearchResults$ppxResults$l1\"]/td[3]/div/span/a")).click();
    	
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame("PegaGadget1Ifr");
	}
	
	@When("^the user makes a quick search from the RCM Home page$")
	public void the_user_makes_a_quick_search_from_the_RCM_Home_page(DataTable casenumber){
		List<Map<String,String>> data=casenumber.asMaps(String.class,String.class); 	 		
		
		//Do a quick search
    	quick.doQuickSearch(data.get(0).get("CaseNumber"));
		
	    
	}

}
