package pages.selfassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FillInYourReturnIncomePage extends BasePage{
	
	public static By wf32_04_FieldTurnover = By.id("wf32_04_FieldTurnover");
	public static By wf32_04_FieldOtherIncome = By.id("wf32_04_FieldOtherIncome");
	public static By totalShortSelfIncome = By.id("totalShortSelfIncome");
	public static By wf32_04_FieldHowExpensesRecorded1 = By.id("wf32_04_FieldHowExpensesRecorded1");
	public static By wf32_04_FieldHowExpensesRecorded2 = By.id("wf32_04_FieldHowExpensesRecorded2");
	public static By wf32_04_FieldTotalExpenses = By.id("wf32_04_FieldTotalExpenses");
	public static By profit = By.id("profit");
	public static By loss = By.id("loss");
	public static By wf32_04_LinkDeleteBusiness = By.id("wf32_04_LinkDeleteBusiness");
	
	

	public FillInYourReturnIncomePage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Fill in your return - Income";
		this.expectedHeading = "4. Fill in your return";
		super.assertTitle().assertHeading();
	}

	public FillInYourReturnCapitalAllowancePage clickNextGoToFillInYourReturnCapitalAllowancePage() {
		super.clickNext();
		return new FillInYourReturnCapitalAllowancePage(driver);
	}

}
