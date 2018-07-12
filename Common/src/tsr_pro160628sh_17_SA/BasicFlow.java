package tsr_pro160628sh_17_SA;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.BusinessTaxAccountPage;
import pages.ExtraSecurityPage;
import pages.GatewayDetailsPage;
import pages.GatewayRegistrationPage;
import pages.LoginPage;
import pages.NewRegistrationSelectionPage;
import pages.RegistrationPage;
import pages.RegistrationSelectionPage;
import pages.RegistrationSuccessPage;
import pages.SetUp2StepVerificationPage;
import pages.selfassessment.CheckYourReturnPage;
import pages.selfassessment.FillInYourReturnAdjustmentsTaxDuePage;
import pages.selfassessment.FillInYourReturnAnyOtherInfoPage1;
import pages.selfassessment.FillInYourReturnAnyOtherInfoPage2;
import pages.selfassessment.FillInYourReturnNotPaidEnoughTaxPage;
import pages.selfassessment.FillInYourReturnOtherDebtsPage;
import pages.selfassessment.FillInYourReturnOverpaidTaxPage;
import pages.selfassessment.FillInYourReturnOverpaidTaxRepaymentPage;
import pages.selfassessment.FillInYourReturnPage;
import pages.selfassessment.FillInYourReturnUnderpaidTaxPage;
import pages.selfassessment.FillInYourReturnUnderpaidTaxPage2;
import pages.selfassessment.SaveYourReturnPage;
import pages.selfassessment.SelfAssessmentHomePage;
import pages.selfassessment.SubmitYourReturnDeclarationPage;
import pages.selfassessment.TailorYourReturnPage;
import pages.selfassessment.TailorYourReturnPage2;
import pages.selfassessment.TailorYourReturnPage3;
import pages.selfassessment.TaxReturnOptionsPage;
import pages.selfassessment.TellUsAboutYouPage;
import pages.selfassessment.ViewYourCalculationSummaryPage;
import pages.selfassessment.WelcomePage;
import resources.CreateWebDriver;
import resources.URLS;
import resources.UserInformation;
import resources.csvTools;

@RunWith(Parameterized.class)
public class BasicFlow {

	private static csvTools csvTools = new csvTools();
	private static WebDriver driver;
	public static OracleChecks oracleChecks;
	public static URLS urls;
	public static LoginPage loginPage;
	public static ExtraSecurityPage extraSecurityPage; 
	public static BusinessTaxAccountPage businessTaxAccountPage;
	public static SetUp2StepVerificationPage setUp2StepVerificationPage;
	public static SelfAssessmentHomePage selfAssessmentHomePage;
	public static TaxReturnOptionsPage taxReturnOptionsPage;
	public static WelcomePage welcomePage;
	public static TellUsAboutYouPage tellUsAboutYouPage;
	public static TailorYourReturnPage tailorYourReturnPage;
	public static TailorYourReturnPage2 tailorYourReturnPage2;
	public static TailorYourReturnPage3 tailorYourReturnPage3;
	public static FillInYourReturnPage fillInYourReturnPage;
	public static FillInYourReturnUnderpaidTaxPage fillInYourReturnUnderpaidTaxPage;
	public static FillInYourReturnUnderpaidTaxPage2 fillInYourReturnUnderpaidTaxPage2;
	public static FillInYourReturnOtherDebtsPage fillInYourReturnOtherDebtsPage;
	public static FillInYourReturnOverpaidTaxPage fillInYourReturnOverpaidTaxPage;
	public static FillInYourReturnOverpaidTaxRepaymentPage fillInYourReturnOverpaidTaxRepaymentPage;
	public static FillInYourReturnNotPaidEnoughTaxPage fillInYourReturnNotPaidEnoughTaxPage;
	public static FillInYourReturnAdjustmentsTaxDuePage fillInYourReturnAdjustmentsTaxDuePage;
	public static FillInYourReturnAnyOtherInfoPage1 fillInYourReturnAnyOtherInfoPage1;
	public static FillInYourReturnAnyOtherInfoPage2 fillInYourReturnAnyOtherInfoPage2;
	public static CheckYourReturnPage checkYourReturnPage;
	public static ViewYourCalculationSummaryPage viewYourCalculationSummaryPage;
	public static SaveYourReturnPage saveYourReturnPage;
	public static SubmitYourReturnDeclarationPage submitYourReturnDeclarationPage;

	public static UserInformation userInformation;
	public static BasePage page;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static RegistrationPage registrationPage;
	public static NewRegistrationSelectionPage newRegistrationSelectionPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	public static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "tsr_pro160628sh_17_SA_test1_NEW.csv";

	@Parameter public static Map<String, String> testDataRow;

	@Rule
	public TestName currentlyRunningTest = new TestName();

	//	@Rule
	//	public final ErrorCollector collector = new ErrorCollector();

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
		//		evidenceCollector = new resources.EvidenceCollector(Test.class.getName());
	}

	@Before
	public void setUp() throws Exception {
		csvTools.saveData(currentlyRunningTest, "Fail/Pass", "");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//		evidenceCollector.newTestCase();
	}

	@Test
	public void Test() throws Exception {

		try {

			/*
			 * New Government Gateway login page (URL -
			 * https://www-qa.tax.service.gov.uk/gg/sign-in?continue=/business-
			 * account)
			 */

			/* Start log */
			page.writeLog("=============== Start TEST CASE : Test1  =========================== "
					+ currentlyRunningTest.getMethodName());

			/* New registration page */
			driver.get(URLS.LOGINPAGEURL);
			extraSecurityPage = loginPage.loginUserSetUp(testDataRow.get("User ID"), testDataRow.get("Password"));
			//			businessTaxAccountPage = extraSecurityPage.clickNotNow();
			//			selfAssessmentHomePage = businessTaxAccountPage.redirectSA();
			selfAssessmentHomePage = extraSecurityPage.redirectSA(); //Use this redirect when dealing with 2FA new scripts - delete otherwise and uncomment above 2 lines
			taxReturnOptionsPage = selfAssessmentHomePage.clickTaxReturnOptions();
			welcomePage = taxReturnOptionsPage.clickFileReturn();

			tellUsAboutYouPage = welcomePage.clickStart();
			tellUsAboutYouPage.setFirstName(testDataRow.get("First name")); // From previous scripts this should be omitted
			tellUsAboutYouPage.setDOB(testDataRow.get("Date of birth")); // From previous scripts this should be omitted
			tellUsAboutYouPage.setRegistrationBlind(testDataRow.get("Are you or your spouse or civil partner registered blind on a local authority or other register?"));
			tellUsAboutYouPage.setStudentLoan(testDataRow.get("Did you receive notification from the Student Loans Company that repayment of an Income Contingent Student Loan began before 6 April 2016?"));

			tailorYourReturnPage = tellUsAboutYouPage.clickNext();
			tailorYourReturnPage.setTypeOfWorker(testDataRow.get("If you were an employee, director, office holder or agency worker, do you need to complete the employment section?"));
			tailorYourReturnPage.setSelfEmployed(testDataRow.get("Were you self-employed?"));
			//tailorYourReturnPage.setSelfEmployedBusiness(testDataRow.get("How many self-employed businesses did you have?"), testDataRow.get("Business 1 name")); //do not need this one for short path
			tailorYourReturnPage.setPartnership(testDataRow.get("Were you in a partnership?"));
			tailorYourReturnPage.setPropertyIncome(testDataRow.get("Did you receive income from UK Property?"));
			tailorYourReturnPage.setForeignIncome(testDataRow.get("If you received any foreign income, do you need to complete the foreign section? Please check help"));
			tailorYourReturnPage.setCapitalGains(testDataRow.get("If you disposed of any chargeable assets, or had any chargeable gains, or you wish to claim an allowable loss, or make any other claim or election, do you need to complete the Capital Gains section? Please check help"));

			tailorYourReturnPage2 = tailorYourReturnPage.clickNext();
			tailorYourReturnPage2.setUKInterest(testDataRow.get("Did you receive any interest etc, for example, from UK banks, UK building societies, UK unit trusts?"));
			tailorYourReturnPage2.setUKDividends(testDataRow.get("Did you receive any dividends, for example, UK companies, authorised unit trusts, open-ended investment companies, foreign companies (up to £300)?"));
			tailorYourReturnPage2.setUKPensions(testDataRow.get("Did you receive any UK pensions, annuities or state benefits, for example, state pension, occupational pension, retirement annuity, Incapacity Benefit?"));	
			tailorYourReturnPage2.setChildBenefit(testDataRow.get("Were you or your partner (if you have one) entitled to receive Child Benefit during the year 2015-16 (this applies if someone else claims Child Benefit for a child who lives with you and pays you for your child's upkeep)?"));
			tailorYourReturnPage2.setLumpSum(testDataRow.get("Did you receive any other UK income, for example, employment lump sums, share schemes, life insurance gains?"));
			tailorYourReturnPage2.setIncomeTaxLosses(testDataRow.get("Have you made any income tax losses in the year 2015-16?"));
			tailorYourReturnPage2.setLiablePensionSaving(testDataRow.get("Are you liable to pension savings tax charges or have you received payments from overseas pension schemes?"));

			tailorYourReturnPage3 = tailorYourReturnPage2.clickNext();
			tailorYourReturnPage3.setPensionContributions(testDataRow.get("Did you make contributions towards a personal pension or retirement annuity? This does not include payments you make to your employer's pension scheme, which are deducted from your pay"));
			tailorYourReturnPage3.setCharity(testDataRow.get("Did you give to charity?"));
			tailorYourReturnPage3.setMarriageAllowance(testDataRow.get("If you, or your spouse or civil partner, were born before 6 April 1935 do you want to claim married couple's allowance?"));
			tailorYourReturnPage3.setPersonalAllowance(testDataRow.get("Do you want to transfer 10% of your personal allowance to your spouse/civil partner? Please see help guidance"));
			tailorYourReturnPage3.setClaimOtherTaxRelief(testDataRow.get("Do you want to claim other tax reliefs and deductions, for example, community investment tax relief, venture capital, maintenance / alimony payments?"));
			tailorYourReturnPage3.setJobCentrePlus(testDataRow.get("Have you had any 2015-16 Income Tax refunded or off-set by us or JobCentre Plus?"));
			tailorYourReturnPage3.setTaxAdvisor(testDataRow.get("Did you have a tax adviser?"));
			tailorYourReturnPage3.setTaxAvoidance(testDataRow.get("Were you party to one or more tax avoidance schemes?"));
			tailorYourReturnPage3.setCapcity(testDataRow.get("Are you acting in capacity on behalf of someone else?"));

			fillInYourReturnPage = tailorYourReturnPage3.clickNext();

			fillInYourReturnUnderpaidTaxPage = fillInYourReturnPage.clickNextUnderpaidTax();
			fillInYourReturnUnderpaidTaxPage.setUnderpaidTax(testDataRow.get("Underpaid tax for earlier years included in your tax code for 2015-16 (from your PAYE Notice of Coding). Please enter '0' if there is nothing shown"));

			fillInYourReturnUnderpaidTaxPage2 = fillInYourReturnUnderpaidTaxPage.clickNext();
			fillInYourReturnUnderpaidTaxPage2.setEstimatedUnderpaidTax(testDataRow.get("Estimated underpaid tax for 2015-16 to be included in your PAYE tax code for 2016-17 (from your PAYE Notice of Coding). Please enter '0' if there is nothing shown"));

			fillInYourReturnOtherDebtsPage = fillInYourReturnUnderpaidTaxPage2.clickNext();
			fillInYourReturnOtherDebtsPage.setOutstandingDebt(testDataRow.get("Outstanding debt included in your tax code for 2015-16"));


			fillInYourReturnOverpaidTaxPage = fillInYourReturnOtherDebtsPage.clickNext();
			fillInYourReturnOverpaidTaxPage.setRepayment(testDataRow.get("Who will be receiving some or all of the repayment?"));
			fillInYourReturnOverpaidTaxPage.clickNext();

			fillInYourReturnOverpaidTaxRepaymentPage = fillInYourReturnOverpaidTaxPage.clickNextRepaymentPage();
			fillInYourReturnOverpaidTaxRepaymentPage.setNoBankAcc();
			fillInYourReturnNotPaidEnoughTaxPage = fillInYourReturnOverpaidTaxRepaymentPage.clickNext();
			fillInYourReturnAdjustmentsTaxDuePage = fillInYourReturnNotPaidEnoughTaxPage.clickNext();
			fillInYourReturnAnyOtherInfoPage1 = fillInYourReturnAdjustmentsTaxDuePage.clickNext();
			fillInYourReturnAnyOtherInfoPage1.setProvisionalEstimatedFigures(testDataRow.get("Does this return contain provisional or estimated figures? (If yes, please provide details on the next page )"));

			fillInYourReturnAnyOtherInfoPage2 = fillInYourReturnAnyOtherInfoPage1.clickNext();
			checkYourReturnPage = fillInYourReturnAnyOtherInfoPage2.clickNext();
			viewYourCalculationSummaryPage = checkYourReturnPage.clickNext();
			saveYourReturnPage = viewYourCalculationSummaryPage.clickNextGoToSaveYourReturnPage();
			submitYourReturnDeclarationPage = saveYourReturnPage.clickNext();
			submitYourReturnDeclarationPage.setDeclaration();

			oracleChecks = new OracleChecks(testDataRow.get("UTR"));

			/* Start DB Checks */
			page.writeLog("-------- Start DB Checking ------");
			page.writeLog(oracleChecks.executeUtrStatement());
			page.writeLog(oracleChecks.executeConversationIDStatement());
			page.writeLog(oracleChecks.executeTrackingEventStatement());
			page.writeLog("-------- End DB Checking ------");

		} finally {

			if(oracleChecks.checkSubmissionSuccessful()){
				//					csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Pass");
				page.writeLog("TEST PASSED - SUBMISSION SUCCESSFUL");
			} else {
				//					csvTools.saveData(currentlyRunningTest, "Fail/Pass", "Fail");
				page.writeLog("TEST FAILED - SUBMISSION UNSUCCESSFUL");
				{	
					/* End log */
					page.writeLog("=============== End TEST CASE : Test1  =========================== "
							+ currentlyRunningTest.getMethodName());
				}}
		}}


	@After
	public void tearDown() throws Exception {
		//		evidenceCollector.moveScreenshotsAndTestData(TEST_DATA_FILE_NAME);
	}

	@AfterClass
	public static void closeBrowser() throws Exception {

		// if (page.successCount != 0) {
		// evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,
		// evidenceCollector.testCaseEndTime, true, 1, 4, page.successCount);
		// }
		// if (page.failCount != 0) {
		// evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,
		// evidenceCollector.testCaseEndTime, false, 1, 4, page.failCount);
		// }

		//		driver.quit();

	}

}
