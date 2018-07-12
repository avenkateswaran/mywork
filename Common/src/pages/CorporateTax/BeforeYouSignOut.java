package pages.CorporateTax;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BeforeYouSignOut extends BasePage {
	
	public final WebDriver driver;
	public static By SignOut = By.id("sighOutHref");
	public BeforeYouSignOut(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.expectedTitle = "Feedback Questionnaire";
		this.expectedHeading = "Before you sign out";
		super.assertTitle().assertHeading();
	}
	
		public BeforeYouSignOut clickSignout(){
			driver.findElement(SignOut).click();
			return  new BeforeYouSignOut (driver);
	}
}


