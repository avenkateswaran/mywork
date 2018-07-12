package pages;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import locators.Common;
import pages.submitVATreturns.EnrolForVATPage;
import pages.submitVATreturns.SubmitAVATReturnPage;
import java.util.Date;
import javax.imageio.ImageIO;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class BasePage {

	public static WebDriver driver;
	public String expectedTitle = "";
	public String expectedHeading = "";
	public String expectedSubHeading = "";
	public String a = "";
	public pages.NavigationPage navigate;
	private DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
	public int successCount = 0;
	public int failCount = 0;

	public String getTimestamp(){
		return dateFormat.format(new Date());
	}
	
	

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		navigate = new pages.NavigationPage(BasePage.driver);
	}

	public String subHeading() {
		return driver.findElements(By.tagName("h2")).get(0).getText();
	}

	public void setText(By locator, String text) {
		writeLog("Element selected  " + locator.toString() + " Text Set " + text);
		// driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}

	public BasePage clickNext() {
		driver.findElement(Common.Next_Button).click();
		writeLog("Click Next");
		screenShot(driver);
		return this;
	}

	public BasePage clickContinue() {
		writeLog("Click Continue/Start");
		screenShot(driver);
		driver.findElement(Common.continue_Button).click();
		return this;
	}

	public BasePage clickSubmit() {
		writeLog("Click Submit");
		screenShot(driver);
		driver.findElement(Common.Submit_Button).click();
		return this;
	}

	public BasePage clickActivate() {
		writeLog("Click Activate");
		screenShot(driver);
		driver.findElement(Common.Activate_Button).click();
		return this;
	}

	public BasePage clickDelete() {
		writeLog("Click Delete");
		screenShot(driver);
		driver.findElement(Common.Delete).click();
		return this;
	}

	public void clickElement(By locator) {
		writeLog("Element selected  " + locator.toString());
		driver.findElement(locator).click();
	}

	public String actualTitle() {
		return driver.getTitle();
	}

	public String actualHeading() {
		return driver.findElements(By.tagName("h1")).get(0).getText();
	}

	public String actualSubHeading() {
		return driver.findElements(By.tagName("h2")).get(0).getText();
	}

	public boolean isDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}

	public void assertElementIsDisplayed(By locator) {
		boolean elementFound = driver.findElement(locator).isDisplayed();
		String message = String.format("**** assertElementIsDisplayed **** : %s %s ",
				elementFound == true ? "found" : "did not find", locator);
		System.out.printf(message + "\r\n");
		writeLog(message);
		Assert.assertTrue(elementFound);
	}

	public void assertIsElementSelected(By locator) {
		writeLog("assert ElementIsSelected : " + locator.toString());
		Assert.assertTrue(driver.findElement(locator).isSelected());
	}

	public void assertTextEquals(By locator, String expectedText) {
		writeLog("assert TextEquals : " + expectedText);
		Assert.assertTrue(driver.findElement(locator).getText().equals(expectedText));
	}

	public void assertTextFieldEquals(By locator, String expectedText) {
		writeLog("assert TextFieldEquals : " + expectedText);
		Assert.assertTrue(driver.findElement(locator).getAttribute("value").equals(expectedText));
	}

	public BasePage assertTitle() {
		String message = String.format("Expected Page Title is: '%s' \t Actual Page title was: '%s'",
				this.expectedTitle, actualTitle());
		System.out.printf(message + "\r\n");
		writeLog(message);
		Assert.assertEquals(this.expectedTitle, actualTitle());
		return this;
	}

	public BasePage assertHeading() {
		String message = String.format("Expected Page Heading is: '%s' \t\t Actual Page Heading was: '%s'\r\n",
				this.expectedTitle, actualTitle());
		System.out.printf(message + "\r\n");
		writeLog(message);
		Assert.assertEquals(this.expectedHeading, actualHeading());
		return this;
	}

	public BasePage assertSubHeading() {
		String message = String.format("Expected Sub Heading is: '%s' \t\t Actual Sub Heading was: '%s'\r\n",
				this.expectedSubHeading, actualSubHeading());
		System.out.printf(message + "\r\n");
		writeLog(message);
		Assert.assertEquals(this.expectedSubHeading, actualSubHeading());
		return this;
	}

	public void getscreenshot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		} catch (IOException e) {
			writeLog("***************  printStackTrace  ****************" + e);
			System.out.println("***************  printStackTrace  ****************" + e);
		}
	}

	public void waitForMilliSeconds(int noOfSeconds) {
		try {
			Thread.sleep(noOfSeconds);
		} catch (InterruptedException e) {
			writeLog("*************** waitForSeconds  printStackTrace exception  ****************" + e);
			System.out.println("*************** waitForSeconds  printStackTrace exception  ****************" + e);
		}
	}

	public void getandCompareURL() {
		String str = driver.getCurrentUrl();
		System.out.println("url str :" + str);
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void AssertPageContainsText(String text) {
		Assert.assertTrue(driver.getPageSource().contains(text));
	}

	/**
	 * Kofi
	 */
	public void clickCheckbox(By locator) {
		driver.findElement(locator).click();
	}

	public void assertTitle(String text) {
		System.out.printf("Expected Page Title is: %s \t Actual Page title was: %s", text, actualTitle());
		Assert.assertEquals(text, actualTitle());
	}

	public void subTitle(String text) {
		System.out.printf("Expected Page Sub Heading is: %s \t Actual Page title was: %s", text, subHeading());
		Assert.assertEquals(text, subHeading());
	}

	public void assertHeading(String text) {
		System.out.printf("Expected Page Heading is: %s \t\t Actual Page Heading was: %s\r\n", text, actualTitle());
		Assert.assertEquals(text, actualHeading());
	}

	public void compareSections(List<String> step_sections) {

		System.out.print("************** method compareSections ********************");
		writeLog("************** method compareSections ********************");
		List<String> content = new ArrayList<String>();
		// Access all the heading that exists on the page and compare with the
		// list abve
		List<WebElement> headings = driver.findElements(By.tagName("h2"));
		for (WebElement e : headings) {
			System.out.println(e.getText());
			// Add the headings to a string list so that later it can be used
			// for comparison.
			content.add(e.getText());
		}
		ArrayList<String> checking = new ArrayList<String>();
		for (String temp : content) {
			checking.add((step_sections.contains(temp) ? "Yes" : "No"));
			System.out.println("String Temp :   " + temp);
			writeLog("String Temp :   " + temp + "Checking  " + checking);
			System.out.println(checking);
			if (checking.get(checking.size() - 1) == "No") {
				System.out.println("ERROR. There are either new sections or existing sections are missing. \n \n ");
				writeLog("ERROR. There are either new sections or existing sections are missing. \n \n ");
				break;
			}
		}
	}

	public void compareSectionsH1(List<String> step_sections) {

		System.out.print("************** method compareSections ********************");
		writeLog("************** method compareSections ********************");

		List<String> content = new ArrayList<String>();
		// Access all the heading that exists on the page and compare with the
		// list abve
		List<WebElement> headings = driver.findElements(By.tagName("h1"));
		for (WebElement e : headings) {
			System.out.println(e.getText());
			// Add the headings to a string list so that later it can be used
			// for comparison.
			content.add(e.getText());
		}
		// This checks whether the current sections of the mainpage exists.
		ArrayList<String> checking = new ArrayList<String>();
		for (String temp : content) {
			checking.add((step_sections.contains(temp) ? "Yes" : "No"));
			System.out.println("String Temp :   " + temp);
			writeLog("String Temp :   " + temp + "Checking  " + checking);
			System.out.println(checking);
			if (checking.get(checking.size() - 1) == "No") {
				System.out.println("ERROR. There are either new sections or existing sections are missing. \n \n ");
				writeLog("ERROR. There are either new sections or existing sections are missing. \n \n ");
				break;
			}
		}
	}

	public GatewayRegistrationPage clickEnrolServices() {
		driver.findElement(locators.Common.linkServiceEnrol).click();
		return new GatewayRegistrationPage(driver);
	}

	public EnrolForVATPage clickEnrolVATService() {
		driver.findElement(locators.Common.linkEnrolVAT).click();
		return new EnrolForVATPage(driver);
	}

	public SubmitAVATReturnPage clickEnrolServicesSubmit() {
		driver.findElement(locators.Common.linkServiceEnrol).click();
		return new SubmitAVATReturnPage(driver);
	}

	public void clickHomelinkButton() {
		driver.findElement(locators.Common.linkHomebuttom).click();
	}

	public GatewayRegistrationPage clickLinkService() {
		driver.findElement(locators.Common.linkServicesCanUSe).click();
		return new GatewayRegistrationPage(driver);
	}

	public GatewayRegistrationPage clickAccessEnrol() {
		driver.findElement(locators.Common.linkEnrolVATfromAcces).click();
		return new GatewayRegistrationPage(driver);
	}

	public void writeLog(String writetoLog) {
		System.err.println(writetoLog);
	}

	public BasePage screenShot(WebDriver driver) {
		if (new File("C:\\Automation\\ScreenshotNew\\").exists() == false) {
			new File("C:\\Automation\\ScreenshotNew\\").mkdir();
		}

		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_");
			String nameFile = dateFormat.format(new Date()) + System.currentTimeMillis() + ".jpg";
			BufferedImage image = new Robot()
					.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "jpg", new File("C:\\Automation\\ScreenshotNew\\" + nameFile));
			System.out.println("SCREENSHOT saved:" + nameFile);
			System.err.println("SCREENSHOT saved:" + nameFile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (HeadlessException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		return this;
	}

	public void checkEnrolled(String variable) {
		// List<String> content = new ArrayList<String>();
		// Access all the heading that exists on the page and compare with the
		// list abve
		List<WebElement> headings = driver.findElements(By.tagName("h2"));
		for (WebElement e : headings) {
			System.out.println(e.getText());
			// Add the headings to a string list so that later it can be used
			// for comparison.
			if (e.getText().equals(variable)) {
				System.out.println(" Not Enrolleed for VAT EU Refunds");
				System.out.println("The user have not enrolled for VAT return");
				writeLog("The user have not  enrolled for VAT return");
				// fail();
			}

		}
	}

	public BasePage clickExit() {
		writeLog("Click Exit");
		screenShot(driver);
		driver.findElement(Common.Exit).click();
		return this;

	}

	public EnrolForVATPage clickVATLink() {
		driver.findElement(locators.Common.linkEnrolVAT).click();
		return new EnrolForVATPage(driver);
	}
	
	public Boolean CheckEnrolmentSuccessful() {
		screenShot(driver);
		try {
			return driver.findElement(By.className("success")).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void incrementSuccessCount(){
		successCount++;
		System.out.println("Total number of successful enrolments: " + successCount);
		System.err.println("Total number of successful enrolments: " + successCount);
	}
	
	public void incrementFailCount(){
		failCount++;
		System.out.println("Total number of failed enrolments: " + failCount);
		System.err.println("Total number of failed enrolments: " + failCount);
	}
}
