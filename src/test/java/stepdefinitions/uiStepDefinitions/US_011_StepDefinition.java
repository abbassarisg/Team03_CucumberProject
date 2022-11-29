package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DemirPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US_011_StepDefinition {

    DemirPage demirPage = new DemirPage();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());

    @Given("Kullanici doktor olarak {string} anasayfasina gider")
    public void kullaniciDoktorOlarakAnasayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("Kullanicilar  butonuna tiklar")
    public void kullanicilarButonunaTiklar() {

        demirPage.kullanicilar.click();
    }

    @And("Sign in sekmesine tiklar")
    public void signInSekmesineTiklar() {

        demirPage.signIn.click();
    }

    @And("Kullanici username {string} girer")
    public void kullaniciUsernameGirer(String userName) {

        demirPage.userName.sendKeys(userName);
    }

    @And("Gecerli password {string} girer")
    public void gecerliPasswordGirer(String password) {

        demirPage.password.sendKeys(password);


    }

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {

        demirPage.signInButton.click();
    }

    @Then("Kullanici doktor olarak doktor sayfasina giris yapildigini goruntuler")
    public void kullaniciDoktorOlarakDoktorSayfasinaGirisYapildiginiGoruntuler() {

        demirPage.doktorPage.isDisplayed();
    }


    @Then("Kullanici doktor olarak doktor sayfasina giris yapilamadigini goruntuler")
    public void kullaniciDoktorOlarakDoktorSayfasinaGirisYapilamadiginiGoruntuler() {

        demirPage.popUpMessage.isDisplayed();

    }

    @And("Make an Appointment linkine tiklar")
    public void makeAnAppointmentLinkineTiklar() {

        jse.executeScript("arguments[0].click;", demirPage.makeAnAppointment);


    }

    @And("Acilan sayfada hasta bilgilerini\\(username,lastnname,SSN,email,phone,Appointment DateTime) girer")
    public void acilanSayfadaHastaBilgileriniUsernameLastnnameSSNEmailPhoneAppointmentDateTimeGirer() {
        //jse.executeScript("arguments[0].scrollIntoView(true);", demirPage.appointmentFirstName);
        demirPage.appointmentFirstName.sendKeys(Keys.ENTER);
        actions.sendKeys("Abdullah").sendKeys(Keys.TAB).
                sendKeys("Ademoglu").sendKeys(Keys.TAB).
                sendKeys("104-10-1004").sendKeys(Keys.TAB).
                sendKeys("abdullahademoglu@gmail.com").sendKeys(Keys.TAB).
                sendKeys("555-444-3322").sendKeys(Keys.TAB).
                sendKeys("27.11.2022").perform();

    }

    @And("Send an Appointment Request butonuna tiklar")
    public void sendAnAppointmentRequestButonunaTiklar() {

        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }

    @Then("Randevu kaydinin olustugu bilgisini\\(Appointment Registrarion Save!) gorur")
    public void randevuKaydininOlustuguBilgisiniAppointmentRegistrarionSaveGorur() {
        demirPage.popUpMessageAppointment.isDisplayed();


    }

    @And("MY PAGES sekmesine tiklar")
    public void myPAGESSekmesineTiklar() {

        demirPage.myPages.click();
    }

    @And("My Appointments sekmesine tiklar")
    public void myAppointmentsSekmesineTiklar() {
        demirPage.myAppointment.click();

    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {

        jse.executeScript("arguments[0].scrollIntoView(true);", demirPage.edit);
        demirPage.edit.sendKeys(Keys.ENTER);
    }

    @And("Guncellemek istedigi alana gerekli bilgileri girer")
    public void guncellemekIstedigiAlanaGerekliBilgileriGirer() {

        demirPage.anamnesis.clear();
        demirPage.anamnesis.sendKeys("cerrahi anamnez");
        demirPage.treatment.clear();
        demirPage.treatment.sendKeys("Kemoterapi");
        demirPage.diagnosis.clear();
        demirPage.diagnosis.sendKeys("Losemi");
        demirPage.prescription.clear();
        demirPage.prescription.sendKeys("QXYZRETIKH");
        demirPage.description.clear();
        demirPage.description.sendKeys("Acil tibbi mudahele");


    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        // actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        demirPage.AppointmentUpdateSave.sendKeys(Keys.ENTER);
    }

    @And("Guncelleme gerceklesti mesajini \\(The Appointment is updated with identifier) goruntuler")
    public void guncellemeGerceklestiMesajiniTheAppointmentIsUpdatedWithIdentifierGoruntuler() {

        demirPage.popUpMessageAppointmentUpdate.isDisplayed();
    }

    @And("Randevu sayfasunda hastanin id, start and end date, Status, physician and patient bilgilerini goruntuler")
    public void randevuSayfasundaHastaninIdStartAndEndDateStatusPhysicianAndPatientBilgileriniGoruntuler() {

        List<WebElement> hastaBilgileri = demirPage.hastaBilgileri;

        hastaBilgileri.forEach(WebElement::isDisplayed);


    }

    @And("Anamnesis, Treatment ve Diagnosis alanlarına bilgileri girer")
    public void anamnesisTreatmentVeDiagnosisAlanlarınaBilgileriGirer() {

        demirPage.anamnesis.sendKeys(Keys.ENTER);
        demirPage.anamnesis.clear();
        demirPage.anamnesis.sendKeys("cerrahi anamnez");
        demirPage.treatment.clear();
        demirPage.treatment.sendKeys("Kemoterapi");
        demirPage.diagnosis.clear();
        demirPage.diagnosis.sendKeys("Losemi");

    }

    @And("Anamnesis, Treatment ve Diagnosis alanlarıni bos birakir")
    public void anamnesisTreatmentVeDiagnosisAlanlarıniBosBirakir() {

        demirPage.anamnesis.clear();
        demirPage.treatment.clear();
        demirPage.diagnosis.clear();

    }

    @Then("This field is required \\(Bu alan gereklidir) uyarisini gorur")
    public void thisFieldIsRequiredBuAlanGereklidirUyarisiniGorur() {

        List<WebElement> buAlanGereklidir = demirPage.thisFieldIsRequired;
        buAlanGereklidir.forEach(WebElement::isDisplayed);

    }

    @And("prescription ve description alanlarına bilgileri girer")
    public void prescriptionVeDescriptionAlanlarınaBilgileriGirer() {

        demirPage.anamnesis.clear();
        demirPage.anamnesis.sendKeys("cerrahi anamnez");
        demirPage.treatment.clear();
        demirPage.treatment.sendKeys("Kemoterapi");
        demirPage.diagnosis.clear();
        demirPage.diagnosis.sendKeys("Losemi");
        demirPage.prescription.clear();
        demirPage.prescription.sendKeys("QXYZRETIKH");
        demirPage.description.clear();
        demirPage.description.sendKeys("Acil tibbi mudahele");

    }

    @And("prescription ve description alanlarıni bos birakir")
    public void prescriptionVeDescriptionAlanlarıniBosBirakir() {

        demirPage.anamnesis.clear();
        demirPage.anamnesis.sendKeys("cerrahi anamnez");
        demirPage.treatment.clear();
        demirPage.treatment.sendKeys("Kemoterapi");
        demirPage.diagnosis.clear();
        demirPage.diagnosis.sendKeys("Losemi");
        demirPage.prescription.clear();
        demirPage.description.clear();

    }

    @And("PENDING secenegini secer")
    public void pendıngSeceneginiSecer() {

        Select select = new Select(demirPage.status);
        select.selectByIndex(1);

    }

    @And("COMPLETED secenegini secer")
    public void completedSeceneginiSecer() {
        Select select = new Select(demirPage.status);
        select.selectByIndex(2);
    }

    @And("CANCELLED secenegini secer")
    public void cancelledSeceneginiSecer() {

        Select select = new Select(demirPage.status);
        select.selectByIndex(3);
    }
}
