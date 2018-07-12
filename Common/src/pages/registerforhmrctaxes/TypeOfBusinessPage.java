package pages.registerforhmrctaxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class TypeOfBusinessPage extends BasePage{
	
	//Type of business
	public static By FieldtypeOfBusiness0 = By.id("FieldtypeOfBusiness0");
	public static By FieldtypeOfBusiness1 = By.id("FieldtypeOfBusiness1");
	public static By FieldtypeOfBusiness2 = By.id("FieldtypeOfBusiness2");
	public static By FieldtypeOfBusiness3 = By.id("FieldtypeOfBusiness3");
	public static By LabeltypeOfBusiness = By.id("LabeltypeOfBusiness");
	public static By LabeltypeOfBusiness1 = By.id("LabeltypeOfBusiness1");
	public static By LabeltypeOfBusiness2 = By.id("LabeltypeOfBusiness2");
	public static By LabeltypeOfBusiness3 = By.id("LabeltypeOfBusiness3");

	public TypeOfBusinessPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Type of business";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "Type of business";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public QuestionsAboutTheBusinessPage clickNext(){
		super.clickNext();
		return new QuestionsAboutTheBusinessPage(driver);
	}

}
