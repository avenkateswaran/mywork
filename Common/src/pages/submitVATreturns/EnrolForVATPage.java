package pages.submitVATreturns;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class EnrolForVATPage extends BasePage{

		public EnrolForVATPage(WebDriver driver) {
			super(driver);
			this.expectedTitle = "HMRC: Enrol for VAT";
			this.expectedHeading = "Enrol for VAT";
			super.assertTitle().assertHeading();
		}
		
		public EnrolForVATPage clickNext() {
			super.clickNext();
			return new EnrolForVATPage(driver);
		}
		
		public EnrolForVATPage enrolforVATSales(BasePage page, String VRNNo,String princpleBusinessPostcode, String dateRegVAT, String finalMonthVATSubmitted, String amountLastVatSubmitted)
		{
			page.setText(locators.Common.fieldVRN, VRNNo);
			page.setText(locators.Common.fieldPostcode,princpleBusinessPostcode);
			page.setText(locators.Common.fieldDateofReg,dateRegVAT);
			page.setText(locators.Common.fieldPeriodEnd,finalMonthVATSubmitted);
			page.setText(locators.Common.fieldLastVATreturn,amountLastVatSubmitted);
			page.clickNext();  
	         if(driver.findElement((locators.Common.enrolFail)) != null)
	        	 page.clickNext().writeLog("Encountered error page"); 
	         
	         return this;
		}
		
		
		
}