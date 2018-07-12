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
import pages.RegistrationSelectionPage;
import pages.RegistrationSuccessPage;

import java.util.Collection;
import java.util.Map;

@RunWith(Parameterized.class)
public class Organisation_CorpTax_Register {

	private static csvTools csvTools = new csvTools();
	private static WebDriver driver;
	public static URLS urls;
	public static LoginPage loginPage;
	public static UserInformation userInformation;
	public static BasePage page;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	private static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "Organisation CorpTax.csv";

	// Data variables
	private String companyName;
	private String email_id;
	private String password;
	private String dateRegistered;

	public Organisation_CorpTax_Register(Map<String, String> testDataRow) {
		this.companyName = testDataRow.get("Name");
		this.email_id = testDataRow.get("Government gateway email");
		this.password = testDataRow.get("Password");
		this.dateRegistered = testDataRow.get("Registered");
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
		evidenceCollector = new resources.EvidenceCollector(Organisation_CorpTax_Register.class.getName());
	}

	@Before
	public void setUp() throws Exception {
		if (this.password.length()==0){
			this.password = "p2ssword";
			csvTools.saveData(currentlyRunningTest, "Password", this.password);
		}
		if (this.email_id.length()==0){
			this.email_id = "testemail@hmrc.gov.uk";
			csvTools.saveData(currentlyRunningTest, "Password", this.email_id);
		}
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "");
		evidenceCollector.newTestCase();
	}

	@Test
	public void OrganisatinCorporationTax() throws Exception {
		System.out.println(dateRegistered.length());
		// only register unregistered entities
		if(dateRegistered == null || dateRegistered.length() == 0){
			try {

				/*
				 * New Government Gateway login page (URL -
				 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
				 * account)
				 */

				/* Start log */
				page.writeLog("=============== Start TEST CASE : Organisation Corporation Tax  =========================== "
						+ currentlyRunningTest.getMethodName());

				/* New registration page */
				driver.get("https://www.qa.tax.service.gov.uk/government-gateway-registration-frontend/choose-your-account?continue=https%3A%2F%2Fibt.hmrc.gov.uk%2Fhome");
				NewRegistrationSelectionPage newRegistrationSelectionPage = new NewRegistrationSelectionPage(driver);
				newRegistrationSelectionPage.clickAccountTypeOrganisation();
				gatewayDetailsPage = newRegistrationSelectionPage.clickContinue();

				/* Gateway details page */
				gatewayDetailsPage.registrationDetails(gatewayDetailsPage, companyName, email_id, password);

				/* Registration success page */
				registrationSuccessPage = gatewayDetailsPage.clickContinue();
				Thread.sleep(5000);

				// gatewayRegistrationPage.writeLog("Storeuser id method is called
				// :)");
				userInformation.Newuser = driver.findElement((locators.Common.RegistrationGateWayUserId)).getText();

				userInformation.Newuser = userInformation.Newuser.replaceAll("[^0-9.]", "");
				// gatewayRegistrationPage.writeLog("User check : " +
				// userInformation.Newuser);
				csvTools.saveData(currentlyRunningTest, "GatewayID", userInformation.Newuser);

				/*
				 * Registration gateway page (to start enrolment for service process
				 */
				gatewayRegistrationPage = registrationSuccessPage.clickContinue();
				page.screenShot(driver);
				
				csvTools.saveData(currentlyRunningTest, "Registered", page.getTimestamp());
				page.writeLog(GatewayRegistrationPage.passTestResult);
				page.incrementSuccessCount();
				driver.get("https://ibt.hmrc.gov.uk/logout");

			} catch (Exception e) {
				page.writeLog(GatewayRegistrationPage.failTestResult);
				collector.addError(new Throwable(GatewayRegistrationPage.failTestResult));
				System.out.println(e.getMessage());
				page.incrementFailCount();
				page.screenShot(driver);
			};
			/* End log */
			page.writeLog("=============== End TEST CASE : Organisation Corporation Tax Register =========================== "
					+ currentlyRunningTest.getMethodName());
		}else{
			/* End log */
			page.writeLog("=============== End TEST CASE : Organisation Corporation Tax Register =========================== "
					+ currentlyRunningTest.getMethodName() + "record skipped, already registered");
		}
	}

	@After
	public void tearDown() throws Exception {
		evidenceCollector.moveScreenshotsAndTestData(TEST_DATA_FILE_NAME);
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		
		if (page.successCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 69, 4, page.successCount);
		}
		if (page.failCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 69, 4, page.failCount);
		}
		
		driver.quit();
		
	}

}