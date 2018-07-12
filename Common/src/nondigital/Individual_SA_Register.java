package nondigital;

import resources.CreateWebDriver;
import resources.UserInformation;
import resources.csvTools;

import java.util.Collection;
import java.util.Map;
import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.*;

@RunWith(Parameterized.class)
public class Individual_SA_Register {
	private static csvTools csvTools = new csvTools();

	private static WebDriver driver;
	public static UserInformation userInformation;
	public static BasePage page;
	public static NewRegistrationSelectionPage newRegistrationSelectionPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static RegistrationPage registrationPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static referenceGateway.pages.HomePage homePage;
	private static resources.EvidenceCollector evidenceCollector;
	

	// Data variables
	private String fullName;
	private String email_id;
	private String password;
	private String dateRegistered;

	public Individual_SA_Register(Map<String, String> testDataRow) {
		this.fullName = testDataRow.get("Full name");
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
		return csvTools.getTests("E:\\Automation\\Data\\Individual SA.csv");
	}

	@BeforeClass
	public static void openBrowser() throws Exception {
		driver = CreateWebDriver.getDriver("chrome");
		page = new BasePage(driver);
		userInformation = new UserInformation();
		userInformation = new UserInformation();
		registrationPage = new RegistrationPage(driver);
		gatewayRegistrationPage = new GatewayRegistrationPage(driver);
		evidenceCollector = new resources.EvidenceCollector(Individual_SA_Register.class.getName());

		// usage
		page.writeLog("=============== Start TEST CASE : Individual SA  ===========================");

	}

	@Before
	public void setUp() throws Exception {
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "");
		evidenceCollector.newTestCase();
	}

	@Test
	public void IndividualSA() throws Exception {
		
		// only enroll registered entities
		if(dateRegistered == null || dateRegistered.length() == 0){
			try {

				/*
				 * New Government Gateway login page (URL -
				 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
				 * account)
				 */

				/* Start log */
				page.writeLog("=============== Start TEST CASE : Individual SA  =========================== " + currentlyRunningTest.getMethodName());
				/* New registration page */
				driver.get("https://www.qa.tax.service.gov.uk/government-gateway-registration-frontend/choose-your-account?continue=https%3A%2F%2Fibt.hmrc.gov.uk%2Fhome");
				NewRegistrationSelectionPage newRegistrationSelectionPage = new NewRegistrationSelectionPage(driver);
				newRegistrationSelectionPage.clickAccountTypeIndividual();
				gatewayDetailsPage = newRegistrationSelectionPage.clickContinue();

				/* Gateway details page */
				gatewayDetailsPage.registrationDetails(gatewayDetailsPage, fullName, email_id, password);

				/* Registration success page */
				registrationSuccessPage = gatewayDetailsPage.clickContinue();
				Thread.sleep(3000);

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
				System.out.println(e.getMessage());
				collector.addError(new Throwable(GatewayRegistrationPage.failTestResult));
				page.incrementFailCount();
				page.screenShot(driver);
			}
			/* End log */
			page.writeLog("=============== End TEST CASE : Individual SA Registration =========================== "
					+ currentlyRunningTest.getMethodName());
		}else{
			/* End log */
			page.writeLog("=============== End TEST CASE : Individual SA Registration =========================== "
					+ currentlyRunningTest.getMethodName() + "record skipped, already registered");
		}
	}
	

	@After
	public void tearDown() throws Exception {
		evidenceCollector.moveScreenshots();
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		gatewayRegistrationPage.writeLog("=============== End TEST CASE : Individual SA  ===========================");

			if (page.successCount != 0){
				evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 6, 4, page.successCount);
			}
			if (page.failCount != 0){
				evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 6, 4, page.failCount);
			}
			
		driver.quit();

	}

}
