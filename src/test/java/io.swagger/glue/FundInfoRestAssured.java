package io.swagger.glue;


import com.jayway.restassured.path.json.JsonPath;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.util.Assert;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FundInfoRestAssured extends RestAssuredIntegrationTest {

    private String uri;
    @Given("^baseRestUri is (.*)$")
    public void setBaseUri(String uri) {
        Assert.notNull(uri);
        Assert.isTrue(!uri.isEmpty());
        baseUri = uri;
    }

    @Given("^set body to (.*)$")
    public void setBody(String sBody) {
        Assert.notNull(sBody);
        Assert.isTrue(!sBody.isEmpty());
        body = sBody;
    }

    @Given("^set (.*) header to (.*)$")
    public void setHeader(String hKey, String hValue) {
        Assert.notNull(hKey);
        Assert.isTrue(!hKey.isEmpty());
        Assert.notNull(hValue);
        Assert.isTrue(!hValue.isEmpty());
        headerName = hKey;
        headerValue = hValue;
    }

    @When("^the client calls GET (.*)$")
    public void get(String resource) {
        uri = baseUri + resource ;
        executeGet(uri);
    }

    @When("^the client calls POST (.*)$")
    public void post(String resource) {
        uri = baseUri + resource ;
        executePost(uri);
    }

    @When("^the client calls PUT (.*)$")
    public void put(String resource) {
        uri = baseUri + resource ;
        executePut(uri);
    }

    @When("^the client calls Delete (.*)$")
    public void delete(String resource) {
        uri = baseUri + resource ;
        executeDelete(uri);
    }


    @Then("^the client receives status code equal to (\\d+)$")
    public void the_client_receives_on_get_status_code_of(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }

    @Then("^the client receives body which contains (.*) as (.*)$")
    public void the_client_receives_body_contains(String tagName,String tagValue) {
        JsonPath jsonPathEvaluator = response.jsonPath();
        String jsonValue = jsonPathEvaluator.getString(tagName);
        assertEquals(jsonValue, tagValue);
//        resBody = response.getBody();
//        String bodyStringValue = body.toString();
//        assertTrue(bodyStringValue.contains(resource));
    }

    @Then("^the client receives status code not equal to (\\d+)$")
    public void the_client_receives_on_get_not_status_code_of(int statusCode) {
        assertNotEquals(statusCode, response.getStatusCode());
//        assertStatus(response, statusCode);
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) {

        response.then().body("number", is(version));
    }


}