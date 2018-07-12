package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public final WebDriver driver;
	
	//New logon screen - https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-account
	public static By UserId = By.id("userId");
	public static By password = By.id("password");
	public static By Password = By.id("password");
	public static By Login_Button_ID_BA = By.xpath("//*[@id='loginForm']/fieldset/div/div[3]/button");
	public static By Registration = By.id("registration");
	public static By Submit = By.xpath("//*[@id='loginForm']/fieldset/div/div[3]/button");
	
	
	public static By UserID_TextField_ID = By.id("FieldUserID");
	public static By Password_TextField_ID = By.id("FieldPassword");
	public static By Login_Button_ID = By.id("ButtonLogin");
	public static By Register_Button_ID = By.id("ButtonRegister");
	public static By Help_LinkText = By.linkText("Help");
	public By confirmmain = By.xpath("//*[@id='common0031']/div[2]/form/div[1]");
	public By signOut = By.partialLinkText("Sign out");
//	
//	// Tess
//	public static By ButtonRegister = By.id("ButtonRegister");
//
//	public String Home_LinkText = "Home";
//	public String Cymraeg_LinkText = "Cymraeg";
//	public String ContactHMRC_LinkText = "Contact HMRC";

	// public LoginPage() { }

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Sign in - Government Gateway"; //HMRC: Login
		this.expectedHeading = "Sign in"; //Welcome to HMRC Online services
		//super.assertTitle();
	}

	public SecurityMessagePage loginUser(String username, String password) {
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button_ID_BA).click();
		return new SecurityMessagePage(driver);
	}

	public LoginPage loginUserWrongPassword(String username, String password) {
		driver.findElement(UserID_TextField_ID).sendKeys(username);
		driver.findElement(Password_TextField_ID).sendKeys(password);
		driver.findElement(Login_Button_ID).click();
		return this;
	}
	
	public LoginPage loginUserNewGateway(String username, String password) {
		screenShot(driver);
		driver.findElement(UserId).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Submit).click();
		return this;
	}
	
	public ExtraSecurityPage loginUserSetUp(String username, String password) {
		driver.findElement(UserId).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Submit).click();
		writeLog("Logged in: " + username);
		screenShot(driver);
		return new ExtraSecurityPage(driver);
	}
	
	public BusinessTaxAccountPage loginBusinessTaxAccount(String username, String password) {
		driver.findElement(UserId).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Submit).click();
		writeLog("Logged in: " + username);
		screenShot(driver);
		return new BusinessTaxAccountPage(driver);
	}

	/*
	 * Tess : What would you like to do section page Going to return an instance
	 * of the registration selection page
	 */
//	public RegistrationSelectionPage clickRegister() {
//		driver.findElement(ButtonRegister).click();
//		return new RegistrationSelectionPage(driver);
//	}
	
	public NewRegistrationSelectionPage clickRegister() {
		screenShot(driver);
		driver.findElement(Registration).click();
		return new NewRegistrationSelectionPage(driver);
	}
	
	// public static String ButtonID = "ButtonLogin";
	// public static String ButtonID = "ButtonLogin";
	
	public LoginPage enrolforAgentCharitites(BasePage page, String CharRef, String CusRef, String branchPostcode) {
		screenShot(driver);
		page.setText(locators.Common.fieldCharitiesAgentRef, CharRef);
		page.setText(locators.Common.fieldAccRef, CusRef);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
//		page.clickNext();
//		page.clickElement(signOut);

		return this;
	}

}

