package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AsimPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_005_StepDefinitions {

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

    @Then("kullanici Email kismina bir email adresi girer")
    public void kullaniciEmailKisminaBirEmailAdresiGirer() {

        medunna.emailEmpty.sendKeys("adembakirci124@gmail.com");
    }

    @And("kullanici Email kisminda bir email adresi oldugunu dogrular")
    public void kullaniciEmailKismindaBirEmailAdresiOldugunuDogrular() {

        Assert.assertTrue(medunna.emailFull.isDisplayed());
    }

    @Then("kullanici Email kismini bos birakir")
    public void kullaniciEmailKisminiBosBirakir() {

        medunna.emailEmpty.sendKeys(Keys.TAB);
    }

    @And("kullanici Email kismini bos biraktiginda cikan uyari yazisini dogrular")
    public void kullaniciEmailKisminiBosBiraktigindaCikanUyariYazisiniDogrular() {

        Assert.assertTrue(medunna.emailWarning.isDisplayed());
    }

    @Then("kullanici SSN kismina uc ve bes rakamindan sonra - iceren ve dokuz rakamdan olusan bir numara girer")
    public void kullaniciSSNKisminaUcVeBesRakamindanSonraIcerenVeDokuzRakamdanOlusanBirNumaraGirer() {

        medunna.ssnEmpty.sendKeys("124-98-4782");
    }

    @And("kullanici SSN kisminda uc ve bes rakamindan sonra - iceren ve dokuz rakamdan olusan bir numara oldugunu dogrular")
    public void kullaniciSSNKismindaUcVeBesRakamindanSonraIcerenVeDokuzRakamdanOlusanBirNumaraOldugunuDogrular() {

        Assert.assertTrue(medunna.ssnFull.isDisplayed());
    }

    @Then("kullanici SSN kismini bos birakir")
    public void kullaniciSSNKisminiBosBirakir() {

        medunna.ssnEmpty.sendKeys(Keys.TAB);
    }

    @And("kullanici SSN kismini bos biraktiginda cikan uyari yazisini dogrular")
    public void kullaniciSSNKisminiBosBiraktigindaCikanUyariYazisiniDogrular() {

        Assert.assertTrue(medunna.ssnWarning.isDisplayed());
    }

    @Then("kullanici sayfada sag ustte bulunan kisi ikonuna gelir ve register sekmesine tiklar")
    public void kullaniciSayfadaSagUstteBulunanKisiIkonunaGelirVeRegisterSekmesineTiklar() {

        medunna.kisiSekmesi.click();

        medunna.register.click();
    }

    @And("kullanici SSN kismina randevu alirken girdigi {string} numarasini girer")
    public void kullaniciSSNKisminaRandevuAlirkenGirdigiNumarasiniGirer(String ssn) {

        medunna.registerSsn.sendKeys(ConfigReader.getProperty(ssn));
    }

    @And("kullanici First Name kismina randevu alirken girdigi {string} ismini girer")
    public void kullaniciFirstNameKisminaRandevuAlirkenGirdigiIsminiGirer(String firstName) {

        medunna.registerFirstName.sendKeys(ConfigReader.getProperty(firstName));
    }

    @And("kullanici Last Name kismina randevu alirken girdigi {string} ismini girer")
    public void kullaniciLastNameKisminaRandevuAlirkenGirdigiIsminiGirer(String lastName) {

        medunna.registerLastName.sendKeys(ConfigReader.getProperty(lastName));
    }

    @And("kullanici Username kismina bir {string} girer")
    public void kullaniciUsernameKisminaBirGirer(String userName) {

        medunna.registerUsername.sendKeys(ConfigReader.getProperty(userName));
    }

    @And("kullanici Email kismina randevu alirken girdigi {string} adresini girer")
    public void kullaniciEmailKisminaRandevuAlirkenGirdigiAdresiniGirer(String email) {

        medunna.registerEmail.sendKeys(ConfigReader.getProperty(email));
    }

    @And("kullanici New Password kismina bir {string} girer")
    public void kullaniciNewPasswordKisminaBirGirer(String password) {

        medunna.registerPassword1.sendKeys(ConfigReader.getProperty(password));
    }

    @And("kullanici New Password confirmation kismina tekrar {string} girer")
    public void kullaniciNewPasswordConfirmationKisminaTekrarGirer(String password) {

        medunna.registerPassword2.sendKeys(ConfigReader.getProperty(password));
    }

    @And("kullanici Register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {

        medunna.registerSubmit.click();
    }

    @And("kullanici uygulamada oturum acmak icin sisteme kaydoldugunu dogrular")
    public void kullaniciUygulamadaOturumAcmakIcinSistemeKaydoldugunuDogrular() {

        Assert.assertFalse(medunna.registerEmailWarning.isDisplayed());
    }
   /*
    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {

        ReusableMethods.waitFor(saniye);
    }*/
}
