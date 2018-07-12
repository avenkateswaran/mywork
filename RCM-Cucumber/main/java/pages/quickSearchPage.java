package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class quickSearchPage {
	
	//Declaration
	
	//quick search text box
	@FindBy(name="$PpyDisplayHarness$pBasicSearchText")
	private WebElement txtquickSearch;
	
	//quick search button
	@FindBy(css="a[data-click*=BasicSearchMaster]")
	private WebElement btnQuickSearch;
	
	
	//Methods
	public void doQuickSearch(String caseID) {
		
		//enter the case id 
		txtquickSearch.sendKeys(caseID);
		
		//click on the button
		btnQuickSearch.click();
		
	}
}
