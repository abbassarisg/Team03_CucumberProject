package stepdefinitions.apiStepDefinitions;

import api.pojos.AfraPojo.AppointmentOuterPojo;
import api.pojos.AfraPojo.AppointmentPysician;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import static api.util.Authentication.generateToken;
import static io.restassured.RestAssured.given;

public class Us_010_api {
    String url;
    Response response;

    @Given("Doctor lokman set the base url")
    public void doctorLokmanSetTheBaseUrl() {
        url="https://medunna.com/api/appointments/306003";
    }
    @When("Doctor send the request and get the response")
    public void doctorSendTheRequestAndGetTheResponse() {
        response=given().headers("Authorization","Bearer "+(generateToken())).when().get(url);

    }

    @Then("Doctor status code should be {int}")
    public void doctorStatusCodeShouldBe(int code) {
        response.then().statusCode(code);
    }

    @Then("Doctor verify response")
    public void doctorVerifyResponse() {
        AppointmentOuterPojo actualPojo= response.as(AppointmentOuterPojo.class);
        AppointmentPysician doktorName=new AppointmentPysician("lokman","lokman");

        AppointmentOuterPojo expectedAppointment = new AppointmentOuterPojo(306003,"2022-11-18T00:00:00Z",
                "2022-11-18T01:00:00Z","PENDING",doktorName);
        Assert.assertEquals(expectedAppointment.getId(),actualPojo.getId());
        Assert.assertEquals(expectedAppointment.getStartDate(),actualPojo.getStartDate());
        Assert.assertEquals(expectedAppointment.getEndDate(),actualPojo.getEndDate());
        Assert.assertEquals(expectedAppointment.getStatus(),actualPojo.getStatus());
        Assert.assertEquals(expectedAppointment.getPhysician().getFirstName(),actualPojo.getPhysician().getFirstName());
    }


}
