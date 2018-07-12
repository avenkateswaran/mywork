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
import pages.GatewayDetailsPage;
import pages.GatewayRegistrationPage;
import pages.NewRegistrationSelectionPage;
import pages.RegistrationPage;
import pages.RegistrationSelectionPage;
import pages.RegistrationSuccessPage;
import referenceGateway.pages.IndividualServicesPage;
import referenceGateway.pages.RegisterForIndividualTax;
import referenceGateway.pages.RegisterForIndividualTaxForm;
import resources.CreateWebDriver;
import resources.UserInformation;
import resources.csvTools;

@RunWith(Parameterized.class)
public class Individual_SA_Enroll {
	
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
		private String password;
		private String postcode;
		private String UTR;
		private String NINO;
		private String gatewayId;
		private String dateRegistered;
		private String dateEnrolled;

	public Individual_SA_Enroll(Map<String, String> testDataRow) {
		this.password = testDataRow.get("Password");
		this.postcode = testDataRow.get("Postcode");
		this.NINO = testDataRow.get("NINO");
		this.UTR = testDataRow.get("UTR");
		this.dateRegistered = testDataRow.get("Registered");
		this.dateEnrolled = testDataRow.get("Enrolled");
		this.gatewayId = testDataRow.get("GatewayID");
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
		
		//Enrolment
		page.writeLog("=============== Start TEST CASE : Individual SA Enrolment =========================== ");
		System.out.println(dateRegistered+"ss");
		// only enroll registered entities
		if(dateRegistered != null){
			// only enroll once
			if(dateEnrolled == null || dateEnrolled.length() == 0){
				try{
					//driver.get("http://www.ref.gateway.gov.uk/");
					homePage = new referenceGateway.pages.HomePage(driver);
					referenceGateway.pages.LoginPage login = homePage.clickLogin();
					IndividualServicesPage services= login.loginIndividual(gatewayId, password);
					Thread.sleep(1000);
					RegisterForIndividualTax registrationPage = services.registerForIndividualTax();
					RegisterForIndividualTaxForm form = registrationPage.clickContinue();
					form.setYourUTR(UTR);
					csvTools.saveData(currentlyRunningTest, "UTR", UTR);
					if (postcode != null){
						form.setYourPostcode(postcode);
					}
					else{
						// if no postcode, the default to use is
						form.setYourPostcode("TF3 4ER");
						csvTools.saveData(currentlyRunningTest, "Postcode", "TF3 4ER");
					}
					if (NINO != null){
						form.setNINO(NINO);
					}
					
					form.clickNext();
					form.screenShot();
					DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
					csvTools.saveData(currentlyRunningTest, "Enrolled", dateFormat.format(new Date()));
					csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Pass");
					page.incrementSuccessCount();
					form.logOut();
					homePage.writeLog("=============== End TEST CASE : Individual SA Enrolment =========================== "
							+ currentlyRunningTest.getMethodName());
				}
				catch (Exception e){
					page.incrementFailCount();
					csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Fail");
					for (StackTraceElement s : e.getStackTrace()){
						System.out.println(s.getFileName()+" : "+ String.valueOf(s.getLineNumber()));	
					}
					throw new Exception(e);
				}
			}
			else{
				homePage.writeLog("=============== End TEST CASE : Individual SA Enrolment =========================== "
						+ currentlyRunningTest.getMethodName() + "record skipped, already enrolled");
			}

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
