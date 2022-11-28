package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KenanPage {


    public KenanPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement giris;

    @FindBy(xpath = "//*[@class='dropdown-item']")
    public WebElement signIn;

    @FindBy(xpath = "//input [@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input [@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement signIn2;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement tarih;

    @FindBy(xpath = "//*[@id='register-submit']")//*[@class='btn btn-primary']
    public WebElement sendApp;

    //*[contains(text(),Appointment registration saved! We will call you as soon as possible.)]
    //*[contains(text(),Check your email for deails on how to reset your password)]
    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement kacanyazi;

    @FindBy(xpath = "//*[@class='alert alert-danger fade show']")
    public WebElement failYazi;

    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement pastDate;


    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement mypages;

    @FindBy(xpath = "//*[text()='My Appointments']")
    public WebElement myAppoint;

    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement date;


}
