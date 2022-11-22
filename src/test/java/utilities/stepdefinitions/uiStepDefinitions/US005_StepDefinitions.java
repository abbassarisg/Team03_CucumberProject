package utilities.stepdefinitions.uiStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AsimPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US005_StepDefinitions {

    AsimPage medunna = new AsimPage();

    @Given("kullanici {string} anasayfasina gider")
    public void kullaniciAnasayfasinaGider(String medunnaUrl) {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("kullanici sayfada yer alan Make an Appointment butonuna tiklar")
    public void kullaniciSayfadaYerAlanMakeAnAppointmentButonunaTiklar() {

        medunna.makeAnAppointment.click();
    }

    @Then("kullanici First Name kismina herhangi bir karakter girer")
    public void kullaniciFirstNameKisminaHerhangiBirKarakterGirer() {

        medunna.firstNameEmpty.sendKeys("Adem");
    }

    @And("kullanici First Name kisminda herhangi bir karakter oldugunu dogrular")
    public void kullaniciFirstNameKismindaHerhangiBirKarakterOldugunuDogrular() {

        Assert.assertTrue(medunna.firstNameFull.isDisplayed());
    }

    @Then("kullanici First Name kismini bos birakir")
    public void kullaniciFirstNameKisminiBosBirakir() {

        medunna.firstNameEmpty.sendKeys(Keys.TAB);
    }

    @And("kullanici First Name kismini bos biraktiginda cikan uyari yazisini dogrular")
    public void kullaniciFirstNameKisminiBosBiraktigindaCikanUyariYazisiniDogrular() {

        Assert.assertTrue(medunna.firstNameWarning.isDisplayed());
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

        Driver.closeDriver();
    }

    @Then("kullanici Last Name kismina herhangi bir karakter girer")
    public void kullaniciLastNameKisminaHerhangiBirKarakterGirer() {

        medunna.lastNameEmpty.sendKeys("Bakırcı");
    }

    @And("kullanici Last Name kisminda herhangi bir karakter oldugunu dogrular")
    public void kullaniciLastNameKismindaHerhangiBirKarakterOldugunuDogrular() {

        Assert.assertTrue(medunna.lastNameFull.isDisplayed());
    }

    @Then("kullanici Last Name kismini bos birakir")
    public void kullaniciLastNameKisminiBosBirakir() {

        medunna.lastNameEmpty.sendKeys(Keys.TAB);
    }

    @And("kullanici Last Name kismini bos biraktiginda cikan uyari yazisini dogrular")
    public void kullaniciLastNameKisminiBosBiraktigindaCikanUyariYazisiniDogrular() {

        Assert.assertTrue(medunna.lastNameWarning.isDisplayed());
    }
}
