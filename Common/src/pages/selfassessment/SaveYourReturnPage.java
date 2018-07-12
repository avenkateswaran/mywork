package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class SaveYourReturnPage extends BasePage{
	
	public static By wf70_01_ButtonViewHtml = By.id("wf70_01_ButtonViewHtml");
	public static By wf70_01_ButtonSaveHtml = By.id("wf70_01_ButtonSaveHtml");
	public static By wf70_01_ButtonPrintHtml = By.id("wf70_01_ButtonPrintHtml");
	public static By wf70_01_ButtonViewPdf = By.id("wf70_01_ButtonViewPdf");
	public static By wf70_01_ButtonSavePdf = By.id("wf70_01_ButtonSavePdf");
	public static By wf70_01_ButtonPrintPdf = By.id("wf70_01_ButtonPrintPdf");
	public static By wf70_01_LinkAddAnAttachment = By.id("wf70_01_LinkAddAnAttachment");
	public static By wf70_01_LinkViewAnAttachment = By.id("wf70_01_LinkViewAnAttachment");

	public SaveYourReturnPage(WebDriver driver) {
		super(driver);
	}

	public SubmitYourReturnDeclarationPage clickNext() {
		super.clickNext();
		return new SubmitYourReturnDeclarationPage(driver);
	}

}
