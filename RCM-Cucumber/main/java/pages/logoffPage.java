package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logoffPage {
	
//Declarations
	//role link
	@FindBy(css="a[data-click*=showMenu]")
	private WebElement lnkrolemenu;
	
	@FindBy(css="td[data-click*=logOff]")
	private WebElement lnklogoffmenu;
	
	
	//methods
	public void pegaLogoff(){
		
		//click on the logff menu
		lnkrolemenu.click();
		
		//click on log off menu
		lnklogoffmenu.click();	
		
		
	}
	
	
	

}
