package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class P46CarIntroductionPage extends BasePage{
	
	public static By FieldFirstPrivateCarInd = By.id("FieldFirstPrivateCarInd");
	public static By FieldCarReplaceInd = By.id("FieldCarReplaceInd");
	public static By FieldProvdSecond = By.id("FieldProvdSecond");
	public static By FieldPayOverLimit = By.id("FieldPayOverLimit");
	public static By FieldWithDrawnCarProvd = By.id("FieldWithDrawnCarProvd");
	
	
	public P46CarIntroductionPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - P46(Car) - Introduction";
		this.expectedHeading = "P46(Car) - Introduction";
		super.assertTitle().assertHeading();
	}


	public P46CarWithdrawnPage clickNextGoToCarWithdrawnPage() {
		super.clickNext();
		return new P46CarWithdrawnPage(driver);
	}

}
