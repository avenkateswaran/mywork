package nondigital;

import resources.CreateWebDriver;
import resources.URLS;
import resources.UserInformation;
import resources.csvTools;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.*;

@RunWith(Parameterized.class)
public class Individual_VAT {

	private static csvTools csvTools = new csvTools();
	private static WebDriver driver;
	public static URLS urls;
	public static LoginPage loginPage;
	public static UserInformation userInformation;
	public static BasePage page;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static NewRegistrationSelectionPage newRegistrationSelectionPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	public static RegistrationPage registrationPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "Individual VAT.csv";

	// Data variables
	private String fullName;
	private String email_id;
	private String password;
	private String postcode;
	// private String GatewayID;
	private String VRN;
	private String Date;
	// private String FailPass;
	private String FinalMonth;
	private String Amount;

	public Individual_VAT(Map<String, String> testDataRow) {
		this.fullName = testDataRow.get("Full name");
		this.email_id = testDataRow.get("Government gateway email");
		this.password = testDataRow.get("Password");
		this.postcode = testDataRow.get("Postcode");
		this.Date = testDataRow.get("Date");
		this.VRN = testDataRow.get("VRN");
		this.FinalMonth = testDataRow.get("final Month ");
		this.Amount = testDataRow.get("Amount");
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
		loginPage = new LoginPage(driver);
		userInformation = new UserInformation();
		registrationPage = new RegistrationPage(driver);
		evidenceCollector = new resources.EvidenceCollector(Individual_VAT.class.getName());
	}

	@Before
	public void setUp() throws Exception {
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "");
		evidenceCollector.newTestCase();
	}

	@Test
	public void IndividualVAT() throws Exception {

		try {

			/*
			 * New Government Gateway login page (URL -
			 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
			 * account)
			 */

			/* Start log */
			page.writeLog("=============== Start TEST CASE : Individual VAT  =========================== "
					+ currentlyRunningTest.getMethodName());

			/* New registration page */
			driver.get(URLS.LOGINPAGEURL);
			newRegistrationSelectionPage = loginPage.clickRegister();
			newRegistrationSelectionPage.assertHeading().assertTitle();
			newRegistrationSelectionPage.clickAccountTypeIndividual();
			gatewayDetailsPage = newRegistrationSelectionPage.clickContinue();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			/* Gateway details page */
			gatewayDetailsPage.registrationDetails(gatewayDetailsPage, fullName, email_id, password);

			/* Registration success page */
			registrationSuccessPage = gatewayDetailsPage.clickContinue();
			Thread.sleep(5000);

			// gatewayRegistrationPage.writeLog("Storeuser id method is called
			// :)");
			userInformation.Newuser = driver.findElement((locators.Common.RegistrationGateWayUserId)).getText();

			// gatewayRegistrationPage.writeLog("User check : " +
			// userInformation.Newuser);
			userInformation.Newuser = userInformation.Newuser.replaceAll("[^0-9.]", "");
			// gatewayRegistrationPage.writeLog("User check : " +
			// userInformation.Newuser);
			csvTools.saveData(currentlyRunningTest, "GatewayID", userInformation.Newuser);

			/*
			 * Registration gateway page (to start enrolment for service process
			 */
			gatewayRegistrationPage = registrationSuccessPage.clickContinue();

			if (page == gatewayRegistrationPage) {

				driver.findElement(gatewayRegistrationPage.FindTax).click();
				driver.findElement(gatewayRegistrationPage.AddTaxVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				driver.findElement(gatewayRegistrationPage.AddVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				driver.findElement(gatewayRegistrationPage.YesVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				Thread.sleep(7000);

				// Enrol for charities services
				gatewayRegistrationPage.enrolforVATSales(gatewayRegistrationPage, VRN, postcode, Date, FinalMonth,
						Amount);

			} else {

				driver.get("https://www.qa.tax.service.gov.uk/business-account/manage-account");
				driver.findElement(By.id("service-info-home-link")).click();
				driver.findElement(gatewayRegistrationPage.FindTax).click();
				driver.findElement(gatewayRegistrationPage.AddTaxVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				driver.findElement(gatewayRegistrationPage.AddVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				driver.findElement(gatewayRegistrationPage.YesVAT).click();
				driver.findElement(gatewayRegistrationPage.BA_Continue).click();
				Thread.sleep(7000);

				/* Enrol for charities services */
				gatewayRegistrationPage.enrolforVATSales(gatewayRegistrationPage, VRN, postcode, Date, FinalMonth,
						Amount);

			}

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
		page.writeLog("=============== End TEST CASE : Individual VAT  =========================== "
				+ currentlyRunningTest.getMethodName());

	}

	@After
	public void tearDown() throws Exception {
		evidenceCollector.moveScreenshotsAndTestData(TEST_DATA_FILE_NAME);
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		
		if (page.successCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 7, 4, page.successCount);
		}
		if (page.failCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 7, 4, page.failCount);
		}
		
		driver.quit();
	}

}
