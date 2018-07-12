package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;


public class YourTaxAccountPage extends BasePage{
	
	public final WebDriver driver;
	public static By CompleteReturnButton = By.id("ct-file-return-link");
	
	public YourTaxAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Your tax account";

}

	
	public BeforeYouStart clickCompleteReturn(){
		driver.findElement(CompleteReturnButton).click();
		return new BeforeYouStart (driver); 
	}
	

}
