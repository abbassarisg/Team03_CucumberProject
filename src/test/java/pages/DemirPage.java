package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemirPage {

    public DemirPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@aria-haspopup='true']")
    public WebElement kullanicilar;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[text()='Doktor Demir']")
    public WebElement doktorPage;

    @FindBy(xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;

    @FindBy(xpath = "//*[text()='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//*[text()='Make an appointment']")
    public WebElement makeAnAppointment;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement appointmentFirstName;

    @FindBy(xpath = "//*[contains(text(), 'Appointment registration saved!')]")
    public WebElement popUpMessageAppointment;

    @FindBy(xpath = "(//*[text()='My Appointments'])[1]")
    public WebElement myAppointment;

    @FindBy(xpath = "(//*[@class='btn btn-primary btn-sm'])[2]")
    public WebElement edit;

    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement prescription;

    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement AppointmentUpdateSave;


    @FindBy(xpath = "//*[contains(text(), 'The Appointment is updated with identifier')]")
    public WebElement popUpMessageAppointmentUpdate;

    @FindBy(xpath = "//tbody//tr[1]//td")
    public List<WebElement> hastaBilgileri;

    @FindBy(xpath = "//div[text()='This field is required.']")
    public List<WebElement> thisFieldIsRequired;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement status;

    @FindBy(xpath = "//span[text()='Status']")
    public WebElement statusHead;


    @FindBy(xpath = "//option[text()='PENDING']")
    public WebElement statusPending;

    @FindBy(xpath = "//option[text()='COMPLETED']")
    public WebElement statusCompleted;

    @FindBy(xpath = "//option[text()='CANCELLED']")
    public WebElement statusCancelled;



}
