package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.KenanPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.LocalDate;


public class US_007_StepDefinitions {
    KenanPage kenanPage = new KenanPage();
    Actions actions = new Actions(Driver.getDriver());
    LocalDate date = LocalDate.now();


    @Given("Hasta {string} sayfasına gider")
    public void hastaSayfasınaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Giriş' e tıklar")
    public void girişETıklar() {
        kenanPage.giris.click();
        kenanPage.signIn.click();
    }

    @And("Hasta olarak kullanıcı bilgileri girilir")
    public void hastaOlarakKullanıcıBilgileriGirilir() {

        kenanPage.userName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB);
        kenanPage.password.sendKeys("Hasta03:)");
    }

    @And("TekrarGirişe tıklar")
    public void tekrargirişeTıklar() {

        kenanPage.signIn2.click();
    }

    @And("Hasta bilgilerini ve telefonu girer ve bugunun tarih seçer")
    public void hastaBilgileriniVeTelefonuGirerVeBugununTarihSeçer() {
        kenanPage.firstName.clear();
        kenanPage.firstName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.lastName.clear();
        kenanPage.lastName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.ssn.clear();
        kenanPage.ssn.sendKeys("123-02-3265");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.email.clear();
        kenanPage.email.sendKeys("hasan_hasta@gmail.com");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.phone.sendKeys("555 444 4444");

        actions.sendKeys(Keys.TAB)
                .sendKeys("" + (date.getDayOfMonth()) + "")
                .sendKeys("" + date.getMonthValue() + "")
                .sendKeys("2022")
                .perform();
    }

    @And("Hasta bilgilerini ve telefonu girer ve gelecek tarihi seçer")
    public void hastaBilgileriniVeTelefonuGirerVeGelecekTarihiSeçer() {
        kenanPage.firstName.clear();
        kenanPage.firstName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.lastName.clear();
        kenanPage.lastName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.ssn.clear();
        kenanPage.ssn.sendKeys("123-02-3265");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.email.clear();
        kenanPage.email.sendKeys("hasan_hasta@gmail.com");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.phone.sendKeys("555 444 4444");

        actions.sendKeys(Keys.TAB)
                .sendKeys("" + (date.getDayOfMonth() + 3) + "")
                .sendKeys("" + date.getMonthValue() + "")
                .sendKeys("2022")
                .perform();


    }
    @And("Send on appointment Request'e tıklar")
    public void sendOnAppointmentRequestETıklar() {

        kenanPage.sendApp.click();
    }

    @And("Ekranda {string} \\({string}) yazısını görür")
    public void ekrandaYazısınıGörür(String arg0, String arg1) {

        Assert.assertTrue(kenanPage.kacanyazi.isDisplayed());
    }

    @Then("Close the page")
    public void closeThePage() {
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSure) {
        try {
            Thread.sleep(istenenSure * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }





    @And("Hasta olarak yanlış username girilir")
    public void hastaOlarakYanlışUsernameGirilir() {
        kenanPage.userName.sendKeys("Huseyin_hasta");
        actions.sendKeys(Keys.TAB);
        kenanPage.password.sendKeys("Hasta03:)");
        kenanPage.signIn2.click();
    }

    @And("Ekranda Failed to sign in! Please check your credentials and try again.yazısını gorur")
    public void ekrandaFailedToSignInPleaseCheckYourCredentialsAndTryAgainYazısınıGorur() {
        Assert.assertTrue(kenanPage.failYazi.isDisplayed());
    }

    @And("Hasta olarak yanlış password girilir")
    public void hastaOlarakYanlışPasswordGirilir() {
        kenanPage.userName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB);
        kenanPage.password.sendKeys("Pasta03:)");
        kenanPage.signIn2.click();
    }


    @And("Hasta bilgilerini ve telefonu girer ve dunun tarih seçer")
    public void hastaBilgileriniVeTelefonuGirerVeDununTarihSeçer() {
        kenanPage.firstName.clear();
        kenanPage.firstName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.lastName.clear();
        kenanPage.lastName.sendKeys("Hasan_hasta");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.ssn.clear();
        kenanPage.ssn.sendKeys("123-02-3265");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.email.clear();
        kenanPage.email.sendKeys("hasan_hasta@gmail.com");
        actions.sendKeys(Keys.TAB).perform();
        kenanPage.phone.sendKeys("555 444 4444");

        actions.sendKeys(Keys.TAB)
                .sendKeys("" + (date.getDayOfMonth() -1) + "")
                .sendKeys("" + date.getMonthValue() + "")
                .sendKeys("2022")
                .perform();

    }

    @And("Ekranda {string} yazısını görür")
    public void ekrandaYazısınıGörür(String arg0) {
        Assert.assertTrue(kenanPage.pastDate.isDisplayed());
    }




    @And("Tarihin gun-ay-yıl sekilde oldugu gorur")
    public void tarihinGunAyYılSekildeOlduguGorur() {
        kenanPage.mypages.click();
        kenanPage.myAppoint.click();
        String expectedResult = kenanPage.date.getText();
        System.out.println(expectedResult);
        Assert.assertTrue(kenanPage.date.isDisplayed());
    }
}



