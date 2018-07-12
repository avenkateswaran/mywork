package pages.submitVATreturns;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SetUpSharedSecretsPage extends BasePage{

	public SetUpSharedSecretsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Setup Shared Secrets";
		this.expectedHeading = "Set up Shared Secrets";
		super.assertTitle().assertHeading();
	}

	public SetUpSharedSecretsPage clickNext() {
		super.clickNext();
		return new SetUpSharedSecretsPage(driver);
	}
	
	public SetUpSharedSecretsPage setupDetailsForm(BasePage page, String sharedSecretQuestion1, String sharedSecretQuestion2, String sharedSecretQuestion3, String sharedSecretQuestion4, String sharedSecretQuestion5)
	{
		System.out.println("Conducting the fill form part");
         page.setText(locators.Common.fieldSharedQuestion1 , sharedSecretQuestion1);
         page.setText(locators.Common.fieldSharedQuestion2, sharedSecretQuestion2);    
         page.setText(locators.Common.fieldSharedQuestion3 , sharedSecretQuestion3);
         page.setText(locators.Common.fieldSharedQuestion4, sharedSecretQuestion4);
         page.setText(locators.Common.fieldSharedQuestion5 , sharedSecretQuestion5);
         page.clickNext();  
         if(driver.findElement((locators.Common.enrolFail)) != null)
        	 page.clickNext().writeLog("Encountered error page"); 
         page.clickNext();
         page.clickSubmit().clickNext();
         return this;
	}
	
}
