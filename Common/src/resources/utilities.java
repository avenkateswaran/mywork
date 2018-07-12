package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilities {
	
	public void waitForElementToAppear(WebDriver driver, By Selector, int timeOutInSeconds, String timeOutMessage) {
	    try {
	      WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(Selector));
	    } catch (TimeoutException e) {
	      throw new IllegalStateException(timeOutMessage);
	    }
	  }

//  /*Looks for an element in every frame identified and passes on control once element is found*/

    public void switchToFrame(WebDriver driver,By selector){
          driver.switchTo().defaultContent();
          int frameCount = driver.findElements(By.tagName("iframe")).size(); //4
          System.out.println(frameCount);
          if(driver.findElements(selector).size() <= 0){
        	  for(int i = 0; i < frameCount; i++){
        		  System.out.println(frameCount);
                  driver.switchTo().frame(i);
                  System.out.println(frameCount);
                  int elementCount = driver.findElements(selector).size();
                  if(elementCount >= 1){
                	  break;
                  }
                  
               }
          }

    }
    
    
    //Select a value from dropdown
    public void selectfromdropdown(WebElement ele,String selectValue) {
	   Select selval=new Select(ele);
	   selval.selectByValue(selectValue);
	  }

    //Click base tabs
    
    public void clickBaseTabs(WebDriver driver,By elementVal) {
    	
    	driver.findElement(elementVal).click();
    	
    	
    }
    


}
