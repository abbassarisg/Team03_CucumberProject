package stepdefinitions.apiStepDefinitions;

import api.util.Authentication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.Driver;


import static io.restassured.RestAssured.given;


public class US_007_API_StepDefinitions extends Authentication {

    Response response;
    RequestSpecification spec;

    @Given("guncel tarihli endpoint olusturuldu")

    public void guncelTarihliEndpointOlusturuldu() {
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api/").build();
        spec.pathParams("first", "appointments", "second", "310169");
    }

    @Then("get request and get response")

    public void getRequestAndGetResponse() {
        response = given()
                .spec(spec)
                .header("Authorization", "Bearer " + generateToken())
                .when()
                .get("/{first}/{second}");
        response.prettyPrint();
    }


    @And("status kod {int} olmali")
    public void statusKodOlmali(int statusCode) {

        Assert.assertEquals(statusCode, response.statusCode());
    }

    @And("hasta id {int} olmali")
    public void hastaIdOlmali(int patientId) {
        JsonPath json = response.jsonPath();
        Assert.assertEquals(patientId, json.getInt("patient.id"));
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() {

        Driver.closeDriver();
    }

    @Given("ileri tarihli endpoint olusturuldu")

    public void ileriTarihliEndpointOlusturuldu() {
        spec = new RequestSpecBuilder().setBaseUri("https://www.medunna.com/api/").build();
        spec.pathParams("first", "appointments", "second", "310169");
    }
}
