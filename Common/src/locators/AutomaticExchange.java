package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AutomaticExchange extends BasePage
{

	public AutomaticExchange(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Heading 
	public String H1 = "Automatic Exchange of Information (AEOI) registration";
	public String H2 = "What you will need";
	public String H3 = "Registration summary";
	public String H4 = "Automatic Exchange of Information registration";
	public String H5 = "Registration details";
	public String H6 = "Declaration";
	public String H7 = "Security check";
	public String H8 = "Acknowledgment";
	
	//Subheading 
	public String sH2 = "Address details";
	public String sH3 = "User registration details - Confirmation";
	public String sH4 = "Reporting financial institution - Contact details";
	public String sH5 = "Reporting financial institution - Address details";
	public String sH6 = "Reporting financial institution - Confirmation";
	public String sH7 = "Overview";
	
	//Labels Fieldcountry1_opt 
	public By Que1 = By.id("LabelinitialQuestion1");
	public By Que2 = By.id("LabelinitialQuestion2");
	public By orgName = By.id("LabelcompanyName");
	public By fristLab = By.id("LabelfirstName");
	public By lastLab = By.id("LabellastName");
	public By phonLab = By.id("LabelcontactTelephoneNumber");
	public By buildName = By.id("LabelbuildingName");
	public By street = By.id("Labelstreet");
	public By ciTy = By.id("LabelcityTown");
	public By pCode = By.id("Labelpostcode");
	public By counTry = By.id("Labelcountry");
	public By orgCName = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/dl[1]/dt[1]");
	public By fristCLab = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/dl[1]/dt[2]");
	public By lastCLab = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/dl[1]/dt[3]");
	public By phonCLab = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/dl[1]/dt[4]");
	public By emailCLab = By.xpath("//*[@id='top']/div[3]/div[2]/div/div[2]/dl[1]/dt[5]");
	public By gIin = By.id("Labelgiin");
	public By nIin = By.id("LabelnationalInsuranceNumber");

	//Fields
	public By orgFName = By.id("FieldcompanyName");
	public By fristFLab = By.id("FieldfirstName");
	public By lastFLab = By.id("FieldlastName");
	public By phonFLab = By.id("FieldcontactTelephoneNumber");
	public By buildFName = By.id("FieldbuildingName");
	public By streetF = By.id("Fieldstreet");
	public By ciTyF = By.id("FieldcityTown");
	public By pFCode = By.id("Fieldpostcode");
	public By FcounTry  = By.id("Fieldcountry1_opt");
	public By fGiin = By.id("Fieldgiin");
	public By fNiin = By.id("FieldnationalInsuranceNumber");
	public By fUser = By.id("FieldUserID");
	
	

	//Menu 
	public By menU = By.id("main-menu");
	
	//CheckBox FielddeclareSignUpInformation
	public  By chkBox0 = By.id("FielddeclareSignUpInformation");
	public  By chkBox = By.id("FieldinitialQuestion2");
	//drop Selection  
	public String drp1 = "Fieldcountry1_opt";
	
	//images 						
	public  By toDo = By.xpath("//*[@id='portletFatcaNotificationSummary']/div/table/tbody/tr/td[2]/ul[1]/li/img");
	public  By toDo1 = By.xpath("//*[@id='portletFatcaNotificationSummary']/div/table/tbody/tr/td[2]/ul[2]/li/img");


}
