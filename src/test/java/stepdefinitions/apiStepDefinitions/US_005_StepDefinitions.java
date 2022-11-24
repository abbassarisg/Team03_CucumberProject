package stepdefinitions.apiStepDefinitions;

import api.baseUrl.MedunnaBaseUrl;
import api.pojos.AppointmentPojo;
import api.pojos.UserDataPojo;
import api.util.ObjectMapperUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static api.util.Authentication.generateToken;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_005_StepDefinitions extends MedunnaBaseUrl {

    Response response;
    UserDataPojo user;
    AppointmentPojo expectedData;
    AppointmentPojo actualData;

    @When("kullanici adrese GET istegi gonderir")
    public void kullaniciAdreseGETIstegiGonderir() {

        String url = "https://medunna.com/api/patients/309193";

        UserDataPojo user = new UserDataPojo("adembakirci", "Adem", "Bakırcı",
                                             "adembakirci1245@gmail.com", true,
                                             "en", null, null, "124-98-4782");

        AppointmentPojo expectedData = new AppointmentPojo("Adem", "Bakırcı", null,
                                                           "1249847820", "MALE", "Apositive",
                                                           null, "adembakirci124@gmail.com", null,
                                                           user, null, null, null, null);

        Response response = given().header("Authorization", "Bearer " +generateToken()).
                            when().get(url);

        AppointmentPojo actualData = ObjectMapperUtil.convertJsonToJava(response.asString(), AppointmentPojo.class);
    }

    @Then("kullanici Status kodun {int} oldugunu dogrular")
    public void kullaniciStatusKodunOldugunuDogrular(int expectedCode) {

        int actualCode = response.getStatusCode();

        assertEquals(expectedCode, actualCode);
    }

    @And("kullanici kaydedilen hastanin bilgilerini dogrular")
    public void kullaniciKaydedilenHastaninBilgileriniDogrular() {

        assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        assertEquals(expectedData.getLastName(), actualData.getLastName());
        assertEquals(expectedData.getBirthDate(), actualData.getBirthDate());
        assertEquals(expectedData.getPhone(), actualData.getPhone());
        assertEquals(expectedData.getGender(), actualData.getGender());
        assertEquals(expectedData.getBloodGroup(), actualData.getBloodGroup());
        assertEquals(expectedData.getAdress(), actualData.getAdress());
        assertEquals(expectedData.getEmail(), actualData.getEmail());
        assertEquals(expectedData.getDescription(), actualData.getDescription());

        assertEquals(user.getLogin(), actualData.getUser().getLogin());
        assertEquals(user.getFirstName(), actualData.getUser().getFirstName());
        assertEquals(user.getLastName(), actualData.getUser().getLastName());
        assertEquals(user.getEmail(), actualData.getUser().getEmail());
        assertEquals(user.getActivated(), actualData.getUser().getActivated());
        assertEquals(user.getLangKey(), actualData.getUser().getLangKey());
        assertEquals(user.getImageUrl(), actualData.getUser().getImageUrl());
        assertEquals(user.getResetDate(), actualData.getUser().getResetDate());
        assertEquals(user.getSsn(), actualData.getUser().getSsn());

        assertEquals(expectedData.getAppointments(), actualData.getAppointments());
        assertEquals(expectedData.getInPatients(), actualData.getInPatients());
        assertEquals(expectedData.getCountry(), actualData.getCountry());
        assertEquals(expectedData.getCstate(), actualData.getCstate());
    }
}

