package stepdefinitions.uiStepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.IbrahimPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_013_StepDefinitions {
    IbrahimPage ibrahimPage = new IbrahimPage();
    Actions actions ;
    Select select ;


    @Given("ibrahim medunna sayfasina gider")
    public void kullanici_medunna_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna"));
    }
    @Given("kullanici Hasta rolunde gerekli bilgilieri girer")
    public void kullanici_hasta_rolunde_gerekli_bilgilieri_girer() {
        ibrahimPage.girisYapilanButon.click();
        ibrahimPage.girisSignInButonu.click();
        //ibrahimPage.userName.sendKeys(Driver.getDriver().get(ConfigReader.getProperty("")));
        ibrahimPage.userName.sendKeys("Hasta_team_03");
        ibrahimPage.password.sendKeys("ibrahim56");
    }
    @Given("kullanici Sign in butonuna tiklar")
    public void kullanici_sign_in_butonuna_tiklar() {
        ibrahimPage.bilgilerSignInButonu.click();
    }
    @Given("kullanici My Pages butonuna tiklar")
    public void kullanici_my_pages_butonuna_tiklar() {
        ibrahimPage.hastaMyPages.click();

    }
    @Given("kullanici Make An Appointment butonuna basar")
    public void kullanici_make_an_appointment_butonuna_basar() {
        ibrahimPage.hastaMakeAnAppointment.click();
    }
    @Given("kullanici acilan ekranda Phone girer")
    public void kullanici_acilan_ekranda_phone_girer() {
        ibrahimPage.hastaKayitPhone.sendKeys("555-555-5555");

    }
    @Given("kullanici Send An Appointment Request butonuna basar")
    public void kullanici_send_an_appointment_request_butonuna_basar() {
        JSUtils.clickElementByJS(ibrahimPage.sendAnAppointmentRequest);
    }
    @Then("basarili bir sekilde randevu olusturuldugu dogrulanir")
    public void basarili_bir_sekilde_randevu_olusturuldugu_dogrulanir() {
        ReusableMethods.waitForVisibility(ibrahimPage.SendAnAppointmentDogrulama,20);
        Assert.assertTrue(ibrahimPage.SendAnAppointmentDogrulama.isDisplayed());
    }
    @Then("kullanici Sign out butonuna tiklar")
    public void kullanici_sign_out_butonuna_tiklar() {
        ibrahimPage.signOutUlasmakIcin.click();
        ibrahimPage.signOut.click();
    }
    @Then("kullanici giristeki Sign in butonuna tiklar")
    public void kullanici_giristeki_sign_in_butonuna_tiklar() {
        ibrahimPage.girisYapilanButon.click();
        ibrahimPage.girisSignInButonu.click();
    }
    @Then("kullanici personel rolunde gerekli bilgileri doldurulur")
    public void kullanici_personel_rolunde_gerekli_bilgileri_doldurulur() {
        ibrahimPage.userName.sendKeys("personelibrahim");
        ibrahimPage.password.sendKeys("ibrahim56");
    }
    @Then("kullanici personel rolunde My Pages butonuna tiklar")
    public void kullanici_personel_rolunde_my_pages_butonuna_tiklar() {
        ibrahimPage.personelMyPages.click();

    }
    @Then("kullanici acilan yazida Search Patient butonuna tiklar")
    public void kullanici_acilan_yazida_search_patient_butonuna_tiklar() {
        ReusableMethods.waitForClickablility(ibrahimPage.personelSearchPatient,20).click();

    }
    @Then("kullanici Patient SSN arama kutusuna hastanin SSN’s’n’ girer")
    public void kullanici_patient_ssn_arama_kutusuna_hastanin_ssn_s_n_girer() {
        ibrahimPage.personelPatientSsn.sendKeys("898-88-8989");

    }
    @Then("kullanici acilan sayfada Show Appointments’e tiklar")
    public void kullanici_acilan_sayfada_show_appointments_e_tiklar() {
        ReusableMethods.waitForClickablility(ibrahimPage.personelShowAppointments,20).click();
    }
    @Then("kullanici edit butonuna tiklar")
    public void kullanici_edit_butonuna_tiklar() {
        ibrahimPage.personelEdit.click();

    }
    @Then("ibrahim endDate tarihini ayarlar")
    public void ibrahim_end_date_tarihini_ayarlar() {
        ReusableMethods.waitForClickablility(ibrahimPage.personelEndDateTime,10).click();
        ibrahimPage.personelEndDateTime.sendKeys("30.11.2022 04:00");
    }
    @Then("kullanici Status dropdown menuden Pending secenegine tiklar")
    public void kullanici_status_dropdown_menuden_pending_secenegine_tiklar() {
        ibrahimPage.personelStatus.sendKeys("PENDING");
    }
    @Then("kullanici Physican bolumunden gerekli doktora hasta atamasini yapar")
    public void kullanici_physican_bolumunden_gerekli_doktora_hasta_atamasini_yapar() {
        ReusableMethods.jsScrollClick(ibrahimPage.personelPhysician);
        ReusableMethods.jsScrollClick(ibrahimPage.personelPhysician);
        ibrahimPage.personelPhysician.click();
        ibrahimPage.personelPhysician.click();
        ReusableMethods.jsScrollClick(ibrahimPage.personelPhysician);
        ReusableMethods.waitFor(10);


        select=new Select(ibrahimPage.personelPhysician);
        select.selectByVisibleText("330657");
        //ibrahimPage.personelPhysicianibrahim.sendKeys("330657");


    }
    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        ReusableMethods.waitFor(3);
        ReusableMethods.jsScrollClick(ibrahimPage.personelSave);

    }
    @Then("basarili bir sekilde hastanin doktara atandigini dogrulanir")
    public void basarili_bir_sekilde_hastanin_doktara_atandigini_dogrulanir() {

    }
    @Then("kullanici personel Sign out butonuna tiklar")
    public void kullanici_personel_sign_out_butonuna_tiklar() {
        ibrahimPage.personelSignoutUlasmak.click();
        ibrahimPage.personelSignout.click();

    }
    @Then("kullanici doktor rolunde gerekli bilgileri doldurulur")
    public void kullanici_doktor_rolunde_gerekli_bilgileri_doldurulur() {
        ibrahimPage.userName.sendKeys("ibrahimdoktor");
        ibrahimPage.password.sendKeys("ibrahim56");

    }
    @Then("kullanici acilan ekran doktor My Pages yazisina tiklar")
    public void kullanici_acilan_ekran_doktor_my_pages_yazisina_tiklar() {
        ibrahimPage.doktorMyPages.click();

    }
    @Then("kullanici acilan yazida My Appointments yazisini tiklar")
    public void kullanici_acilan_yazida_my_appointments_yazisini_tiklar() {
        ReusableMethods.waitForClickablility(ibrahimPage.doktorMyAppointments,20).click();

    }
    @Then("kullanici acilan sayfada edit yazisina tiklar")
    public void kullanici_acilan_sayfada_edit_yazisina_tiklar() {
        ReusableMethods.jsScrollClick(ibrahimPage.doktorEdit);

    }
    @Then("kullanici “request A test” yazisina tiklar")
    public void kullanici_request_a_test_yazisina_tiklar() {
        ReusableMethods.waitFor(1);
        ibrahimPage.doktorRequestATest.click();
    }
    @Then("kullanici acilan ekranda istedigi testleri secer")
    public void kullanici_acilan_ekranda_istedigi_testleri_secer() {
        ReusableMethods.waitFor(5);
        ReusableMethods.waitForClickablility(ibrahimPage.doktorOrnekTestBir,10).click();
        ReusableMethods.waitForClickablility(ibrahimPage.doktorOrnekTestIki,10).click();
        ReusableMethods.waitForClickablility(ibrahimPage.doktorOrnekTestUc,10).click();


    }
    @Given("kullanici test kisminda save butonuna tiklar")
    public void kullanici_test_kisminda_save_butonuna_tiklar() {

        ReusableMethods.jsScrollClick(ibrahimPage.doktorSaveTest);
        ReusableMethods.waitFor(1);
    }
    @Then("basarili sekilde save olundugu  dogrulanir")
    public void basarili_sekilde_save_olundugu_dogrulanir() {
        ReusableMethods.waitForVisibility(ibrahimPage.doktorSaveButonuDogrulama,20);
        Assert.assertTrue(ibrahimPage.doktorSaveButonuDogrulama.isDisplayed());

    }
    @Given("kullanici acilan bolumde gerekli hastanin show test''ne tiklar")
    public void kullanici_acilan_bolumde_gerekli_hastanin_show_test_ne_tiklar() {
        ibrahimPage.personelShowTest.click();
    }
    @Given("kullanici acilan bolumde View Results'a tiklar")
    public void kullanici_acilan_bolumde_view_results_a_tiklar() {
        ibrahimPage.personelViewResult.click();

    }
    @Given("kullanici acilan bolumde Edit'e tiklar")
    public void kullanici_acilan_bolumde_edit_e_tiklar() {
        ibrahimPage.personelEditTestResult.click();
    }
    @Given("kullanici result bolumune gerekli bilgileri girer")
    public void kullanici_result_bolumune_gerekli_bilgileri_girer() {

        ReusableMethods.waitFor(2);
        ibrahimPage.personelResultText.sendKeys("Guzel");

    }
    @Given("kullanici description bolumune gerekli bilgileri girer")
    public void kullanici_description_bolumune_gerekli_bilgileri_girer() {
        ibrahimPage.personelDescriptionText.sendKeys("No problem");

    }
    @Given("kullanici personel bolumunden testi onaylamak icin Save butonuna basar")
    public void kullanici_personel_bolumunden_testi_onaylamak_icin_save_butonuna_basar() {

        ReusableMethods.jsScrollClick(ibrahimPage.personelTestResultSave);
    }
    @Given("kullanici personel bolumunden testi onaylamak icin Save olundugunu dogrular")
    public void kullanici_personel_bolumunden_testi_onaylamak_icin_save_olundugunu_dogrular() {

        ReusableMethods.waitForVisibility(ibrahimPage.PersonelSaveTestResultDogrulama,20);
        Assert.assertTrue(ibrahimPage.PersonelSaveTestResultDogrulama.isDisplayed());
    }
    @Given("kullanici Show Test Result'a tiklar")
    public void kullanici_show_test_result_a_tiklar() {

        ReusableMethods.waitFor(2);
        ibrahimPage.doktorShowTestResult.click();
    }
    @Given("kullanici doktor rolunde View Resulta tiklar")
    public void kullanici_doktor_rolunde_view_resulta_tiklar() {

        ReusableMethods.jsScrollClick(ibrahimPage.doktorViewResult);
    }
    @Given("kullanici acilan ekranda ID, Name gibi bilgilerin oldugunu dogrular")
    public void kullanici_acilan_ekranda_id_name_gibi_bilgilerin_oldugunu_dogrular() {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(ibrahimPage.doktorIDDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorNameDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorResultTableDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorDefaultMinDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorDefaultMaxDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorTestDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorDescriptionDogrulama.isDisplayed());
        Assert.assertTrue(ibrahimPage.doktorDateDogrulama.isDisplayed());

    }
    @Given("kullanici Request inpatient butonuna basar")
    public void kullanici_request_inpatient_butonuna_basar() {

        ReusableMethods.waitForClickablility(ibrahimPage.doktorRequestinpatient,10).click();

    }
    @Given("kullanici acilan ekranda My inpatient butonuna basar")
    public void kullanici_acilan_ekranda_my_inpatient_butonuna_basar() {

        ReusableMethods.waitForClickablility(ibrahimPage.doktorMyInpatient,10).click();


    }
    @Given("yatan hastanin oldugu dogrulanir")
    public void yatan_hastanin_oldugu_dogrulanir() {

        ReusableMethods.waitFor(1);
        Assert.assertTrue(ibrahimPage.doktorMyInpatientDogrulama.isDisplayed());
    }



}
