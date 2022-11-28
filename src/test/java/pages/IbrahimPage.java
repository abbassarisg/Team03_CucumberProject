package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IbrahimPage {
    public IbrahimPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "#account-menu")
    public WebElement girisYapilanButon;
    @FindBy (css = "#login-item")
    public WebElement girisSignInButonu;
    @FindBy (css = "#username")
    public WebElement userName;
    @FindBy (css = "#password")
    public WebElement password;
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement bilgilerSignInButonu;
    @FindBy (css = "#entity-menu")
    public WebElement hastaMyPages;
    @FindBy (xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement hastaMakeAnAppointment;
    @FindBy (css = "#phone")
    public WebElement hastaKayitPhone;
    @FindBy (css = "#register-submit")
    public WebElement sendAnAppointmentRequest;
    @FindBy (xpath = " //*[contains(text(), 'We will call you as soon as possible.')]")
    public WebElement SendAnAppointmentDogrulama;
    @FindBy (css = "#account-menu")
    public WebElement signOutUlasmakIcin;
    @FindBy (xpath = "(//*[@class='dropdown-item'])[4]")
    public WebElement signOut;
    @FindBy (css = "#entity-menu")
    public WebElement personelMyPages;
    @FindBy (xpath = "//*[@class='svg-inline--fa fa-search fa-w-16 fa-fw ']")
    public WebElement personelSearchPatient;
    @FindBy (xpath = "//*[@class='form-control']")
    public WebElement personelPatientSsn;
    @FindBy (xpath = "(//*[@class='d-none d-md-inline'])[3]")
    public WebElement personelShowAppointments;
    @FindBy (xpath = "(//*[@class='btn btn-warning btn-sm'])[1]")
    public WebElement personelEdit;
    @FindBy (css = "#appointment-status")
    public WebElement personelStatus;
    @FindBy (css = "#appointment-physician")
    public WebElement personelPhysician;

    @FindBy (xpath = "//*[@value='330657']")
    public WebElement personelPhysicianibrahim;

    @FindBy (css = "#save-entity")
    public WebElement personelSave;
    @FindBy (css = "#entity-menu")
    public WebElement doktorMyPages;
    @FindBy (xpath = "(//*[.='My Appointments'])[1]")
    public WebElement doktorMyAppointments;
    @FindBy (xpath = "(//*[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement doktorEdit;
    @FindBy (xpath = "//a[@class='btn btn-success btn-sm']")
    public WebElement doktorRequestATest;
    @FindBy (xpath = "//*[@id='132000']")
    public WebElement doktorOrnekTestBir;
    @FindBy (xpath = "//*[@id='1402']")
    public WebElement doktorOrnekTestIki;
    @FindBy (xpath = "//*[@id='1407']")
    public WebElement doktorOrnekTestUc;
    @FindBy (xpath = " //*[contains(text(), 'A new Test is created with identifier')]")
    public WebElement doktorSaveButonuDogrulama;
    @FindBy (xpath = "(//*[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement personelSignoutUlasmak;
    @FindBy (xpath = "(//*[@class='dropdown-item'])[5]")
    public WebElement personelSignout;

    @FindBy (xpath = "//input[@name='endDate']")
    public WebElement personelEndDateTime;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement doktorSaveTest;

    @FindBy (xpath = "(//*[.='Show Tests'])[18]")
    public WebElement personelShowTest;

    @FindBy (xpath = "(//span[@class='d-none d-md-inline'])[1]")
    public WebElement personelViewResult;

    @FindBy (xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement personelEditTestResult;
    @FindBy (css = "#c-test-result-result")
    public WebElement personelResultText;
    @FindBy (css = "#c-test-result-description")
    public WebElement personelDescriptionText;
    @FindBy (css = "#save-entity")
    public WebElement personelTestResultSave;

    @FindBy (xpath = " //*[contains(text(), 'A Test Result is updated with identifier')]")
    public WebElement PersonelSaveTestResultDogrulama;

    @FindBy (xpath = "//a[@class='btn btn-danger btn-sm']")
    public WebElement doktorShowTestResult;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-eye fa-w-18 '])[1]")
    public WebElement doktorViewResult;

    @FindBy (xpath = "//table//th/span[.='ID']")
    public WebElement doktorIDDogrulama;

    @FindBy (xpath = "//table//th/span[.='Name']")
    public WebElement doktorNameDogrulama;

    @FindBy (xpath = "//table//th/span[.='Result']")
    public WebElement doktorResultTableDogrulama;



    @FindBy (xpath = "//table//th/span[.='Default Min. Value']")
    public WebElement doktorDefaultMinDogrulama;

    @FindBy (xpath = "//table//th/span[.='Default Max. Value']")
    public WebElement doktorDefaultMaxDogrulama;

    @FindBy (xpath = "//table//th/span[.='Test']")
    public WebElement doktorTestDogrulama;

    @FindBy (xpath = "//table//th/span[.='Description']")
    public WebElement doktorDescriptionDogrulama;

    @FindBy (xpath = "//table//th/span[.='Date']")
    public WebElement doktorDateDogrulama;

    @FindBy (xpath = "(//button[@type='button'])[2]")
    public WebElement doktorRequestinpatient;

    @FindBy (xpath = "//*[.='My Inpatients']")
    public WebElement doktorMyInpatient;

    @FindBy (xpath = "//tbody")
    public WebElement doktorMyInpatientDogrulama;

}
