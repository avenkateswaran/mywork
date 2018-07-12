package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.machinegamesduty.AgentDetailsPage;

public class GatewayRegistrationPage extends BasePage {

	// Heading
	public String H1 = "HMRC: Create a Government Gateway account";
	public String H2 = "Automatic Exchange of Information (AEOI) registration";

	// SubHeading
	public String sH1 = "What to do next";
	public String sH2 = "About you";
	public String sH3 = "Create password and confirm terms and conditions";
	public String sH4 = "Note User ID";

	// Labels LabelinitialQuestion1 LabelinitialQuestion2
	public By fullName = By.id("FieldfullName");
	public By email = By.id("FieldemailAddress");
	public By conemail = By.id("FieldconfirmEmailAddress");
	public By passLab = By.id("Labelpassword");
	public By conpassLab = By.id("LabelconfirmPassword");
	public By warNing = By.id("NoteUserIDWarning");
	public By signOut = By.partialLinkText("Sign out");
	
	//Registration enrolment
	public By confirm = By.xpath("//*[@id='common0112']/div[2]/form/div[1]");
	public By confirmmain = By.xpath("//*[@id='common0031']/div[2]/form/div[1]");
	// TextFields
	public By passText = By.id("Fieldpassword");
	public By passText1 = By.id("FieldPassword");
	public By conpassText = By.id("FieldconfirmPassword");
	
	//Business account
	public By FindTax = By.id("add-a-tax");
	public By AddTaxCT = By.id("add-tax-ct");
	public By AddTaxSA = By.id("add-tax-sa");
	public By AddTaxPAYE = By.id("add-tax-employer");
	public By AddTaxVAT = By.id("add-tax-vat");
	public By AddTaxOther = By.id("add-tax-other");
	public By BA_Continue = By.id("continue-button");
	public By SignOut = By.id("logOutNavHref");
	public By SignBackIn = By.id("sign-back-in");
	public By RegistrationLinkContainer = By.id("registration-link-container");
	public By RegistrationLink1 = By.id("registration-link-1");
	
	//Business account - SA
	public By SAIndividual = By.id("add-sa-individual");
	public By SAPartnership = By.id("add-sa-partnership");
	public By SATrust = By.id("add-sa-trust");
	
	//Business account - Partnership
	public By ExistingPartner = By.id("yes-button");
	public By DoSomethingElse = By.id("no-button");
	
	//Business account - Trust
	public By RegisteredTrust = By.id("yes-button");
	public By NotRegistered = By.id("no-button");
	
	//Business account - VAT
	public By AddVAT = By.id("add-vat");
	public By AddECSalesList = By.id("add-vat-eu-refunds");
	public By AddEURefunds = By.id("add-vat-eu-refunds");
	public By AddRCSL = By.id("add-vat-rcsl");
	public By AddMOSS = By.id("add-vat-mossn");
	public By AddNOVA = By.id("add-vat-nova");
	public By YesVAT = By.id("yes-button");
	public By NoVAT = By.id("no-button");
	
	//Business account - Other
	public By OtherAlcohol = By.id("add-alcohol");
	public By OtherAEOI = By.id("add-aeoi");
	public By OtherCharities = By.id("add-charities");
	public By OtherGambling = By.id("add-gambling");
	public By OtherSomethingElse = By.id("add-other");
	
	//Business account - Charities
	public By YesCharRef = By.id("yes-button");
	public By NoCharRef = By.id("no-button");
	
	//Business account - Employers
	public By EmployerPAYE = By.id("add-employer-epaye");
	public By EmployerCIS = By.id("add-employer-cis");
	public By EmployerPension = By.id("add-employer-pension");
	public By EmployerERS = By.id("add-employer-ers");
	public By EmployerEI = By.id("add-employer-intermediaries");
	
	//Business account - Agents
	public By CharitiesForAgents = By.id("FieldToBeDetermined");
	public By CorpTaxForAgents = By.id("FieldCorporationTaxForAgents");
	public By MachineGamesDutyForAgents = By.id("FieldmachineGamesDuty");
	public By NotificationOfVehicleArrivals = By.id("FieldNovaForAgents");
	public By VATMiniOneStopShopForAgents = By.id("FieldMossForAgents");
	public By PayeCisErsForAgents = By.id("FieldPayeCISForAgents");
	public By SAForAgents = By.id("FieldSelfAssessmentForAgents");
	public By StampTaxesForAgents = By.id("FieldStampTaxesForAgents");
	public By VATForAgents = By.id("FieldVatForAgents");
	public By VATEURefundsForAgents = By.id("FieldEuVatForAgents");
	
	//Individual
	public By SelfAssessment = By.id("FieldSelfAssessment");
	public By SAFullName = By.id("FieldfullName");
	
	// LinkText
	public String LINKLOGINTEXT = "I have an account - login";
	public String LINKCREATEACCOUNTTEXT = "Create an account for me";
	
	// CheckBox
	public static By acceptTermsCheckbox = By.id("FieldtermsAndConditionsAccepted");
	
	public By LinkIndividual = By.id("LinkIndividual");
	
	public static String passTestResult = "=============== Test result: Pass - User successfully enrolled";
	public static String failTestResult = "=============== Test result: Fail";
	public static String failTestResultFinalScreen = "=============== Test result: Fail - Either the Known Facts have already been used or field validation on the enrolment screen rejected test data";

	public GatewayRegistrationPage(WebDriver driver) {
		super(driver);
	}

	public AgentDetailsPage AclickNext() {
		screenShot(driver);
		super.clickNext();
		// driver.findElement(locators.Common.Next_Button).click();
		return new AgentDetailsPage(driver);
	}

	// Enrol for Self Assessment
	public GatewayRegistrationPage enrolforSA(BasePage page, String UTRNo, String NINo, String PCode) {

		page.setText(locators.Common.fieldUTR, UTRNo);
		page.setText(locators.Common.fieldNI, NINo);
		page.setText(locators.Common.fieldPC, PCode);
		page.clickNext();	
//		page.assertElementIsDisplayed(confirm);
//		page.clickNext();
//		page.assertHeading("Your HMRC services");
//		page.clickElement(signOut);
//		

		return this;
	}
	// Enrol for Self Assessment Partnership
	public GatewayRegistrationPage enrolforSAPart(BasePage page, String UTRNo, String PCode) {
		page.setText(locators.Common.fieldUTR, UTRNo);
		page.setText(locators.Common.fieldPC, PCode);
		page.clickNext();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		page.assertElementIsDisplayed(confirmmain);
//		page.clickNext();
//		page.assertHeading("Your HMRC services");
//		page.clickElement(signOut);
		

		return this;
	}
	// Enrol for VAT, VAT EU Refunds, VAT Reverse Charge Sales List (RCSL)
	public GatewayRegistrationPage enrolforVATSales(BasePage page, String VRNNo, String princpleBusinessPostcode,String dateRegVAT, String finalMonthVATSubmitted, String amountLastVatSubmitted) {
		
		page.setText(locators.Common.fieldVRN, VRNNo);
		page.setText(locators.Common.fieldPostcode, princpleBusinessPostcode);
		page.setText(locators.Common.fieldDateofReg, dateRegVAT);
		page.setText(locators.Common.fieldPeriodEnd, finalMonthVATSubmitted);
		page.setText(locators.Common.fieldLastVATreturn, amountLastVatSubmitted);
		page.clickNext();
//		page.assertElementIsDisplayed(confirm);

		return this;
	}

	// Enrol for VAT EC Sales List (ECSL)
	public GatewayRegistrationPage enrolforVAT(BasePage page, String VRNNo, String branchID, String branchPostcode) {

		page.setText(locators.Common.fieldVRN, VRNNo);
		page.setText(locators.Common.fieldBranch, branchID);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage enrolforAgentCharitites(BasePage page, String CharRef, String CusRef, String branchPostcode) {

		page.setText(locators.Common.fieldCharitiesAgentRef, CharRef);
		page.setText(locators.Common.fieldAccRef, CusRef);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();	
		page.assertElementIsDisplayed(confirmmain);
		page.clickNext();
		page.assertHeading("Your HMRC services");
		page.clickElement(signOut);

		return this;
	}
	
	public GatewayRegistrationPage enrolforAgentCorpTax(BasePage page, String CorpTaxRef, String branchPostcode) {

		page.setText(locators.Common.fieldAgentRef, CorpTaxRef);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
//		if (driver.findElement((locators.Common.enrolFail)) != null)
//			page.clickNext().writeLog("Encountered error page");

		return this;
	}
	
	public GatewayRegistrationPage enrolforCorpTax(BasePage page, String CorpTaxRef, String CorpCRN,  String branchPostcode) {

		page.setText(locators.Common.fieldUTR, CorpTaxRef);
		page.setText(locators.Common.fieldCRN, CorpCRN);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
//		if (driver.findElement((locators.Common.enrolFail)) != null)
//			page.clickNext().writeLog("Encountered error page");

		return this;
	}
	public GatewayRegistrationPage enrolforAgentPAYE(BasePage page, String PAYERef, String branchPostcode) {

		page.setText(locators.Common.fieldAgentRef, PAYERef);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}
	public GatewayRegistrationPage enrolforAgentSA(BasePage page, String SARef, String branchPostcode) {
		page.setText(locators.Common.fieldAgentRef, SARef);
		page.setText(locators.Common.fieldPostcode, branchPostcode);
		page.clickNext();
//		if (driver.findElement((locators.Common.enrolFail)) != null)
//			page.clickNext().writeLog("Encountered error page");

		return this;
	}
	public GatewayRegistrationPage enrolforAgentVATSales(BasePage page, String VRNNo, String princpleBusinessPostcode,String dateRegVAT, String finalMonthVATSubmitted, String amountLastVatSubmitted) 
	{
		page.clickNext();
		page.setText(locators.Common.fieldVRN, VRNNo);
		page.setText(locators.Common.fieldPostcode, princpleBusinessPostcode);
		page.setText(locators.Common.fieldDateofReg, dateRegVAT);
		page.setText(locators.Common.fieldPeriodEnd, finalMonthVATSubmitted);
		page.setText(locators.Common.fieldLastVATreturn, amountLastVatSubmitted);
		page.clickNext();
//		page.assertElementIsDisplayed(confirm);

		return this;
	}

	public GatewayRegistrationPage enrolforAgentVATSalesNo2(BasePage page, String AgentVRNNo, String princpleBusinessPostcode) 
	{
		page.clickNext();
		page.setText(locators.Common.fieldVRNAgent, AgentVRNNo);
		page.setText(locators.Common.fieldPostcode, princpleBusinessPostcode);
		page.clickNext();
	//	page.assertElementIsDisplayed(confirm);

		return this;
	}
	
	public GatewayRegistrationPage enrolforAgentVATSalesNo3(BasePage page, String FullName, String princpleBusinessPostcode, String Addy1, String Addy2) 
	{
		page.clickNext();
		page.setText(locators.Common.fieldName, FullName);
		page.setText(locators.Common.VATfieldaddline1, Addy1);
		page.setText(locators.Common.VATfieldaddline2, Addy2);
		page.setText(locators.Common.fieldPostcode, princpleBusinessPostcode);
		page.clickNext();
	//	page.assertElementIsDisplayed(confirm);

		return this;
	}

	public GatewayRegistrationPage registrationDetailsAgent (BasePage page, String fullname, String emailadd, String OrgName) {
		page.setText(locators.Common.fieldName, fullname);
		page.setText(locators.Common.fieldOrgName, OrgName);
		page.setText(locators.Common.email_add, emailadd);
		page.setText(locators.Common.email_add_confirm, emailadd);
		page.clickNext();
		return this;
	}
	
	public GatewayRegistrationPage registrationDetails(BasePage page, String fullname, String emailadd) {
		page.setText(locators.Common.fieldName, fullname);
		page.setText(locators.Common.email_add, emailadd);
		page.setText(locators.Common.email_add_confirm, emailadd);
		page.clickNext();
		return this;
	}
	

	public GatewayRegistrationPage registrationPassword(BasePage page, String password) {
		page.setText(locators.Common.fieldPassword, password);
		page.setText(locators.Common.fieldPasswordConfrim, password);
		page.clickNext();

		return this;
	}

	public GatewayRegistrationPage charitiesServices(BasePage page, String HMRC_charity_ref, String postcode,
			String Last_4_digit_acc, String Customer_Account_Number) {
		// Enrol for charities services
		page.setText(locators.Common.fieldChar, HMRC_charity_ref);
		page.setText(locators.Common.fieldPostcode, postcode);
		page.setText(locators.Common.fieldBankAcc, Last_4_digit_acc);
		page.setText(locators.Common.fieldAccRef, Customer_Account_Number);
		page.clickNext();
		return this;
	}

	// Enrol for Construction Industry (CIS)
	public GatewayRegistrationPage constructionIndustry(BasePage page, String emp_ref_p1, String emp_ref_p2, String acc_ref) {
		page.setText(locators.Common.fieldTaxOfficeNo, emp_ref_p1);
		page.setText(locators.Common.fieldTaxOfficeRef, emp_ref_p2);
		page.setText(locators.Common.fieldAccOffRef, acc_ref);
		page.clickNext();
		//if (driver.findElement((locators.Common.enrolFail)) != null)
			//page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage dutyDefermentDDES(BasePage page, String Dept_App_DAN, String businessPostcode) {
		// Enrol for Duty Deferment Electronic Statements(DDES)
		page.setText(locators.Common.fieldDan, Dept_App_DAN);
		page.setText(locators.Common.fieldPostcode, businessPostcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage electronicBindingeBTI(BasePage page, String Trader_URN_TURN,
			String businessPostcode) {
		// Enrol for electronic Binding tariff information eBTI
		page.setText(locators.Common.fieldTURN, Trader_URN_TURN);
		page.setText(locators.Common.fieldPostcode, businessPostcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage employmenyIntermiaries(BasePage page, String emp_ref_p1, String emp_ref_p2,
			String acc_ref) {
		// Enrol for employment intermediaries
		page.setText(locators.Common.fieldTaxOfficeNo, emp_ref_p1);
		page.setText(locators.Common.fieldTaxOfficeRef, emp_ref_p2);
		page.setText(locators.Common.fieldAccOffRef, acc_ref);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage exciseMovement(BasePage page, String excise_reg_no, String postcode) {
		// Enrol for Excise movement and control systems
		page.setText(locators.Common.FieldExciseReg, excise_reg_no);
		page.setText(locators.Common.fieldPostcode, postcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage automaaticExchange(BasePage page, String auto_exchange, String postcode) {
		// Enrol for Automatic Exchange of Information
		page.setText(locators.Common.fieldFatca, auto_exchange);
		page.setText(locators.Common.fieldPostcode, postcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage importControls(BasePage page, String economic_oper_reg_no, String postcode) {
		// Enrol for import control systems
		page.setText(locators.Common.fieldTradeReg, economic_oper_reg_no);
		page.setText(locators.Common.fieldPostcode, postcode);
		page.clickNext();
		if (driver.findElement((locators.Common.enrolFail)) != null)
			page.clickNext().writeLog("Encountered error page");

		return this;
	}

	public GatewayRegistrationPage machineGamesDuty(BasePage page, String machine_duty_no, String postcode) {
		// enrol for machine games duty
		page.setText(locators.Common.fieldMachineGame, machine_duty_no);
		page.setText(locators.Common.fieldPostcode, postcode);
		page.clickNext();

		return this;
	}
	
	public LoginPage clickNext() {
		screenShot(driver);
		super.clickNext();
		return new LoginPage(driver);
		
	}
	
}
