package nondigital;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
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
public class Agent_Charities {

	private static csvTools csvTools = new csvTools();
	private static WebDriver driver;
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
	public static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "Agent Charities.csv";

	// Data variables
	private String fullName;
	private String email_id;
	private String password;
	private String postcode;
	private String AcharRef;
	// private String last_4_Digits;
	private String customerAccNo;
	private String Org_Name;
	// private String GatewayID;

	public Agent_Charities(Map<String, String> testDataRow) {
		this.fullName = testDataRow.get("Full name");
		this.email_id = testDataRow.get("Government gateway email");
		this.password = testDataRow.get("Password");
		this.postcode = testDataRow.get("Postcode");
		this.AcharRef = testDataRow.get("AgentCharities  Ref Number");
		// this.last_4_Digits = testDataRow.get("Last four digits of acc
		// number");
		this.customerAccNo = testDataRow.get("Customer account number");
		this.Org_Name = testDataRow.get("Organisation Name");
		// this.GatewayID = testDataRow.get("GatewayID");
	}

	@Rule
	public TestName currentlyRunningTest = new TestName();
	
	@Rule
	public final ErrorCollector collector = new ErrorCollector();

	@Parameterized.Parameters
	public static Collection<Map<String, String>> testData() throws Exception {
		return csvTools.getTests(TEST_DATA_FILE_NAME);
	}

	@BeforeClass
	public static void openBrowser() throws Exception {

		driver = CreateWebDriver.getDriver("chrome");
		page = new BasePage(driver);
		userInformation = new UserInformation();
		loginPage = new LoginPage(driver);
		registrationPage = new RegistrationPage(driver);
		evidenceCollector = new resources.EvidenceCollector(Agent_Charities.class.getName());
	}

	@Before
	public void setUp() throws Exception {
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "");
		evidenceCollector.newTestCase();
	}

	@Test
	public void AgentCharities() throws Exception {

		try {

			/*
			 * New Government Gateway login page (URL -
			 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
			 * account)
			 */

			/* Start log */
			page.writeLog("=============== Start TEST CASE : Agent Charities  =========================== "
					+ currentlyRunningTest.getMethodName());

			/* New registration page */
			driver.get(URLS.LOGINPAGEURL);
			newRegistrationSelectionPage = loginPage.clickRegister();
			newRegistrationSelectionPage.clickAccountTypeAgent();
			gatewayDetailsPage = newRegistrationSelectionPage.clickContinue();
			driver.findElement(gatewayDetailsPage.CharitiesForAgents).click();
			newRegistrationSelectionPage.clickNext();
			newRegistrationSelectionPage.clickNext();
			newRegistrationSelectionPage.clickNext();
			gatewayRegistrationPage = newRegistrationSelectionPage.clickNext();
			gatewayRegistrationPage.registrationDetailsAgent(gatewayRegistrationPage, fullName, email_id, Org_Name);
			gatewayRegistrationPage.registrationPassword(gatewayRegistrationPage, password);
			Thread.sleep(5000);
			userInformation.Newuser = driver.findElement((locators.Common.RegistrationGateWayUserIdCard)).getText();
			userInformation.Newuser = userInformation.Newuser.replaceAll("[^0-9.]", "");
			gatewayRegistrationPage.writeLog("User check : " + userInformation.Newuser);
			csvTools.saveData(currentlyRunningTest, "GatewayID", userInformation.Newuser);
			loginPage = gatewayRegistrationPage.clickNext();

			/* Gateway login page */
			loginPage.loginUserNewGateway(userInformation.Newuser, password);
			Thread.sleep(500);

			/* Redirect to Agent Charities page */
			driver.get("https://ibt.hmrc.gov.uk/service/charities?action=enrol&step=enterdetails");
			loginPage.enrolforAgentCharitites(gatewayRegistrationPage, AcharRef, customerAccNo, postcode);
			Thread.sleep(5000);

			if (gatewayRegistrationPage.CheckEnrolmentSuccessful()) {
				csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Pass");
				page.writeLog(GatewayRegistrationPage.passTestResult);
				page.incrementSuccessCount();
			} else {
				csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Fail");
				page.writeLog(GatewayRegistrationPage.failTestResultFinalScreen);
				collector.addError(new Throwable(GatewayRegistrationPage.failTestResultFinalScreen));
				page.incrementFailCount();
			}
		} catch (Exception e) {
			csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Fail");
			page.writeLog(GatewayRegistrationPage.failTestResult);
			collector.addError(new Throwable(GatewayRegistrationPage.failTestResult));
			page.incrementFailCount();
		};

		driver.get("https://ibt.hmrc.gov.uk/logout");
		page.screenShot(driver);

		/* End log */
		page.writeLog("=============== End TEST CASE : Agent Charities  =========================== "
				+ currentlyRunningTest.getMethodName());

	}

	@After
	public void tearDown() throws Exception {
		evidenceCollector.moveScreenshotsAndTestData(TEST_DATA_FILE_NAME);
	}
	
	

	@AfterClass
	public static void closeBrowser() throws Exception {
		
		if (page.successCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 1, 4, page.successCount);
		}
		if (page.failCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 1, 4, page.failCount);
		}
		
		driver.quit();

	}
}