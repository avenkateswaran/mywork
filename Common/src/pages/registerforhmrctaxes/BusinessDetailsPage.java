package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;
import pages.registerforhmrctaxes.selfassessment.BusinessAddressPage;

public class BusinessDetailsPage extends BasePage{
	
	public static By FieldtradingNameBusiness = By.id("FieldtradingNameBusiness");
	public static By Fieldutr = By.id("Fieldutr");
	public static By FieldwhatSortSelfEmpWork = By.id("FieldwhatSortSelfEmpWork");
	

	public BusinessDetailsPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Business details";
		this.expectedHeading = "About the business";
		this.expectedSubHeading = "Business details";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public BusinessAddressPage clickNext(){
		super.clickNext();
		return new BusinessAddressPage(driver);
	}

	public AddressSearchPage clickNextGoToAddressSearch() {
		super.clickNext();
		return new AddressSearchPage(driver);
	}
	

}
