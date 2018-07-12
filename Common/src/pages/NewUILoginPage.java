package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.CorporateTax.YourTaxAccountPage;

public class NewUILoginPage extends BasePage
{
	public final WebDriver driver;
	
	public static  By UserID_TextField_ID = By.id("userId"); 	
	public static  By Password_TextField_ID = By.id("password");
	public static  By Login_Button_ID = By.xpath("//*[@id='loginForm']/fieldset/div/div[3]/button");
	public static  By Register_Button_ID = By.id("ButtonRegister");
	public static  By Help_LinkText = By.linkText("Help");
	
	//Tess 
	public static By ButtonRegister = By.id("ButtonRegister");
	
	public  String Home_LinkText = "Home";
	public  String Cymraeg_LinkText = "Cymraeg";
	public  String ContactHMRC_LinkText = "Contact HMRC";
	
	
	
	//public LoginPage() 	{	}	
	
	public NewUILoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Sign in - Government Gateway";
		this.expectedHeading = "Sign in";
		super.assertTitle();
	}	
	/**
	 * Created for CorpTax, Kofi Kankam 
	 */
	public YourTaxAccountPage loginUserCorp(String username, String password)
	{	
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button_ID).click();
		return new YourTaxAccountPage(driver);
	}
	
	
	public NewUILoginPage loginUserWrongPassword(String username, String password)
	{	
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button_ID).click();
		return this;
	}
	
	/*Tess : What would you like to do section page
	 *Going to return an instance of the registration selection page */
	public RegistrationSelectionPage clickRegister()
	{
		driver.findElement(ButtonRegister).click();
		return new RegistrationSelectionPage(driver);
	}
	//public static String ButtonID = "ButtonLogin";
	//public static String ButtonID = "ButtonLogin";

}
