package com.capgemini.utm.utility;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
//import reporter.Reporter;

import java.util.Date;

import org.junit.runner.RunWith;

//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (strict = false, features = {"src/test/resources/features"}, glue = {"com.capgemini.utm.stepdefs.jschstepdefs","com.capgemini.utm.stepdefs.utmstepdefs"}, format = {}, tags = {})
public class UTMRunner {
	
//	private static Reporter reporter = new Reporter();
//	private static Date startTime;
//	private static Date endTime;
	
//	@BeforeClass
//	public static void beforeMethodStuff() throws Exception {
////		startTime = new Date();
//		System.out.println("+++++ Doing before method");
//	}
//
//
//	@AfterClass
//	public static void afterClasstuff() throws Exception{
////		endTime = new Date();
////		if (!scenario.isFailed()) {
////			reporter.createReport(startTime, endTime, true, 75);
//			System.out.println("+++++ Doing after method");
////		}
//	}
	
}



