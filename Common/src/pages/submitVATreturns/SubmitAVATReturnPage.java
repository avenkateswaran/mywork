package pages.submitVATreturns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pages.BasePage;

public class SubmitAVATReturnPage extends BasePage{
  
	public SubmitAVATReturnPage(WebDriver driver) {
		super(driver);
		
		
		if(this.actualTitle().equals("HMRC: Your HMRC services"))
		{
			System.out.println("vat page");
			//setUpSharedSecretsPage = this.refresh();
			//setUpSharedSecretsPage.setupDetailsForm(gatewayRegistrationPage, sharedSecretQuestion1, sharedSecretQuestion2, sharedSecretQuestion3, sharedSecretQuestion4, sharedSecretQuestion5);
			this.expectedTitle = "HMRC: Your HMRC services";
			this.expectedHeading = "Your HMRC services";
			super.assertTitle().assertHeading();
		}
		
		if(this.actualTitle().equals("HMRC: Setup Shared Secrets"))
		{
			System.out.println("vat page");
			//setUpSharedSecretsPage = this.refresh();
			//setUpSharedSecretsPage.setupDetailsForm(gatewayRegistrationPage, sharedSecretQuestion1, sharedSecretQuestion2, sharedSecretQuestion3, sharedSecretQuestion4, sharedSecretQuestion5);
			this.expectedTitle = "HMRC: Setup Shared Secrets";
			this.expectedHeading = "Set up Shared Secrets";  
			super.assertTitle().assertHeading();
		}
		
		
	}

	public SubmitAVATReturnPage clickNext() {
		super.clickNext();
		return new SubmitAVATReturnPage(driver);
	}
	

	public SubmitAVATReturnPage submitReturnNewUI(BasePage pagefor, String Box1, String Box2, String Box4, String Box6, String Box7, String Box8, String Box9, String Username , String Password) {
//	     gatewayRegistrationPage.clickElement(locators.Common.linkEnrolVATReturn);
		System.out.println("New UI " + this.actualTitle().toString());
		System.out.println("came here  new ui");
		
		pagefor.waitForMilliSeconds(1000);
		
		pagefor.clickElement(locators.Common.fieldVATReturnButton);
		
		System.out.println("New UI3 " + this.actualTitle().toString());
		System.out.println("came here  new ui 3");
		
		if(this.actualTitle().equals("HMRC: Submit a return")){
			System.out.println(this.actualTitle().toString());
			pagefor.clickNext();
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='VAT0011']/div[2]/table/tbody"));
		List<WebElement> rows2 = driver.findElements(By.tagName("tr"));
		System.out.println("Total number of rows :"+ rows.size());
		System.out.println("Total number of rows2 :"+ rows2.size());
		List<WebElement> rows3 = driver.findElements(By .tagName("tbody"));
		System.out.println("Total number of rows3 :"+ rows3.size());
		downloadVATReturnPDF(pagefor);
	//	pagefor.clickElement(locators.Common.linkSubmitReturn);
	     driver.findElement(By.xpath("//*[@id='VAT0007']/div[2]/table/tbody/tr/td[1]/a")).click();
	      
	     pagefor.setText(locators.Common.fieldVATDueSales,Box1);
	     pagefor.setText(locators.Common.fieldVATAcquisations,Box2);
	     pagefor.setText(locators.Common.fieldVATReclaimedPurchases,Box4);
	     pagefor.setText(locators.Common.fieldTotalValueSales,Box6);
	     pagefor.setText(locators.Common.fieldTotalValuePurchases ,Box7);
	     pagefor.setText(locators.Common.fieldTotalValueSupplies,Box8 );
	     pagefor.setText(locators.Common.fieldTotalValueAcquisitions ,Box9);
	     pagefor.clickNext();
	     pagefor.clickSubmit();
	     
	     //Secuirty check 
	     pagefor.setText(locators.Common.fieldUserIdE,  Username );
	     pagefor.setText(locators.Common.fieldPasswordE, Password);
	     pagefor.clickSubmit();
	     
	     //Save the VAT Return 
	     pagefor.clickElement(locators.Common.linkDownloadVATReturnPdf);
	     Actions builder = new Actions(driver);
	     builder.keyDown(Keys.RIGHT);
	     //Get the current window handle
//	     String windowHandle = driver.getWindowHandle();
	     //Get the list of window handles
//	     ArrayList tabs = new ArrayList (driver.getWindowHandles());
//	     System.out.println(tabs.size());
	     //Use the list of window handles to switch between windows
//	     driver.switchTo().window((String) tabs.get(1));
	     //Switch back to original window
//	     driver.switchTo().window((String) tabs.get(0));
	     //Get the Submission Receipt 
	     pagefor.clickElement(locators.Common.SubmissionRecieptLink);
	     pagefor.clickNext();
	     
	     pagefor.writeLog(locators.Common.submissionRecieptref.toString());
	     return this;
	}
	
	public SubmitAVATReturnPage submitReturn(BasePage pagefor, String Box1, String Box2, String Box4, String Box6, String Box7, String Box8, String Box9,  String DDAccountHolderName, String DDAccountNumber, String DDSortcode , String Username , String Password) {
//	     gatewayRegistrationPage.clickElement(locators.Common.linkEnrolVATReturn);
		//pagefor.checkEnrolled("VAT EU Refunds");
		System.out.println("OLD UI " + this.actualTitle().toString());
		pagefor.waitForMilliSeconds(1000);
		pagefor.clickElement(locators.Common.linkEnrolVATReturn);
		pagefor.clickElement(locators.Common.linkSubmitReturn);
		
		System.out.println("Ready10");
		if(DDlinkcheck() ==true) {
			setUpDD(pagefor, DDAccountHolderName, DDAccountNumber, DDSortcode);
			pagefor.waitForMilliSeconds(1000);
			pagefor.clickElement(locators.Common.linkSubmitVAT);
			pagefor.waitForMilliSeconds(1000);
			pagefor.clickNext(); 
			pagefor.waitForMilliSeconds(1000);
		}
	     driver.findElement(By.xpath("//*[@id='VAT0007']/div[2]/table/tbody/tr/td[1]/a")).click();
	      
	     pagefor.setText(locators.Common.fieldVATDueSales,Box1);
	     pagefor.setText(locators.Common.fieldVATAcquisations,Box2);
	     pagefor.setText(locators.Common.fieldVATReclaimedPurchases,Box4);
	     pagefor.setText(locators.Common.fieldTotalValueSales,Box6);
	     pagefor.setText(locators.Common.fieldTotalValuePurchases ,Box7);
	     pagefor.setText(locators.Common.fieldTotalValueSupplies,Box8 );
	     pagefor.setText(locators.Common.fieldTotalValueAcquisitions ,Box9);
	     pagefor.clickNext();
	     pagefor.clickSubmit();
	     
	     //Secuirty check 
	     pagefor.setText(locators.Common.fieldUserIdE,  Username );
	     pagefor.setText(locators.Common.fieldPasswordE, Password);
	     pagefor.clickSubmit();
	     
	     return this;
	}
	
	public SubmitAVATReturnPage setUpDD(BasePage pagefor, String DDAccountHolderName, String DDAccountNumber, String DDSortcode){
		System.out.println("Ready4");
		pagefor.clickElement(locators.Common.linkSetUpDirectDebit);
		pagefor.setText(locators.Common.DDaccountholdername, DDAccountHolderName);
		pagefor.setText(locators.Common.DDaccountnumber, DDAccountNumber);
		pagefor.setText(locators.Common.DDsortcode, DDSortcode);
		pagefor.clickElement(locators.Common.DDaccept1);
		pagefor.clickElement(locators.Common.DDaccept2);
		//pagefor.clickSubmit();
		return this;
	}
	
	public boolean DDlinkcheck(){
	
		 if(driver.findElements(locators.Common.linkSetUpDirectDebit).size() >0)
			 return true;
					 
		 return false;
	}
	
	public boolean Activatelinkcheck(){
			
		if(driver.findElements(locators.Common.linkToActivateVAT).size() >0){
			 return true;
		 }
		else return false ; 
		
			}
		
	public boolean checkEnrolledOrNot(BasePage page){
		 page.clickElement(locators.Common.linkServiceEnrol);
		 if(driver.findElements(locators.Common.linkEnrolVAT).size() >0)
		 {//enrolForVATPage = page.clickVATLink();
		 return true; 
		 }
		 
		 else {
			 page.clickHomelinkButton();
			 return false; 
		 }
		 
	}
	
	public SubmitAVATReturnPage downloadVATReturnPDF(BasePage page)
	{
		System.out.println("In the download pdf method");
		page.clickElement(locators.Common.linkSubmittedVATLink);
		page.clickElement(locators.Common.linkViewSubmittedVATLink);
		page.clickElement(locators.Common.linkDownloadVATReturnPdf);
		
//		 String windowHandle = driver.getWindowHandle();
//         ArrayList tabs = new ArrayList (driver.getWindowHandles());
//	     System.out.println("Before thesubmission reciept one"+tabs.size());
	     //Get the Submission Receipt 
	     page.clickElement(locators.Common.SubmissionRecieptLink);
	     page.clickNext();	    
	     System.out.println("Just checking along" );
	     int value = driver.findElements(locators.Common.submissionRecieptref).size();  
	     System.out.println("See value : " +value);
	     System.out.println("Without s : " +driver.findElement(locators.Common.submissionRecieptref).getText());
	     page.writeLog(driver.findElement(locators.Common.submissionRecieptref).getText());
	     //TODO - Download the reciept pdf 
	    /* 
	     File file = new File("/some/absolute/path/myfile.ext");
	     OutputStream out = new FileOutputStream(file);
	     // Write your data
	     out.close();
	     */
	     page.clickElement(locators.Common.linkDownloadSubmissionRecieptRef);
//	     System.out.println("After tab link"+tabs.size());
	    // 
//	     tabs.clear();
//	     tabs = new ArrayList (driver.getWindowHandles());
//	     System.out.println("After tab link 2"+tabs.size());
//	     driver.switchTo().window((String) tabs.get(2)).findElement(locators.Common.buttonDownloadSubmissionRef).click();
        // driver.switchTo().window((String) tabs.get(2)).close();
         
   
	     page.clickNext();
	     
		return this; 
	}
	
	
	}
	
	
	

