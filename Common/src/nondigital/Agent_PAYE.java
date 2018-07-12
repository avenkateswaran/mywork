package nondigital;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import resources.CreateWebDriver;
import resources.URLS;
import resources.UserInformation;
import resources.csvTools;
import pages.BasePage;
import pages.GatewayDetailsPage;
import pages.GatewayRegistrationPage;
import pages.LoginPage;
import pages.NewRegistrationSelectionPage;
import pages.RegistrationPage;
import pages.RegistrationSelectionPage;
import pages.RegistrationSuccessPage;

import java.util.Collection;
import java.util.Map;

@RunWith(Parameterized.class)
public class Agent_PAYE {

	private static csvTools csvTools = new csvTools();

	private static WebDriver driver = CreateWebDriver.getDriver("chrome");
	public static URLS urls;
	public static LoginPage loginPage;
	public static UserInformation userInformation;
	public static BasePage page;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static RegistrationPage registrationPage;
	public static NewRegistrationSelectionPage newRegistrationSelectionPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	public static resources.EvidenceCollector EvidenceCollector;

	// Data variables
	private String fullName;
	private String email_id;
	private String password;
	private String postcode;
	private String Org_Name;
	private String PAYEref;

	public Agent_PAYE(Map<String, String> testDataRow) {
		this.fullName = testDataRow.get("Full name");
		this.email_id = testDataRow.get("Government gateway email");
		this.password = testDataRow.get("Password");
		this.postcode = testDataRow.get("Postcode");
		this.Org_Name = testDataRow.get("Organisation Name");
		this.PAYEref = testDataRow.get("PAYE Tax Ref Num");

	}

	@Rule
	public TestName currentlyRunningTest = new TestName();

	@Parameterized.Parameters
	public static Collection<Map<String, String>> testData() throws Exception {
		return csvTools.getTests("C:\\Automation\\Data\\Agent PAYE.csv");
	}

	@BeforeClass
	public static void openBrowser() {
		driver.get(URLS.LOGINPAGEURL);
		page = new BasePage(driver);
		loginPage = new LoginPage(driver);
		registrationPage = new RegistrationPage(driver);
		userInformation = new UserInformation();
		page.writeLog("=============== Start TEST CASE : Agent PAYE  ===========================");
	}

	@Before
	public void setUp() throws Exception {
		EvidenceCollector = new resources.EvidenceCollector(this.getClass().getName());
	}

	@Test
	public void AgentPAYE() throws Exception {
		/*
		 * New Government Gateway login page (URL -
		 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
		 * account)
		 */

		/* New registration page */
		newRegistrationSelectionPage = loginPage.clickRegister();
		newRegistrationSelectionPage.clickAccountTypeAgent();
		gatewayDetailsPage = newRegistrationSelectionPage.clickContinue();
		
		driver.findElement(gatewayDetailsPage.PayeCisErsForAgents).click();
		newRegistrationSelectionPage.clickNext();
		newRegistrationSelectionPage.clickNext();
		newRegistrationSelectionPage.clickNext();

		gatewayRegistrationPage = newRegistrationSelectionPage.clickNext();
		gatewayRegistrationPage.registrationDetailsAgent(gatewayRegistrationPage, fullName, email_id, Org_Name);
		gatewayRegistrationPage.registrationPassword(gatewayRegistrationPage, password);
		Thread.sleep(7000);
		userInformation.Newuser = driver.findElement((locators.Common.RegistrationGateWayUserIdCard)).getText();
		userInformation.Newuser = userInformation.Newuser.replaceAll("[^0-9.]", "");
		gatewayRegistrationPage.writeLog("User check : " + userInformation.Newuser);
		csvTools.saveData(currentlyRunningTest, "GatewayID", userInformation.Newuser);
		loginPage = gatewayRegistrationPage.clickNext();

		/* Gateway login page */
		loginPage.loginUserNewGateway(userInformation.Newuser, password);
		Thread.sleep(500);

		/* Redirect to Agent PAYE page */
		driver.get("https://ibt.hmrc.gov.uk/service/paye?action=enrol&step=enterdetails");
		gatewayRegistrationPage.enrolforAgentPAYE(gatewayRegistrationPage, PAYEref, postcode);
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Pass");

	}

	@After
	public void tearDown() throws Exception {
		EvidenceCollector.moveScreenshots();
	}

	@AfterClass
	public static void closeBrowser() {
		gatewayRegistrationPage.screenShot(driver);
		gatewayRegistrationPage.writeLog("=============== End TEST CASE : Agent PAYE  ===========================");
		// driver.quit();
	}

}