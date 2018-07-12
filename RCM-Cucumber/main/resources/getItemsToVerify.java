package main.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getItemsToVerify {
	
	public static String getSearchResults(WebDriver driver,By searchTable, String searchRow,String valToSearch){
		String getSearchVal=null;
		
		//int numrows=driver.findElements(By.cssSelector("table[class='gridTable '][pl_prop='SearchResults.pxResults']")).size();
		int numrows=driver.findElements(searchTable).size();
		System.out.println("number of rows:"+numrows);
		for(int i=0;i<numrows;i++){
			
			System.out.println(searchRow+String.valueOf(i+1));
			
			//getSearchVal=driver.findElement(By.xpath("//table[@pl_prop='SearchResults.pxResults']/tbody/tr[@id='$PSearchResults$ppxResults$l1']")).getText();
			if(driver.findElements(By.xpath(searchRow+String.valueOf(i+1)+"']")).size()>0) {
				getSearchVal=driver.findElement(By.xpath(searchRow+String.valueOf(i+1)+"']")).getText();
			
				if(!valToSearch.isEmpty()){
					if(!getSearchVal.isEmpty() && getSearchVal.contains(valToSearch) ){
						break;
					}
					}else{
						if(!getSearchVal.isEmpty()){
							break;
						}
					}
			}	
		}	
		return getSearchVal;
	}
	
	
	public static boolean compareXMLwithScreenValues(WebElement ele, String expectedvalue){
	
		boolean flg=false;
		
		String actualvalue=ele.getText();
		
		if(expectedvalue.contentEquals(actualvalue)) {
			flg=true;
		}
		return flg;	
		
		
	}
	
	public static boolean compareXMLwithScreenValuespageSource(WebDriver driver,String expectedvalue){
		
		boolean flg=false;
		
		String actualvalue=driver.getPageSource();		
		
		if(actualvalue.contains(expectedvalue.trim())) {
			flg=true;
		}
		return flg;	
		
		
	}

}
