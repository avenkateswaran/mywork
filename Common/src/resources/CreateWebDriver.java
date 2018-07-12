package resources;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CreateWebDriver {
	
	public static WebDriver getDriver(String browserName){
		
		ChromeOptions options=null;
		if (new File("E:\\Automation\\Software\\chromedriver\\chromedriver.exe").exists()) {
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Software\\chromedriver\\chromedriver.exe");
			options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);

			
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Software\\chromedriver\\chromedriver.exe");
		}
	
		if (new File("E:\\Automation\\Software\\IEDriverServer_x64_2.52.1\\iedriverserver.exe").exists()) {
			System.setProperty("webdriver.ie.driver", "E:\\Automation\\Software\\IEDriverServer_x64_2.52.1\\iedriverserver.exe");
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Automation\\Software\\IEDriverServer_x64_2.52.1\\iedriverserver.exe");
		}
	
		WebDriver driver = null;
		
		switch (browserName.toLowerCase()){
			case "ie": 		
							driver = new InternetExplorerDriver();
							break;
			case "chrome": 	
				//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				//driver = new ChromeDriver(capabilities);
							driver = new ChromeDriver(options);
							break;
			case "firefox": 
							driver = new FirefoxDriver();
							break;
			default: 
							driver = new ChromeDriver();
							break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
