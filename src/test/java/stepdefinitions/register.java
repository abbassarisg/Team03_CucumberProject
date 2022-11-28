package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class register {
    RegisterPage register= new RegisterPage();
    Faker faker= new Faker();

    Actions actions= new Actions(Driver.getDriver());
    @Given("kullanici medunna sayfasina gider")
    public void kullaniciMedunnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaurl"));
    }

    @When("kullanici giris ikonuna tiklar")
    public void kullaniciGirisIkonunaTiklar() {
        register.girisikon.click();
    }

    @And("kullanici register ikonuna tiklar")
    public void kullaniciRegisterIkonunaTiklar() {
        JSUtils.clickElementByJS(register.registergirisikon);
    }

    @When("kullanici gecerli SSN girer")
    public void kullaniciGecerliSSNGirer() {
        register.ssn.sendKeys(faker.idNumber().ssnValid());
    }

    @And("kullanici  firstname girer")
    public void kullaniciFirstnameGirer() {
        actions.click(register.firstname).perform();
     register.firstname.sendKeys(faker.name().firstName());

    }

    @And("Kullanici  lastname girer.")
    public void kullaniciLastnameGirer() {
     actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).perform();
    }

    @And("kullanIci  username girer")
    public void kullanıciUsernameGirer() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().username()).perform();
    }

    @And("kullanici  email girer")
    public void kullaniciEmailGirer() {
        actions.sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).perform();
    }

    @When("kullanici   SSN bos birakir")
    public void kullaniciSSNBosBirakir() {

    }


    @When("kullanici gecersiz  SSN girer")
    public void kullaniciGecersizSSNGirer() {

    }


    @And("kullanici password girer")
    public void kullaniciPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("12345a").perform();
    }

    @And("kullanici tekrar password girer")
    public void kullaniciTekrarPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("12345a").perform();
    }
    @And("kullanici register butonuna basar")
    public void kullaniciRegisterButonunaBasar() {
      JSUtils.clickElementByJS(register.registerbuton);
    }
    @And("kullanici kayit oldugunu dogrular")
    public void kullaniciKayitOldugunuDogrular() {
        ReusableMethods.waitForVisibility(register.basarilikayit,10);
       Assert.assertTrue(register.basarilikayit.isDisplayed());

    }


  // @And("kullanici {int} saniye bekler")
  // public void kullaniciSaniyeBekler(int saniye) {

  //     try {
  //         Thread.sleep(saniye*1000);
  //     } catch (InterruptedException e) {
  //         throw new RuntimeException(e);
  //     }
   // }

    @And("kullanicinin kayıt olamadıgı dogrulanir")
    public void kullanicininKayıtOlamadıgıDogrulanir() {
        Assert.assertTrue(register.invalidSSN.isDisplayed());
    }

    @And("kullanici gecersiz bir  {string} girer")
    public void kullaniciGecersizBirGirer(String ssn ) {
       register.ssn.sendKeys(ssn);
    }

    @And("kullanici  firstname kismini bos birakir")
    public void kullaniciFirstnameKisminiBosBirakir() {
        register.firstname.sendKeys(" ");
    }

    @And("Kullanici  lastname kismini bos birakir")
    public void kullaniciLastnameKisminiBosBirakir() {
        actions.sendKeys(Keys.TAB).sendKeys(" ").perform();
    }


    @Then("kullanici required uyarisi alir")
    public void kullaniciRequiredUyarisiAlir() {
       Assert.assertTrue(register.firstnamereqired.isDisplayed() && register.lastnamereqired.isDisplayed());
    }


    @And("kullanici gecersiz olan {string} girer")
    public void kullaniciGecersizOlanGirer(String username) {
        register.username.sendKeys(username);
    }

    @And("kullanici gecersiz {string} girer")
    public void kullaniciGecersizGirer(String email) {
        register.email.sendKeys(email);
        try {
            ReusableMethods.getScreenshotWebElement("BUG",register.username);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
