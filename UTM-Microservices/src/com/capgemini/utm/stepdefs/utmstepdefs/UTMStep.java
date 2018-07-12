package com.capgemini.utm.stepdefs.utmstepdefs;
import com.capgemini.utm.services.UTMService;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static com.capgemini.utm.utility.DateFormatter.getFormattedTime;

import java.io.File;

public class UTMStep {

    public UTMService UTMService;

    public UTMStep(){
        UTMService = new UTMService();
    }

    @When("^the user sends a POST to the DES tool with the following config \"([^\"]*)\"$")
    public void theUserSendsAPOSTToTheDESToolWithTheFollowingConfig(File file) throws Throwable {
        UTMService.callUTMWorkflow(file);
    }

    @Then("^the user gets a \"([^\"]*)\" successful response$")
    public void theUserGetsASuccessfulResponse(String status) throws Throwable {
        System.out.println("Status code is: " + UTMService.response.getStatusCode());
        Assert.assertEquals(status, String.valueOf(UTMService.response.getStatusCode()));
    }

    @Given("^the user accesses host: \"([^\"]*)\" and on port: \"([^\"]*)\"$")
    public void theUserIsAccessingTheDomainOrIpaddressAndOnPort(String hostname, String port) throws Throwable {
        UTMService.getRS1(hostname, port);
    }

    @And("^the user gets the DES log file$")
    public void theUserGetsTheDESLogFile() throws Throwable {
    }
}
