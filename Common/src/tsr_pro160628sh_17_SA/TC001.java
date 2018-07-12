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
import pages.SecurityCheckPage;
import pages.SetUp2StepVerificationPage;
import pages.selfassessment.CheckYourReturnPage;
import pages.selfassessment.FillInYourReturnAddAttachmentPage;
import pages.selfassessment.FillInYourReturnAdjustmentsTaxDuePage;
import pages.selfassessment.FillInYourReturnAnyOtherInfoPage;
import pages.selfassessment.FillInYourReturnAnyOtherInfoPage1;
import pages.selfassessment.FillInYourReturnAnyOtherInfoPage2;
import pages.selfassessment.FillInYourReturnCapitalSectionPage;
import pages.selfassessment.FillInYourReturnDetailsOfChargeableAssetsPage;
import pages.selfassessment.FillInYourReturnDividendsPage;
import pages.selfassessment.FillInYourReturnHelpInCompletingCapitalGainsPage;
import pages.selfassessment.FillInYourReturnListedSharesAndSecuritiesPage;
import pages.selfassessment.FillInYourReturnLossesAndAdjustmentsPage;
import pages.selfassessment.FillInYourReturnNotPaidEnoughTaxPage;
import pages.selfassessment.FillInYourReturnOtherDebtsPage;
import pages.selfassessment.FillInYourReturnOtherPropertyPage;
import pages.selfassessment.FillInYourReturnOverpaidTaxPage;
import pages.selfassessment.FillInYourReturnOverpaidTaxRepaymentPage;
import pages.selfassessment.FillInYourReturnPage;
import pages.selfassessment.FillInYourReturnUKInterestPage;
import pages.selfassessment.FillInYourReturnUnderpaidTaxPage;
import pages.selfassessment.FillInYourReturnUnderpaidTaxPage2;
import pages.selfassessment.FillInYourReturnUnlistedSharesAndSecuritiesPage;
import pages.selfassessment.SaveYourReturnPage;
import pages.selfassessment.SelfAssessmentHomePage;
import pages.selfassessment.SubmitYourReturnDeclarationPage;
import pages.selfassessment.SubmitYourReturnPage;
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
public class TC001 {

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
	public static FillInYourReturnOtherPropertyPage fillInYourReturnOtherPropertyPage;
	public static FillInYourReturnDetailsOfChargeableAssetsPage fillInYourReturnDetailsOfChargeableAssetsPage;
	public static FillInYourReturnHelpInCompletingCapitalGainsPage fillInYourReturnHelpInCompletingCapitalGainsPage;
	public static FillInYourReturnCapitalSectionPage fillInYourReturnCapitalSectionPage;
	public static FillInYourReturnListedSharesAndSecuritiesPage fillInYourReturnListedSharesAndSecuritiesPage;
	public static FillInYourReturnUnlistedSharesAndSecuritiesPage fillInYourReturnUnlistedSharesAndSecuritiesPage;
	public static FillInYourReturnLossesAndAdjustmentsPage fillInYourReturnLossesAndAdjustmentsPage;
	public static FillInYourReturnAddAttachmentPage fillInYourReturnAddAttachmentPage;
	public static FillInYourReturnAnyOtherInfoPage fillInYourReturnAnyOtherInfoPage;
	public static FillInYourReturnUKInterestPage fillInYourReturnUKInterestPage;
	public static FillInYourReturnDividendsPage fillInYourReturnDividendsPage;
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
	public static SecurityCheckPage securityCheckPage;
	public static SubmitYourReturnPage submitYourReturnPage;
	public static UserInformation userInformation;
	public static BasePage page;
	public static RegistrationSelectionPage registrationSelectionPage;
	public static RegistrationPage registrationPage;
	public static NewRegistrationSelectionPage newRegistrationSelectionPage;
	public static GatewayRegistrationPage gatewayRegistrationPage;
	public static GatewayDetailsPage gatewayDetailsPage;
	public static RegistrationSuccessPage registrationSuccessPage;
	public static resources.EvidenceCollector evidenceCollector;
	private static final String TEST_DATA_FILE_NAME = "Organisation SA - TC001.csv";

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
			
			//Above will need to be looked at - need to sort out 2FA for Organisation accounts
			
			/* Tell us about you page */
			tellUsAboutYouPage = welcomePage.clickStart();
			tellUsAboutYouPage.setFirstName(testDataRow.get("First name")); // From previous scripts this should be omitted
			tellUsAboutYouPage.setDOB(testDataRow.get("Date of birth")); // From previous scripts this should be omitted
			tellUsAboutYouPage.setRegistrationBlind(testDataRow.get("Are you or your spouse or civil partner registered blind on a local authority or other register?"));
			tellUsAboutYouPage.setStudentLoan(testDataRow.get("Did you receive notification from the Student Loans Company that repayment of an Income Contingent Student Loan began before 6 April 2016?"));
			tailorYourReturnPage = tellUsAboutYouPage.clickNext();
			
			/* Tailor your return page 1 */
			tailorYourReturnPage.setTypeOfWorker(testDataRow.get("Were you an employee (or director or office holder) or agency worker in the year to 5 April 2017?"));
			tailorYourReturnPage.setSelfEmployed(testDataRow.get("Were you self-employed?"));
			tailorYourReturnPage.setPartnership(testDataRow.get("Were you in a partnership?"));
			tailorYourReturnPage.setPropertyIncome(testDataRow.get("Did you receive income from UK Property?"));
			tailorYourReturnPage.setForeignIncome(testDataRow.get("If you received any foreign income, do you need to complete the foreign section? Please check help"));
			tailorYourReturnPage.setCapitalGains(testDataRow.get("If you disposed of any chargeable assets, or had any chargeable gains, or you wish to claim an allowable loss, or make any other claim or election, do you need to complete the Capital Gains section? Please check help"));
			tailorYourReturnPage2 = tailorYourReturnPage.clickNext();
			
			/* Tailor your return page 2 */
			tailorYourReturnPage2.setUKInterest(testDataRow.get("Did you receive any interest etc, for example, from UK banks, UK building societies, UK unit trusts?"));
			tailorYourReturnPage2.setUKDividends(testDataRow.get("Did you receive any dividends, for example, UK companies, authorised unit trusts, open-ended investment companies, foreign companies (up to £300)?"));
			tailorYourReturnPage2.setUKPensions(testDataRow.get("Did you receive any UK pensions, annuities or state benefits, for example, state pension, occupational pension, retirement annuity, Incapacity Benefit?"));	
			tailorYourReturnPage2.setChildBenefit(testDataRow.get("Were you or your partner (if you have one) entitled to receive Child Benefit during the year 2015-16 (this applies if someone else claims Child Benefit for a child who lives with you and pays you for your child's upkeep)?"));
			tailorYourReturnPage2.setLumpSum(testDataRow.get("Did you receive any other UK income, for example, employment lump sums, share schemes, life insurance gains?"));
			tailorYourReturnPage2.setIncomeTaxLosses(testDataRow.get("Have you made any income tax losses in the year 2015-16?"));
			tailorYourReturnPage2.setLiablePensionSaving(testDataRow.get("Are you liable to pension savings tax charges or have you received payments from overseas pension schemes?"));
			tailorYourReturnPage3 = tailorYourReturnPage2.clickNext();
			
			/* Tailor your return page 3 */
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
			
			/* Fill in your return page */
			fillInYourReturnDetailsOfChargeableAssetsPage = fillInYourReturnPage.clickNextCapitalGains();
			
			/* Fill in your return - Details of chargeable assets page */
			fillInYourReturnDetailsOfChargeableAssetsPage.setDisposeOfChargeableAssets(testDataRow.get("Did you dispose of chargeable assets worth more than £44,400?"));
			fillInYourReturnHelpInCompletingCapitalGainsPage = fillInYourReturnDetailsOfChargeableAssetsPage.clickNext();
			
			/* Fill in your return - Help in completing capital gains page */
			fillInYourReturnHelpInCompletingCapitalGainsPage.setCapitalGainsComputationWorksheet(testDataRow.get("Do you want to use the capital gains computation worksheet for any of your disposals?"));
			fillInYourReturnCapitalSectionPage = fillInYourReturnHelpInCompletingCapitalGainsPage.clickNext();
			
			/* Fill in your return - Capital section page */
			fillInYourReturnCapitalSectionPage.setShowOtherProperty();
			fillInYourReturnCapitalSectionPage.setShowListedSharesAndSecurities();
			fillInYourReturnCapitalSectionPage.setShowUnlistedSharesAndSecurities();
			fillInYourReturnOtherPropertyPage = fillInYourReturnCapitalSectionPage.clickNextOtherProperty();
			
			/* Fill in your return - Other property page */
			fillInYourReturnOtherPropertyPage.setClaimOrElections(testDataRow.get("Other property - Are you making any claims or elections?"));
			fillInYourReturnOtherPropertyPage.setMakeClaimsOrElections(testDataRow.get("Other property - If you are making any claims or elections, select the relevant code"));
			fillInYourReturnListedSharesAndSecuritiesPage = fillInYourReturnOtherPropertyPage.clickNextListedShares();
								
			/* Fill in your return - Listed shares and securities page */
			fillInYourReturnListedSharesAndSecuritiesPage.setNumberOfDisposals(testDataRow.get("Listed shares and securities - Number of disposals"));
			fillInYourReturnListedSharesAndSecuritiesPage.setDisposalProceeds(testDataRow.get("Listed shares and securities - Disposal proceeds"));
			fillInYourReturnListedSharesAndSecuritiesPage.setGainsInTheYearBeforeLosses(testDataRow.get("Listed shares and securities - Gains in the year, before losses"));
			fillInYourReturnUnlistedSharesAndSecuritiesPage = fillInYourReturnListedSharesAndSecuritiesPage.clickNextUnlistedShares();
			
			/* Fill in your return - Unlisted shares and securities page */
			fillInYourReturnUnlistedSharesAndSecuritiesPage.setNumberOfDisposals(testDataRow.get("Unlisted shares and securities - Number of disposals"));
			fillInYourReturnUnlistedSharesAndSecuritiesPage.setDisposalProceeds(testDataRow.get("Unlisted shares and securities - Disposal proceeds"));
			fillInYourReturnUnlistedSharesAndSecuritiesPage.setGainsInTheYearBeforeLosses(testDataRow.get("Unlisted shares and securities - Gains in the year, before losses"));
			fillInYourReturnLossesAndAdjustmentsPage = fillInYourReturnUnlistedSharesAndSecuritiesPage.clickNext();
			
			/* Fill in your return - Losses and adjustments page */
			fillInYourReturnAddAttachmentPage = fillInYourReturnLossesAndAdjustmentsPage.clickNext();
			fillInYourReturnLossesAndAdjustmentsPage.setLossesBroughtForward(testDataRow.get("Losses brought forward and used in-year"));
			fillInYourReturnLossesAndAdjustmentsPage.setGainsEntrepreneursReliefOnOrAfter(testDataRow.get("Gains qualifying for Entrepreneurs’ Relief - Gains on or after 23 June 2010"));
			
			/* Fill in your return - Add attachments */
			fillInYourReturnAnyOtherInfoPage = fillInYourReturnAddAttachmentPage.clickNext();
			
			/* Fill in your return - Any other information page */
			fillInYourReturnAnyOtherInfoPage.setOtherInfoCGT(testDataRow.get("Please give any other information about capital gains below"));
			fillInYourReturnUKInterestPage = fillInYourReturnAnyOtherInfoPage.clickNextUKInterest();
			
			/* Fill in your return - UK interest page */
			fillInYourReturnUKInterestPage.setTaxedUKInterest(testDataRow.get("Taxed UK interest etc. Enter net amount after tax has been taken off"));
			fillInYourReturnUKInterestPage.setUntaxedUKInterest(testDataRow.get("Untaxed UK interest etc (amounts which have not been taxed). Enter total amount"));
			fillInYourReturnDividendsPage = fillInYourReturnUKInterestPage.clickNextDividends();
			
			/* Fill in your return - Dividends */
			fillInYourReturnDividendsPage.setDividendsFromUKCompanies(testDataRow.get("Dividends from UK companies. The amount received"));
			
			/* Fill in your return - Underpaid tax page */
			fillInYourReturnUnderpaidTaxPage = fillInYourReturnPage.clickNextUnderpaidTax();
			fillInYourReturnUnderpaidTaxPage.setUnderpaidTax(testDataRow.get("Underpaid tax for earlier years included in your tax code for 2015-16 (from your PAYE Notice of Coding). Please enter '0' if there is nothing shown"));
			fillInYourReturnUnderpaidTaxPage2 = fillInYourReturnUnderpaidTaxPage.clickNext();
			
			/* Fill in your return - Underpaid tax page 2 */
			fillInYourReturnUnderpaidTaxPage2.setEstimatedUnderpaidTax(testDataRow.get("Estimated underpaid tax for 2015-16 to be included in your PAYE tax code for 2016-17 (from your PAYE Notice of Coding). Please enter '0' if there is nothing shown"));
			fillInYourReturnOtherDebtsPage = fillInYourReturnUnderpaidTaxPage2.clickNext();
			
			/* Fill in your return - Other debts page */
			fillInYourReturnOtherDebtsPage.setOutstandingDebt(testDataRow.get("Outstanding debt included in your tax code for 2015-16"));
			fillInYourReturnOverpaidTaxPage = fillInYourReturnOtherDebtsPage.clickNext();
			
			/* Fill in your return - Overpaid tax page */
			fillInYourReturnNotPaidEnoughTaxPage = fillInYourReturnOverpaidTaxPage.clickNextNotPaidEnoughTaxPage();
			
			/* Fill in your return - Not paid enough tax page */
			fillInYourReturnAdjustmentsTaxDuePage = fillInYourReturnNotPaidEnoughTaxPage.clickNext();
			
			/* Fill in your return - Adjustments to tax due page */
			fillInYourReturnAnyOtherInfoPage1 = fillInYourReturnAdjustmentsTaxDuePage.clickNext();
			
			/* Fill in your return - Any other information page */
			fillInYourReturnAnyOtherInfoPage1.setProvisionalEstimatedFigures(testDataRow.get("Does this return contain provisional or estimated figures? (If yes, please provide details on the next page )"));
			fillInYourReturnAnyOtherInfoPage2 = fillInYourReturnAnyOtherInfoPage1.clickNext();
			
			/* Fill in your return - Any other information page 2 */
			checkYourReturnPage = fillInYourReturnAnyOtherInfoPage2.clickNext();
			
			/* Check your return page */
			viewYourCalculationSummaryPage = checkYourReturnPage.clickNext();
			
			/* View your calculation summary page */
			saveYourReturnPage = viewYourCalculationSummaryPage.clickNextGoToSaveYourReturnPage();
			
			/* Save your return page */
			submitYourReturnDeclarationPage = saveYourReturnPage.clickNext();
			
			/* Submit your return declaration page */
			submitYourReturnDeclarationPage.setDeclaration();
			securityCheckPage = submitYourReturnDeclarationPage.clickNextGoToSecurityCheckPage();
			
			/* Security page */
			submitYourReturnPage = securityCheckPage.reauthenticateUser(testDataRow.get("User ID"), testDataRow.get("Password")); // Once the driver has moved to the Submit your return page it will assert the page title and heading, we could check other elements at this point to confirm that the return has successfully been submitted
			
			/* Start DB Checks */
			oracleChecks = new OracleChecks(testDataRow.get("UTR"));
			
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
