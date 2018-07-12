package referenceGateway.pages;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	public static WebDriver driver;
	private By logout = By.linkText("Log out");

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	public referenceGateway.pages.HomePage logOut(){
		driver.findElement(logout).click();
		return new referenceGateway.pages.HomePage(driver);
	}
	
	public BasePage screenShot() {
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
	
	public void writeLog(String writetoLog) {
		System.err.println(writetoLog);
	}
}
