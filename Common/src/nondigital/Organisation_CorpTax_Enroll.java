package nondigital;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.GatewayRegistrationPage;
import referenceGateway.pages.LoginPage;
import referenceGateway.pages.OrganisationServicesPage;
import referenceGateway.pages.RegisterForCorporationTax;
import referenceGateway.pages.RegisterForCorporationTaxForm1;
import resources.CreateWebDriver;

import resources.csvTools;

@RunWith(Parameterized.class)
public class Organisation_CorpTax_Enroll {

	private static csvTools csvTools = new csvTools();
	private static WebDriver driver;
	public static BasePage page;
	public static referenceGateway.pages.HomePage homePage;
	private static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "Organisation CorpTax.csv";

	// Data variables
	private String password;
	private String postcode;
	private String UTR;
	private String CRN;
	private String gatewayId;
	private String dateRegistered;
	private String dateEnrolled;

	public Organisation_CorpTax_Enroll(Map<String, String> testDataRow) {
		this.gatewayId = testDataRow.get("GatewayID");
		this.password = testDataRow.get("Password");
		this.postcode = testDataRow.get("Postcode").trim();
		this.UTR = testDataRow.get("UTR").replace(" ", "");
		this.CRN = testDataRow.get("CRN");
		this.dateRegistered = testDataRow.get("Registered");
		this.dateEnrolled = testDataRow.get("Enrolled");
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
		homePage = new referenceGateway.pages.HomePage(driver);
		page = new BasePage(driver);
		evidenceCollector = new resources.EvidenceCollector(Organisation_CorpTax_Enroll.class.getName());
	}

	@Before
	public void setUp() throws Exception {
		evidenceCollector.newTestCase();
	}

	@Test
	public void OrganisatinCorporationTax() throws Exception {
		homePage.writeLog("=============== Start TEST CASE : Organisation Corporation Tax Enroll =========================== ");
		System.out.println(dateRegistered+"ss");
		// only enroll registered entities
		if(dateRegistered != null){
			// only enroll once
			if(dateEnrolled == null || dateEnrolled.length() == 0){
				try{
					LoginPage login = homePage.clickLogin();
					OrganisationServicesPage services = login.loginOrganisation(gatewayId, password);
					Thread.sleep(1000);
					RegisterForCorporationTax registrationPage = services.registerForCorporationTax();
					RegisterForCorporationTaxForm1 form1 = registrationPage.clickContinue();
					form1.setYourCompanyTaxReference(UTR);
					csvTools.saveData(currentlyRunningTest, "UTR", UTR);
					if (postcode != null){
						form1.setYourRegisteredOfficePostcode(postcode);
					}
					else if (CRN != null){
						form1.setCompanyRegistrationNumber(CRN);
					}
					else{
						// if no postcode or CRN given, the default to use is
						form1.setYourRegisteredOfficePostcode("TF3 4ER");
						csvTools.saveData(currentlyRunningTest, "Postcode", "TF3 4ER");
					}
					form1.clickNext();
					form1.screenShot();
					form1.logOut();
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
					csvTools.saveData(currentlyRunningTest, "Enrolled", dateFormat.format(new Date()));

					homePage.writeLog("=============== End TEST CASE : Organisation Corporation Tax Enroll =========================== "
							+ currentlyRunningTest.getMethodName());
				}
				catch (Exception e){
					
					System.out.println(e.getMessage());
					for (StackTraceElement s : e.getStackTrace()){
						System.out.println(s.getFileName()+" : "+ String.valueOf(s.getLineNumber()));
						
					}
					page.writeLog(GatewayRegistrationPage.failTestResult);
					collector.addError(new Throwable(GatewayRegistrationPage.failTestResult));
					page.incrementFailCount();
					page.screenShot(driver);
				}
			}
			else{
				homePage.writeLog("=============== End TEST CASE : Organisation Corporation Tax Enroll =========================== "
						+ currentlyRunningTest.getMethodName() + "record skipped, already enrolled");
			}

		}
	}


	@After
	public void tearDown() throws Exception {
		evidenceCollector.moveScreenshotsAndTestData(TEST_DATA_FILE_NAME);
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		
		if (page.successCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 8, 4, page.successCount);
		}
		if (page.failCount != 0){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 8, 4, page.failCount);
		}
		driver.quit();
		
	}
}
