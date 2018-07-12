package nondigital;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.CreateWebDriver;
import resources.csvTools;

@RunWith(Parameterized.class)
public class ExampleTest {

	// example test finds the search terms listed in the spreadsheet and saves the top result against each entry
	
	private static WebDriver driver = CreateWebDriver.getDriver("chrome");
	
	private static csvTools csvTools = new csvTools();
	
	@Rule public TestName currentlyRunningTest = new TestName();
	
	@Parameter public Map<String, String> testDataRow;
	
	@Parameterized.Parameters
	public static Collection<Map<String,String>> testData() throws Exception {
		// the spreadsheet containing search terms
		return csvTools.getTests("C:\\Automation\\Data\\test.csv");
	}
	
	@Before
	public void before(){
		// system under test
		driver.get("http://www.google.co.uk");
	}
	
	@Test
	public void test() throws Exception {
		// routine to be performed for each entry in the spreadsheet

		
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys(testDataRow.get("searchterm")+Keys.RETURN);
		
		
		List<WebElement> list = driver.findElements(By.className("r"));

		for (WebElement e : list){
			System.out.println(e.findElement(By.tagName("a")).getText());
		}
		
		
		
		
		String url = list.get(0).findElement(By.tagName("a")).getAttribute("href");
		driver.get(url);
		
		csvTools.saveData(currentlyRunningTest, "top result",list.get(0).getText());
		
	}
	
	// close the browser after all the search terms have been looked up
	@AfterClass
	public static void after(){
		driver.quit();
	}
	
}
