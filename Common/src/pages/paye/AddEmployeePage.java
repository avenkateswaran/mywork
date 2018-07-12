package pages.paye;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class AddEmployeePage extends BasePage{
	
	public static By FieldemployeeAdditionReason = By.id("FieldemployeeAdditionReason");
	public static By FieldemployeeSurname = By.id("FieldemployeeSurname");
	public static By FieldemployeeForename = By.id("FieldemployeeForename");
	public static By FieldemployeeOtherName = By.id("FieldemployeeOtherName");
	public static By FieldemployeeTitle = By.id("FieldemployeeTitle");
	public static By FieldemployeeAddress1 = By.id("FieldemployeeAddress1");
	public static By FieldemployeeAddress2 = By.id("FieldemployeeAddress2");
	public static By FieldemployeeAddress3 = By.id("FieldemployeeAddress3");
	public static By FieldemployeeAddress4 = By.id("FieldemployeeAddress4");
	public static By FieldemployeePostcode = By.id("FieldemployeePostcode");
	public static By FieldemployeeNino = By.id("FieldemployeeNino");
	public static By FieldemployeeNinoNotKnown = By.id("FieldemployeeNinoNotKnown");
	public static By FieldemployeeDateOfBirth = By.id("FieldemployeeDateOfBirth");
	public static By FieldemployeeDateOfBirthNotKnown = By.id("FieldemployeeDateOfBirthNotKnown");
	public static By FieldemployeeGender = By.id("FieldemployeeGender");
	public static By FieldemployeeWorksNumber = By.id("FieldemployeeWorksNumber");
	public static By FieldemployeeJobTitle = By.id("FieldemployeeJobTitle");
	public static By FieldemployeeIsEmployeeDirector = By.id("FieldemployeeIsEmployeeDirector");
	public static By FieldemployeeStartDate = By.id("FieldemployeeStartDate");
	public static By FieldemployeeLeavingDate = By.id("FieldemployeeLeavingDate");

	public AddEmployeePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "PAYE Online Services - Add Employee";
		this.expectedHeading = "Add Employee";
		super.assertTitle().assertHeading();
	}

	public PayeInRealTimePage clickNextGoToPayeInRealTimePage() {
		super.clickNext();
		return new PayeInRealTimePage(driver);
	}

}
