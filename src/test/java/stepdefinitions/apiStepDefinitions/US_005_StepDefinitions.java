package stepdefinitions.apiStepDefinitions;

import api.baseUrl.MedunnaBaseUrl;
import api.pojos.AppointmentPojo;
import api.pojos.PatientPojo;
import api.pojos.UserDataPojo;
import api.pojos.UserPojo;
import api.util.ObjectMapperUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import static api.util.Authentication.generateToken;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_005_StepDefinitions {

    Response response;
    UserPojo user;
    PatientPojo patient;
    AppointmentPojo expectedData;
    AppointmentPojo actualData;

    @When("kullanici adrese GET istegi gonderir")
    public void kullaniciAdreseGETIstegiGonderir() {

        user = new UserPojo("anonymousUser", "2022-11-18T16:04:56.181538Z", 309799,
                            "adembakirci", "Adem", "Bakırcı", "adembakirci1245@gmail.com",
                            true, "en", null, null, "124-98-4782");

        patient = new PatientPojo("anonymousUser", "2022-11-18T15:48:18.937892Z", 309193,
                                  "firstName", "Bakırcı", null, "1249847820",
                                  "MALE", "Apositive", null, "adembakirci124@gmail.com",
                                  null, user, null, null, null);

        expectedData = new AppointmentPojo("anonymousUser", "2022-11-25T20:13:16.103562Z",
                                           339037, "2022-11-30T00:00:00Z", "2022-11-30T01:00:00Z",
                                           "UNAPPROVED", null, null, null,
                                           null, null, null, patient, null);

        System.out.println("Expected Data : " +expectedData);

        response = given().header("Authorization", "Bearer " +generateToken()).when().get(ConfigReader.getProperty("endpoint"));

        //response.prettyPrint();

        actualData = ObjectMapperUtil.convertJsonToJava(response.asString(), AppointmentPojo.class);

        System.out.println("Actual Data : " +actualData);
    }

    @Then("kullanici Status kodun {int} oldugunu dogrular")
    public void kullaniciStatusKodunOldugunuDogrular(int expectedCode) {

        int actualCode = response.getStatusCode();

        Assert.assertEquals(expectedCode, actualCode);
    }

    @And("kullanici kaydedilen hastanin bilgilerini dogrular")
    public void kullaniciKaydedilenHastaninBilgileriniDogrular() {

        assertEquals(user.getFirstName(), actualData.getPatient().getUser().getFirstName());
        assertEquals(user.getLastName(), actualData.getPatient().getUser().getLastName());
        assertEquals(user.getSsn(), actualData.getPatient().getUser().getSsn());
        assertEquals(user.getEmail(), actualData.getPatient().getUser().getEmail());
        assertEquals(patient.getPhone(), actualData.getPatient().getPhone());
    }
}

