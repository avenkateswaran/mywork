package pages.registerforhmrctaxes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class ValidTypesOfBusinessPage extends BasePage {
	
	public static By helpLink1 = By.xpath("//img[@title='Help about: Supported Taxes - opens in a new window']");

	public ValidTypesOfBusinessPage(WebDriver driver) {
		super(driver);
		this.expectedTitle = "HMRC: Register for HMRC taxes";
		this.expectedHeading = "Register for HMRC taxes";
		this.expectedSubHeading = "What types of business can use this service?";
		super.assertTitle().assertHeading().assertSubHeading();
	}
	
	public InvalidTypesOfBusinessPage clickNext(){
		super.clickNext();
		return new InvalidTypesOfBusinessPage(driver);
	}

	public String checkHelpPage(By locator){
		String parentWindowHandle = driver.getWindowHandle();
		String popupWindowHandle = null;
		
		driver.findElement(locator).click();
		
		// switch to popup window
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			popupWindowHandle = iterator.next();
		}
		driver.switchTo().window(popupWindowHandle);
		

		String firstHeader = driver.findElements(By.tagName("h3")).get(0).getText();
		driver.findElement(By.linkText("Close")).click();
		driver.switchTo().window(parentWindowHandle);
		return firstHeader;
	}

}
