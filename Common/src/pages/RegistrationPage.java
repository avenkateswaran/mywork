package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import locators.Common;
import pages.AutomaticExchangeOfInformation.RegAeoiPage;
import pages.registerforhmrctaxes.DeclarationPage;
import resources.UserInformation;

public class RegistrationPage extends BasePage {

	private static UserInformation information;

	public RegistrationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Register for HMRC taxes";
		this.expectedTitle = this.expectedHeading = "Register for HMRC taxes";
	}

	// HMRC Registration page link texts
	public String LinkSignUpHMRCServices = "Sign up for HMRC online services"; 	
	public String LINKREGISTRATIONHMRCTAXES = "Register for HMRC taxes";//"Register for HMRC taxes";LinkRegisterHMRCTaxes

	//	Register for HMRC taxes
	public String LinkRegisterMGD = "Register for Machine Games Duty";
	public String LinkRegisterQrops = "Register for QROPS";	
	public String LinkRegisterMoss = "Register for VAT Mini One Stop Shop";
	public String LinkRegisterFatca = "Register for Automatic Exchange of Information";

	//Tell HMRC you are new business, new employer or new to VAT	
	public String UserID_TextField_ID = "FieldUserID"; 	
	public String Password_TextField_ID = "FieldPassword";
	public String Login_Button_ID = "ButtonLogin";
	public String Register_Button_ID = "ButtonRegister";
	public String NEXTBUTTONNAME =	"next";
	public String BACKBUTTONNAME ="back";

	//Register for HMRC taxes LinkLogin
	public String LINKLOGINTEXT =	"I have an account - login";
	public String LINKCREATEACCOUNTTEXT ="Create an account for me";
	public static By LinkCreateAccount = By.id("LinkCreateAccount");

	//Register for HMRC taxes Radio options
	public String RADIOHMRCDEFAULTTAXES = "FieldregistrationOptions0";
	public String RADIOHMRCNEWREGISTERTAXES = "FieldregistrationOptions1";
	public String RADIOHMRCALREADYREGISTERTAXES = "FieldregistrationOptions2";

	//business registration
	public static By LinkRegisterForHMRCTaxes = By.id("LinkRegisterForHMRCTaxes");
	public static By linkRegisterForMachineGamesDuty = By.id("linkRegisterForMachineGamesDuty");
	public static By linkRegisterForMoss = By.id("linkRegisterForMoss");
	public static By LinkDelegateAccessToRegistration = By.id("LinkDelegateAccessToRegistration");
	public static By LinkRegisterForGTR = By.id("LinkRegisterForGTR");
	public static By linkRegisterFatca = By.id("LinkRegisterFatca");
	public static By linkRegisterForFatca = By.id("linkRegisterForFatca");
	public static By LinkRegisterForQROPS = By.id("LinkRegisterForQROPS");
	public static By registerForNewTax = By.id("FieldregistrationOptions1");
	public static By helpLink1 = By.xpath("//img[@title='Help about: Supported Taxes - opens in a new window']");

	public static By RegisteringAsAPartnerForSelfAssessmentAndClass2 = By.partialLinkText("Registering as a partner for Self Assessment and Class 2");
	public static By APartnerForSelfAssessmentIfTheyreNotAnIndividual = By.partialLinkText("a partner for Self Assessment if they're not an individual");
	public static By ReturnToTheHMRCHome = By.partialLinkText("Return to the HMRC home");

	//Tess 04July16
	//Tess - Individual Account and for signup online services  
	public static By linkSignUpHMRCServices = By.id("LinkSignUpHMRCServices");
	public static By linkIndividual = By.id("LinkIndividual");
	public static By linkOrganisation = By.id("LinkOrganisation");
	public static By linkAgent = By.id("LinkAgent"); 
	public static By linkPensions = By.id("LinkPensions"); 
	public static By VATReg = By.id("Fieldtype1"); 
	public static By VATRegNoAge = By.id("Fieldtype2"); 
	public static By NoVATRegNoAge = By.id("Fieldtype3"); 


	public AboutYouPage ClickNextOnRegistrationSummary(){
		screenShot(driver);
		super.clickNext();
		return new AboutYouPage(driver);
	}

	public DeclarationPage ClickNextOnRegistrationSummaryToDeclaration(){
		screenShot(driver);
		super.clickNext();
		return new DeclarationPage(driver);
	}

	public String checkHelpPage(By locator){
		String parentWindowHandle = driver.getWindowHandle();
		String popupWindowHandle = null;

		driver.findElement(locator).click();

		// switch to popup window
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			popupWindowHandle = iterator.next();
		}
		driver.switchTo().window(popupWindowHandle);

		String firstHeader = driver.findElements(By.tagName("h3")).get(0).getText();
		driver.findElement(By.linkText("Close")).click();
		driver.switchTo().window(parentWindowHandle);
		return firstHeader;
	}

	//Tess - check for next and submit button and click 
	public static void click_button(WebDriver drivercheck, String findElementUsing, String checkText)
	{
		By element =By.xpath("Just check"); 
		switch(findElementUsing)
		{
		case "id": 
			element	= By.id(checkText);
			break;
		case "cssSelector": 
			element	= By.cssSelector(checkText);	
			break;				
		case "partialLinkText": 
			element	= By.partialLinkText(checkText);
			break;
		case "linkText": 
			element	= By.linkText(checkText);
			break;
		case "xpath": 
			element	= By.xpath(checkText);
			break;		
		default:
			System.out.println("Error: the given option is not found");
		}

		if(drivercheck.findElement(element) != null)
		{
			drivercheck.findElement(element).click();
		}
	}

	public static void selectionAccount(WebDriver driver, int i)
	{
		//System.out.print("Please enter a number based on your selection.  \n 1 -Individual \n 2- Organisation \n 3- Agent \n 4- Pensions  \n\n" );
		int user_selection;
		user_selection = i;
		switch(user_selection)
		{
		case 1 : driver.findElement(linkIndividual).click(); break;   
		case 2 : driver.findElement(linkOrganisation).click();  break;
		case 3 : driver.findElement(linkAgent).click();  break;
		case 4 : driver.findElement(linkPensions).click();  break;
		}
	}
	
	public static void VAT_Selection(WebDriver driver, int i)
	{
		int user_selection;
		user_selection = i;
		switch(user_selection)
		{
		case 1 : driver.findElement(VATReg).click(); break;   
		case 2 : driver.findElement(VATRegNoAge).click();  break;
		case 3 : driver.findElement(NoVATRegNoAge).click();  break;
		
		}
		
	}
	
	public void VATreg(){
		
		
	}

	public static void validate_all_links_onpage(WebDriver driver_linkcheck)
	{
		List<WebElement> all_links = driver_linkcheck.findElement(By.id("AcceptTermsAndConditions")).findElements(By.tagName("a")); 
		System.out.println(all_links.size()); 
		for(int i=0; i< all_links.size(); i++)
		{
			System.out.println(all_links.get(i).getAttribute("href"));
			//	all_links.get(i).click();
			if(driver_linkcheck.findElement(By.tagName("h1")).getText().contains("HMRC Terms & conditions"))
				System.out.println("Successful");
			else System.out.println("Wrong page is displayed" + driver_linkcheck.findElement(By.tagName("h1")).getText()); 
		}

		List<WebElement> checkbox = driver_linkcheck.findElements(By.className("checkbox"));
		//System.out.println(checkbox.size());
		for(int i=0; i< checkbox.size(); i++)
		{
			((WebElement) checkbox.get(i)).click();
		}

		click_button(driver,"id","ButtonNext"); 
	}

	/**
	 * Kofi
	 */
	public RegistrationPage registerForAutoExchange(){
		try {
			driver.findElement(linkRegisterForFatca).click();
		} 
		catch (NoSuchElementException e)
		{
			driver.findElement(linkRegisterFatca).click();
		}
		return this;
	}

	public RegistrationPage createNewAccount(){
		driver.findElement(LinkCreateAccount).click();
		return this;
	}

	public RegistrationPage clickNext(){
		super.clickNext();;
		return this;
	}

	/**
	 * Added by Kofi */
	public RegistrationPage clickUK (String text){
		driver.findElement(By.id(text)).click();
		return this;
	}

	public RegistrationPage clickSubmit(){
		driver.findElement(Common.Submit_Button2).click();
		return this;
	}

	public RegistrationPage clickLogOut(){
		driver.findElement(Common.logOut_Button).click();
		return this;
	}

	public  void userId (String store){
		information = new UserInformation();
		String UserId= driver.findElement(By.xpath("//*[@id='UserId']")).getText();
		String[] parts = UserId.split(" ");
		store = parts[4];	
		information.USERID_1 = store;
		return ;
	}

	public RegAeoiPage ClickNextregisterAutoExch(){
		screenShot(driver);
		driver.findElement(linkRegisterForFatca).click();
		return new RegAeoiPage(driver);
	}

	public RegistrationPage registerForHmrcTaxes(){
		screenShot(driver);
		driver.findElement(LinkRegisterForHMRCTaxes).click();
		return new RegistrationPage(driver);
	}
	// Agents
	public RegistrationPage Click_AgentChar(){
		screenShot(driver);
		driver.findElement(locators.Common.AgentCHAR).click();
		return this ;
	}
	public RegistrationPage Click_AgentSA(){
		screenShot(driver);
		driver.findElement(locators.Common.AgentSA).click();
		return this ;
	}
	public RegistrationPage Click_AgentVAT(){
		screenShot(driver);
		driver.findElement(locators.Common.AgentVAT).click();
		return this ;
	}
	public RegistrationPage Click_AgentCT(){
		screenShot(driver);
		driver.findElement(locators.Common.AgentCoprTax).click();
		return this ;
	}
	public RegistrationPage Click_AgentPAYE(){
		screenShot(driver);
		driver.findElement(locators.Common.AgentPAYE).click();
		return this ;
	}
	//Individual
	public RegistrationPage Click_SA(){
		screenShot(driver);
		driver.findElement(locators.Common.SelfAssesment).click();
		return this ;
	}
	public RegistrationPage Click_CT(){
		screenShot(driver);
		driver.findElement(locators.Common.CT).click();
		return this ;
	}
	
	public RegistrationPage Click_Charities(){
		screenShot(driver);
		driver.findElement(locators.Common.Charities).click();
		return this ;
	}

	public RegistrationPage Click_VAT(){
		screenShot(driver);
		driver.findElement(locators.Common.VAT).click();
		return this ;
	}
	public RegistrationPage Click_PAYE(){
		screenShot(driver);
		driver.findElement(locators.Common.PAYE).click();
		return this ;
	}
	public RegistrationPage Click_SA_PART(){
		screenShot(driver);
		driver.findElement(locators.Common.SelfAssesmentPart).click();
		return this ;
	}
	public RegistrationPage Click_SA_TRUST(){
		screenShot(driver);
		driver.findElement(locators.Common.SelfAssesmentTrust).click();
		return this ;
	}
}
