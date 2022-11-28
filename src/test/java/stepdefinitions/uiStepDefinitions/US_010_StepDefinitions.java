package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AfraPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_010_StepDefinitions {

    AfraPage ap=new AfraPage();
    @Given("Doktor url gider")
    public void doktorUrlGider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("Doktor Kişi ikonuna  tıklar")
    public void doktorKisiIkonunaTiklar() {
        ap.kisiIconu.click();
    }

    @And("Doktor sign in buttonuna tıklar")
    public void doktorsiginButtonunaTiklar() {
        ap.kayitOl.click();
    }

    @And("Doktor rolü ile geçerli username {string} girer")
    public void doktorRoluIleGecerliUsernameGirer(String username) {
        ap.userName.sendKeys(username);
    }

    @And("Doktor rolü ile gecerli password {string} girer")
    public void doktorRoluIleGecerliPasswordGirer(String password) {
        ap.password.sendKeys(password);
    }

    @And("Doktor Sign in tıklar")
    public void doktorSignInTiklar() {
        ap.signInButton.click();
    }

    @And("Doktor My Pages buttonuna tıklar")
    public void doktorMyPagesButtonunaTiklar() {
        ap.myPagesButtonu.click();
    }

    @And("Doktor My Appointment buttonuna tıklar")
    public void doktorMyAppointmentButtonunaTiklar() {
        ap.myAppointmentsButtonu.click();
    }

    @Then("Doktor Zaman araligini gorur.")
    public void doktorZamanAraliginiGorur() {
        Assert.assertTrue(ap.from.isDisplayed());
        Assert.assertTrue(ap.to.isDisplayed());

    }
    @Then("Doktor randevu olan aralikta bir tarih secer")
    public void doktorRandevuOlanAraliktaBirTarihSecer() {

        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));
        String date1 = "14";
        String date2 = "11";
        String date3 = "-2022";
        date.sendKeys(date1);
        date.sendKeys(date2);
        date.sendKeys(date3);
        ReusableMethods.waitFor(2);

        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 =  "21";
        String todate2 = "-11";
        String todate3 = "-2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);
        ReusableMethods.waitFor(3);

    }
    @Then("Doktor randevu listesini gorur.")
    public void doktorRandevuListesiniGorur() {
       Assert.assertTrue(ap.head.isDisplayed());
    }
    @And("Doktor sayfasi kapatilir")
    public void doktorSayfasiKapatilir() {
        Driver.closeDriver();
    }

    @Then("Randevu olan aralikta max on bes gun aralikla tarih belirler")
    public void randevuOlanAraliktaMaxOnBesGunAraliklaTarihBelirler() {
        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));
        String date1 = "14";
        String date2 = "11";
        String date3 = "-2022";
        date.sendKeys(date1);
        date.sendKeys(date2);
        date.sendKeys(date3);
        ReusableMethods.waitFor(2);

        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 =  "21";
        String todate2 = "-11";
        String todate3 = "-2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);
        ReusableMethods.waitFor(3);

    }

    @Then("Uzerine kayitli olan randevularin detaylarini gorebilir")
    public void uzerineKayitliOlanRandevularinDetaylariniGorebilir() {
        Assert.assertEquals(ap.idYazisi.getText(),"ID");
        Assert.assertEquals(ap.startDate.getText(),"Start DateTime");
        Assert.assertEquals(ap.endDate.getText(),"End DateTime");
        Assert.assertEquals(ap.status.getText(),"Status");
    }

    @Then("randevu olmayan bir aralik girer")
    public void randevuOlmayanBirAralikGirer() {
        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));
        String date1 = "13";
        String date2 = "11";
        String date3 = "-2022";
        date.sendKeys(date1);
        date.sendKeys(date2);
        date.sendKeys(date3);
        ReusableMethods.waitFor(2);

        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 =  "15";
        String todate2 = "-11";
        String todate3 = "-2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);
        ReusableMethods.waitFor(3);
    }

    @Then("secilen aralikta randevu yoksa no found appointment uyarisini gorur")
    public void secilenAraliktaRandevuYoksaNoFoundAppointmentUyarisiniGorur() {
        Assert.assertTrue(ap.noappointment.isDisplayed());
    }

    @Then("Zaman araligini on bes gunden fazla secer")
    public void zamanAraliginiOnBesGundenFazlaSecer() {
        WebElement date = Driver.getDriver().findElement(By.xpath("//input[@id='fromDate']"));
        String date1 = "13";
        String date2 = "11";
        String date3 = "-2022";
        date.sendKeys(date1);
        date.sendKeys(date2);
        date.sendKeys(date3);
        ReusableMethods.waitFor(2);

        WebElement todate = Driver.getDriver().findElement(By.xpath("//input[@id='toDate']"));
        String todate1 =  "29";
        String todate2 = "-11";
        String todate3 = "-2022";
        todate.sendKeys(todate1);
        todate.sendKeys(todate2);
        todate.sendKeys(todate3);
        ReusableMethods.waitFor(3);
    }

    @Then("Days between begin date and end date must be max 15 day uyarisini alir")
    public void maxOnBesUyarisiniAlir() {
        ReusableMethods.waitForVisibility(ap.maxOnBes,2);
        Assert.assertTrue(ap.maxOnBes.isDisplayed());
    }
}
