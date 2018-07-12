package test.java.stepdefinitions;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.pages.loginPage;
import pages.BasePage;
import resources.CreateWebDriver;
import resources.readConfigfile;
//import test.java.verifyLogin;
import resources.utilities;


@RunWith(Parameterized.class)
public class Login extends BasePage {	
	
	utilities util=new utilities();
	public Login() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@When("^User enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
	public void user_enters_UserName_and_Password(String username,String password) {
		//Initialise page objects using the intiElements() method from page factory class
		loginPage login=PageFactory.initElements(driver, loginPage.class);		
		
	    
		//login into the system
		
		login.pegalogin(username, password);
	}

	@Then("^the user is logged in Successfully$")
	public void the_user_is_logged_in_Successfully(){
	  System.out.println("success");
	}
	
	
}
