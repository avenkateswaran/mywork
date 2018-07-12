package test.java.stepdefinitions;
import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;
import resources.CreateWebDriver;
import resources.EvidenceCollector;
import resources.readConfigfile;


@RunWith(Parameterized.class)
public class Hooks extends BasePage {
	
	public static resources.EvidenceCollector evidenceCollector;
	private static boolean testresultflg=true;
	private static String xmlfile=null;
	
	//public resources.EvidenceCollector evidenceCollector;
	public Hooks() {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
//	@BeforeClass
//	public void Setup() throws Exception {
//			
//		//read the config file and pass the browser type and the url 
//		readConfigfile.readConfig();
//		//evidenceCollector=new EvidenceCollector(getClass().getSimpleName());
//		System.out.println(evidenceCollector);
//		//evidenceCollector = getClass().getSimpleName();
//		
//
//	}
	
	@Before
	public void testsetUp() throws Exception {
			
		//read the config file and pass the browser type and the url 
		readConfigfile.readConfig();
		driver = CreateWebDriver.getDriver(readConfigfile.browserval);
		driver.get(readConfigfile.urlval);
		evidenceCollector=new EvidenceCollector(getClass().getSimpleName());
		evidenceCollector.newTestCase();

	}
	
	@After
	public static void closeBrowser() throws Exception {				
		driver.close();		
		evidenceCollector.moveScreenshots();
		//evidenceCollector = new resources.EvidenceCollector(verifyLogin.class.getName());
		if (testresultflg){
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 111, 4, 1);
		}else {
			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 111, 4, 1);
		}

	}
	
//	@AfterClass
//	public static void updatePortal() throws Exception {
//		
//		if (testresultflg){
//			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, true, 111, 4, 1);
//		}else {
//			evidenceCollector.reporter.createReport(evidenceCollector.testCaseStartTime,evidenceCollector.testCaseEndTime, false, 111, 4, 1);
//		}
//	}
	
	public static boolean isTestresultflg() {
		return testresultflg;
	}

	public static void setTestresultflg(boolean testresultflg) {
		Hooks.testresultflg = testresultflg;
	}

	public static String getXmlfile() {
		return xmlfile;
	}

	public static void setXmlfile(String xmlfile) {
		Hooks.xmlfile = xmlfile;
	}

	
	

}
