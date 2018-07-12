package main.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;
import resources.utilities;

public class advancedSearchPage extends BasePage {
	
	public advancedSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	utilities util=new utilities();
//Declarations
	//advanced search
	@FindBy(css="a[data-click*=AdvancedSearch]")
	private WebElement lnkAdvancedSearch;
	
	//external reference
	@FindBy(name="$PSearchCriteria$pFilterExternalRefNo")
	private WebElement txtexternalReference;
	
	
	//search button
	@FindBy(css="button[data-click*=AdvancedSearchHandler]")
	private WebElement btnSearchButton;
	
	
	
	//Methods
	//search case using advanced search option
	
	public void advancedSearch(WebDriver driver,String searchval){
		
		//click on the advanced search link
		lnkAdvancedSearch.click();
		
		//switch frame
		
		//util.switchToFrame(driver, By.name("$PSearchCriteria$pFilterExternalRefNo"));
		
		driver.switchTo().frame("PegaGadget0Ifr");
		
		//Enter the search criteria
		
		txtexternalReference.sendKeys(searchval);
		
		
		//Click on the search button
		btnSearchButton.click();
		
	}
	

}
