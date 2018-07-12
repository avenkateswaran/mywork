package test;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "reports/CucumberTestReport.json",
detailedReport = true,
detailedAggregatedReport = true,
outputFolder = "reports")
@CucumberOptions
        (features="src\\test\\resources\\features\\Login.feature",plugin = {"html:reports",
                "json:reports/CucumberTestReport.json","pretty:reports/cucumber-pretty.txt","usage:reports/cucumber-usage.json",
                "junit:reports/cucumber-results.xml"
                
        },glue= {"test.java.stepdefinitions"})
public class RCMRunner {
	
	

}