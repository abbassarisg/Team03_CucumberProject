package stepdefinitions.apiStepDefinitions;

import api.pojos.RegisterPojo;
import api.util.ObjectMapperUtil;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;

public class registerAPI {
    RegisterPage register = new RegisterPage();
    Faker faker = new Faker();
    RegisterPojo registerpojo;
    static Response response;


    String email;
    String firstName;
    String lastName;

    String login;
    String password;
    String ssn;

    String url;
    @Given("kullanici {string}")
    public void kullanici(String uri) {
       url = uri;
        ReusableMethods.waitFor(1);
    }

    @When("kullanici post request gönderir")
    public void kullaniciPostRequestGönderir() {
        firstName =faker.name().firstName();
        lastName =faker.name().lastName();
        email =faker.internet().emailAddress();
        ssn =faker.idNumber().ssnValid();
        password =faker.internet().password();
        login=faker.internet().password();

        registerpojo = new RegisterPojo(email,firstName,lastName,login,password,ssn);
        response=given().contentType(ContentType.JSON).body(registerpojo).when().post(url);

        response.prettyPrint();


    }

    @Then("kullanici Status kodunun {int} oldugunu dogrular")
    public void kullaniciStatusKodununOldugunuDogrular(int arg0) {
        Assert.assertEquals(201,response.getStatusCode());
    }

    @And("kullanici response bodyi dogrular")
    public void kullaniciResponseBodyiDogrular() {

    RegisterPojo actualData= ObjectMapperUtil.convertJsonToJava(response.asString(), RegisterPojo.class);
        Assert.assertEquals(registerpojo.getEmail(), actualData.getEmail());

    }
}
