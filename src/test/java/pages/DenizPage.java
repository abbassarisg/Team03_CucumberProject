package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DenizPage {


    public DenizPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "#account-menu")
    public WebElement accountMenu;

    @FindBy(id = "login-item")
    public WebElement signInId;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@name='username']") //css input[name=username]
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@name='password']") // css input[name=password]
    public WebElement passwordBox;

    @FindBy(css = ".btn.btn-primary") // xpath //*[@type='submit']
    public WebElement signInButton;

    // xpath  //div//a[@class='dropdown-item']//span[.='Password']
    @FindBy(css = ".dropdown-menu-right.show>:nth-child(2)>span")
    public WebElement passwordLink;


    @FindBy(xpath = "//*[@name='currentPassword']") // css input[name=currentPassword]
    public WebElement currentPasswordBox;

    @FindBy(css = "#newPassword")   // xpath //*[@id='newPassword']
    public WebElement newPasswordBox;

    @FindBy(css = "#confirmPassword") // xpath //*[@id='confirmPassword']
    public WebElement confirmPasswordBox;

    @FindBy(css = ".btn.btn-success>span") // xpath //button//span[.='Save']
    public WebElement saveButton;

    // @FindBy(xpath = "//*[contains(text(), 'Password changed')]")
    @FindBy(xpath = "//*[contains(text(), 'Password changed!')]")
    public WebElement passwordChangedMessage;


    @FindBy(css = "div.col-md-8")
    public WebElement passwordScreen;

    // Password Strength
    @FindBy(css = "#strengthBar")
    public WebElement strengthBar;

    @FindBy(css = "#strength")
    public WebElement strength;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']") // size = 1
    public List<WebElement> redStrength;  // css  #strengthBar>:nth-child(1)

    //@FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    //public WebElement orangeStrength;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 153, 0);']") // size = 2
    public List<WebElement> orangeStrengthList;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 255, 0);']") // size = 3
    public List<WebElement> yellowStrength;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']") // size = 4
    public List<WebElement> limeGreenStrength;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']") // size = 5
    public List<WebElement> greenStrength;

    @FindBy(xpath = "//*[.='The password and its confirmation do not match!']")
    public WebElement notMatchTextMessage;  // css  .invalid-feedback


    // DOCTOR
    @FindBy(xpath = "//a//*[.='MY PAGES']")
    public WebElement myPages;

    @FindBy(xpath = "//a//*[.='My Inpatients']")
    public WebElement myInpatients;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> patientTableTitles;

    @FindBy(xpath = "//span//*[.='Edit']")
    public List<WebElement> editButtons;

    @FindBy(xpath = "//span//*[.='Edit']")
    public WebElement editButton;

    @FindBy(css = "#in-patient-status")   //   xpath   //*[@id='in-patient-status']
    public WebElement statusDdm;

    @FindBy(xpath = "(//*[@class='col-md-8'])[2]")
    public WebElement statusScreen;

    @FindBy(xpath = "//*[text()='DISCHARGED']")
    public WebElement dischargedWait;



    @FindBy(css = "#in-patient-room")  //   xpath   //*[@id='in-patient-room']
    public WebElement roomDdm;

    @FindBy(css = "table.table")  // xpath    //table[@class='table']
    public WebElement patientTable;

    @FindBy(css = "#in-patient-appointment")
    public WebElement appointmentDdm;

    @FindBy(css = "#save-entity>span")
    public WebElement saveButtonCreatePatient;

    @FindBy(xpath = "//*[text()='Status']")
    public WebElement statusForm;



    @FindBy(xpath = "//*[contains(text(), 'InPatient status can not be changed with this type of status')]")
    public WebElement inPatientSaveMassage;

    //@FindBy(xpath = "//*[contains(text(), 'The In Patient is updated with identifier 303046')]")
    //public WebElement inPatientSaveMassage2;







    // Randevu
    @FindBy(xpath = "//*[@class='appointment-btn scrollto']")
    public WebElement randevuClick;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement randevuFirtname;

    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement randevuLastname;

    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement randevuSSN;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement randevuEmail;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement randevuPhone;

    @FindBy(xpath = "//*[text()='Send an Appointment Request']")
    public WebElement randevuSendAnButton;


    @FindBy(xpath = "//*[@id='in-patient-room']")
    public List<WebElement> rooms;

    @FindBy(xpath = "(//*[@class='form-group'])[9]")
    public WebElement room;

}