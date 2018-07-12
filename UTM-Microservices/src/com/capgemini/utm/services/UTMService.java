package com.capgemini.utm.services;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

import static io.restassured.RestAssured.given;


public class UTMService {

    public RequestSpecification requestSpecification = null;
    public Response response = null;
    public RequestSpecification rs = null;

    public RequestSpecification getRS1(String domainorip, String port){
        rs = given().contentType("application/xml").baseUri(domainorip).port(Integer.parseInt(port));
        return rs;
    }

    public Response callUTMWorkflow(File payload){
        response = rs.body(payload).log().all().when().post("/services/ScheduledFileTransferTriggerEvent");
        return response;
    }

}
