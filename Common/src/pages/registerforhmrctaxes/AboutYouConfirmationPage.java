package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AboutYouConfirmationPage extends BasePage{
	
	//About you confirmation
	public static By LinkChangePersonalInformation = By.id("LinkChangePersonalInformation");
	public static By LinkChangeAddress = By.id("LinkChangeAddress");
	public static By LinkChangeContactDetails = By.id("LinkChangeContactDetails");
	public static By LinkChangePersonOrFirmDetails = By.id("LinkChangePersonOrFirmDetails");
	
	//About you - SA personal information read-only form
	public static By personalInfoCheck1 = By.xpath("//dl[@class='read-only-form'][1]/dd[1]");
	public static By personalInfoCheck2 = By.xpath("//dl[@class='read-only-form'][1]/dd[2]");
	public static By personalInfoCheck3 = By.xpath("//dl[@class='read-only-form'][1]/dd[3]");
	public static By personalInfoCheck4 = By.xpath("//dl[@class='read-only-form'][1]/dd[4]");
	public static By personalInfoCheck5 = By.xpath("//dl[@class='read-only-form'][1]/dd[5]");
	public static By personalInfoCheck6 = By.xpath("//dl[@class='read-only-form'][1]/dd[6]");
	public static By personalInfoCheck7 = By.xpath("//dl[@class='read-only-form'][1]/dd[7]");
	public static By personalInfoCheck8 = By.xpath("//dl[@class='read-only-form'][1]/dd[8]");
	public static By personalInfoCheck9 = By.xpath("//dl[@class='read-only-form'][1]/dd[9]");
	public static By personalInfoCheck10 = By.xpath("//dl[@class='read-only-form'][1]/dd[10]");
	public static By personalInfoCheck11 = By.xpath("//dl[@class='read-only-form'][1]/dd[11]");
	public static By personalInfoCheck12 = By.xpath("//dl[@class='read-only-form'][1]/dd[12]");
	public static By personalInfoCheck13 = By.xpath("//dl[@class='read-only-form'][1]/dd[13]");
	public static By personalInfoCheck14 = By.xpath("//dl[@class='read-only-form'][1]/dd[14]");
	public static By personalInfoCheck15 = By.xpath("//dl[@class='read-only-form'][1]/dd[15]");
	
	//About you - home addresses read only form
	public static By homeAddressCheck1 = By.xpath("//dl[@class='read-only-form'][2]/dd[1]");
	public static By homeAddressCheck2 = By.xpath("//dl[@class='read-only-form'][2]/dd[2]");
	public static By homeAddressCheck3 = By.xpath("//dl[@class='read-only-form'][2]/dd[3]");
	public static By homeAddressCheck4 = By.xpath("//dl[@class='read-only-form'][2]/dd[4]");
	public static By homeAddressCheck5 = By.xpath("//dl[@class='read-only-form'][2]/dd[5]");
	public static By homeAddressCheck6 = By.xpath("//dl[@class='read-only-form'][2]/dd[6]");
	
	
	//About you - contact details read only form
	public static By contactDetailsCheck1 = By.xpath("//dl[@class='read-only-form'][3]/dd[1]");
	public static By contactDetailsCheck2 = By.xpath("//dl[@class='read-only-form'][3]/dd[2]");
	public static By contactDetailsCheck3 = By.xpath("//dl[@class='read-only-form'][3]/dd[3]");
	
	//About you - working for one person or firm read only form
	public static By onePersonOrFirmCheck1 = By.xpath("//dl[@class='read-only-form'][4]/dd[1]");
	public static By onePersonOrFirmCheck2 = By.xpath("//dl[@class='read-only-form'][4]/dd[2]");
	public static By onePersonOrFirmCheck3 = By.xpath("//dl[@class='read-only-form'][4]/dd[3]");
	public static By onePersonOrFirmCheck4 = By.xpath("//dl[@class='read-only-form'][4]/dd[4]");
	public static By onePersonOrFirmCheck5 = By.xpath("//dl[@class='read-only-form'][4]/dd[5]");
	public static By onePersonOrFirmCheck6 = By.xpath("//dl[@class='read-only-form'][4]/dd[6]");
	
	//About you - confirmation (PAYE for Employers)
	public static By personalInfoPAYECheck1 = By.xpath("//dl[@class='read-only-form']/dd[1]");
	public static By personalInfoPAYECheck2 = By.xpath("//dl[@class='read-only-form']/dd[2]");
	

	public AboutYouConfirmationPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: About you confirmation";
		this.expectedHeading = "About you";
		this.expectedSubHeading = "Confirmation";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public BusinessDetailsPage clickNext(){
		super.clickNext();
		return new BusinessDetailsPage(driver);
	}
	

}
