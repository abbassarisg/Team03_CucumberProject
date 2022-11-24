package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AsimPage {

    public AsimPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@href='#appointment'][1]")
    public WebElement makeAnAppointment;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement firstNameEmpty;

    @FindBy (xpath = "//input[@value='Adem']")
    public WebElement firstNameFull;

    @FindBy (xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameWarning;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement lastNameEmpty;

    @FindBy (xpath = "//input[@value='Bakırcı']")
    public WebElement lastNameFull;

    @FindBy (xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameWarning;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement emailEmpty;

    @FindBy (xpath = "//input[@value='adembakirci124@gmail.com']")
    public WebElement emailFull;

    @FindBy (xpath = "//div[text()='Your email is required.']")
    public WebElement emailWarning;

    @FindBy (xpath = "//input[@id='ssn']")
    public WebElement ssnEmpty;

    @FindBy (xpath = "//input[@value='124-98-4782']")
    public WebElement ssnFull;

    @FindBy (xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnWarning;

    @FindBy (xpath = "//input[@id='phone']")
    public WebElement phoneEmpty;

    @FindBy (xpath = "//input[@value='124-984-7820']")
    public WebElement phoneFull;

    @FindBy (xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneWarning;













}
