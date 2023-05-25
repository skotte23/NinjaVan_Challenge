package stepdefs.core;

import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ShipperOrderCreationSteps {
    private String authenticationUrl = "https://v4.ninja.com/sg/oauth/access_token";
    private String orderCreateUrl = "https://v4.ninja.com/sg/order-create/orders";
    private String accessToken;
    private Response authenticationResponse;
    private Response orderCreateResponse;

    @Given("the shipper is registered in Ninja Van")
    public void shipperRegisteredInNinjaVan() {
        // Perform any necessary setup or validations
    }

    @When("shipper authenticates to the Ninja Van system")
    public void shipperAuthenticatesToNinjaVan() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Accept", "application/json");

        String requestBody = "{\n" +
                "    \"client_id\": \"f288852c-7a4a-4d5e-8267-a83778233ad0\",\n" +
                "    \"client_secret\": \"be2z8YU6ubykr1oJYWee5Q\"\n" +
                "}";

        authenticationResponse = request.body(requestBody)
                .post(authenticationUrl);
    }

    @Then("QA verifies that the HTTP response code is {int}")
    public void verifyHttpResponseCode(int expectedResponseCode) {
        int actualResponseCode = authenticationResponse.getStatusCode();
        Assert.assertEquals(expectedResponseCode, actualResponseCode);
    }

    @When("shipper retrieves its access token")
    public void retrieveAccessToken() {
        accessToken = authenticationResponse.jsonPath().getString("access_token");
    }

    @When("shipper sends an order create request")
    public void sendOrderCreateRequest() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.header("Accept", "*/*");
        request.header("Authorization", "Bearer " + accessToken);

        String requestBody = "{\n" +
                "    \"service_type\": \"Parcel\",\n" +
                "    \"service_level\": \"Standard\",\n" +
                "    \"from\": {\n" +
                "        \"name\": \"Ninja Sender Z64441290\",\n" +
                "        \"phone_number\": \"082188889999\",\n" +
                "        \"email\": \"ninja@test.co\",\n" +
                "        \"address\": {\n" +
                "            \"address1\": \"903 Toa Payoh North\",\n" +
                "            \"address2\": \"\",\n" +
                "            \"country\": \"SG\",\n" +
                "            \"postcode\": \"511200\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"to\": {\n" +
                "        \"name\": \"Recipient X\",\n" +
                "        \"phone_number\": \"082188889999\",\n" +
                "        \"email\": \"mickyself.com\",\n" +
                "        \"address\": {\n" +
                "            \"address1\": \"999 Toa Payoh North\",\n" +
                "            \"address2\": \"\",\n" +
                "            \"country\": \"SG\",\n" +
                "            \"postcode\": \"318993\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"parcel_job\": {\n" +
                "        \"pickup_date\": \"2022-02-09\",\n" +
                "        \"pickup_address\": {\n" +
                "            \"name\": \"reservation-2\",\n" +
                "            \"phone_number\": \"082188881592\",\n" +
                "            \"email\": \"reservation-1@ninjavan.co\",\n" +
                "            \"address\": {\n" +
                "                \"address1\": \"903 Toa Payoh North\",\n" +
                "                \"address2\": \"\",\n" +
                "                \"country\": \"SG\",\n" +
                "                \"postcode\": \"511200\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"pickup_timeslot\": {\n" +
                "            \"start_time\": \"12:00\",\n" +
                "            \"end_time\": \"15:00\",\n" +
                "            \"timezone\": \"Asia/Singapore\"\n" +
                "        },\n" +
                "        \"delivery_timeslot\": {\n" +
                "            \"start_time\": \"09:00\",\n" +
                "            \"end_time\": \"22:00\",\n" +
                "            \"timezone\": \"Asia/Singapore\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        orderCreateResponse = request.body(requestBody)
                .post(orderCreateUrl);
    }
    
    @And("shipper provides the access token in the request header")
    public void provideAccessTokenInRequestHeader() {
    	RequestSpecification request = RestAssured.given(); 
    	request.header("Authorization", "Bearer " + accessToken);    	
    }


    @And("QA verifies that the HTTP response body is {string}")
    public void verifyOrderCreateResponseBody(String expectedResponseBody) {
        String actualResponseBody = orderCreateResponse.getBody().asString();
        Assert.assertEquals(expectedResponseBody, actualResponseBody);
    }
}
