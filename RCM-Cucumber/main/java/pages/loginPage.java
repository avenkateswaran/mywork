package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;
import resources.utilities;

public class loginPage extends BasePage {
	
//Declarations
	
	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}






	//username
	@FindBy(name="UserIdentifier")
	private WebElement txtpegaUserid;
	
	//password
	@FindBy(name="Password")
	private WebElement txtpegaPassword;
	
	//login button
	@FindBy(name="pyActivity=Code-Security.Login")
	private WebElement btnlogIn;

	

	

	
//Methods
	
	//login into pega system
	public void pegalogin(String userName,String password){
		
		//Enter the username
		txtpegaUserid.sendKeys(userName);
		
		//Enter the password
		txtpegaPassword.sendKeys(password);
		
		//Click on login button
		btnlogIn.click();
		
		
		
	}

	

}
