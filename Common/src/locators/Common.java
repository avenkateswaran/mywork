package locators;

import org.openqa.selenium.By;

public class Common {
	
	public static By Next_Button = By.xpath("//input[@value='Next']");
	public static By Back_Button = By.xpath("//input[@value='Back']");
	public static By logginedInUser = By.className("name");
	public static By taxPayerName = By.id("DataTaxPayerName");
	public static By DataOrgName = By.id("DataOrgName");
	public static By Submit_Button = By.xpath("//input[@value='Submit']");
	public static By Activate_Button = By.xpath("//input[@value='Activate']");
	public static By Delete = By.xpath("//input[@value='Delete']");
	public static By LogOut = By.linkText("Sign out");
	public static By Exit = By.xpath("//input[@value='Exit']");
	public static By RegSumButton = By.xpath("//input[@value='Registration summary']");
	public static By ChangeAddressButton = By.xpath("//input[@value='Change address']");
	public static By Save_Button = By.xpath("//input[@value='Save']");
	public static By Check_your_progress_Button = By.xpath("//input[@value='Check your progress']");
	public static By Add_businesses_Button = By.xpath("//input[@value='Add businesses']");
	public static By continue_Button = By.id("continue");
	public static By DataOrgIdentifier = By.xpath("//*[@id='DataOrgIdentifier']/dd[1]");
	public static By signOut = By.linkText("Sign out");
	public static By utr = By.xpath("//dl[@id='DataTaxPayerIdentifier']/dd[1]");
	
	
	/**********************************************************************************
	 * Tess 
	 **********************************************************************************/
	
	public static By FullName = By.id("fullName");
	public static By EmailAddress = By.id("email");
	public static By Password = By.id("password");
	public static By PasswordConfirm = By.id("passwordConfirm");
	public static By FieldPassword = By.id("Fieldpassword");
	public static By FieldPasswordConfirm = By.id("FieldconfirmPassword");
	
	public static By fieldName = By.id("FieldfullName");
	public static By email_add = By.id("FieldemailAddress");
	public static By email_add_confirm = By.id("FieldconfirmEmailAddress");
	public static By fieldPassword = By.id("Fieldpassword");
	public static By fieldPasswordConfrim = By.id("FieldconfirmPassword");
	public static By RegistrationGateWayUserId = By.id("registration-completed-userid");
	public static By RegistrationGateWayUserIdCard = By.xpath("//*[@id='gateway-card']/dl/dd");
	public static By gatewayUserId = By.id("gateway-user-id");
	public static By fieldUTR = By.id("FieldUTR");
	public static By fieldNI = By.id("FieldNINO");
	public static By fieldPC = By.id("FieldpostCode");
	public static By enrolFail = By.id("enrolmentFailure");
	public static By Charities = By.id("FieldToBeDetermined");
	public static By CT = By.id("LabelCorporationTax");
	public static By SelfAssesment = By.id("FieldSelfAssessment");
	public static By SelfAssesmentPart = By.id("FieldSelfAssessmentForPartnerships");
	public static By SelfAssesmentTrust = By.id("FieldSelfAssessmentForTrusts");
	public static By VAT = By.id("FieldVATMakeVATReturn");
	public static By VAT2 = By.id("FieldSelfAssessment");
	public static By PAYE = By.id("FieldPayeForEmployers");
	public static By AgentCHAR = By.xpath("//*[@id='FieldToBeDetermined']");
	public static By AgentCoprTax = By.id("LabelCorporationTaxForAgents");
	public static By AgentPAYE = By.id("FieldPayeCISForAgents");
	public static By AgentSA = By.id("FieldSelfAssessmentForAgents");
	public static By AgentVAT = By.id("FieldVatForAgents");
	public static By fieldVRN = By.id("FieldVRN");
	public static By fieldVRNAgent = By.id("FieldagentReference");
	public static By fieldPostcode = By.id("FieldpostCode");
	public static By fieldDateofReg = By.id("FielddateOfRegistration");
	public static By fieldPeriodEnd = By.id("FieldperiodEnd");
	public static By fieldLastVATreturn = By.id("FieldlastVatReturn" );
	public static By fieldBranch = By.id("FieldbranchId");
    public static By fieldChar = By.id("FieldcharID");
    public static By fieldBankAcc = By.id("FieldbankAccountNumber");
    public static By fieldAccRef = By.id("FieldcustomerAccRef");
    public static By fieldTaxOfficeNo = By.id("FieldtaxOfficeNumber");
    public static By fieldTaxOfficeRef = By.id("FieldtaxOfficeReference");
    public static By fieldAccOffRef = By.id("FieldaccountsOfficeReference");
    public static By fieldCRN = By.id("FieldCRN");
    
    public static By fieldDan = By.id("FieldDAN");
    public static By fieldTURN = By.id("FieldTURN");
    public static By FieldExciseReg = By.id("FieldexciseRegistrationNumber");
    public static By fieldFatca = By.id("FieldfatcaId");
    public static By fieldTradeReg = By.id("FieldeoriTraderRegistrationNumber");
    public static By fieldMachineGame = By.id("FieldmachineGamesDutyRegNo");
    
    public static By fieldUserIdE = By.id("FieldUserID");
    public static By fieldPasswordE = By.id("FieldPassword");
    
	//Tess 19/2/06 
    public static By fieldOrgName = By.id("FieldorganisationName");
    public static By fieldCharitiesAgentRef =By.id("FieldagentCharID");
	public static By fieldAgentRef = By.id("FieldagentReference");
	public static By fieldmgAgentRefavailable = By.id("FieldmgdAgentRefAvailable");
    public static By fieldTelephoneno = By.id("FieldcontactNumber");
    public static By fieldMobilenumber = By.id("FieldmobileNumber");
    public static By fieldFaxnumber = By.id("FieldfaxNumber"); 
    public static By fieldHousenumber = By.id("FieldhouseId");
    public static By findAddButton = By.xpath("//input[@value='Find address']");
    public static By fieldNonUKAddbutton = By.xpath("//input[@value='Non-UK address']");
    public static By fieldaddline1 = By.id("Fieldline1");
    public static By fieldaddline2 = By.id("Fieldline2");
    public static By fieldaddline3 = By.id("Fieldline3");
    public static By fieldaddline4 = By.id("Fieldline4");
    public static By fieldCountry = By.id("Fieldcountry");
    public static By fieldSchemeAdministrator = By.id("FieldschemeAdministratorId");
    public static By fieldUsername = By.id("FielduserName");
    public static By linkEnrolVATReturn = By.id("LinkAccessVATMakeVATReturn");
	public static By linkServicesCanUSe = By.id("linkServicesYouCanUse");
	public static By linkServiceEnrol= By.id("linkservicesYouCanEnrol");
	public static By linkSubmitReturn = By.id("LinkSubmitAReturn");
	public static By linkHomebuttom = By.xpath("//*[@id='main-menu']/li[2]/a");
	public static By linkEnrolVATfromAcces = By.id("LinkEnrolVATChangeRegistrationDetails");
	
	//VAT RETURN Submit 
	public static By VATfieldaddline1 = By.id("FieldaddressLine1");
	public static By VATfieldaddline2 = By.id("FieldaddressLine2");
	public static By VATfieldaddline3 = By.id("FieldaddressLine3");
	public static By fieldVATDueSales = By.id("FieldvatBox1");
	public static By fieldVATAcquisations = By.id("FieldvatBox2");
	public static By fieldVATReclaimedPurchases = By.id("FieldvatBox4");
	public static By fieldTotalValueSales = By.id("FieldvatBox6");
	public static By fieldTotalValuePurchases = By.id("FieldvatBox7");
	public static By fieldTotalValueSupplies = By.id("FieldvatBox8");
	public static By fieldTotalValueAcquisitions = By.id("FieldvatBox9");
	public static By fieldVATReturnButton = By.id("vat-file-return-link");
	public static By linkDownloadVATReturnPdf = By.xpath("//*[@id='VAT0010']/div[2]/ul/li/a");
	public static By SubmissionRecieptLink = By.xpath("//*[@id='VAT0010']/div[2]/div[2]/p/a[1]");
	public static By submissionRecieptref = By.xpath("//*[@id='VAT0037']/div[2]/div[2]/p");
	public static By linkSubmittedVATLink = By.id("LinkNavbarViewSubmittedReturns");
	public static By linkViewSubmittedVATLink = By.xpath("//*[@id='VAT0011']/div[2]/table/tbody/tr[1]/td[6]/a");
	public static By linkDownloadSubmissionRecieptRef = By.xpath("//*[@id='VAT0037']/div[2]/div[4]/a");
    public static By buttonDownloadSubmissionRef = By.xpath("//*[@id='VAT0038']/div[2]/form/div/input[2]");
	/**********************************************************************************
	 * Kofi 
	 **********************************************************************************/
	public static String gaTeway = "gateway-user-id";
	public static By Submit_Button2 = By.xpath("//*[@id='next']");
	public static By logOut_Button = By.xpath("//*[@id='top']/div[3]/div/ul/li[1]/a");
	public static By Downlaod = By.id("Download");
	
	//Tess - VAT Return 
	public static By fieldSharedQuestion1 = By.id("questions[0].answer");
	public static By fieldSharedQuestion2 = By.id("questions[1].answer");
	public static By fieldSharedQuestion3 = By.id("questions[2].answer");
	public static By fieldSharedQuestion4 = By.id("questions[3].answer");
	public static By fieldSharedQuestion5 = By.id("questions[4].answer");
	
	public static By linkToActivateVAT = By.id("LinkActivateVATChangeRegistrationDetails");
	public static By fieldActivateId = By.id("FieldactivationPin");
	
	public static By linkSetUpDirectDebit = By.id("LinkSetUpDirectDebit");
	public static By DDaccountholdername = By.id("FieldaccountHoldersName");
	public static By DDaccountnumber = By.id("FieldaccountNumber");
	public static By DDsortcode = By.id("FieldbankSortCode");
	public static By DDaccept1 = By.id("FieldownerOfAccount");
	public static By DDaccept2 = By.id("FielddoesNotRequireMultipleSignatories");
	public static By linkSubmitVAT = By.id("LinkNavbarSubmitAReturn");
	
	public static By linkEnrolVAT = By.id("LinkEnrolVAT");
	public static By clickCheckboxAcceptTC =By.id("FieldreadTermsAndConditions");
}
